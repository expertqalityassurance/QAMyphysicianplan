package com.selenium.ui.pageobjects.Register;

import com.selenium.dataprovider.GlobalPropertiesReader;
import com.selenium.ui.UpdateExcel.UpdateExcelEmail;
import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static com.selenium.ui.pageobjects.Register.RegisterPageTravelers.*;

public class RegisterHealthCareFacilityProvider extends BasePage {
    public static String BlockedName;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    By USERNAME= By.xpath("//*[@id='UserName']");
    By PASSWORD = By.xpath("//*[@id='Password']");
    By LOGIN_BTN = By.xpath("//*[@id='btnLogin']");
    By actionSelect = By.xpath("//ul[contains(@id,'State') and contains(@class,'k-list')]//li");
    By SelectFacilities = By.xpath("//ul[@id='OrganizationNames_listbox']//li");
    By selectPayType = By.xpath("");
    By Facilities = By.xpath("//*[@id='liViewOrganizations']");
    By Business = By.xpath("//*[@id='liEmployers']");
    By PaymentSetup = By.xpath("//*[@id='orgOnboarding']/ul/li[6]/a");
    By NewInvitation = By.xpath("//*[@id='liHealthChampionReferral']");
    By FacilitiesDrop = By.xpath("//*[@id='OrganizationNames']");
    By Name = By.xpath("//*[@id='Name']");
    By EmailId = By.xpath("//*[@id='Email']");
    By ContactNumber = By.xpath("//*[@id='ContactNumber']");
    By SendBTN = By.xpath("//*[@id='divWindow']/div[7]/div/button[2]");
    By AddBusiness = By.xpath("//*[@id='divMain']/div/div[2]/div/div/button");
    By AddFacility = By.xpath("//*[@id='divMainRegistration']/div/div[1]/div/div/button");
    By FacilityName = By.xpath("(//input[@id='OrganizationName'])[1]");
    By DoctorFirstName = By.xpath("//*[@id='ProviderFirstName']");
    By DoctorLastName = By.xpath("//*[@id='ProviderLastName']");
    By PhoneNumber = By.xpath("//*[@id='ContactNumber']");
    By Email = By.xpath("//*[@id='Email']");
    By StreetAddress = By.xpath("//*[@id='Address']");
    By City = By.xpath("//*[@id='CityName']");
    By State = By.xpath("//*[@id='divMainRegistration']/div[5]/div[2]/span[2]/span");
    By PostalCode = By.xpath("//*[@id='Zip']");
    By FamilyPractice = By.xpath("//*[@id='divSpecializationList']/input[1]");
    By ObstetricsGynecology = By.xpath("//*[@id='divSpecializationList']/input[2]");
    By InternalMedicine = By.xpath("//*[@id='divSpecializationListRight']/input[1]");
    By Pediatrics = By.xpath("//*[@id='divSpecializationListRight']/input[2]");
    By Geriatrician = By.xpath("//*[@id='divSpecializationList']/input[3]");
    By Password = By.xpath("//*[@id='Password']");
    By ConfirmPassword = By.xpath("//*[@id='ConfirmPassword']");
    By SubmitBTN = By.xpath("//*[@id='btnSubmitClick']");
    By MemberTab = By.xpath("//*[@id='liMemberList']");
    By MemberBTN = By.xpath("//*[@id='btnAddMember']");
    By Diagnostics = By.xpath("//*[@id='liLabOrder']");
    By LabOrderBTN = By.xpath("//*[@id='divMain']/div/div[2]/div/div/button");
    By Member = By.xpath("//*[@id='MemberName']");
    By MemberS = By.xpath("//*[@id='MemberName_listbox']/li[1]");
    By CollectionDate = By.xpath("//*[@id='divMain']/div[3]/div[3]/span/span/span/span");
    By SelectCollectionDate = By.xpath("//*[@id='SampleDate']");
    By SelectedDate = By.xpath("//*[@id='SampleDate']");
    By Invoicing = By.xpath("//*[@id='divMain']/div[11]/button[1]");
    By Scroll = By.xpath("/html");
    By SaveBTN = By.xpath("//*[@id='divMain']/div[6]/div/button");
    By FilterOp = By.xpath("//*[@id='grid']/div[1]/div/table/thead/tr/th[2]/a[1]/span");
    By Content = By.xpath("/html/body/div[15]/form/div[1]/input");
    By FilterBTN = By.xpath("/html/body/div[15]/form/div[1]/div[2]/button[1]");
    By EditIcon = By.xpath("//*[@id='grid']/div[2]/table/tbody/tr/td[1]/a/span");
    By FilterOption = By.xpath("//*[@id='gvOrganizationGrid']/div[2]/div/table/thead/tr/th[2]/a[1]/span");
    By FilterOption3 = By.xpath("//*[@id='gvOrganizationGrid']/div[2]/div/table/thead/tr/th[4]/a[1]/span");
    By SelectValue = By.xpath("/html/body/div[15]/form/div[1]/span[2]/span/span[1]");
    By SelectPaymentOptions = By.xpath("//ul[contains(@class,'k-list')]/li");
    By Contains = By.xpath("/html/body/div[15]/form/div[1]/input");
    By EyeIconBTN = By.xpath("//tbody/tr[1]/td[1]/a[1]/span[1]");
    By EyeIcon = By.xpath("//*[@id=\"grid\"]/div[2]/table/tbody/tr[1]/td[1]/a/span");
    By TaxID = By.xpath("//*[@id='TaxID']");
    By SaveButton = By.xpath("//*[@id='btnSubmitClick']");
    By BranchTab = By.xpath("//*[@id='orgOnboarding']/ul/li[2]/a");
    By AddBranch = By.xpath("//*[@id='orgOnboarding-2']/div/div[1]/div/button");
    By BranchName = By.xpath("//*[@id='BranchName']");
    By BranchNumber = By.xpath("//*[@id='BranchContactNumber']");
    By BranchEmail = By.xpath("//*[@id='BranchEmail']");
    By BranchAddress = By.xpath("//*[@id='BranchAddress']");
    By ButtonConfirm = By.xpath("//*[@id='divBranchDetail']/div[6]/div/div/button");
    By SaveMessage = By.xpath("//*[@id='formStatus']");
    By OkBTN = By.xpath("//*[@id='btnClose']");
    By Providers = By.xpath("//*[@id='orgOnboarding']/ul/li[2]/a");
    By Plan = By.xpath("//*[@id='orgOnboarding']/ul/li[4]/a");
    By SubscribeBTN = By.xpath("//*[@id='btnSubscribe']");
    By AddProviders = By.xpath("//*[@id='btnAddProvider']");
    By ProviderFirstName = By.xpath("//*[@id='ProviderFirstName']");
    By ProviderLastName = By.xpath("//*[@id='ProviderLastName']");
    By Gender = By.xpath("//*[@id='Gender']");
    By NPIId = By.xpath("//*[@id='NPI']");
    By ProviderEmail = By.xpath("//*[@id='ProviderEmail']");
    By Specialization1 = By.xpath("//*[@id='1']");
    By Specialization2 = By.xpath("//*[@id='2']");
    By Specialization3 = By.xpath("//*[@id='3']");
    By Specialization4 = By.xpath("//*[@id='4']");
    By Specialization5 = By.xpath("//*[@id='5']");
    By Scroller = By.xpath("//*[@id='wndProvider']");
    By SubmitButton = By.xpath("//*[@id='btnSubmitClick']");
    By SelectOP = By.xpath("//*[@id='gridUnsubscribedPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
    By SelectFacility = By.xpath("//*[@id=\"orgOnboarding\"]/ul/li[6]/a");
    By EnterTaxID = By.xpath("//*[@id='TaxID']");
    By ScrollerForWindow = By.xpath("//*[@id='wndSubscribe']");
    By Subscribe = By.xpath("//*[@id='btnSubscribeSelectedPlan']");
    By CancelBTN = By.xpath("//*[@id='wndSubscribe']/div/div[5]/button[2]");
    By Terms = By.xpath("//*[@id='orgOnboarding']/ul/li[4]/a");
    By SelectFiLeBTN = By.xpath("//*[@id='OrgTerms']");
    By Upload = By.xpath("//*[@id=\"orgOnboarding-4\"]/div[1]/div/div/button");
    By UploadMessage = By.xpath("//*[@id='formStatus']");
    By SaveUploadFile = By.xpath("//*[@id='orgOnboarding']");
    By ProviderRemittanceTab = By.xpath("//*[@id=\"orgOnboarding\"]/ul/li[5]/a");
    By FinancialsTab = By.xpath("//*[@id='orgOnboarding']/ul/li[6]/a");
    By DocumentsTab = By.xpath("//*[@id='orgOnboarding']/ul/li[7]/a");
    By AccountNumber = By.xpath("//*[@id='AccountNumber']");
    By RoutingNumber = By.xpath("//*[@id='RoutingNumber']");
    By AccountName = By.xpath("//*[@id='AccountHolderName']");
    By SSNLast = By.xpath("//*[@id='SSNLast4']");
    By RepresentativeFirstName = By.xpath("//*[@id='FirstName']");
    By RepresentativeLastName = By.xpath("//*[@id='LastName']");
    By DateOfBirth = By.xpath("//*[@id='DOB']");
    By DateOfCalender = By.xpath("//*[@id='divElectronicPayment']/div[3]/div[3]/span[2]/span/span/span");
    By ConnectBTN = By.xpath("//*[@id='divPayment']/div[4]/div/div/button");
    By CheckPayments = By.xpath("//*[@id='btnAddPayment']");
    By AddCheckNumber = By.xpath("//*[@id='CheckNumber']");
    By AddCheckAmount = By.xpath("//*[@id='CheckAmount']");
    By SavePayment = By.xpath("//*[@id='divAddPayment']/div/div[3]/div/button[1]");
    By FileDescription = By.xpath("//*[@id='Description']");
    By UploadFile = By.xpath("//*[@id=\"orgOnboarding-7\"]/div[1]/div/div/button");
    By SelectFile = By.xpath("//*[@id='OrgDocuments']");
    By MessageTab = By.xpath("//*[@id='orgOnboarding']/ul/li[8]/a");
    By ComposeMail = By.xpath("//*[@id='orgOnboarding-8']/div[1]/button[3]");
    By Subject = By.xpath("//*[@id='Subject']");
    By MainMessage = By.xpath("//*[@id='BodyText']");
    By sendButton = By.xpath("//*[@id='Compose']/div[3]/div/div/button");
    By Save_Button = By.xpath("//*[@id='orgOnboarding-1']/footer/button");
    By Employees = By.xpath("//*[@id='orgOnboarding']/ul/li[7]/a");
    By EmployeesID = By.xpath("//*[@id='PaylocityEmployeeID']");
    By AddEmpButton = By.xpath("//*[@id='btnAddEmployee']");
    By DOBs = By.xpath("//*[@id='DOB']");
    By FirstNm = By.xpath("//*[@id='FirstName']");
    By LastNm = By.xpath("//*[@id='LastName']");
    By MobileNumber = By.xpath("//*[@id='MobileNumber']");
    By Address = By.xpath("//*[@id='Address12']");
    By btnEmployeeSave = By.xpath("//*[@id=\"btnEmployeeSave\"]");
    By Cityz = By.xpath("//*[@id='City2']");
    By States = By.xpath("//*[@id='State2']");
    By Zipcode = By.xpath("//*[@id='Zip2']");
    By EmployeeEmail = By.xpath("//*[@id='EmployeeEmail']");
    By CardNumber= By.xpath("//*[@id='CardNumber']");
    By CardName = By.xpath("//*[@id='NameOnCard']");
    By ExpiryYear = By.xpath("//*[@id='divbankdetails']/div[2]/div[1]/span[3]/span/span[1]");
    By SelectExpiryYear = By.xpath("//*[@id='YY_listbox']/li[6]");
    By CVV = By.xpath("//*[@id='CVV']");
    By BankInstantly = By.xpath("//*[@id='divCarddetails']/div[2]/a[2]");
    By SaveBankDetails = By.xpath("//*[@id='submit-bank']");
    By DateEligibility = By.xpath("//*[@id='wndEligibility']/div/div[3]/div[1]/span[1]/span/span");
    By SelectEligibilityDate = By.xpath("//*[@id='ApptDate']");
    By NotifyBTN  = By.xpath("//*[@id='wndEligibility']/div/div[3]/div[1]/button[2]");
    By ApptAction  = By.xpath("//*[@id='gridAppt']/div[2]/table/tbody/tr/td[2]/a");
    By AppointmentMessage   = By.xpath("//*[@id='wndMessage']");
    By wndMessageCloseBox   = By.xpath("//div[@id='wndMessageBox']//button[@id='btnSuccess']");
    By CancelApptBTN = By.xpath("//a[normalize-space()='Cancel Appt']");
    By PlanStatusFilter = By.xpath("//*[@id='gridMembers']/div[1]/div/table/thead/tr/th[8]/a[1]/span");
    By EmailFilter = By.xpath("//*[@id=\"gridMembers\"]/div[1]/div/table/thead/tr/th[4]/a[1]/span");
    By InputEmail = By.xpath("(//input[@type='text'])[4]");
    By SelectFilterOption = By.xpath("//input[@value='false']");
    By SelectFilterBTN = By.xpath("/html/body/div[17]/form/div[1]/input");
    By ClickFilterBTN = By.xpath ("/html/body/div[17]/form/div/div[2]/button[1]");
    By EmailFilterBTN = By.xpath("/html/body/div[17]/form/div[1]/div[2]/button[1]");
    By SelectEyeIcon = By.xpath("//span[@class='glyphicon glyphicon-eye-open'])");
    By BlackListOption = By.xpath("//*[@id='divMain']/div[1]/div[2]/a[2]");
    By ConfirmMessageMember = By.xpath("//*[@id='lblconfirmMessage']");
    By YesBTN = By.xpath("//*[@id='btnYes']");
    By FetchUserName = By.xpath("//input[@id='Email']");
    By EndPlan = By.xpath("//*[@id='divMain']/div[1]/div[2]/a[1]");
    By LogOutIcon = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul[2]/li/a/input");
    By YesBTNLogout = By.xpath("//*[@id='btnLogoutYes']");





    public RegisterHealthCareFacilityProvider()
    {
        super();
    }

    public void FillHealthCareFacilityDetails() throws InterruptedException {
        click(AddFacility,"");
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        FirstName=CreatedDummyName();
        enterValue(FacilityName,FirstName,"");
        enterValue(DoctorFirstName,CreatedDummyName(),"");
        enterValue(DoctorLastName,CreatedDummyName(),"");
        enterValue(DoctorLastName,CreatedDummyName(),"");
        enterValue(PhoneNumber,CreatedPhoneNumber(),"");
        enterValue(Email,CreatedDummyEmail(),"");
        enterValue(StreetAddress,generateRandomAddressInCalifornia(),"");
        enterValue(City,"California","");
        click(State,"");
        selectCategoryByIndex(2);
        enterValue(PostalCode,CreatedZipNumber(),"");
        click(FamilyPractice,"");
        click(ObstetricsGynecology,"");
        click(InternalMedicine,"");
        click(Pediatrics,"");
        click(Pediatrics,"");
        click(Geriatrician,"");
    }

    public void FillHealthCareFacilityPasswordDetails() throws InterruptedException {
        enterValue(Password,"Tester@1","");
        enterValue(ConfirmPassword,"Tester@1","");
        click(SubmitBTN,"");
        enterValue(ConfirmPassword,"Tester@1","");
        Thread.sleep(1000);

    }
    public void CheckWithLogin() throws InterruptedException {
        enterValue(Password,"Tester@1","");
        click(LOGIN_BTN,"");
        Thread.sleep(1000);

    }
    public void SelectFacilitiesTab() {
        click(Facilities, "Select member Plan");
    }

    public void MemberModule () throws InterruptedException {
        click(MemberTab, "Select member Plan");
    }
    public void SelectBusinessTab() {
        click(Business, "Select member Plan");
    }
    public void SelectPaymentSetupTab() {
        click(PaymentSetup, "Select member Plan");
    }

    public void UpdateBusinessDetails() throws Exception {
            click(Save_Button,"");
            Thread.sleep(1000);
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='errTaxID']")));
            String popupText = popup.getText();
            System.out.println(popupText);
            String expectedMessage = "Tax ID Required";
            Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
            Thread.sleep(10000);
            enterValue(EnterTaxID, 12345, "");
            Thread.sleep(1000);
            click(Save_Button,"");
            WebElement pop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
            String popupText1 = pop.getText();
            System.out.println(popupText1);
            String expectedMessages = "Your profile has been saved";
            Assert.assertEquals(popupText1.trim(), expectedMessages, "Popup message is not as expected!");
    }
    public void BusinessDetails() throws Exception {
        click(FilterOp, "");
        Thread.sleep(1000);
        enterValue(Contains, "TestName", "");
        click(FilterBTN, "");
        Thread.sleep(1000);
        click(EyeIcon, "");
    }
    public void PaymentDetails() throws Exception {
        enterValue(CardNumber,"4111111111111111","");
        enterValue(CardName,CreatedDummyName(),"");
        click(ExpiryYear,"");
        click(SelectExpiryYear,"");
        enterValue(CVV,CreatedDummyName(),"");
        Thread.sleep(1000);
        click(BankInstantly,"");
        click(SaveBankDetails,"");
        Thread.sleep(100000);
    }
    public void AddEmployeeInBusiness() throws Exception {
        click(Employees,"");
        click(AddEmpButton,"");
        enterValue(EmployeesID,generateRandomNumbers(5),"");
        enterValue(DOBs,"04/20/1998","");
        enterValue(EmployeeEmail,CreatedDummyEmail(),"");
        enterValue(FirstNm,CreatedDummyName(),"");
        enterValue(LastNm,CreatedDummyName(),"");
        enterValue(MobileNumber,generateRandomNumbers(10),"");
        enterValue(Address,generateRandomAddressInCalifornia(),"");
        enterValue(Cityz,generateRandomCityInCalifornia(),"");
        enterValue(States,"California","");
        enterValue(Zipcode,CreatedZipNumber(),"");
        Thread.sleep(1000);
        click(btnEmployeeSave,"");
        Thread.sleep(100000);
    }

