package com.selenium.ui.browser;
import com.selenium.connectors.JsonConnector;
import com.selenium.dataprovider.GlobalPropertiesReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactoryManager {

    private static final Logger logger = LogManager.getLogger(DriverFactoryManager.class);
    private RemoteWebDriver driver;

    private DriverType selectedDriverType;
    public String v_browserVersion;
    public String v_os;
    public String v_osVersion;
    public String v_deviceName;

    public String useGridVariable = System.getProperty("useGrid");
    private final boolean apiInstance = Boolean.valueOf(
            JsonConnector.getConfig("apiInstance") != null ? JsonConnector.getConfig("apiInstance") : "false"
    );
    private final boolean proxyEnabled = Boolean.getBoolean("proxyEnabled");

    public DriverFactoryManager(String browserName, String browserVersion, String os, String osVersion, String deviceName) {
        logger.debug("Default browser type is Chrome. For other options reset the value in config.json");
        DriverType driverType = DriverType.WEBDRIVERMANAGERCHROME;

        try {
            driverType = DriverType.valueOf(browserName);
        } catch (IllegalArgumentException ignored) {
            logger.error("Unknown driver specified, defaulting to '" + driverType + "'...");
        } catch (NullPointerException ignored) {
            logger.error("No driver specified, defaulting to '" + driverType + "'...");
        }

        selectedDriverType = driverType;
        v_browserVersion = browserVersion;
        v_os = os;
        v_osVersion = osVersion;
        v_deviceName = deviceName;
    }

    public RemoteWebDriver getDriver() {
        if (driver == null) {
            instantiateWebDriver(selectedDriverType, v_browserVersion, v_os, v_osVersion, v_deviceName);
        }
        return driver;
    }

    public RemoteWebDriver getStoredDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private void instantiateWebDriver(DriverType browserName, String browserVersion, String os, String osVersion, String deviceName) {
        boolean crossBrowser = Boolean.parseBoolean(useGridVariable);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        if (proxyEnabled) {
            desiredCapabilities.setCapability("proxy", "");
        }

        if (crossBrowser) {
            URL seleniumGridURL = null;
            try {
                String gridUrlString = GlobalPropertiesReader.propReader().url();
                seleniumGridURL = new URL(gridUrlString);
                logger.info("Using Selenium Grid URL: {}", seleniumGridURL);
            } catch (MalformedURLException e) {
                logger.error("Invalid Selenium Grid URL: {}", e.getMessage());
            } catch (Exception e) {
                logger.error("Failed to read Selenium Grid URL: {}", e.getMessage());
            }

            desiredCapabilities.setCapability("browserName", browserName);
            desiredCapabilities.setCapability("browserVersion", browserVersion);
            desiredCapabilities.setCapability("os", os);
            desiredCapabilities.setCapability("osVersion", osVersion);
            desiredCapabilities.setCapability("deviceName", deviceName);
            desiredCapabilities.setCapability("local", "false");

            if (seleniumGridURL != null) {
                driver = new RemoteWebDriver(seleniumGridURL, desiredCapabilities);
            } else {
                logger.error("Selenium Grid URL is null. Driver not initialized.");
            }

        } else if (apiInstance) {
            logger.info("API Execution is initiated.");
        } else {
            driver = browserName.getWebDriverObject(desiredCapabilities);
        }
    }
}

