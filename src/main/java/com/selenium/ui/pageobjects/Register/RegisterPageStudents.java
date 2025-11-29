package com.selenium.ui.pageobjects.Register;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class RegisterPageStudents extends BasePage {

    public RegisterPageStudents() {
        super();
    }

    By registerLink = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(6)");
    By medicalPlansStudentLink = By.xpath("//*[@id='headingStudents']/h4/a");
    By planSelectButton = By.xpath("//*[@id='collapseStudents']/div/div/div/a/div/div/div/button");
    By planSecondSelectButton = By.xpath("//*[@id='collapseStudents']/div/div/div[2]/a/div/div/div/button");
    By EssentialStudentPlan = By.xpath("//*[@id='collapseStudents']/div/div/div[2]/a/div/div/div/button");

    By startDateDropdown = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[1]/span[2]/span/span/span");
    By endDateDropdown = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[2]/span[2]/span/span/span");
    By travelStartDateField = By.id("TravelStartDate");
    By travelEndDateField = By.id("TravelEndDate");

    By zipCodeUSField = By.name("USZip");
    By nextButton = By.xpath("//*[@id='tabstrip-1']/div/footer/button");

    By firstNameField = By.id("firstName1");
    By lastNameField = By.id("lastName1");
    By dobField = By.id("DOB1");
    By addressField = By.id("Address");
    By cityField = By.id("CityName");
    By stateDropdown = By.xpath("//*[@id='tabstrip-2']/div[3]/div[2]/span[2]");
    By stateSelectedOption = By.id("StateName_option_selected");
    By postalCodeField = By.id("Zip");
    By emailField = By.id("Email");
    By countryCodeField = By.id("CountryCode");
    By mobileNumberField = By.id("MobileNumber");

    By memberNextButton = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");

    By cardNumberField = By.id("CardNumber");
    By nameOnCardField = By.id("NameOnCard");
    By expiryDateField = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]");
    By cvvField = By.id("CVV");
    By termsCheckbox = By.id("chkTerms");
    By makePaymentButton = By.xpath("//*[@id='tabstrip-3']/div/footer/button[2]");

    // Actions

    public RegisterPageStudents clickOnRegister() {
        click(registerLink, "Click on Register");
        return this;
    }

    public void registerForPremiumInternational_StudentPlan() throws InterruptedException {
        clickOnRegister();
        click(medicalPlansStudentLink, "Click on Medical Plans for Students");
        click(planSelectButton, "Click to select Student Plan");

        Thread.sleep(1000);
        click(startDateDropdown, "Click on Start Date");
        enterValue(travelStartDateField, Keys.ENTER);

        Thread.sleep(1000);
        click(endDateDropdown, "Click on End Date");
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ENTER);
        enterValue(zipCodeUSField, "73001", "Enter US Zip Code");
        click(nextButton, "Click on Next (Plan Step)");

        enterValue(firstNameField, CreatedDummyName(), "Enter First Name");
        enterValue(lastNameField, CreatedDummyName(), "Enter Last Name");
        enterValue(dobField, "04/20/1998", "Enter DOB");
        enterValue(addressField, "Near Station", "Enter Address");
        enterValue(cityField, "California", "Enter City");

        click(stateDropdown, "Click on State Dropdown");
        enterValue(stateDropdown, Keys.ARROW_DOWN);
        enterValue(stateSelectedOption, Keys.ENTER);

        enterValue(postalCodeField, CreatedZipNumber(), "Enter Postal Code");
        enterValue(emailField, CreatedDummyEmail(), "Enter Email");
        enterValue(countryCodeField, "91", "Enter Country Code");
        enterValue(mobileNumberField, CreatedPhoneNumber(), "Enter Mobile Number");

        click(memberNextButton, "Click on Next (Member Info)");

        enterValue(cardNumberField, "4111111111111111", "Enter Card Number");
        enterValue(nameOnCardField, "QA Test", "Enter Name on Card");

        enterValue(expiryDateField, Keys.ARROW_DOWN);
        enterValue(cvvField, "123", "Enter CVV");

        click(termsCheckbox, "Accept Terms");
        click(makePaymentButton, "Click on Make Payment");

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Member Registration Student", "Verify Registration Success");

        Thread.sleep(10000);
    }


    public void registerForEssentialInternational_StudentPlan() throws InterruptedException {
        clickOnRegister();
        click(medicalPlansStudentLink, "Click on Medical Plans for Students");
        click(planSecondSelectButton, "Click to select Student Plan");

        Thread.sleep(1000);
        click(startDateDropdown, "Click on Start Date");
        enterValue(travelStartDateField, Keys.ENTER);

        Thread.sleep(1000);
        click(endDateDropdown, "Click on End Date");
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ARROW_DOWN);
        enterValue(travelEndDateField, Keys.ENTER);
        enterValue(zipCodeUSField, "73001", "Enter US Zip Code");
        click(nextButton, "Click on Next (Plan Step)");

        enterValue(firstNameField, CreatedDummyName(), "Enter First Name");
        enterValue(lastNameField, CreatedDummyName(), "Enter Last Name");
        enterValue(dobField, "04/20/1998", "Enter DOB");
        enterValue(addressField, "Near Station", "Enter Address");
        enterValue(cityField, "California", "Enter City");

        click(stateDropdown, "Click on State Dropdown");
        enterValue(stateDropdown, Keys.ARROW_DOWN);
        enterValue(stateSelectedOption, Keys.ENTER);

        enterValue(postalCodeField, CreatedZipNumber(), "Enter Postal Code");
        enterValue(emailField, CreatedDummyEmail(), "Enter Email");
        enterValue(countryCodeField, "91", "Enter Country Code");
        enterValue(mobileNumberField, CreatedPhoneNumber(), "Enter Mobile Number");

        click(memberNextButton, "Click on Next (Member Info)");

        enterValue(cardNumberField, "4111111111111111", "Enter Card Number");
        enterValue(nameOnCardField, "QA Test", "Enter Name on Card");

        enterValue(expiryDateField, Keys.ARROW_DOWN);
        enterValue(cvvField, "123", "Enter CVV");

        click(termsCheckbox, "Accept Terms");
        click(makePaymentButton, "Click on Make Payment");

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Member Registration Student", "Verify Registration Success");

        Thread.sleep(10000);
    }

    }
