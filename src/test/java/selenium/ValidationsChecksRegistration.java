package selenium;

import com.selenium.dataprovider.JsonDataProvider;
import com.selenium.ui.pageobjects.AccountPage.AccountPage;
import com.selenium.ui.pageobjects.Loginsite.LoginPage;
import com.selenium.ui.pageobjects.Register.RegisterPageUSEmployers;
import com.selenium.ui.pageobjects.Register.RegisterPlanSignupWithDr;
import com.selenium.ui.pageobjects.ValidationChecks.*;
import com.selenium.ui.testbase.TestBase;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class ValidationsChecksRegistration extends TestBase {

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For Travel Details", priority = 1)
	public void TC001_ValidationCheckForMandatoryField(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForTravelDetails();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For End Date Travel DetailsPage", priority = 2)
	public void TC002_ValidationCheckForEndDateField(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForEndDate_TravelDetailsPage();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For End Date Field", priority = 3)
	public void TC003_ValidationCheckForEndDateField(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForEndDate_TravelDetailsPage();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For Traveler Details", priority = 4)
	public void TC004_ValidationCheckForTravelerDetails(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForEndDate_TravelerDetailsPage();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For Date of Birth Traveler Details Page", priority = 5)
	public void TC005_ValidationCheckForDateofBirthTravelerDetails(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForDateofBirth_TravelerDetailsPage();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For Make Payment Traveler Details", priority = 6)
	public void TC006_ValidationCheckForMakePaymentTravelerDetails(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForMakePayment_TravelerDetailsPage();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Change Password", priority = 7)
	public void TC007_ChangePassword(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication().login();
		new AccountPage().ChangePassword();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validation Check For Extend Date Premium Comprehensive Plan", priority = 8)
	public void TC008_ValidationCheckForExtendDatePremiumComprehensivePlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication().login();
		new ValidationCheckForExtendPlanPage().ValidationCheckForExtendDate();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With Incorrect Details", priority = 9)
	public void TC009_LoginWithIncorrectDetails(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithInvalidCredentials();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With Blank Email", priority = 10)
	public void TC010_LoginWithBlankEmail(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithBlankEmail();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With Blank Password", priority = 11)
	public void TC011_LoginWithBlankPassword(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithBlankPassword();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With Blank username And Password", priority = 12)
	public void TC012_LoginWithBlankusernameAndPassword(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithBlankAndUsername();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With Valid Username Invalid Password", priority = 13)
	public void TC013_LoginWithValidUsernameInvalidPassword(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithValidUsernameInvalidPassword();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With InValid Username Valid Password", priority = 14)
	public void TC014_LoginWithInValidUsernameValidPassword(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithInValidUsernameValidPassword();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Login With Non Registered Email", priority = 15)
	public void TC015_LoginWithNonRegisteredEmail(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new LoginPageValidations().loginWithNonRegisteredEmail();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Plan Term PDF Validation Premium Plan", priority = 16)
	public void TC016_PlanTermPDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().ValidatePlanTerms();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Exhibit_A_and_B PDF Validation Premium Plan", priority = 17)
	public void TC017_Exhibit_A_and_BPDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().ValidateExhibit_A_and_B();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Validate Policy_Exhibit PDF Validation Premium Plan", priority = 18)
	public void TC018_ValidatePolicy_ExhibitPDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().ValidatePolicy_Exhibit();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Plan Brochure PDF Validation Premium Plan", priority = 19)
	public void TC019_PlanBrochurePDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().ValidatePlanBrochure();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Plan Term PDF Validation Essential Plan", priority = 20)
	public void TC020_PlanTermPDFValidationEssentialPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().EssentialPlanValidatePlanTerms();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential Plan Validate Exhibit_A_and_B", priority = 21)
	public void TC021_Exhibit_A_and_BPDFValidationEssentialPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().EssentialPlanValidateExhibit_A_and_B();
	}


	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential Plan Validate Policy_Exhibit", priority = 22)
	public void TC022_Policy_ExhibitValidateEssentialPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().EssentialPlanValidatePolicy_Exhibit();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Plan Brochure PDF Validation Essential Plan", priority = 23)
	public void TC023_PlanBrochurePDFValidationEssentialPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().EssentialPlanFor_ValidateplanBrochure();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Primary Care Card PDF Validation Premium Plan", priority = 24)
	public void TC024_PrimaryCareCardPDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication().login();
		new PdfValidationPage().Validate_PrimaryCare_CardForPremiumComprehensiveplan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Travel Plan Card PDF Validation Premium Plan", priority = 25)
	public void TC025_TravelPlanCardPDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication().login();
		new PdfValidationPage().Validate_TravelPlanCardForPremiumComprehensiveplan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Plan Summary PDF Validation Premium Plan", priority = 26)
	public void TC026_PlanSummaryPDFValidationPremiumPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication().login();
		new PdfValidationPage().Validate_PlanSummaryForPremiumComprehensiveplan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Premium International Student Plan for PDF Validation Plan_Brochure", priority = 27)
	public void TC027_Plan_BrochurePDFValidationPremiumInternationalStudentPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_Plan_BrochureForPremiumInternationalStudentPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Premium International Student Plan for PDF Validation Plan Pricing", priority = 28)
	public void TC028_Plan_PricingPDFValidationPremiumInternationalStudentPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_Plan_PricingForPremiumInternationalStudentPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Brochure", priority = 29)
	public void TC029_Plan_BrochurePDFValidationEssentialInternationalStudentPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_Plan_BrochureForEssentialInternationalStudentPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Pricing ", priority = 30)
	public void TC030_Plan_PricingPDFValidationEssentialInternationalStudentPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_Plan_PricingForEssentialInternationalStudentPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Pricing ", priority = 31)
	public void TC031_Pricing_ValidationForRoutineMedicalCarePlan2MonthPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_PlanPriceForRoutineMedicalCare2monthPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Pricing ", priority = 32)
	public void TC032_Pricing_ValidationForRoutineMedicalCarePlan3MonthPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_PlanPriceForRoutineMedicalCare3monthPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Pricing ", priority = 33)
	public void TC033_Pricing_ValidationForRoutineMedicalCarePlan6MonthPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_PlanPriceForRoutineMedicalCare6monthPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Pricing ", priority = 34)
	public void TC034_Pricing_ValidationForRoutineMedicalCarePlan12MonthPlan(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_PlanPriceForRoutineMedicalCare12monthPlan();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Essential International Student Plan for PDF Validation Plan Pricing ", priority = 35)
	public void TC035_Pricing_ValidationForRoutineMedicalCarePlanFlexibleUSCare(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new PdfValidationPage().Validate_PlanPriceForRoutineMedicalCareFlexibleUSCare();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify that Virtual shows Appointment Type with Existing Member. ", priority = 36)
	public void TC036_Validation_ForCheckAppointmentTypeVirtualExistingMember(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationForBookAppointment().ValidationCheckForAppointmentTypeVirtual();
		new LoginPage().login();
		new ValidationForBookAppointment().verifyBooking_AppointmentType();

	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify that In_person shows Appointment Type with Existing Member. ", priority = 37)
	public void TC037_Validation_ForCheckAppointmentTypeIn_personExistingMember(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationForBookAppointment().ValidationCheckForAppointmentTypeIn_person();
		new LoginPage().login();
		new ValidationForBookAppointment().verifyBooking_AppointmentType();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify that In_person shows Appointment Type with New Member.", priority = 38)
	public void TC038_Validation_ForCheckAppointmentTypeIn_personWithNewMember(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationForBookAppointment().ValidationCheckForAppointmentTypeIn_personwithNewMember();
		new RegisterPageUSEmployers().fillTravelerForm();
		new RegisterPageUSEmployers().enterMemberLoginCredentials();
		new RegisterPageUSEmployers().fillPaymentForm();
		new ValidationForBookAppointment().verifyBooking_NewMemberBookingAppointment();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify that Virtual shows Appointment Type with New Member. ", priority = 39)
	public void TC039_Validation_ForCheckAppointmentTypeVirtualWithNewMember(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationForBookAppointment().ValidationCheckForAppointmentTypeVirtualWithNewMember();
		new RegisterPageUSEmployers().fillTravelerForm();
		new RegisterPageUSEmployers().enterMemberLoginCredentials();
		new RegisterPageUSEmployers().fillPaymentForm();
		new ValidationForBookAppointment().verifyBooking_NewMemberBookingAppointment();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the plan for US employers with Employer Registration.", priority = 40)
	public void TC040_Validation_CheckForPlanSignupWithDoctor(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplicationWithDoctors();
		new RegisterPlanSignupWithDr().RegisterPlanSignupWithDoctor();
		new RegisterPageUSEmployers().fillTravelerForm();
		new RegisterPageUSEmployers().enterMemberLoginCredentials();
		new RegisterPlanSignupWithDr().fillPaymentFormForDoctor();
		new ValidationForBookAppointment().verifyPlanSignupWithDoctor();
	}

	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Validation Check For Start Date PlanFlexibleUSCare", priority = 41)
	public void TC041_Validation_CheckForStartDatPlanFlexibleUSCare(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckForFlexible_US_CarePage();
	}
	@Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Validation Check For Invalid BOD For PlanFlexibleUSCare", priority = 42)
	public void TC042_Validation_CheckForInvalid_BOD_ForPlanFlexibleUSCare(String rowID, String description, JSONObject data) throws Exception {
		new LoginPage().launchApplication();
		new ValidationPage().ValidationCheckAvailabilityForFlexible_US_CarePage();
		new ValidationPage().PrimaryMemberFormWithoutValid_Date();
	}
}




