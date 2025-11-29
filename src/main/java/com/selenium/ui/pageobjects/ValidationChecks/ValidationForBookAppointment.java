package com.selenium.ui.pageobjects.ValidationChecks;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class ValidationForBookAppointment extends BasePage {

    public ValidationForBookAppointment() {
        super();
    }


    By Appointment = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(9)");
    By SearchZip = By.xpath("//*[@id='SearchZip']");
    By Next_BTN = By.cssSelector("button.button_blue:nth-child(5)");
    By SelectCheckBox = By.xpath("//*[@id='AnyProvider']");
    By EarliestCheckBox = By.xpath("//*[@id='AnyTime']");
    By comment = By.xpath("//*[@id='ApptNotes']");
    By NewMember = By.xpath("//*[@id='divConfirmAppointment']/div/button[2]");
    By ExistingMember = By.xpath("//*[@id='divConfirmAppointment']/div/button[1]");
    By ApptDate1 = By.xpath("//*[@id='ApptDate1']");
    By ApptDate2 = By.xpath("//*[@id='ApptDate2']");
    By ApptDate3 = By.xpath("//*[@id='ApptDate3']");
    By Option1 = By.xpath("//*[@id='divAppointment']/div[2]/span[1]/span/span/span");
    By Option2 = By.xpath("//*[@id='divAppointment']/div[3]/span[1]/span/span/span");
    By Option3 = By.xpath("//*[@id='divAppointment']/div[4]/span[1]/span/span/span");
    By Virtual = By.xpath("/html/body/div[1]/div[5]/div[5]/input[2]");
    By SelectPlan = By.xpath("//*[@id=\"gridDefaultPlans\"]/div[2]/table/tbody/tr[1]/td[1]/input");
    By Next_Btn = By.xpath("//*[@id='tabstrip-1']/div/footer/button");

    public ValidationForBookAppointment clickBook_Appointment() {
        click(Appointment, "Click on Register");
        return this;
    }

    public void clickNextPlan_Btn() {
        click(Next_Btn, "Click on Next Button");
    }

    public void verifyBooking_AppointmentType() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"wndMessageBox\"]/div")));
        String popupText = popup.getText();

        Assert.assertTrue(
                popupText.contains("Appointment Type: In-Person") || popupText.contains("Appointment Type: Virtual"),
                "Popup does not contain expected Appointment Type!"
        );
    }

    public void verifyBooking_NewMemberBookingAppointment() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSignupPopup']/div/div[2]/div[2]/div[2]")));
        String popupText = popup.getText();
        System.out.println(popupText);
        Assert.assertTrue(
                popupText.contains("Appointment Type: In-Person") || popupText.contains("Appointment Type: Virtual"),
                "Popup does not contain expected Appointment Type!"
        );
    }

    public void ValidationCheckForAppointmentTypeVirtual() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(Option1, "Select Option Date One");
        Thread.sleep(1000);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        click(Option2, "Select Option Date Two");
        enterValue(ApptDate2, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate2, Keys.ENTER);
        click(Option3, "Select Option Date three");
        enterValue(ApptDate3, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate3, Keys.ENTER);
        click(Virtual, "Select Virtual Appointment Type");
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(ExistingMember, "Created Appointment with Existing Member");
    }

    public void ValidationCheckForAppointmentTypeIn_person() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(Option1, "Select Option Date One");
        Thread.sleep(1000);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        click(Option2, "Select Option Date Two");
        enterValue(ApptDate2, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate2, Keys.ENTER);
        click(Option3, "");
        enterValue(ApptDate3, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate3, Keys.ENTER);
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(ExistingMember, "Created Appointment with Existing Member");
    }

    public void ValidationCheckForAppointmentTypeIn_personwithNewMember() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(Option1, "Select Option Date One");
        Thread.sleep(1000);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        click(Option2, "Select Option Date Two");
        enterValue(ApptDate2, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate2, Keys.ENTER);
        click(Option3, "Select Option Date Three");
        enterValue(ApptDate3, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate3, Keys.ENTER);
        enterValue(comment, CreatedDummyName(), "");
        click(NewMember, " Click on New Member Button");
        Thread.sleep(1000);
        click(SelectPlan, "Select Member Plan");
        clickNextPlan_Btn();
        Thread.sleep(1000);
    }
    public void ValidationCheckForAppointmentTypeVirtualWithNewMember() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(Option1, "Select Option Date One");
        Thread.sleep(1000);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        click(Option2, "Select Option Date Two");
        enterValue(ApptDate2, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate2, Keys.ENTER);
        click(Option3, "Select Option Date Three");
        enterValue(ApptDate3, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate3, Keys.ENTER);
        click(Virtual, "");
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(NewMember, "Select Virtual Appointment Type");
        Thread.sleep(1000);
        click(SelectPlan, "Select member Plan");
        clickNextPlan_Btn();
        Thread.sleep(1000);
    }

    public void verifyPlanSignupWithDoctor() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wndMessage\"]")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "You are registered successfully.\n\nYou will receive an email shortly confirming your registration.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");

    }
}