package com.selenium.ui.pageobjects.ValidationChecks;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;
import java.util.ArrayList;

public class PdfValidationPage extends BasePage {

    By Register = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(6)");
    By Travelers = By.cssSelector("#headingTravelers > h4:nth-child(1) > a:nth-child(1)");
    By selectPremiumPlan = By.cssSelector("#collapseTravelers > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
    By selectEssentialPlan = By.xpath("//*[@id='collapseTravelers']/div/div/div[2]/a/div/div/div/button");
    By selectPrimaryPlan = By.xpath("//*[@id='collapseTravelers']/div/div/div[3]/a/div/div/div/button");
    By startDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[1]/span[2]/span/span/span");
    By startdates = By.xpath("//*[@id='TravelStartDate']");
    By EndDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[2]/span[2]/span/span/span");
    By EndDates = By.xpath("//*[@id='TravelEndDate']");
    By country = By.xpath("//*[@id='tabstrip-1']/div/div[2]/div/span[2]");
    By zipCode = By.xpath("//*[@name='USZip']");
    By getQuote = By.xpath("//button[text()='Get Quote']");
    By Plan_Terms =By.xpath("//*[@id='sidebarPlanTerms']/span");
    By ExhibitA_and_B = By.xpath("//*[@id='sidebarPlanSummary']/span");
    By Policy_Exhibit = By.xpath("//*[@id='sidebarACITerms']/span");
    By comprehensivePlan = By.xpath("//*[@id='pivotTableEssential']/tbody/tr[1]/td[2]/label/span[1]");
    By planBrochure = By.xpath("//*[@id='planBrochure']/span");
    By PrimaryCare_Card=By.xpath("//*[@id='PlansGrid']/table/tbody/tr[1]/td/div/div[5]/div[2]/div[1]/a/span");
    By TravelPlanCard = By.xpath("//*[@id='PlansGrid']/table/tbody/tr[1]/td/div/div[5]/div[2]/div[2]/a/span");
    By PlanSummary = By.xpath("//*[@id='PlansGrid']/table/tbody/tr[1]/td/div/div[5]/div[1]/a[2]");
    By MedicalPlansStudent = By.xpath("//*[@id='headingStudents']/h4/a");
    By selectPremiumInternationalStudentPlan = By.xpath("//*[@id='collapseStudents']/div/div/div[1]/a/div/div/div/button");
    By selectsEssentialInternationalStudentPlan = By.xpath("//*[@id='collapseStudents']/div/div/div[2]/a/div/div/div/button");
    By StudentPlan_Brochure = By.xpath("//*[@id='planBrochure']/span");
    By StudentPlan_Pricing = By.xpath("//*[@id='divRegister']/div[2]/div/div[5]/a/span");
    By routineMedicalOption = By.xpath("//*[@id='collapseResidents']/div/div/div[2]/a/div/div/div/button");
    By selectsRoutineMedicalCarePlan = By.xpath("//*[@id='collapseResidents']/div/div/div[2]/a/div/div/div/button");
    By selectPlanprice = By.xpath("//*[@id=\"gridDefaultPlans\"]/div[2]/table/tbody/tr[1]/td[1]/a");
    By select3monthPlanprice = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[2]/td[1]/a");
    By select6monthPlanprice = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[3]/td[1]/a");
    By select12monthPlanprice = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[4]/td[1]/a");
    By usPeopleLink = By.xpath("//*[@id='headingResidents']/h4/a");
    By closewindow = By.xpath("/html/body/div[7]/div[1]/div/a/span");
    By PlanSummarys = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[1]/td[3]/a[1]");
    By ThreemonthPlanSummary = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[2]/td[3]/a[1]");
    By TwelevemonthPlanSummary = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[4]/td[3]/a[1]");
    By FlexiblePlanSummary = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[5]/td[3]/a[1]");
    By FlexibleUSCare = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[5]/td[1]/a");


    public void verifyPdfContent() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MemberTermsConditions_PremiumComprehensiveTravelPlan"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentEssentialPlan() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("Essential"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentForExhibitA_and_B() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("Exhibit_PremiumComprehensiveTravelPlan"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentForPolicy_Exhibit() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("My%20Physician%20Plan%20Premium%20PCP%20Plus-%20CC012234-%2050K"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentForPlanBrochure() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MyPhysicianPlanBrochure_PremiumComprehensiveTravelPlan.pdf"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentEssentialPlanForPlanBrochure() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MyPhysicianPlanBrochure_EssentialComprehensiveTravelPlan.pdf"), "Wrong PDF file opened!");
    }

