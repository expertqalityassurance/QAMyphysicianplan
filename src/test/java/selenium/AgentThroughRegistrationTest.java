package selenium;

import com.selenium.dataprovider.JsonDataProvider;
import com.selenium.ui.pageobjects.Loginsite.LoginPage;
import com.selenium.ui.pageobjects.Register.RegisterPageAgent;
import com.selenium.ui.pageobjects.Register.RegisterPageTravelers;
import com.selenium.ui.testbase.TestBase;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class AgentThroughRegistrationTest extends TestBase {

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with PremiumComprehensivePlan With Agent", priority = 1)
    public void TC001_PremiumComprehensivePlanWithAgent(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithAgent();
        new RegisterPageAgent().registerPremiumComprehensivePlanWithAgent();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageAgent().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPageAgent().VerifyRegistration();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with EssentialComprehensivePlan With Agent", priority = 2)
    public void TC002_EssentialComprehensivePlanWithAgent(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithAgent();
        new RegisterPageAgent().registerEssentialComprehensivePlanWithAgent();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageAgent().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPageAgent().VerifyRegistration();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Registration with PrimaryCarePlan With Agent", priority = 3)
    public void TC003_PrimaryCarePlanWithAgent(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithAgent();
        new RegisterPageAgent().registerPrimaryCarePlanWithAgent();
        new RegisterPageAgent().fillPrimaryCareForm();
        new RegisterPageAgent().fillPrimaryCarePlanForm();
        new RegisterPageAgent().fillPrimaryCarePaymentForm();
        new RegisterPageAgent().selectMakePayment();
        new RegisterPageAgent().VerifyRegistration();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added member PrimaryCarePlan With Agent", priority = 4)
    public void TC004_Verify_MemberAdded_PrimaryCarePlanWithAgent(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithAgent();
        new RegisterPageAgent().registerPrimaryCarePlanWithAgent();
        new RegisterPageAgent().fillPrimaryCareForm();
        new RegisterPageAgent().fillPrimaryCarePlanForm();
        new RegisterPageAgent().fillPrimaryCarePaymentForm();
        new RegisterPageAgent().selectMakePayment();
        new RegisterPageAgent().VerifyRegistration();
        new LoginPage().launchApplication();
        new LoginPage().Agent_login();
        new RegisterPageAgent().SearchAddedMember();
    }

    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify MemberAdded EssentialComprehensivePlan With Agent", priority = 5)
    public void TC005_Verify_MemberAdded_EssentialComprehensivePlanWithAgent(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithAgent();
        new RegisterPageAgent().registerEssentialComprehensivePlanWithAgent();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageAgent().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPageAgent().VerifyRegistration();
        new LoginPage().launchApplication();
        new LoginPage().Agent_login();
        new RegisterPageAgent().ClickOnModuleEssentialComprehensivePlan();
        new RegisterPageAgent().SearchAddedMember();
    }
    @Test(groups = {"Smoke_Test_NewUX", "Browserstack"}, dataProvider = "TestData", dataProviderClass = JsonDataProvider.class, description = "Verify Added Member ComprehensivePlan With Agent", priority = 1)
    public void TC006_Verify_MemberAdded_ComprehensivePlanWithAgent(String rowID, String description, JSONObject data) throws Exception {
        new LoginPage().launchApplicationWithAgent();
        new RegisterPageAgent().registerPremiumComprehensivePlanWithAgent();
        new RegisterPageTravelers().fillDatesForm();
        new RegisterPageTravelers().SelectGetQuote();
        new RegisterPageTravelers().clickNext();
        new RegisterPageAgent().fillTravelerForm();
        new RegisterPageTravelers().clickNextComprehensive();
        new RegisterPageTravelers().fillPaymentForm();
        new RegisterPageTravelers().selectMakePayment();
        new RegisterPageAgent().VerifyRegistration();
        new LoginPage().launchApplication();
        new LoginPage().Agent_login();
        new RegisterPageAgent().ClickOnModuleComprehensivePlan();
        new RegisterPageAgent().SearchAddedMember();
    }
}