    public void clickAction() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
        try {
            okButton.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", okButton);
        }
    }

    public void ValidationMessage() throws InterruptedException {
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lblUserMessagee\"]")));
        String popupText = popup.getText();
        System.out.println(popupText);
        Thread.sleep(10000);
        String expectedMessage = "Facility Created Successfully.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }

    public void SearchAndUpdateFacility() throws InterruptedException {
        click(FilterOption,"");
        enterValue(Contains,FirstName,"");
        click(FilterBTN,"");
        click(EyeIconBTN,"");
        enterValue(TaxID,"27AXXXX1234A1Z5","");
        click(SaveButton,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        String expectedMessage = "Saved Successfully";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");


    }
    public void SelectFacility() throws InterruptedException {
        click(EyeIconBTN,"");
        click(BranchTab,"");
        click(AddBranch,"");
        enterValue(BranchName,CreatedDummyName(),"");
        enterValue(BranchNumber,CreatedPhoneNumber(),"");
        enterValue(BranchEmail,CreatedDummyEmail(),"");
        enterValue(BranchAddress,generateRandomAddressInCalifornia(),"");
        click(ButtonConfirm,"");
        Thread.sleep(10000);
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orgOnboarding\"]/ul/li[2]/a")));
        String popupText = popup.getText();
        String expectedMessage = "Providers";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }
    public void AddProviders() throws InterruptedException {
        click(Providers,"");
        click(AddProviders,"");
        enterValue(ProviderFirstName,CreatedDummyName(),"");
        enterValue(ProviderLastName,CreatedDummyName(),"");
        click(Gender,"");
        enterValue(NPIId,CreatedPhoneNumber(),"");
        enterValue(ProviderEmail,CreatedDummyEmail(),"");
        click(Specialization1,"");
        click(Specialization2,"");
        click(Specialization3,"");
        click(Specialization4,"");
        click(Specialization5,"");
        scrollDowns(Scroller,200);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='btnSubmitClick'])[3]")));
        okButton.click();
        Thread.sleep(100000);

    }
    public void AddSubscribePlan() throws InterruptedException {
        click(SelectFacility,"");
        click(Plan, "");
        click(SubscribeBTN, "");
        click(SelectOP,"");
        scrollDowns(ScrollerForWindow,20);
        click(Subscribe,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='planFormStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Plan Subscribed Successfully";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        click(CancelBTN,"");
    }

    public void UploadExhibitBPlan() throws InterruptedException {
        click(FilterOption,"");
        enterValue(Contains,"TestName","");
        click(FilterBTN,"");
        Thread.sleep(1000);
        click(EyeIconBTN,"");
        enterValue(EnterTaxID,"12345","");
        click(Terms, "");
        By fileChoose = By.xpath("//input[@type='file']");
        UpdateExcelEmail.uploadFile(driver, fileChoose, "pdf-sample_0.pdf");
        Thread.sleep(1000);
        click(Upload,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Terms uploaded";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        click(SaveUploadFile,"");
    }
    public void AddElectronicRemittance() throws InterruptedException {
        click(FilterOption,"");
        enterValue(Contains,"TestName","");
        click(FilterBTN,"");
        Thread.sleep(1000);
        click(EyeIconBTN,"");
        enterValue(EnterTaxID,"12345","");
        click(ProviderRemittanceTab,"");
        enterValue(AccountNumber,"000999999991","");
        enterValue(RoutingNumber,"110000000","");
        enterValue(AccountName,CreatedDummyName(),"");
        enterValue(SSNLast,"12345","");
        enterValue(RepresentativeFirstName,CreatedDummyName(),"");
        enterValue(RepresentativeLastName,CreatedDummyName(),"");
        enterValue(DateOfBirth,"04/20/1998","");
        click(ConnectBTN,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "The following are required for electronic payments - State City";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        click(SaveUploadFile,"");
    }
    public void AddMPPPaymentsToFacility() throws InterruptedException {
        click(FilterOption,"");
        enterValue(Contains,"TestName","");
        click(FilterBTN,"");
        Thread.sleep(1000);
        click(EyeIconBTN,"");
        enterValue(EnterTaxID,"12345","");
        click(FinancialsTab,"");
        click(CheckPayments,"");
        enterValue(AddCheckNumber,"100001","");
        enterValue(AddCheckAmount,"100000","");
        click(SavePayment,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Payment saved.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        click(SaveUploadFile,"");
    }

    public void UploadDocumentsLicence_Malpractice_insurance() throws InterruptedException {
        click(FilterOption,"");
        enterValue(Contains,"TestName","");
        click(FilterBTN,"");
        Thread.sleep(1000);
        click(EyeIconBTN,"");
        enterValue(EnterTaxID,"12345","");
        click(DocumentsTab,"");
        enterValue(FileDescription,"This document is related to this facility.","");
        By fileSelect = By.xpath("(//input[@id='OrgDocuments'])[1]");
        UpdateExcelEmail.uploadFile(driver, fileSelect, "pdf-sample_0.pdf");
        click(UploadFile,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Document uploaded";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }

    public void MessageOrMailToFacilitator() throws InterruptedException {
        click(FilterOption, "");
        enterValue(Contains, "TestName", "");
        click(FilterBTN, "");
        Thread.sleep(1000);
        click(EyeIconBTN, "");
        enterValue(EnterTaxID, "12345", "");
        click(MessageTab,"");
        click(ComposeMail,"");
        enterValue(Subject,"Facility Registration Completed Successfully","");
        enterValue(MainMessage,"Dear TestName,\n" +
                "\n" +
                "Your facility has been successfully registered in the system.\n" +
                "You can now access all related features and begin managing your facility information.\n" +
                "\n" +
                "If you have any questions or need assistance, please feel free to reach out to our support team.\n" +
                "\n" +
                "Best regards,\n" +
                "[Your Name]\n" +
                "[Your Company Name / Team Name]","");
        click(sendButton,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Email sent";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }
    public void FillBusinessDetails() throws InterruptedException {
        click(Business, "Select member Plan");
        click(AddBusiness, "");
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
    }

    public void FillNewMemberDetails() throws InterruptedException {
        click(NewInvitation, "Select member Plan");
        click(FacilitiesDrop, "");
        Thread.sleep(10000);
        enterValue(FacilitiesDrop, Keys.SPACE);
        Thread.sleep(1000);
        SelectFacilitiesCategoryByIndex(3);
        enterValue(Name,CreatedDummyName()," ");
        enterValue(EmailId,CreatedDummyEmail(),"");
        enterValue(ContactNumber,CreatedPhoneNumber(),"");
        click(SendBTN,"");
    }
    public void AddedMemberWithAdmin() throws InterruptedException {
        click(MemberTab, "Select member Plan");
        click(MemberBTN, "");
        Thread.sleep(10000);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
    }

    public void VerifyRegistrationMessage() {
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formStatus']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "Record Saved. Error in sending SMS. Email Sent.";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }

    public void VerifyValidationMessage() throws InterruptedException {
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='spnErrormsg']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        Thread.sleep(10000);
        String expectedMessage = "Please Enter Ordering Physician";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }
    public void VerifyValidationCollection_DateMessage() throws InterruptedException {
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='spnErrormsg']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        Thread.sleep(10000);
        String expectedMessage = "Please Enter Collection Date";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }
    public String selectCategoryByIndex(int index) throws InterruptedException {
        int flag = 0;
        List<WebElement> allOptions = driver.findElements(actionSelect);
        String selectedText = null;

        for (WebElement e : allOptions) {
            if (flag == index) {
                selectedText = e.getText();
                Thread.sleep(1000);
                e.click();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            }
            flag++;
        }
        return selectedText;
    }
    public String SelectFacilitiesCategoryByIndex(int index) throws InterruptedException {
        int flag = 0;
        List<WebElement> allOptions = driver.findElements(SelectFacilities);
        String selectedText = null;

        for (WebElement e : allOptions) {
            if (flag == index) {
                selectedText = e.getText();
                Thread.sleep(1000);
                e.click();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            }
            flag++;
        }
        return selectedText;
    }
    public String SelectPaymentTypeByIndex(int index) throws InterruptedException {
        List<WebElement> allOptions = driver.findElements(SelectPaymentOptions);
        String selectedText = null;

        // Retry once if dropdown not yet loaded
        if (allOptions.isEmpty()) {
            Thread.sleep(1000);
            allOptions = driver.findElements(SelectPaymentOptions);
        }

        int flag = 0;
        for (WebElement e : allOptions) {
            if (flag == index) {
                selectedText = e.getText();
                Thread.sleep(1000);
                e.click();
                Thread.sleep(1000);
                break;
            }
            flag++;
        }
        return selectedText;
    }
    public void CheckDate_of_Appointment() throws InterruptedException {
        // Get all Action column cells
        List<WebElement> actionCells = driver.findElements(By.xpath("//*[@id=\"gridMembers\"]/div[2]"));

        // Random row selection
        Random random = new Random();
        int randomRow = random.nextInt(actionCells.size());
        WebElement selectedActionCell = actionCells.get(randomRow);
        Thread.sleep(10000);
        // Get the "Check In" and "Eligibility" links
        List<WebElement> actions = selectedActionCell.findElements(
                By.xpath("//a[contains(text(),'Eligibility')]")
        );
        Thread.sleep(20000);
        int randomAction = random.nextInt(actions.size());
        actions.get(randomAction).click();
        Thread.sleep(1000);
        click(DateEligibility,"");
        enterValue(SelectEligibilityDate, Keys.ARROW_DOWN);
        enterValue(SelectEligibilityDate,Keys.ENTER);
        click(NotifyBTN,"");
        String popupText = getText(ApptAction);
        System.out.println(popupText);
        String expectedMessage = "Cancel Appt";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        click(NotifyBTN,"");
        Thread.sleep(1000);
        String popupWndText = getText(AppointmentMessage);
        System.out.println(popupWndText);
        String expectedPopUpMessage = "Appointment for this day already exists for member.";
        Assert.assertEquals(popupWndText.trim(), expectedPopUpMessage, "Popup message is not as expected!");
        click(wndMessageCloseBox,"");
        click(CancelApptBTN,"");
    }
    public void CreateBlackList() throws InterruptedException {

        click(PlanStatusFilter,"");
        click(SelectFilterOption,"");
        click(SelectFilterBTN,"");
        Thread.sleep(10000);
        List<WebElement> eyeIcons = driver.findElements(By.xpath("//span[@class='glyphicon glyphicon-eye-open']"));
        if (eyeIcons.isEmpty()) {
            throw new RuntimeException("No eye icons found on the page!");
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(eyeIcons.size());
        WebElement selectedEye = eyeIcons.get(randomIndex);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectedEye);
        selectedEye.click();

        WebElement BlockedUserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Email']")));
        BlockedName = BlockedUserName.getAttribute("value");

        Thread.sleep(1000);
        click(BlackListOption, "");

        // Read popup
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='lblconfirmMessage']")));
        String popupText = popup.getText().trim();

        String blacklistMsg = "The member will be blacklisted and will not be able to enroll in any plans?";
        String removeBlacklistMsg = "The member will be removed from blacklist and be allowed to enroll in any plan?";

        if (popupText.equals(removeBlacklistMsg)) {
            System.out.println("User is already blacklisted → Removing from blacklist...");

            click(ConfirmMessageMember, "");
            click(YesBTN, "");

            // Wait for actions to complete
            Thread.sleep(2000);

            // 🔥 Second attempt: now blacklist again
            click(BlackListOption, "");

            WebElement popup2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[@id='lblconfirmMessage']")));
            String popupText2 = popup2.getText().trim();
            System.out.println("Popup after removing: " + popupText2);

            Assert.assertEquals(popupText2, blacklistMsg, "Expected blacklist message after removal");

            click(ConfirmMessageMember, "");
            click(YesBTN, "");

            System.out.println("User successfully blacklisted after removing.");
        }
        else if (popupText.equals(blacklistMsg)) {
            System.out.println("User is not blacklisted → Proceeding with blacklist...");

            click(ConfirmMessageMember, "");
            click(YesBTN, "");

            System.out.println("User successfully blacklisted.");
        }
        else {
            Assert.fail("Unexpected popup message: " + popupText);
        }
    }

    public void ValidationBlackListLogin() throws InterruptedException {
     click(LogOutIcon,"");
     Thread.sleep(2000);
     click(YesBTNLogout,"");
     enterValue(USERNAME, MemberEmail, "Username Field");
     Thread.sleep(2000);
     enterValue(PASSWORD,"Tester@1", "Password Field");
     click(LOGIN_BTN,"");
     Thread.sleep(10000);
    }

    public void SelectMemberForBlackList() throws InterruptedException {
        click(EmailFilter,"");
        enterValue(InputEmail,MemberEmail,"");
        click(EmailFilterBTN,"");
        Thread.sleep(10000);
        click(EyeIconBTN,"");
        click(BlackListOption, "");
        click(ConfirmMessageMember, "");
        click(YesBTN, "");
        Thread.sleep(10000);
    }

    public void CheckForDeactivateMember() throws InterruptedException {
        click(EmailFilter,"");
        enterValue(InputEmail,MemberEmail,"");
        click(EmailFilterBTN,"");
        Thread.sleep(10000);
        click(EyeIconBTN,"");
        click(EndPlan,"");
        click(ConfirmMessageMember, "");
        click(YesBTN, "");
        Thread.sleep(10000);
    }

    public void DeactivationPlan() throws InterruptedException {
        click(PlanStatusFilter,"");
        Thread.sleep(10000);
        click(SelectFilterOption,"");
        click(ClickFilterBTN,"");
        Thread.sleep(10000);
        List<WebElement> eyeIcons = driver.findElements( By.xpath("//span[@class='glyphicon glyphicon-eye-open']") );
        System.out.println("Total Eye Icons Found: " + eyeIcons.size());
        if (eyeIcons.isEmpty())
        {Thread.sleep(10000);
            throw new RuntimeException("No eye icons found on the page!");
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(eyeIcons.size());
        WebElement selectedEye = eyeIcons.get(randomIndex);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectedEye);
        selectedEye.click();
        System.out.println("Clicked Eye Icon at Index: " + randomIndex);
        String email = driver.findElement(FetchUserName).getAttribute("value");
        System.out.println("Fetched Username: " + email);
        click(EndPlan,"");
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lblconfirmMessage']")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = "The member's plan will get deactivated today. Are you sure you want to terminate the member plan?";
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
        click(YesBTN,"");
    }


    }

