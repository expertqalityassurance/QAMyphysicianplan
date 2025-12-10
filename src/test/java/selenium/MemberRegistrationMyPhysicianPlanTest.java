package selenium;

import com.selenium.dataprovider.JsonDataProvider;
import com.selenium.ui.pageobjects.Loginsite.LoginPage;
import com.selenium.ui.pageobjects.Register.*;
import com.selenium.ui.pageobjects.ValidationChecks.ValidationPage;
import com.selenium.ui.testbase.TestBase;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class MemberRegistrationMyPhysicianPlanTest extends TestBase {

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the plan for US employers with Employer Registration.", priority = 15)
    public void TC022_EmployerRegistration(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().clickRegister();
        new RegisterPageUSEmployers().clickUSEmployers();
        new RegisterPageUSEmployers().selectEmployerRegistration();
        new RegisterPageUSEmployers().EmployersRegistration();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the plan for US employers with Employer Registration.", priority = 20)
    public void TC023_EmployerRegistrationWithCheckEmployeeLogin (String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().clickRegister();
        new RegisterPageUSEmployers().clickUSEmployers();
        new RegisterPageUSEmployers().selectEmployerRegistration();
        new RegisterPageUSEmployers().EmployersRegistration();
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().LoginWithCredentialExcelFromEmail();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the plan for US employers with Employer Registration for Business.", priority = 21)
    public void TC024_EmployerRegistrationWithCheckBusinessLogin (String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().BusinessEmployerRegistration();
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().LoginWithCredentialBusinessFromEmail();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration of New User With Flexible USCare with Initial Unshareable Amount (IUA).", priority = 24)
    public void TC025_RegistrationWithFlexible_US_CarePage(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new ValidationPage().ValidationCheckAvailabilityForFlexible_US_CarePage();
        new ValidationPage().PrimaryMemberFormWithValid_Date();
        new RegisterPageUSEmployers().fillPaymentForm();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the Registered User With Flexible USCare with Initial Unshareable Amount (IUA)", priority = 25)
    public void TC026_RegistrationWithFlexible_US_CarePage(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new ValidationPage().ValidationCheckAvailabilityForFlexible_US_CarePage();
        new ValidationPage().PrimaryMemberFormWithValid_Date();
        new RegisterPageUSEmployers().fillPaymentForm();
        new RegisterPagePeopleUS().TestLoginFetchedCredentialsFromEmail();
    }
   @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the Registered User With Flexible USCare with Initial Unshareable Amount (IUA)", priority = 26)
    public void TC027_AddCoverage_to_preexisting_conditionsPolicyMax(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageTravelers().AddCoverage_to_pre_existingConditions();
        new RegisterPageTravelers().selectRandomPlanAndVerifyPriceChange();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify DueAmount With TravelerCount", priority = 27)
    public void TC028_ToCheckPolicyMax_DueAmountWithTravelerCount(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageTravelers().AddCoverageWith_NumberOfTravelers_pre_existingConditions();
        new RegisterPageTravelers().selectRandomPlanAndVerifyPriceChange();
        new RegisterPageTravelers().verifyAmountDueLogic();
    }


}
