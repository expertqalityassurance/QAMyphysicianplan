package com.selenium.ui.pageobjects.ValidationChecks;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ValidationPage extends BasePage {

    public static String Emailactual;

    public ValidationPage() {
        super();
    }

    By Register = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(6)");
    By startDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[1]/span[2]/span/span/span");
    By EndDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[2]/span[2]/span/span/span");
    By USzipCode = By.xpath("//*[@name='USZip']");
    By Travelers = By.cssSelector("#headingTravelers > h4:nth-child(1) > a:nth-child(1)");
    By selectPremiumPlan = By.cssSelector("#collapseTravelers > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
    By getQuote = By.xpath("//button[text()='Get Quote']");
    By SelectRoutine = By.xpath("//*[@id=\"collapseTravelers\"]/div/div/div[4]/a/div/div/div/button");
    By Validation_Message = By.xpath("//*[@id='errTravelStartDate']");
    By startdates = By.xpath("//*[@id='TravelStartDate']");
    By EndDates = By.xpath("//*[@id='TravelEndDate']");
    By Validation_EnddateMessage = By.xpath("//*[@id='errEndDate']");
    By Validation_DOBdateMessage = By.xpath("//*[@id='errDOB1']");
    By SelectstarDate = By.xpath("//*[@id='tabstrip-1']/div/div[2]/div/span[2]/span/span/span");
    By zipCode = By.xpath("//*[@name='USZip']");
    By country = By.xpath("//*[@id='tabstrip-1']/div/div[2]/div/span[2]");
    By Next = By.xpath("//*[@id='btnPlanNext']");
    By NextBTN = By.xpath("//*[@id='tabstrip-1']/div/footer/button");
    By First_Name = By.xpath("//input[@id='firstName1']");
    By lastName = By.xpath("//*[@id='lastName1']");
    By Date_of_Birth = By.xpath("//*[@id='DOB1']");
    By DBO = By.xpath("//*[@id='familyPanelBar-1']/div/div[2]/div[1]/span[2]/span/span/span");
    By calendarWidgetBy = By.xpath("//div[contains(@class,'k-widget') and contains(@class,'k-calendar') and not(contains(@style,'display:none'))]");
    By Address = By.xpath("//*[@id='Address']");
    By Primary_Address = By.xpath("//*[@id='Address11']");
    By Primary_City = By.xpath("//*[@id='City1']");
    By Primary_Zip = By.xpath("//*[@id='Zip1']");
    By City = By.xpath("//*[@id='CityName']");
    By Postal_Code = By.xpath("//*[@id='Zip']");
    By Email_Username = By.xpath("//*[@id='Email']");
    By PrimaryEmail_Username = By.xpath("//*[@id='Email1']");
    By Mobile_Code = By.xpath("//*[@id='CountryCode']");
    By PrimaryMobile_Code = By.xpath("//*[@id='CountryCode1']");
    By MobileNumber = By.xpath("//*[@id='MobileNumber']");
    By PrimaryMobileNumber = By.xpath("//*[@id='MobileNumber1']");
    By PrimaryUserPass = By.xpath("//*[@id='Password1']");
    By PrimaryConfirmPass = By.xpath("//*[@id='ConfirmPassword1']");
    By nextButtonMember = By.xpath("//*[@id=\"tabstrip-2\"]/footer/button[2]");
    By Next_ButtonComprehensive = By.xpath("//*[@id='divMembers']/footer/button[2]");
    By Make_Payment = By.xpath("//*[@id='tabstrip-4']/div/footer/button[2]");
    By memberPlan = By.xpath("//*[@id=\"gridDefaultPlans\"]/div[2]/table/tbody/tr[5]/td[1]/input");
    By SelectAmount = By.xpath("//*[@id='tabstrip-1']/div/div[3]/div[1]/div/ol/li[1]/span[2]/span");
    By SelectedAmount = By.xpath("//*[@id='IUA_listbox']/li[3]");
    By SelectCheckBox = By.xpath("//*[@id=\"IsTobacco\"]");
    By Nxt_BTN = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");


    public ValidationPage Registers() {
        click(Register, "Click on Register");
        return this;
    }

    public ValidationPage MedicalPlansTravelers() {
        click(Travelers, "Click on Travelers");
        return this;
    }

    public ValidationPage selectPremiumComprehensive() {
        click(selectPremiumPlan, "Click On Select Medical Plan For Travelers");
        return this;
    }

    public ValidationPage selectPrimaryCare_Plan() {
        click(SelectRoutine, "Click On Select Medical Plan For Travelers");
        return this;
    }

    public void clickNext_ButtonComprehensive() {

        click(Next_ButtonComprehensive, "Fill All Information successfully");
    }

    public void clickOnNext() {
        click(Next, "");
    }

    public void travelerForm() {
        enterValue(First_Name, CreatedDummyName(), "FirstName successfully");
        enterValue(lastName, CreatedDummyName(), "LastName successfully");
        enterValue(Date_of_Birth, "04/20/1998", "Date of Birth successfully");
        enterValue(Address, "near station", "Address successfully");
        enterValue(City, "California", "City successfully");
        enterValue(Postal_Code, CreatedZipNumber(), "PostalCode successfully");
        Emailactual = CreatedDummyEmail();
        enterValue(Email_Username, Emailactual, "Email/Username successfully");
        enterValue(Mobile_Code, "91", "MobileCode successfully");
        enterValue(MobileNumber, CreatedPhoneNumber(), "MobileNumber successfully");
    }

    public void datesform() throws InterruptedException {
        click(startDate, "Click on StartDate and Its Selected");
        enterValue(startdates, Keys.ENTER);
        click(EndDate, "Click on EndDate and Its Selected");
        enterValue(EndDates, Keys.ARROW_DOWN);
        enterValue(EndDates, Keys.ENTER);
        Thread.sleep(10000);
        enterValue(country, Keys.ENTER);
        click(zipCode, "Entered zipCode");
        enterValue(zipCode, CreatedZipNumber(), "zipCode successfully");
        click(getQuote, "");
        Thread.sleep(1000);
    }

    public void TravelDetails_ValidationMessage() {
        List<String> actualTexts = Arrays.asList(
                driver.findElement(By.id("errTravelStartDate")).getText().trim(),
                driver.findElement(By.id("errEndDate")).getText().trim(),
                driver.findElement(By.id("errUSZip")).getText().trim()
        );
        List<String> expectedTexts = Arrays.asList("Required", "Required", "Required");
        Assert.assertEquals(actualTexts, expectedTexts, "Mismatch in element texts");
    }

    public void TravelersDetails_ValidationMessage() {
        List<String> actualTexts = Arrays.asList(
                driver.findElement(By.id("errfirstName1")).getText().trim(),
                driver.findElement(By.id("errlastName1")).getText().trim(),
                driver.findElement(By.id("errDOB1")).getText().trim(),
                driver.findElement(By.id("errAddress")).getText().trim(),
                driver.findElement(By.id("errZip")).getText().trim(),
                driver.findElement(By.id("errEmail")).getText().trim(),
                driver.findElement(By.id("errAddress")).getText().trim(),
                driver.findElement(By.id("errMobile")).getText().trim()
        );
        List<String> expectedTexts = Arrays.asList("Required", "Required", "Required", "Required", "Required", "Required", "Required", "Required");
        Assert.assertEquals(actualTexts, expectedTexts, "Mismatch in element texts");
    }

    public void TravelPaymentDetails_ValidationMessage() {
        List<String> actualTexts = Arrays.asList(
                driver.findElement(By.id("spnCardNumber")).getText().trim(),
                driver.findElement(By.id("spnNameOnCard")).getText().trim(),
                driver.findElement(By.id("spnCVV")).getText().trim()
        );
        List<String> expectedTexts = Arrays.asList("Required", "Required", "Required");
        Assert.assertEquals(actualTexts, expectedTexts, "Mismatch in element texts");
    }

    public void ValidationCheckForTravelDetails() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        click(getQuote, "Click on get Quote");
        TravelDetails_ValidationMessage();
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
        Thread.sleep(1000);
    }

    public void ValidationCheckForEndDate_TravelDetailsPage() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        click(startDate, "Click on StartDate and Its Selected");
        enterValue(startdates, Keys.ENTER);
        click(EndDate, "Click on EndDate and Its Selected");
        enterValue(EndDates, Keys.ENTER);
        click(getQuote, "");
        String EndDateFieldMessage = getText(Validation_EnddateMessage);
        Assert.assertEquals(EndDateFieldMessage, "The travel period must be at least 7 days", "Mismatch in element texts");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
        Thread.sleep(1000);
    }

    public void ValidationCheckForEndDate_TravelerDetailsPage() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        clickOnNext();
        clickNext_ButtonComprehensive();
        TravelersDetails_ValidationMessage();
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
        Thread.sleep(1000);
    }

    public void ValidationCheckForDateofBirth_TravelerDetailsPage() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        clickOnNext();
        enterValue(First_Name, CreatedDummyName(), "FirstName successfully");
        enterValue(lastName, CreatedDummyName(), "LastName successfully");
        click(Date_of_Birth, "Click on Date of birth");
        enterValue(Address, "near station", "Address successfully");
        enterValue(City, "California", "City successfully");
        enterValue(Postal_Code, CreatedZipNumber(), "PostalCode successfully");
        Emailactual = CreatedDummyEmail();
        enterValue(Email_Username, Emailactual, "Email/Username successfully");
        enterValue(Mobile_Code, "91", "MobileCode successfully");
        enterValue(MobileNumber, CreatedPhoneNumber(), "MobileNumber successfully");
        String DateOfBirthFieldMessage = getText(Validation_DOBdateMessage);
        Assert.assertEquals(DateOfBirthFieldMessage, "Please enter a valid date in MM/dd/yyyy format.", "Mismatch in element texts");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
        Thread.sleep(1000);
    }

    public void ValidationCheckForMakePayment_TravelerDetailsPage() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        clickOnNext();
        travelerForm();
        clickNext_ButtonComprehensive();
        click(Make_Payment, "Payment successfully");
        TravelPaymentDetails_ValidationMessage();
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
        Thread.sleep(1000);
    }

    public void ValidationCheckForFlexible_US_CarePage() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPrimaryCare_Plan();
        click(memberPlan, "Select member Plan");
        click(SelectAmount, "");
        Thread.sleep(1000);
        click(SelectedAmount, "");
        click(SelectCheckBox, "");
        click(NextBTN, "");
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='errPlanStartDate']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Flexible US Care can start only on the 1st of the month. Please change the Plan Start Date.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
        Thread.sleep(1000);
    }

    public void ValidationCheckAvailabilityForFlexible_US_CarePage() throws InterruptedException {
        Registers();
        MedicalPlansTravelers();
        selectPrimaryCare_Plan();
        click(memberPlan, "Select member Plan");
        click(SelectAmount, "");
        Thread.sleep(1000);
        click(SelectedAmount, "");
        click(SelectCheckBox, "");
        click(NextBTN, "");
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errPlanStartDate")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Flexible US Care can start only on the 1st of the month. Please change the Plan Start Date.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        Reporter.log("Validation message verified successfully.");

        // Open calendar
        click(SelectstarDate, "");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        LocalDate nextMonth = LocalDate.now().plusMonths(1);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH);
        String expectedHeader = nextMonth.format(fmt);

        // Click Next Month arrow
        By nextArrowBy = By.xpath("//a[contains(@class,'k-nav-next')]");
        WebElement nextArrow = wait1.until(ExpectedConditions.elementToBeClickable(nextArrowBy));
        Thread.sleep(1000);
        nextArrow.click();

        // Wait until header shows correct month/year
        By headerBy = By.xpath("//a[contains(@class,'k-link') and contains(@class,'k-nav-fast')]");
        wait1.until(ExpectedConditions.textToBePresentInElementLocated(headerBy, expectedHeader));

        // Retry selecting "1" until success
        By firstDateRel = By.xpath("//table//a[normalize-space(.)='1' and not(contains(@class,'k-other-month'))]");
        for (int i = 0; i < 3; i++) {  // retry up to 3 times
            try {
                WebElement firstDate = wait1.until(ExpectedConditions.elementToBeClickable(firstDateRel));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstDate); // force click
                System.out.println("Clicked on date 1 successfully.");
                break;
            } catch (Exception e) {
                System.out.println("Retrying click on 1 due to: " + e.getMessage());
                Thread.sleep(500);
            }
        }

        Thread.sleep(1000);
        click(NextBTN, "");
        PrimaryMemberForm();
        enterPrimaryMemberLoginCredentials();
    }

    public void ValidationCheckAvailabilityForFlexible_US_CarePlan() throws InterruptedException {
        click(Nxt_BTN,"");
        Thread.sleep(1000);
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Error_msg = waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='errMemberValidation']")));
        String ErrorMessage = Error_msg.getText();
        System.out.println(ErrorMessage);
        String expectedErrorMessage = "Comprehensive Plan not available based on your selections. Please select a different plan.";
        Assert.assertEquals(ErrorMessage.trim(), expectedErrorMessage, "Popup message is not as expected!");
    }
    public void PrimaryMemberForm() throws InterruptedException {
        enterValue(First_Name, CreatedDummyName(), "FirstName successfully");
        enterValue(lastName, CreatedDummyName(), "LastName successfully");
        enterValue(Primary_Address, generateRandomAddressInCalifornia(), "Address successfully");
        Thread.sleep(1000);
        enterValue(Primary_City, generateRandomCityInCalifornia(), "City successfully");
        enterValue(Primary_Zip, CreatedZipNumber(), "PostalCode successfully");
        Emailactual = CreatedDummyEmail();
        enterValue(PrimaryEmail_Username, Emailactual, "Email/Username successfully");
        enterValue(PrimaryMobile_Code, "91", "MobileCode successfully");
        enterValue(PrimaryMobileNumber, CreatedPhoneNumber(), "MobileNumber successfully");
    }

    public void PrimaryMemberFormWithoutValid_Date() throws InterruptedException {
        click(DBO, "");
        enterValue(Date_of_Birth, Keys.ENTER);
        enterPrimaryMemberLoginCredentials();
        click(Nxt_BTN,"");
        ValidationCheckAvailabilityForFlexible_US_CarePlan();
    }

    public void PrimaryMemberFormWithValid_Date() throws InterruptedException {
        enterValue(Date_of_Birth, "04/20/1998", "Date of Birth successfully");
        click(Nxt_BTN,"");
    }



    public void enterPrimaryMemberLoginCredentials() {
        enterValue(PrimaryUserPass, "Tester@1", "Password");
        enterValue(PrimaryConfirmPass, "Tester@1", "Confirm password");
        click(nextButtonMember, "Click on Next");
    }


}
