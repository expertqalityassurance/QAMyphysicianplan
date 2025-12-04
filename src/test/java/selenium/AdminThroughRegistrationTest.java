package selenium;

import com.selenium.dataprovider.JsonDataProvider;
import com.selenium.ui.pageobjects.Admin.AdminGroupCreation;
import com.selenium.ui.pageobjects.Admin.AdminPayments;
import com.selenium.ui.pageobjects.Admin.AdminUserCreation;
import com.selenium.ui.pageobjects.Admin.Management;
import com.selenium.ui.pageobjects.Loginsite.LoginPage;
import com.selenium.ui.pageobjects.Register.RegisterHealthCareFacilityProvider;
import com.selenium.ui.pageobjects.Register.RegisterPagePeopleUS;
import com.selenium.ui.pageobjects.Register.RegisterPageTravelers;
import com.selenium.ui.pageobjects.Register.RegisterPageUSEmployers;
import com.selenium.ui.testbase.TestBase;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class AdminThroughRegistrationTest extends TestBase {

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with HealthCare Facility Provider", priority = 1)
    public void TC001_HealthCare_FacilityProviderRegistration(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityDetails();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityPasswordDetails();
        new RegisterHealthCareFacilityProvider().ValidationMessage();
        new RegisterHealthCareFacilityProvider().clickAction();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with Search And Update Registered HealthCare Facility", priority = 2)
    public void TC002_SearchAndUpdateRegisteredHealthCare_Facility(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityDetails();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityPasswordDetails();
        new RegisterHealthCareFacilityProvider().ValidationMessage();
        new RegisterHealthCareFacilityProvider().clickAction();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().SearchAndUpdateFacility();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Add Branch HealthCare Facility", priority = 3)
    public void TC003_AddBranchHealthCare_Facility(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().SelectFacility();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Providers HealthCare Facility", priority = 4)
    public void TC004_AddProvidersHealthCare_Facility(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().SelectFacility();
        new RegisterHealthCareFacilityProvider().AddProviders();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Subscribe Plan HealthCare Facility", priority = 5)
    public void TC005_AddSubscribePlanHealthCare_Facility(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().AddSubscribePlan();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify UploadExhibitDoc Plan HealthCare Facility", priority = 6)
    public void TC006_UploadExhibitDoc_PlanHealthCare_Facility(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().UploadExhibitBPlan();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added ElectronicRemittanceDetails", priority = 7)
    public void TC007_AddedElectronicRemittanceDetails(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().AddElectronicRemittance();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added MPPPayments", priority = 8)
    public void TC008_AddMPPPayments(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().AddMPPPaymentsToFacility();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Documents", priority = 9)
    public void TC009_AddDocuments(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().UploadDocumentsLicence_Malpractice_insurance();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify MessageOrMail To Facilitator", priority = 10)
    public void TC010_MessageOrMailToFacilitator(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().MessageOrMailToFacilitator();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Business Registration With Admin", priority = 11)
    public void TC011_BusinessRegistrationWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().FillBusinessDetails();
        new RegisterPageUSEmployers().EmployersRegistration();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Business Details Updated With Admin", priority = 12)
    public void TC012_BusinessDetailsUpdateWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectBusinessTab();
        new RegisterHealthCareFacilityProvider().BusinessDetails();
        new RegisterHealthCareFacilityProvider().UpdateBusinessDetails();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Payment Setup InBusiness With Admin", priority = 13)
    public void TC013_PaymentSetupInBusinessWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectBusinessTab();
        new RegisterHealthCareFacilityProvider().BusinessDetails();
        new RegisterHealthCareFacilityProvider().SelectPaymentSetupTab();
        new RegisterHealthCareFacilityProvider().PaymentDetails();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Employee InBusiness With Admin", priority = 14)
    public void TC014_AddEmployeeInBusinessWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectBusinessTab();
        new RegisterHealthCareFacilityProvider().BusinessDetails();
        new RegisterHealthCareFacilityProvider().AddEmployeeInBusiness();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with Premium Comprehensive Plan", priority = 15)
    public void TC015_NewMemberInviteWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().FillNewMemberDetails();
        new RegisterHealthCareFacilityProvider().VerifyRegistrationMessage();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify NewMember Invite With Admin", priority = 16)
    public void TC016_CreateLabOrderWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().AddedMemberWithAdmin();
        new RegisterPageTravelers().clickTravelers();
        new RegisterPageTravelers().selectPremiumComprehensive();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageTravelers().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPagePeopleUS().TestLoginFetchedCredentialsFromEmail();
        new LoginPage().Admin_login();
        new AdminPayments().DiagnosticsWithAdmin();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Updated LabOrder With Admin", priority = 17)
    public void TC017_UpdateLabOrderWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().AddedMemberWithAdmin();
        new RegisterPageTravelers().clickTravelers();
        new RegisterPageTravelers().selectPremiumComprehensive();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageTravelers().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPagePeopleUS().TestLoginFetchedCredentialsFromEmail();
        new LoginPage().Admin_login();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Updated LabOrder With Admin", priority = 17)
    public void TC019_AddMemeberThroughAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().AddedMemberWithAdmin();
        new RegisterPageTravelers().clickTravelers();
        new RegisterPageTravelers().selectPremiumComprehensive();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageTravelers().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPageUSEmployers().TestFetchCredentialsMembersFromEmail();
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().LoginWithCredentialsFromEmail();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Collection Date For LabOrder", priority = 18)
    public void TC018_CheckValidationCollection_DateLabOrder(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().AddedMemberWithAdmin();
        new RegisterPageTravelers().clickTravelers();
        new RegisterPageTravelers().selectPremiumComprehensive();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageTravelers().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPagePeopleUS().TestLoginFetchedCredentialsFromEmail();
        new LoginPage().Admin_login();
        new AdminPayments().CheckValidation_CollectionDateDiagnosticsWithAdmin();
        new RegisterHealthCareFacilityProvider().VerifyValidationCollection_DateMessage();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added User With Admin", priority = 19)
    public void TC019_AddUserWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminUserCreation().UserCreation();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Group With Admin", priority = 20)
    public void TC020_AddGroupWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminUserCreation().UserCreation();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Group Creation With Admin", priority = 21)
    public void TC021_AddGroupCreationWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminGroupCreation().GroupCreation();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation For GroupCreation With Admin", priority = 22)
    public void TC022_CheckValidationForGroupCreationWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminGroupCreation().ValidateGroupCreation();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify ChargeCard With Admin", priority = 23)
    public void TC023_ChargeCardWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityDetails();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityPasswordDetails();
        new RegisterHealthCareFacilityProvider().ValidationMessage();
        new RegisterHealthCareFacilityProvider().clickAction();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new AdminPayments().SearchFacilityForActivation();
        new AdminPayments().SaveAndFinalization();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added NewCard With Admin", priority = 24)
    public void TC024_AddNewCardWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityDetails();
        new RegisterHealthCareFacilityProvider().FillHealthCareFacilityPasswordDetails();
        new RegisterHealthCareFacilityProvider().ValidationMessage();
        new RegisterHealthCareFacilityProvider().clickAction();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().SelectFacilitiesTab();
        new AdminPayments().SearchFacilityForActivation();
        new AdminPayments().AddedNewCardDetails();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify RxSetUp For Pharmacy With Admin", priority = 25)
    public void TC025_RxSetUpForPharmacyWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new Management().AddPharmacy();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify RxSetUp With Admin", priority = 26)
    public void TC026_RxSetUpWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new Management().AddRx();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify RxSetUp Edit For Pharmacy With Admin", priority = 27)
    public void TC027_RxSetUpEditForPharmacyWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new Management().AddPharmacy();
        new Management().EditPharmacyDetails();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Visits Payment Dashboard With Admin", priority = 28)
    public void TC028_CheckVisits_PaymentDashboardWithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminPayments().SearchVisitsForFacilityWithStatus();

    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify MakeChangesToVisits With Admin", priority = 29)
    public void TC029_MakeChangesToVisits_WithAdmin(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminPayments().MakeChangesToVisitsWithStatus();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify To Check Appointment for Member Eligibility", priority = 28)
    public void TC030_ToCheckMember_Eligibility(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().MemberModule();
        new RegisterHealthCareFacilityProvider().CheckDate_of_Appointment();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify To Check Appointment for Member Eligibility", priority = 28)
    public void TC031_BlackListMembers(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().MemberModule();
        new RegisterHealthCareFacilityProvider().CreateBlackList();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify To Check Appointment for Member Eligibility", priority = 28)
    public void TC032_PlanDeactivatedProcess(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().MemberModule();
        new RegisterHealthCareFacilityProvider().DeactivationPlan();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, dependsOnMethods = "TC019_AddMemeberThroughAdmin")
    public void TC033_CheckBlackListMembersValidation(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().MemberModule();
        new RegisterHealthCareFacilityProvider().SelectMemberForBlackList();
        new RegisterHealthCareFacilityProvider().ValidationBlackListLogin();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, dependsOnMethods = "TC019_AddMemeberThroughAdmin")
    public void TC034_CheckPlanDeactivateOrNot(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new RegisterHealthCareFacilityProvider().MemberModule();
        new RegisterHealthCareFacilityProvider().CheckForDeactivateMember();
        new RegisterHealthCareFacilityProvider().ValidationBlackListLogin();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify To Check Appointment for Member Eligibility", priority = 28)
    public void TC035_CheckLabOrderVoidInvoicing(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new LoginPage().Admin_login();
        new AdminPayments().LabOrder_VoidInvoicing();
    }

}


























































































































































































