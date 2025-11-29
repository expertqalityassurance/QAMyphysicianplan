package com.selenium.ui.pageobjects.Admin;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;

public class AdminGroupCreation extends BasePage {

    public AdminGroupCreation() {
        super();
    }

    By GroupTab = By.xpath("//*[@id='liPromotions']");
    By AddNewGroupBTN = By.xpath("//*[@id='btnAdd']");
    By GroupCode = By.xpath("//*[@id='PromoCode']");
    By GroupValue = By.xpath("//*[@name='PromoValue']");
    By GroupType = By.xpath("(//input[@id='PromoType'])[2]");
    By StartDateTable = By.xpath("//*[@id='divAdd']/div/div[3]/div[1]/span/span/span");
    By StartDate = By.xpath("//*[@id='StartDate']");
    By EndDateTable = By.xpath("//*[@id='divAdd']/div/div[3]/div[2]/span/span/span/span");
    By EndDate = By.xpath("//*[@id='EndDate']");
    By SaveBTN = By.xpath("//*[@id='divAdd']/div/div[5]/div/button[1]");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void GroupCreation() throws InterruptedException {
        click(GroupTab, "Click On GroupTab");
        click(AddNewGroupBTN, "Click on Added New Group Button");
        enterValue(GroupCode,generateRandomNumbers(5),"Entered GroupCode");
        enterValue(GroupValue,generateRandomNumbers(4),"Entered GroupValue");
        click(StartDateTable,"Enter StartDate");
        enterValue(StartDate, Keys.ENTER);
        click(EndDateTable,"Enter EndDate");
        enterValue(EndDate, Keys.ENTER);
        click(SaveBTN,"Click On Save Button");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formStatus\"]")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Promotion Saved.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        Reporter.log("Promotion Saved.");
    }

    public void ValidateGroupCreation() throws InterruptedException {
        click(GroupTab, "Click On GroupTab");
        click(AddNewGroupBTN, "Click on Added New Group Button");
        enterValue(GroupCode,generateRandomNumbers(10),"Entered GroupCode");
        enterValue(GroupValue,generateRandomNumbers(4),"Entered GroupValue");
        click(GroupType,"Select GroupType");
        click(StartDateTable,"Enter StartDate");
        enterValue(StartDate, Keys.ENTER);
        click(EndDateTable,"Enter EndDate");
        enterValue(EndDate, Keys.ENTER);
        click(SaveBTN,"Click On Save Button");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"errMessage\"]")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Group Value cannot exceed 100 when Group Type is Percentage";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        Reporter.log("Group Value cannot exceed 100 when Group Type is Percentage");
        clearText(GroupValue);
        enterValue(GroupValue,generateRandomNumbers(2),"Entered GroupValue");
        click(SaveBTN,"Click On Save Button");
        WebElement popup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formStatus\"]")));
        String popupMessage = popup1.getText();
        System.out.println(popupMessage);
        String expectedMessages = "Promotion Saved.";
        Assert.assertEquals(popupMessage.trim(), expectedMessages, "Popup message is not as expected!");
        Reporter.log("Promotion Saved.");

    }
}
