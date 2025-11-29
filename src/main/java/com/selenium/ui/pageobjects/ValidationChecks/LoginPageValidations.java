package com.selenium.ui.pageobjects.ValidationChecks;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPageValidations extends BasePage {

    public LoginPageValidations() {
        super();
    }

    By USERNAME = By.xpath("//*[@id='UserName']");
    By PASSWORD = By.xpath("//*[@id='Password']");
    By LOGIN_BTN = By.xpath("//*[@id='btnLogin']");
    By errormessageincorrect = By.xpath("//*[@id='spnInvalidUser']");


    public void loginWithInvalidCredentials() throws InterruptedException {

        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "testuser@gmail.com", "Username Field");
        enterValue(PASSWORD, "12345", "Password Field");
        clickLoginButton();
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Your username or password is incorrect.", "Error Message Displayed");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
    }

    public void loginWithBlankEmail() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "", "Username Field");
        enterValue(PASSWORD, "12345", "Password Field");
        clickLoginButton();
        Thread.sleep(1000);
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Your username or password is incorrect.", "Error Message Displayed");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
    }

    public void loginWithBlankPassword() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "testuser@gmail.com", "Username Field");
        enterValue(PASSWORD, "", "Password Field");
        clickLoginButton();
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Please enter Password.", "Error Message Displayed");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
    }

    public void loginWithBlankAndUsername() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "", "Username Field");
        enterValue(PASSWORD, "", "Password Field");
        clickLoginButton();
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Please enter Username.", "Error Message Displayed");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
    }


    public void clickLoginButton() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        checkElementIsDisplayed(LOGIN_BTN, "Sign In button is displayed", 500);
        clickBySendKey(LOGIN_BTN, "Clicked the Sign in button");
        Thread.sleep(10000);
    }
    public void loginWithValidUsernameInvalidPassword() throws InterruptedException {

        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "sonali+1@myphysicianplan.com", "Username Field");
        enterValue(PASSWORD, "12345", "Password Field");
        clickLoginButton();
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Your username or password is incorrect.", "Error Message Displayed");
    }

    public void loginWithInValidUsernameValidPassword() throws InterruptedException {

        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "sonali+s1@myphysicianplan.com", "Username Field");
        enterValue(PASSWORD, "Tester@1", "Password Field");
        clickLoginButton();
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Your username or password is incorrect.", "Error Message Displayed");
    }

    public void loginWithNonRegisteredEmail() throws InterruptedException {

        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        enterValue(USERNAME, "quality@gmail.com", "Username Field");
        enterValue(PASSWORD, "Tester@1", "Password Field");
        clickLoginButton();
        String incorrectErrorMessage = getText(errormessageincorrect);
        Assert.assertEquals(incorrectErrorMessage, "Your username or password is incorrect.", "Error Message Displayed");
    }
}