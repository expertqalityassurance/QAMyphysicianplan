package com.selenium.ui.pageobjects.Admin;

import com.selenium.ui.pageobjects.common.BasePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class AdminUserCreation extends BasePage {

    public AdminUserCreation() {
        super();
    }

    By UserTab = By.xpath("//*[@id='liUsers']");
    By AddUserBTN = By.xpath("//*[@id='btnAddUsers']");
    By EnterFirstName = By.xpath("//*[@id='FirstName']");
    By EnterLastName = By.xpath("//*[@id='LastName']");
    By EnterEmail = By.xpath("//*[@id='Email']");
    By EnterCountryCode = By.xpath("//*[@id='CountryCode']");
    By EnterMobileNo = By.xpath("//*[@id='MobileNumber']");
    //By UpdateRoll = By.xpath("//*[@id='divMain'']/div[3]/div[4]/div/div/div[1]/span[2]/span/span[1]");
    By dropdown = By.xpath("//span[@aria-owns='RoleID_listbox']");
    By actionSelect = By.xpath("//ul[@id='RoleID_listbox']/li");
    By SaveUserDetail = By.xpath("//*[@id='btnSave']");


    public void selectRoleByIndex(int index) throws InterruptedException {
        driver.findElement(dropdown).click();
        Thread.sleep(1000);
        List<WebElement> allOptions = driver.findElements(actionSelect);
        int flag = 0;
        String selectedText = null;

        for (WebElement e : allOptions) {
            if (flag == index) {
                selectedText = e.getText();
                Thread.sleep(1000);
                e.click();
                Thread.sleep(2000);
                break;
            }
            flag++;
        }
        System.out.println("Selected Role: " + selectedText);
    }


    public void UserCreation() throws InterruptedException {
        click(UserTab, "");
        click(AddUserBTN, "");
        Thread.sleep(10000);
        enterValue(EnterFirstName, CreatedDummyName(), "");
        enterValue(EnterLastName, CreatedDummyName(), "");
        enterValue(EnterEmail, CreatedDummyEmail(), "");
        enterValue(EnterCountryCode, "1", "");
        enterValue(EnterMobileNo, CreatedPhoneNumber(), "");
        selectRandomUserTypeAndEnterFacilityIfRequired();
        Thread.sleep(1000);
        selectRoleByIndex(1);
        click(SaveUserDetail, "");

    }


    public void selectRandomUserTypeAndEnterFacilityIfRequired() throws InterruptedException {
        // Locate all radio buttons
        List<WebElement> userTypes = driver.findElements(By.xpath("//input[@name='UserType']"));

        if (userTypes.isEmpty()) {
            System.out.println("No User Type radio buttons found!");
            return;
        }

        // Pick a random User Type
        Random random = new Random();
        int randomIndex = random.nextInt(userTypes.size());
        WebElement selectedRadio = userTypes.get(randomIndex);
        String value = selectedRadio.getAttribute("value").trim();

        // Click the random User Type
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectedRadio);
        System.out.println("Randomly selected User Type: " + value);

        Thread.sleep(1000);

        String fieldXPath = null;
        String dropdownXPath = null;
        String inputText = "TestName";

        // Determine input field, dropdown, and input text
        if (value.equalsIgnoreCase("Organization")) {
            fieldXPath = "//*[@id='OrganizationName']";
            dropdownXPath = "//*[@id='OrganizationName_listbox']/li[1]";
        } else if (value.equalsIgnoreCase("Employer")) {
            fieldXPath = "//*[@id='EmployerName']";
            dropdownXPath = "//*[@id='EmployerName_listbox']/li[1]";
        } else if (value.equalsIgnoreCase("Agent")) {
            fieldXPath = "//*[@id='AgentName']";
            dropdownXPath = "//*[@id='AgentName_listbox']/li[1]";
            inputText = "Vis"; // For Agent, enter V instead of TestName
        }

        if (fieldXPath != null) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fieldXPath)));

                inputField.clear();
                inputField.sendKeys(inputText);
                System.out.println("Entered text '" + inputText + "' for User Type: " + value);

                // Wait for dropdown to appear
                Thread.sleep(1000);

                // Select first option from the dropdown
                WebElement firstOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownXPath)));
                firstOption.click();
                System.out.println("Selected first dropdown option for User Type: " + value);

            } catch (Exception e) {
                System.out.println("Input field or dropdown not found for User Type: " + value);
            }
        } else {
            System.out.println("No input field required for User Type: " + value);
        }
    }

}