package com.selenium.ui.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public enum DriverType implements DriverSetup {

	CHROME {
		@Override
		public RemoteWebDriver getWebDriverObject(DesiredCapabilities capabilities) {

			boolean isCI = System.getenv("CI") != null;   // TRUE on GitHub Actions

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.merge(capabilities);
			options.addArguments("--remote-allow-origins=*");

			if (isCI) {
				// ----------------------------
				// RUNS ON GITHUB ACTIONS LINUX
				// ----------------------------
				options.addArguments("--headless=new");
				options.addArguments("--disable-gpu");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--disable-extensions");
				options.addArguments("--window-size=1920,1080");

			} else {
				// ----------------------------
				// RUNS ON LOCAL WINDOWS MACHINE
				// ----------------------------
				options.addArguments("--start-maximized");

				// Only use Windows profile when running locally
				options.addArguments("user-data-dir=C:\\Users\\ADMIN\\AppData\\Local\\Google\\Chrome\\User Data");
				options.addArguments("--profile-directory=Profile 1");
			}

			return new ChromeDriver(options);
		}
	},

	FIREFOX {
		@Override
		public RemoteWebDriver getWebDriverObject(DesiredCapabilities capabilities) {

			boolean isCI = System.getenv("CI") != null;

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.merge(capabilities);

			if (isCI) {
				options.setHeadless(true);
			}

			return new FirefoxDriver(options);
		}
	},

	WEBDRIVERMANAGERCHROME {
		@Override
		public RemoteWebDriver getWebDriverObject(DesiredCapabilities capabilities) {

			boolean isCI = System.getenv("CI") != null;

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			if (isCI) {
				options.addArguments("--headless=new");
				options.addArguments("--disable-gpu");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--disable-extensions");
				options.addArguments("--window-size=1920,1080");
			} else {
				options.addArguments("--start-maximized");
			}

			return new ChromeDriver(options);
		}
	}
}
