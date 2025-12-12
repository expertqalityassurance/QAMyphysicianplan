package com.selenium.ui.pageobjects.Register;

import com.selenium.ui.UpdateExcel.UpdateExcelEmail;
import com.selenium.ui.pageobjects.common.BasePage;
import com.selenium.ui.utils.GmailUtils;
import org.jsoup.Jsoup;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.selenium.ui.pageobjects.Register.RegisterPageTravelers.*;

public class RegisterPageUSEmployers extends BasePage {


    public RegisterPageUSEmployers() {

        super();
    }

     By register = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(6)");
     By Appointment = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(9)");
     By usEmployers = By.xpath("//*[@id='headingEmployers']/h4/a");
     By selectFlexibleUSCare = By.xpath("//*[@id='collapseEmployers']/div/div/div[2]/a/div/div/div/button");
     By routineMedicalCare = By.xpath("//*[@id='collapseEmployers']/div/div/div[2]/a/div/div/div/button");
     By EmpRegistration = By.xpath("//*[@id='collapseEmployers']/div/div/div[1]/a/div/div/div/button");
     By memberPlan = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
     By SelectPlan = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
     By nextButtonMemberPlan = By.xpath("//*[@id='tabstrip-1']/div/footer/button");
     By Next_Btn = By.xpath("//*[@id='tabstrip-1']/div/footer/button");
     By nextSaveButtonMemberPlan = By.xpath("//*[@id='tabstrip-1']/footer/button");
     By firstName = By.xpath("//input[@id='FirstName']");
     By lastName = By.xpath("//*[@id='LastName']");
     By dateOfBirth = By.xpath("//*[@id='DOB']");
     By address = By.xpath("//*[@id='Address']");
     By city = By.xpath("//*[@id='CityName']");
     By postalCode = By.xpath("//*[@id='Zip']");
     By emailUsername = By.xpath("//*[@id='Email']");
     By mobileCode = By.xpath("//*[@id='CountryCode']");
     By mobileNumber = By.xpath("//*[@id='MobileNumber']");
     By nextButtonMember = By.xpath("//button[@onclick='OnMemberNextClick()']");
     By nextButtonComprehensive = By.xpath("(//button[@onclick='OnMemberNextClick()'])[1]");
     By cardNumber = By.xpath("//*[@id='CardNumber']");
     By nameOnCard = By.xpath("//*[@id='NameOnCard']");
     By cvv = By.xpath("//*[@id='CVV']");
     By chkTerms = By.xpath("//*[@id='SecoundTime']");
     By makePayment = By.xpath("//*[@id='tabstrip-3']/div/footer/button[2]");
     By date = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]");
     By dateSelect = By.xpath("//*[@id='YY_listbox']/li[2]");
     By Scroll = By.xpath("/html");
    By scroller = By.xpath("//html");
    By ClickYear = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]/span/span[1]");
    By selectYear = By.xpath("//*[@id='YY_listbox']/li[2]");
     By password = By.xpath("//input[@id='Password']");
     By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By ButtonNext = By.xpath("//*[@id=\"tabstrip-2\"]/footer/button[2]");
    By StartBTN = By.xpath("//*[@id='tabstrip-1']/footer/button");
     By BusinessName = By.xpath("//*[@id='OrganizationName']");
    By Address = By.xpath("//*[@id='Address']");
    By StateName = By.xpath("//*[@id='StateName']");
    By Zip = By.xpath("//*[@id='Zip']");
    By Email = By.xpath("//*[@id='Email']");
    By CountryCode = By.xpath("//*[@id='CountryCode']");
    By PhoneNumber = By.xpath("//*[@id='PhoneNumber']");
    By CityName = By.xpath("//*[@id='CityName']");
    By NextButton = By.xpath("//*[@id='tabstrip-3']/footer/button[2]");
    By selectLocation= By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[1]/div[1]/span[1]/span/span[1]");
    By OptionSelect = By.xpath("//div[@class='k-animation-container']//ul/li[@class='k-item' and text()='Main']");
    By ContactName = By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[2]/div[1]/input");
    By ContactTitle = By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[2]/div[2]/input");
    By ContactEmail = By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[3]/div[1]/input");
    By Contact_PhoneCode =By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[3]/div[2]/input[1]");
    By Contact_Phone =By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[3]/div[2]/input[2]");
    By Role =By.xpath("//*[@id='contactPanelBar']/li/ul/li/div/div[1]/div[2]/span[1]/span/span[1]");
    By SelectOption = By.xpath ("//div[@class='k-animation-container']//ul/li[@class='k-item' and text()='Admin']");
    By actionSelect= By.xpath("//*[@class='k-item']");
    By SaveButton = By.xpath("//*[@id='tabstrip-4']/footer/button[2]");
    By CheckBoxSelect = By.xpath("//*[@id='gridEmployerPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
    By Contribution =By.xpath("//*[@id='gridEmployerPlans']/div[2]/table/tbody/tr[1]/td[5]/input");
    By save_nextbutton =By.xpath("//*[@id='tabstrip-5']/footer/button[2]");
    By Filechoose = By.xpath("//input[@id=\"employeeExcel\"]");
    By SelectDate = By.xpath("//*[@id='tabstrip-6']/div/fieldset/div[3]/div[1]/span[1]/span/span");
    By SelectedDate =By.xpath("//*[@id='PlanStartDate']");
    By UploadandValidate =By.xpath("//*[@id='tabstrip-6']/div/fieldset/div[3]/div[2]/button");
    By SaveandNextButton= By.xpath("//*[@id='tabstrip-6']/footer/button[2]");
    By calendar_icon= By.xpath("//input[@placeholder='MM/DD/YYYY']/following-sibling::button");
    By next_btn = By.xpath("//a[@class='k-link k-nav-next']");
    By firstDateXpath = By.xpath("//table[contains(@class,'k-calendar')]//a[text()='1']");
    By calendarWidgetBy = By.xpath("//div[contains(@class,'k-widget') and contains(@class,'k-calendar') and not(contains(@style,'display:none'))]");
    By CardNumber = By.xpath("//*[@id='CardNumber']");
    By CardName = By.xpath("//*[@id='NameOnCard']");
    By CvvField = By.xpath("//*[@id='CVV']");
    By cardExpiryDropdown = By.xpath("//*[@id='tabstrip-7']/div/fieldset/div[8]/div[1]/span[2]/span/span[1]");
    By SelectExpiryDropdown = By.xpath("//*[@id='tabstrip-7']/div/fieldset/div[8]/div[1]/span[3]/span/span[1]");
    By expiryYearOption = By.xpath("//*[@id=\"YY_listbox\"]/li[6]");
    By SelectexpiryYearOption = By.xpath("//*[@id='YY_listbox']/li[6]");
    By CompleteRegistration = By.xpath("//*[@id='tabstrip-7']/footer/button[2]");
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
    By Username = By.xpath("//input[@id='UserName']");
    By Password = By.xpath("//*[@id='Password']");
    By BTN_login = By.xpath("//*[@id='btnLogin']");
    By NewPassword = By.xpath("//input[@id='NewPassword']");
    By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By BTNSubmit = By.xpath("//*[@id='setPasswordModal']/div[2]/div[2]/div[3]/button");
    By CheckBoxAuthentication = By.xpath("//input[@id='chk2factor']");
    By NextBTN = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");




    public RegisterPageUSEmployers clickRegister() {
        click(register, "Click on Register");
        return this;
    }
    public RegisterPageUSEmployers clickBook_Appointment() throws InterruptedException {
        Thread.sleep(1000);
        click(Appointment, "Click on Register");
        return this;
    }

    public RegisterPageUSEmployers clickUSEmployers() {
        click(usEmployers, "Click on US Employers");
        return this;
    }
    public RegisterPageUSEmployers EmployerRegistration() {
        click(EmpRegistration, "Click on US Employers");
        return this;
    }

    public RegisterPageUSEmployers selectFlexibleUSCarePlan() {
        click(selectFlexibleUSCare, "Click on Select Flexible US Care");
        return this;
    }

    public RegisterPageUSEmployers selectRoutineMedicalUSCarePlan() {
        click(routineMedicalCare, "Click on Select Routine Medical US Care");
        return this;
    }
    public RegisterPageUSEmployers selectEmployerRegistration() {
        click(EmpRegistration, "Click on Select Routine Medical US Care");
        return this;
    }

    public void clickNextMemberPlan() {
        click(nextButtonMemberPlan, "Click on Next Button");
    }
    public void clickNextPlan_Btn() {
        click( Next_Btn, "Click on Next Button");
    }
    public void verifyBooking_Details() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSignupPopup']/div/div[2]/div[2]/div[2]")));
        System.out.println("Popup text: " + popup.getText());
        Thread.sleep(1000);
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("You are registered successfully."), "Wrong PDF file opened!");
    }

    public void verifyBooking_TimeVerifyBooking() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divSignupPopup']/div/div[2]/div[2]/div[2]")));
        System.out.println("Popup text: " + popup.getText());
        Thread.sleep(1000);
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("Preferred Appointment Timings:"), "Wrong PDF file opened!");
    }


    public void clickSaveAndNextMemberPlan() {
        click(nextButtonMemberPlan, "Click on Next Button");
    }

    public void fillTravelerForm() {
        enterValue(firstName, CreatedDummyName(), "First Name successfully");
        enterValue(lastName, CreatedDummyName(), "Last Name successfully");
        enterValue(dateOfBirth, "04/20/1998", "Date of Birth successfully");
        enterValue(address, "near station", "Address successfully");
        enterValue(city, "California", "City successfully");
        enterValue(postalCode, CreatedZipNumber(), "Postal Code successfully");
        enterValue(emailUsername, CreatedDummyEmail(), "Email/Username successfully");
        enterValue(mobileCode, "91", "Mobile Code successfully");
        enterValue(mobileNumber, CreatedPhoneNumber(), "Mobile Number successfully");
    }

    public void enterMemberLoginCredentials() throws InterruptedException {
        Thread.sleep(1000);
        enterValue(password, "Tester@1", "Password");
        enterValue(confirmPassword, "Tester@1", "Confirm password");
        Thread.sleep(1000);
        click(nextButtonComprehensive, "Click on Next button");
    }

    public void SelectCheckBoxAuthentication () throws InterruptedException {
        Thread.sleep(10000);
       click(CheckBoxAuthentication,"");
       click(NextBTN,"");
    }


    public void fillPaymentForm() throws InterruptedException {
        enterValue(cardNumber, "4111111111111111", "Card Number successfully");
        selectRandomMonth();
        scrollUp(Scroll,500);
        enterValue(nameOnCard, CreatedDummyName(), "Name on Card successfully");
        selectRandomYear();
        enterValue(cvv, "123", "CVV successfully");
        click(chkTerms, "Select check Terms successfully");
        click(makePayment,"");
        Thread.sleep(100);
    }

    public void registerFlexibleUSCare() throws InterruptedException {
        clickRegister();
        clickUSEmployers();
        selectFlexibleUSCarePlan();
        click(memberPlan, "Select member Plan");
        scrollDowns(Scroll,200);
        clickNextMemberPlan();
        Thread.sleep(10000);
        fillTravelerForm();
        enterMemberLoginCredentials();
        fillPaymentForm();
    }

    public void registerRoutineMedicalCare() throws InterruptedException {
        clickRegister();
        clickUSEmployers();
        selectRoutineMedicalUSCarePlan();
        click(memberPlan, "Select member Plan");
        clickNextMemberPlan();
        Thread.sleep(10000);
        fillTravelerForm();
        enterMemberLoginCredentials();
        fillPaymentForm();
    }
    public void BusinessEmployerRegistration() throws Exception {
        clickRegister();
        clickUSEmployers();
        selectEmployerRegistration();
        click(StartBTN,"Click on Start Button");
        enterValue(BusinessName, CreatedDummyName(), "BusinessName Enter successfully");
        enterValue(Address, generateRandomAddressInCalifornia(), "BusinessName Enter successfully");
        enterValue(CityName, generateRandomCityInCalifornia(), "BusinessName Enter successfully");
        enterValue(StateName, "California", "BusinessName Enter successfully");
        enterValue(Zip,CreatedZipNumber(),"");
        Emailactual = CreatedDummyEmail();
        enterValue(Email, Emailactual, "Email");
        enterValue(CountryCode, "1", "Mobile Code");
        enterValue(PhoneNumber, CreatedPhoneNumber(), "Mobile Number");
        clickSaveAndNextMemberPlan();
        Thread.sleep(10000);
        click(NextButton,"Click On Next Button");
        click(selectLocation,"Select Location From Dropdown");
        Thread.sleep(1000);
        enterValue(ContactName,CreatedDummyName(),"Entered ContactName ");
        enterValue(ContactTitle,CreatedDummyName(),"Entered ContactTitle");
        click(SaveButton,"Click On Save Button");
        click(CheckBoxSelect,"Select CheckBox For Plan");
        enterValue(Contribution,"10","Entered Contribution");
        click(save_nextbutton,"Click on Save and Next");
        Thread.sleep(1000);
        String updatedEmail = UpdateExcelEmail.updateEmailInExcel();
        System.out.println("Excel updated with email: " + updatedEmail);
        By Filechoose = By.xpath("//input[@type=\"file\"]");
        String projectPath = System.getProperty("user.dir");
        String fileName = "EmployeeData.xlsx";
        String fullPath = projectPath + "/src/main/resources/testdata/" + fileName;
        driver.findElement(Filechoose).sendKeys(fullPath);
        Thread.sleep(10000);
        click(SelectDate,"Selected Plan Start Date");
        Thread.sleep(1000);
        click(next_btn,"Click on Save and Next");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        LocalDate nextMonth = LocalDate.now().plusMonths(1);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH);
        String expectedHeader = nextMonth.format(fmt);
        By headerBy = By.xpath("//div[contains(@class,'k-widget') and contains(@class,'k-calendar') and not(contains(@style,'display:none'))]//a[contains(@class,'k-link') and contains(@class,'k-nav-fast')]");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(headerBy, expectedHeader));
        WebElement calendar = driver.findElement(calendarWidgetBy);
        By firstDateRel = By.xpath(".//table//a[normalize-space(.)='1' and not(contains(@class,'k-other-month'))]");
        WebElement firstDate = calendar.findElement(firstDateRel);
        wait.until(ExpectedConditions.elementToBeClickable(firstDate));
        try {
            firstDate.click();
            Thread.sleep(1000);
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            WebElement calendarRetry = driver.findElement(calendarWidgetBy);
            WebElement freshFirstDate = calendarRetry.findElement(firstDateRel);

            wait.until(ExpectedConditions.elementToBeClickable(freshFirstDate));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", freshFirstDate);
        }
        WebDriverWait explicit_wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        explicit_wait.until(ExpectedConditions.elementToBeClickable(UploadandValidate));
        click(UploadandValidate,"Click On Upload and validate Button");
        Thread.sleep(10000);
        click(SaveandNextButton,"Click on Save and Next");
        enterValue(CardNumber, "4111111111111111", "Card Number");
        enterValue(CardName, CreatedDummyName(), "Name on Card");
        click(cardExpiryDropdown,"Open expiry dropdown");
        explicit_wait.until(ExpectedConditions.elementToBeClickable(SelectExpiryDropdown));
        click(SelectExpiryDropdown,"Open ExpiryDate Dropdown ");
        click(expiryYearOption,"Selected Expiry Date Dropdown");
        Thread.sleep(1000);
        enterValue(CvvField, "123", "Entered CVV");
        click(CompleteRegistration, "Completed Employee Registration");
        Thread.sleep(10000);
        TestFetchCredentialsBusinessFromEmail();
    }

    public void EmployersRegistration() throws Exception {
        click(StartBTN,"Click on Start Button");
        enterValue(BusinessName, CreatedDummyName(), "BusinessName Enter successfully");
        enterValue(Address, generateRandomAddressInCalifornia(), "BusinessName Enter successfully");
        enterValue(CityName, generateRandomCityInCalifornia(), "BusinessName Enter successfully");
        enterValue(StateName, "California", "BusinessName Enter successfully");
        enterValue(Zip,CreatedZipNumber(),"");
        Emailactual = CreatedDummyEmail();
        enterValue(Email, Emailactual, "Email");
        enterValue(CountryCode, "1", "Mobile Code");
        enterValue(PhoneNumber, CreatedPhoneNumber(), "Mobile Number");
        clickSaveAndNextMemberPlan();
        Thread.sleep(10000);
        click(NextButton,"Click On Next Button");
        click(selectLocation,"Select Location From Dropdown");
        Thread.sleep(1000);
        enterValue(ContactName,CreatedDummyName(),"Entered ContactName ");
        enterValue(ContactTitle,CreatedDummyName(),"Entered ContactTitle");
        click(SaveButton,"Click On Save Button");
        click(CheckBoxSelect,"Select CheckBox For Plan");
        enterValue(Contribution,"10","Entered Contribution");
        click(save_nextbutton,"Click on Save and Next");
        Thread.sleep(1000);
        String updatedEmail = UpdateExcelEmail.updateEmailInExcel();
        ExcelEmail=updatedEmail;
        System.out.println("Excel updated with email: " + updatedEmail);
        By Filechoose = By.xpath("//input[@type=\"file\"]");
        String projectPath = System.getProperty("user.dir");
        String fileName = "EmployeeData.xlsx";
        String fullPath = projectPath + "/src/main/resources/testdata/" + fileName;
        driver.findElement(Filechoose).sendKeys(fullPath);
        Thread.sleep(10000);
        click(SelectDate,"Selected Plan Start Date");
        Thread.sleep(1000);
        click(next_btn,"Click on Save and Next");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        LocalDate nextMonth = LocalDate.now().plusMonths(1);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH);
        String expectedHeader = nextMonth.format(fmt);
        By headerBy = By.xpath("//div[contains(@class,'k-widget') and contains(@class,'k-calendar') and not(contains(@style,'display:none'))]//a[contains(@class,'k-link') and contains(@class,'k-nav-fast')]");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(headerBy, expectedHeader));
        WebElement calendar = driver.findElement(calendarWidgetBy);
        By firstDateRel = By.xpath(".//table//a[normalize-space(.)='1' and not(contains(@class,'k-other-month'))]");
        WebElement firstDate = calendar.findElement(firstDateRel);
        wait.until(ExpectedConditions.elementToBeClickable(firstDate));
        try {
            firstDate.click();
            Thread.sleep(1000);
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            WebElement calendarRetry = driver.findElement(calendarWidgetBy);
            WebElement freshFirstDate = calendarRetry.findElement(firstDateRel);

            wait.until(ExpectedConditions.elementToBeClickable(freshFirstDate));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", freshFirstDate);
        }
        WebDriverWait explicit_wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        explicit_wait.until(ExpectedConditions.elementToBeClickable(UploadandValidate));
        click(UploadandValidate,"Click On Upload and validate Button");
        Thread.sleep(10000);
        click(SaveandNextButton,"Click on Save and Next");
        enterValue(CardNumber, "4111111111111111", "Card Number");
        enterValue(CardName, CreatedDummyName(), "Name on Card");
        click(cardExpiryDropdown,"Open expiry dropdown");
        explicit_wait.until(ExpectedConditions.elementToBeClickable(SelectExpiryDropdown));
        click(SelectExpiryDropdown,"Open ExpiryDate Dropdown ");
        click(expiryYearOption,"Selected Expiry Date Dropdown");
        Thread.sleep(1000);
        enterValue(CvvField, "123", "Entered CVV");
        click(CompleteRegistration, "Completed Employee Registration");
        Thread.sleep(100000);
        TestFetchCredentialsEmployeeFromEmail();
    }


    public void BookDoctor_Appointment() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(EarliestCheckBox, "Select CheckBox For Earliest Appointment");
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(NewMember, "Click on New Member Button");
        Thread.sleep(1000);
        click(SelectPlan, "Select Member Plan");
        clickNextPlan_Btn();
        Thread.sleep(10000);
        fillTravelerForm();
        enterMemberLoginCredentials();
        fillPaymentForm();
        verifyBooking_Details();

    }
    public void BookDoctor_AvailableAppointment() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        Thread.sleep(1000);
        click(SelectCheckBox, "Select CheckBox");
        click(Option1,"Select Option Date One");
        Thread.sleep(1000);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        click(Option2,"Select Option Date Two");
        enterValue(ApptDate2, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate2, Keys.ENTER);
        click(Option3,"Select Option Date Three");
        enterValue(ApptDate3, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate3, Keys.ENTER);
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(NewMember, "Click on New Member Button");
        Thread.sleep(1000);
        click(SelectPlan, "Select Member Plan");
        clickNextPlan_Btn();
        Thread.sleep(10000);
        fillTravelerForm();
        enterMemberLoginCredentials();
        Thread.sleep(500);
        fillPaymentForm();
        verifyBooking_TimeVerifyBooking();

    }
    public void BookDoctor_AppointmentExistingMember() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(1000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(EarliestCheckBox, "Select CheckBox For Earliest Appointment");
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(ExistingMember,"Created Appointment with Existing Member");
    }
    public void BookDoctor_AppointmentWithExistingMemberAvailableDate() throws Exception {
        clickBook_Appointment();
        enterValue(SearchZip, CreatedZipNumber(), "Enter Zip Code");
        Thread.sleep(10000);
        click(Next_BTN, "Click On Next Button");
        click(SelectCheckBox, "Select CheckBox");
        click(Option1,"Select Option Date One");
        Thread.sleep(1000);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        enterValue(ApptDate1, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate1, Keys.ENTER);
        click(Option2,"Select Option Date Two");
        enterValue(ApptDate2, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate2, Keys.ENTER);
        click(Option3,"Select Option Date Three");
        enterValue(ApptDate3, Keys.ARROW_RIGHT);
        Thread.sleep(500);
        enterValue(ApptDate3, Keys.ENTER);
        enterValue(comment, CreatedDummyName(), "Enter Comments");
        click(ExistingMember,"Created Appointment with Existing Member");

    }

  public void TestFetchCredentialsEmployeeFromEmail() throws Exception {
      String fromAddress = "support@myphysicianplan.com";
      String subjectKeyword = "STG: MyPhysicianPlan: Welcome";


      // 1️⃣ Get the email body
      String emailBody = GmailUtils.getEmailBodyWithKeyword(fromAddress, subjectKeyword, "Employee Login");

      // 2️⃣ Clean HTML tags (if any)
      String plainTextBody = Jsoup.parse(emailBody).text();

      // 3️⃣ Extract username and password using regex
      Map<String, String> credentials = new HashMap<>();

      Pattern userPattern = Pattern.compile("UserName:\\s*(\\S+)");
      Matcher userMatcher = userPattern.matcher(plainTextBody);
      if (userMatcher.find()) {
          credentials.put("Username", userMatcher.group(1));
      }

      Pattern passPattern = Pattern.compile("Temporary Password:\\s*(\\S+)");
      Matcher passMatcher = passPattern.matcher(plainTextBody);
      if (passMatcher.find()) {
          extractedPassword = passMatcher.group(1); // save into string
          credentials.put("Password", extractedPassword); // also put into map
      }
      System.out.println("Extracted Password: " + extractedPassword);
      // 4️⃣ Print results
      System.out.println("Username: " + credentials.get("Username"));
      System.out.println("Password: " + credentials.get("Password"));
  }




    public void TestFetchCredentialsBusinessFromEmail() throws Exception {
            String fromAddress = "support@myphysicianplan.com";
            String subjectKeyword = "STG: MyPhysicianPlan: Welcome";


        // 1️⃣ Get the email body
        String emailBody = GmailUtils.getEmailBodyWithKeyword(fromAddress, subjectKeyword, "Business Login");

        // 2️⃣ Clean HTML tags (if any)
        String plainTextBody = Jsoup.parse(emailBody).text();

        // 3️⃣ Extract username and password using regex
        Map<String, String> credentials = new HashMap<>();

        Pattern userPattern = Pattern.compile("UserName:\\s*(\\S+)");
        Matcher userMatcher = userPattern.matcher(plainTextBody);
        if (userMatcher.find()) {
            credentials.put("Username", userMatcher.group(1));
        }

        Pattern passPattern = Pattern.compile("Temporary Password:\\s*(\\S+)");
        Matcher passMatcher = passPattern.matcher(plainTextBody);
        if (passMatcher.find()) {
            extractedPassword = passMatcher.group(1); // save into string
            credentials.put("Password", extractedPassword); // also put into map
        }
        // 4️⃣ Print results
        System.out.println("Username: " + credentials.get("Username"));
        System.out.println("Password: " + credentials.get("Password"));
    }


    public void TestFetchCredentialsMembersFromEmail() throws Exception {

        String body = GmailUtils.getLatestEmailBody(
                "support@myphysicianplan.com",
                "Welcome"
        );

        pwd = GmailUtils.extractPasswordFromTravelEmail(body);

        System.out.println("Password = " + pwd);
    }

    public void LoginWithCredentialExcelFromEmail() throws InterruptedException {
        enterValue(Username, ExcelEmail, "Username Field");
        Thread.sleep(10000);
        enterValue(Password,extractedPassword, "Password Field");
        click(BTN_login, "Click on Login");
        Thread.sleep(10000);
        enterValue(NewPassword, "Tester@1", "");
        enterValue(ConfirmPassword, "Tester@1", "");
        Thread.sleep(10000);
        click(BTNSubmit, "");
        Thread.sleep(10000);
    }

    public void LoginWithCredentialBusinessFromEmail() throws InterruptedException {
        enterValue(Username, Emailactual, "Username Field");
        Thread.sleep(10000);
        enterValue(Password, extractedPassword, "Password Field");
        click(BTN_login, "Click on Login");
        Thread.sleep(10000);
        enterValue(NewPassword, "Tester@1", "");
        enterValue(ConfirmPassword, "Tester@1", "");
        Thread.sleep(10000);
        click(BTNSubmit, "");
        Thread.sleep(10000);
    }

    public void LoginWithCredentialsFromEmail() throws InterruptedException {
        enterValue(Username, MemberEmail, "Username Field");
        Thread.sleep(10000);
        enterValue(Password, pwd, "Password Field");
        click(BTN_login, "Click on Login");
        Thread.sleep(10000);
        enterValue(NewPassword, "Tester@1", "");
        enterValue(ConfirmPassword, "Tester@1", "");
        Thread.sleep(10000);
        click(BTNSubmit, "");
        Thread.sleep(10000);
    }
    public void selectRandomMonth() throws InterruptedException {
        driver.findElement(date).click();
        Thread.sleep(400); // allow animation
        int randomSteps = new Random().nextInt(12) + 1;
        WebElement dropdown = driver.switchTo().activeElement();
        for (int i = 0; i < randomSteps; i++) {
            dropdown.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(80);
        }
        dropdown.sendKeys(Keys.ENTER);
    }


    public void selectRandomYear() throws InterruptedException {
        driver.findElement(ClickYear).click();
        Thread.sleep(400);
        int totalYears = 15;
        int randomSteps = new Random().nextInt(totalYears) + 1;
        WebElement active = driver.switchTo().activeElement();
        for (int i = 0; i < randomSteps; i++) {
            active.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(80);
        }
        active.sendKeys(Keys.ENTER);
    }


}

