package com.selenium.ui.pageobjects.Register;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPagePeopleUS extends BasePage {

    public RegisterPagePeopleUS() {
        super();
    }

    By registerLink = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(6)");
    By usPeopleLink = By.xpath("//*[@id='headingResidents']/h4/a");
    By usCareOption = By.xpath("//*[@id='collapseResidents']/div/div/div[1]/a/div/div/div/button");
    By neuroPlanOption = By.xpath("//*[@id='collapseResidents']/div/div/div[3]/a/div/div/div/button");
    By routineMedicalOption = By.xpath("//*[@id='collapseResidents']/div/div/div[2]/a/div/div/div/button");

    By memberPlanRadio = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
    By nextBtnMemberPlan = By.xpath("//*[@id='tabstrip-1']/div/footer/button");

    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dobField = By.id("DOB");
    By addressField = By.id("Address");
    By cityField = By.id("CityName");
    By postalCodeField = By.id("Zip");
    By emailField = By.id("Email");
    By mobileCodeField = By.id("CountryCode");
    By mobileNumberField = By.id("MobileNumber");

    By nextBtnMember = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");
    By nextBtnPlan = By.xpath("//*[@id='tabstrip-2']/div/footer/button[2]");

    By cardNumberField = By.id("CardNumber");
    By nameOnCardField = By.id("NameOnCard");
    By cvvField = By.id("CVV");
    By termsCheckbox = By.id("SecoundTime");
    By makePaymentButton = By.xpath("//*[@id='tabstrip-4']/div/footer/button[2]");
    By cardExpiryDropdown = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]");
    By expiryYearOption = By.xpath("//*[@id='YY_listbox']/li[2]");

    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");

    By routineMakePaymentButton = By.xpath("//*[@id='tabstrip-3']/div/footer/button[2]");
    By zipCodeField = By.id("SearchZip");
    By nextZipCodeButton = By.xpath("//*[@id='divProviderSelection']/div[1]/div[1]/button");
    By neuroPlanRadio = By.xpath("//*[@id='gridDefaultPlans']/table/tbody/tr/td[1]/input");
    By nextMemberDetailsBtn = By.xpath("//*[@id='tabstrip-3']/footer/button[2]");
    By LoginLink = By.xpath("//*[@id='divDone']/div/a");


    public RegisterPagePeopleUS clickOnRegister() {
        click(registerLink, "Click on Register");
        return this;
    }

    public void TestLoginFetchedCredentialsFromEmail() throws InterruptedException {
        Thread.sleep(1000);
        click(LoginLink, "");
    }
    public RegisterPagePeopleUS clickOnUSEmployersPlansTravelers() {
        click(usPeopleLink, "Click on US Employers Plans Travelers");
        return this;
    }

    public RegisterPagePeopleUS clickOnUSCare() {
        click(usCareOption, "Click on US Care option");
        return this;
    }

    public RegisterPagePeopleUS clickOnRoutineMedicalCare() {
        click(routineMedicalOption, "Click on Routine Medical Care");
        return this;
    }

    public RegisterPagePeopleUS clickOnNeuroPlan() {
        click(neuroPlanOption, "Click on Neuro Plan");
        return this;
    }

    public void clickNextMemberPlanButton() {
        click(nextBtnMemberPlan, "Click on Next (Member Plan)");
    }

    public void fillTravelerForm() {
        enterValue(firstNameField, CreatedDummyName(), "First Name");
        enterValue(lastNameField, CreatedDummyName(), "Last Name");
        enterValue(dobField, "04/20/1998", " Date of Birth");
        enterValue(addressField, "Near station", "Address");
        enterValue(cityField, "California", "City");
        enterValue(postalCodeField, CreatedZipNumber(), "Postal Code");
        enterValue(emailField, CreatedDummyEmail(), "Email");
        enterValue(mobileCodeField, "91", "Mobile Code");
        enterValue(mobileNumberField, CreatedPhoneNumber(), "Mobile Number");
    }

    public void fillPaymentForm() throws InterruptedException {
        enterValue(cardNumberField, "4111111111111111", "Card Number");
        click(cardExpiryDropdown, "Open expiry dropdown");
        click(expiryYearOption, "Select expiry year");
        enterValue(nameOnCardField, CreatedDummyName(), "Name on Card");
        enterValue(cvvField, "123", "CVV");
        click(termsCheckbox, "Accept Terms");
        click(makePaymentButton, "Make Payment");
        Thread.sleep(100000);
        Assert.assertEquals(driver.getTitle(), "Member Registration", "Verify Registration Page");
    }

    public void fillRoutinePaymentForm() throws InterruptedException {
        enterValue(cardNumberField, "4111111111111111", "Card Number");
        click(cardExpiryDropdown, "Open expiry dropdown");
        click(expiryYearOption, "Select expiry year");
        enterValue(nameOnCardField, CreatedDummyName(), "Name on Card");
        enterValue(cvvField, "123", "CVV");
        click(termsCheckbox, "Accept Terms");
        click(routineMakePaymentButton, " Make Payment");
        Thread.sleep(100000);
    }

    public void enterMemberLoginCredentials() {
        enterValue(passwordField, "Tester@1", "Password");
        enterValue(confirmPasswordField, "Tester@1", "Confirm Password");
        click(nextBtnMember, "Click on Next");
    }

    // Registration flows
    public void registerWithFlexibleCare() throws InterruptedException {
        clickOnRegister();
        clickOnUSEmployersPlansTravelers();
        clickOnUSCare();
        click(memberPlanRadio, "Select Member Plan");
        clickNextMemberPlanButton();
        Thread.sleep(10000);
        fillTravelerForm();
        enterMemberLoginCredentials();
        fillRoutinePaymentForm();
    }

    public void registerWithRoutineMedicalCare() throws InterruptedException {
        clickOnRegister();
        clickOnUSEmployersPlansTravelers();
        clickOnRoutineMedicalCare();
        click(memberPlanRadio, "Select Member Plan");
        clickNextMemberPlanButton();
        Thread.sleep(10000);
        fillTravelerForm();
        enterMemberLoginCredentials();
        fillRoutinePaymentForm();
    }

    public void registerWithNeuroPlan() throws InterruptedException {
        clickOnRegister();
        clickOnUSEmployersPlansTravelers();
        clickOnNeuroPlan();
        Thread.sleep(1000);
        enterValue(zipCodeField, "73001", "Zip Code");
        click(nextZipCodeButton, "Click on Next Zip");
        Thread.sleep(1000);
        scrollToView(nextBtnMemberPlan);
        clickNextMemberPlanButton();
        click(neuroPlanRadio, "Select Neuro Plan");
        click(nextBtnPlan, "Click on Next Plan");
        fillTravelerForm();
        click(nextMemberDetailsBtn, "Click on Next Member Details");
        fillPaymentForm();
    }
}
