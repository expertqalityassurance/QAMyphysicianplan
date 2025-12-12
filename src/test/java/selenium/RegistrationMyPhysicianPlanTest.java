package selenium;

import com.selenium.dataprovider.JsonDataProvider;
import com.selenium.ui.pageobjects.Loginsite.LoginPage;
import com.selenium.ui.pageobjects.Register.RegisterPageTravelers;
import com.selenium.ui.pageobjects.Register.RegisterPageUSEmployers;
import com.selenium.ui.pageobjects.Register.RegisterPlanSignupWithDr;
import com.selenium.ui.testbase.TestBase;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class RegistrationMyPhysicianPlanTest extends TestBase {
        @Test(dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with Premium Comprehensive Plan", priority = 1)
        public void TC001_PremiumComprehensivePlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerPremiumComprehensivePlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with ComprehensivePlan", priority = 2)
        public void TC002_EssentialComprehensivePlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerComprehensivePlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with OptimumComprehensiveTravelPlan", priority = 3)
        public void TC003_OptimumComprehensiveTravelPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerOptimumComprehensivePlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration Primary Care Plan", priority = 4)
        public void TC004_PrimaryCarePlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerPrimaryCarePlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with Premium InternationalStudent Plan", priority = 5)
        public void TC005_PremiumInternational_StudentPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForPremiumInternational_StudentPlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with Essential InternationalStudent Plan", priority = 6)
        public void TC006_EssentialInternational_StudentPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForEssentialInternational_StudentPlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify with Registration Flexible US Care", priority = 7)
        public void TC007_PrimaryCareInternational_StudentPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForPrimaryCareInternational_StudentPlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify with Registration Flexible US Care", priority = 7)
        public void TC008_USLocalWithUSCarePlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForUSCareWithUSLocalPlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify with Registration Routine Medical Care", priority = 8)
        public void TC009_USLocalWithUSCareOptimumPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForUSCareOptimumPlanWithUSLocalPlan();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify with Registration for PeopleFlexible US Care", priority = 9)
        public void TC010_USLocalWithUSCareOptimumPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForUSCarePlusPlanWithUSLocal();
        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify with Registration PeopleRoutine Medical Care", priority = 10)
        public void TC011_USLocalWithUSCarePremiumPlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForUSCarePremiumPlanWithUSLocal();

        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify with Registration Neuron Plan", priority = 11)
        public void TC012_USLocalWithPrimaryCarePlan(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().registerForPrimaryCarePlanWithUSLocal();

        }

        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration With MultiMembers", priority = 12)
        public void TC013_RegistrationWithMultiMembers(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication();
            new RegisterPageTravelers().RegistrationMultipleMembers();
        }
        @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify login", priority = 14)
        public void TC014_Login(String rowID, String description, JSONObject data) throws Exception {
            new LoginPage().launchApplication().login();
        }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify booking a doctor Appointment", priority = 16)
    public void TC015_BookDoctor_Appointment(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().BookDoctor_Appointment();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify booking a doctor appointment with an existing member using the earliest available date.", priority = 17)
    public void TC016_BookDoctor_AppointmentWithExistingMember(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().BookDoctor_AppointmentExistingMember();
        new LoginPage().login();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify booking a doctor appointment with a new member using the expected available date.", priority = 18)
    public void TC017_BookDoctor_AppointmentWithDateAvailable(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().BookDoctor_AvailableAppointment();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Book a doctor appointment with an existing member using the expected available date.", priority = 19)
    public void TC018_BookDoctor_AppointmentWithExistingMemberAvailableDate(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplication();
        new RegisterPageUSEmployers().BookDoctor_AppointmentWithExistingMemberAvailableDate();
        new LoginPage().login();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the plan Signup With Doctor.", priority = 22)
    public void TC019_PlanSignupWithDoctor(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithDoctors();
        new RegisterPlanSignupWithDr().RegisterPlanSignupWithDoctor();
        new RegisterPageUSEmployers().fillTravelerForm();
        new RegisterPageUSEmployers().enterMemberLoginCredentials();
        new RegisterPageUSEmployers().SelectCheckBoxAuthentication();
        new RegisterPlanSignupWithDr().fillPaymentFormForDoctor();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify the plan for US employers with Employer Registration.", priority = 23)
    public void TC020_AmountDueCheckOfPlanWithDoctor(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithDoctors();
        new RegisterPlanSignupWithDr().selectRandomPlan();
        new RegisterPlanSignupWithDr().clickNextMemberPlan();
        new RegisterPlanSignupWithDr().clickOnNextMember();
        new RegisterPlanSignupWithDr().verifyAmountDue();
    }

}