    public PdfValidationPage Registers() {
        click(Register, "Click on Register");
        return this;
    }

    public PdfValidationPage MedicalPlansTravelers() {
        click(Travelers, "Click on Travelers");
        return this;
    }

    public PdfValidationPage selectPremiumComprehensive() {
        click(selectPremiumPlan, "Click On Select Medical Plan For Travelers");
        return this;
    }
    public PdfValidationPage selectEssentialComprehensive() {
        click(selectEssentialPlan, "Click On Select Medical Plan For Travelers");
        return this;
    }
    public void quoteformforEssentialPlan() {
        click(comprehensivePlan, "Select the plan");

    }
    public PdfValidationPage selectPremiumInternationalStudent_Plan() {
        click(selectPremiumInternationalStudentPlan, "Click On Select Medical Plan For Travelers");
        return this;
    }

    public PdfValidationPage selectEssentialInternationalStudentPlan() {
        click(selectsEssentialInternationalStudentPlan, "Click On Select Medical Plan For Travelers");
        return this;
    }
    public PdfValidationPage MedicalStudentPlan() {
        click(MedicalPlansStudent, "Click on Travelers");
        return this;
    }

    public PdfValidationPage selectRoutineMedicalCarePlan() {
        click(selectsRoutineMedicalCarePlan, "Click On Select Medical Plan For Travelers");
        return this;
    }
    public PdfValidationPage clickOnUSEmployersPlansTravelers() {
        click(usPeopleLink, "Click on US Employers Plans Travelers");
        return this;
    }
    public PdfValidationPage clickOnRoutineMedicalCare() {
        click(routineMedicalOption, "Click on Routine Medical Care");
        return this;
    }
    public void verifyPdfContentEssentialInternationalStudentPlanForPlan_Brochure() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MyPhysicianPlan_Essential_International_Student_Plan_Detailed_Brochure.pdf"), "Wrong PDF file opened!");
    }

    public void verifyPdfContentPremiumInternationalStudentForPlan_Pricing() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wndPlanPricing_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("Student Health Plans (including Primary Care)"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentEssentialInternationalStudentForPlan_Pricing() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wndPlanPricing_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("Student Health Plans (including Primary Care)"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentPremiumInternationalStudentForPlan_Brochure() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MyPhysicianPlan_Premium_International_Student_Plan_Detailed_Brochure.pdf"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentForExhibitA_and_B_EssentialPlan() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("Exhibit_Essential%20Comprehensive%20Travel%20Plan_VI_10012024_1.0"), "Wrong PDF file opened!");
    }
    public void verifyPdfContentForEssentialComprehensive_Policy_Exhibit() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MPP%20PCP%20Plus%20Coinsurance-%20CC013963-%2050K-250"), "Wrong PDF file opened!");
    }

    public void verifyPlanPriceForRoutineMedicalCarePlan() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Details_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("2-Month Plan ($150)"), "Wrong PDF file opened!");
        click(closewindow,"");
        click(PlanSummarys,"");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MPP_MonthlyPlanSummary.pdf"), "Wrong PDF file opened!");
    }
    public void verifyPlanPriceForRoutineMedicalCare3monthPlan() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Details_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("3-Month Plan ($210)"), "Wrong PDF file opened!");
        click(closewindow,"");
        click(ThreemonthPlanSummary,"");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MPP_3MonthPlanSummary.pdf"), "Wrong PDF file opened!");
    }

    public void verifyPlanPriceForRoutineMedicalCare6monthPlan() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Details_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("6-Month Plan ($390)"), "Wrong PDF file opened!");
        click(closewindow,"");
        click(TwelevemonthPlanSummary,"");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MPP_12MonthPlanSummary.pdf"), "Wrong PDF file opened!");
    }
    public void verifyPlanPriceForRoutineMedicalCare12monthPlan() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Details_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("12-Month Plan ($720)"), "Wrong PDF file opened!");
        click(closewindow,"");
        click(TwelevemonthPlanSummary,"");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("MPP_12MonthPlanSummary.pdf"), "Wrong PDF file opened!");
    }
    public void verifyPlanPriceForRoutineMedicalCareFlexibleUSCare() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Details_wnd_title']")));
        System.out.println("Popup text: " + popup.getText());
        String popupText = popup.getText();
        Assert.assertTrue(popupText.contains("Flexible US Care"), "Wrong PDF file opened!");
        click(closewindow,"");
        click(FlexiblePlanSummary,"");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("FlexibleUSCare_Exhibits_102024.pdf"), "Wrong PDF file opened!");
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
        click(getQuote, "Click on get Quote");
        Thread.sleep(1000);
    }
    public void ValidatePlanTerms() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        Thread.sleep(10000);
        scrollToView(Plan_Terms);
        click(Plan_Terms,"Click on plan terms");
        verifyPdfContent();
    }
    public void ValidateExhibit_A_and_B() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        Thread.sleep(10000);
        scrollToView(ExhibitA_and_B);
        click(ExhibitA_and_B,"Click on ExhibitA_and_B");
        verifyPdfContentForExhibitA_and_B();
    }
    public void ValidatePolicy_Exhibit() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        Thread.sleep(10000);
        scrollToView(Policy_Exhibit);
        click(Policy_Exhibit,"Click on Policy Exhibit");
        verifyPdfContentForPolicy_Exhibit();
    }
    public void ValidatePlanBrochure() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        Thread.sleep(10000);
        scrollToView(planBrochure);
        click(planBrochure,"Click on plan Brochure");
        verifyPdfContentForPlanBrochure();
    }
    public void EssentialPlanValidatePlanTerms() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectEssentialComprehensive();
        datesform();
        quoteformforEssentialPlan();
        scrollToView(Plan_Terms);
        click(Plan_Terms,"Click on plan terms");
        verifyPdfContentEssentialPlan();
    }
    public void ValidateplanBrochure() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectPremiumComprehensive();
        datesform();
        Thread.sleep(10000);
        scrollToView(planBrochure);
        click(planBrochure,"Click on Plan Brochure");
        verifyPdfContentForPlanBrochure();
    }
    public void EssentialPlanValidateExhibit_A_and_B() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectEssentialComprehensive();
        datesform();
        quoteformforEssentialPlan();
        scrollToView(ExhibitA_and_B);
        click(ExhibitA_and_B,"Click on Exhibit A & B");
        verifyPdfContentForExhibitA_and_B_EssentialPlan();
    }
    public void EssentialPlanValidatePolicy_Exhibit() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectEssentialComprehensive();
        datesform();
        quoteformforEssentialPlan();
        scrollToView(Policy_Exhibit);
        click(Policy_Exhibit,"Click on Policy Exhibit");
        verifyPdfContentForEssentialComprehensive_Policy_Exhibit();

    }
    public void EssentialPlanFor_ValidateplanBrochure() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalPlansTravelers();
        selectEssentialComprehensive();
        datesform();
        Thread.sleep(10000);
        scrollToView(planBrochure);
        click(planBrochure,"Click on Plan Brochure");
        verifyPdfContentEssentialPlanForPlanBrochure();
    }
    public void verifyPdfContentPremiumComprehensiveplanForPrimaryCareCard() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("PrimaryCareCardPDF?MemberPlanID=3761&MemberID=3144"), "Wrong PDF file opened!");
    }
    public void Validate_PrimaryCare_CardForPremiumComprehensiveplan() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        click(PrimaryCare_Card,"Click on Primary Care Card");
        Thread.sleep(1000);
        verifyPdfContentPremiumComprehensiveplanForPrimaryCareCard();
        Thread.sleep(1000);
    }
    public void verifyPdfContentPremiumComprehensiveplanForTravelPlanCard() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("TravelCareCardPDF?MemberPlanID=3761"), "Wrong PDF file opened!");
    }
    public void Validate_TravelPlanCardForPremiumComprehensiveplan() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        click(TravelPlanCard,"Click on Travel Plan Card");
        Thread.sleep(1000);
        verifyPdfContentPremiumComprehensiveplanForTravelPlanCard();
        Thread.sleep(1000);
    }
    public void verifyPdfContentPremiumComprehensiveplanForPlanSummary() throws Exception {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String pdfUrl = driver.getCurrentUrl();
        System.out.println("Opened PDF: " + pdfUrl);
        Assert.assertTrue(pdfUrl.contains("My%20Physician%20Plan%20PCP%20Plus%20(Short%20Term)-%20CC012274-%2050K-250.pdf"), "Wrong PDF file opened!");
    }
    public void Validate_PlanSummaryForPremiumComprehensiveplan() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        click(PlanSummary,"Click on Plan Summary");
        Thread.sleep(1000);
        verifyPdfContentPremiumComprehensiveplanForPlanSummary();
        Thread.sleep(1000);
    }
    public void Validate_Plan_PricingForPremiumInternationalStudentPlan() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalStudentPlan();
        selectPremiumInternationalStudent_Plan();
        click(StudentPlan_Pricing,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPdfContentPremiumInternationalStudentForPlan_Pricing();
        Thread.sleep(1000);
    }
    public void Validate_Plan_BrochureForPremiumInternationalStudentPlan() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalStudentPlan();
        selectPremiumInternationalStudent_Plan();
        Thread.sleep(10000);
        click(StudentPlan_Brochure,"Click on Plan Brochure");
        verifyPdfContentPremiumInternationalStudentForPlan_Brochure();
        Thread.sleep(1000);
    }
    public void Validate_Plan_BrochureForEssentialInternationalStudentPlan() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalStudentPlan();
        selectEssentialInternationalStudentPlan();
        Thread.sleep(10000);
        click(StudentPlan_Brochure,"Click on Plan Brochure");
        verifyPdfContentEssentialInternationalStudentPlanForPlan_Brochure();
        Thread.sleep(1000);
    }

    public void Validate_Plan_PricingForEssentialInternationalStudentPlan()throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        MedicalStudentPlan();
        selectPremiumInternationalStudent_Plan();
        click(StudentPlan_Pricing,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPdfContentEssentialInternationalStudentForPlan_Pricing();
        Thread.sleep(1000);
    }
    public void Validate_PlanPriceForRoutineMedicalCare2monthPlan()throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        clickOnUSEmployersPlansTravelers();
        clickOnRoutineMedicalCare();
        Thread.sleep(10000);
        click(selectPlanprice,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPlanPriceForRoutineMedicalCarePlan();
        Thread.sleep(1000);
    }
    public void Validate_PlanPriceForRoutineMedicalCare3monthPlan()throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        clickOnUSEmployersPlansTravelers();
        clickOnRoutineMedicalCare();
        Thread.sleep(10000);
        click(select3monthPlanprice,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPlanPriceForRoutineMedicalCare3monthPlan();

        Thread.sleep(1000);
    }
    public void Validate_PlanPriceForRoutineMedicalCare6monthPlan()throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        clickOnUSEmployersPlansTravelers();
        clickOnRoutineMedicalCare();
        Thread.sleep(10000);
        click(select6monthPlanprice,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPlanPriceForRoutineMedicalCare6monthPlan();

        Thread.sleep(1000);
    }
    public void Validate_PlanPriceForRoutineMedicalCare12monthPlan()throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        clickOnUSEmployersPlansTravelers();
        clickOnRoutineMedicalCare();
        Thread.sleep(10000);
        click(select12monthPlanprice,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPlanPriceForRoutineMedicalCare12monthPlan();
        Thread.sleep(1000);
    }
    public void Validate_PlanPriceForRoutineMedicalCareFlexibleUSCare()throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Registers();
        clickOnUSEmployersPlansTravelers();
        clickOnRoutineMedicalCare();
        Thread.sleep(10000);
        scrollToView(FlexibleUSCare);
        click(FlexibleUSCare,"Click on Plan Pricing");
        Thread.sleep(1000);
        verifyPlanPriceForRoutineMedicalCareFlexibleUSCare();
        Thread.sleep(1000);
    }
}



