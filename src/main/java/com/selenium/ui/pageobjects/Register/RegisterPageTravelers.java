package com.selenium.ui.pageobjects.Register;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegisterPageTravelers extends BasePage {
    public static String Emailactual, FirstName, LastName,pwd,extractedPassword,MemberEmail,ExcelEmail;

    public RegisterPageTravelers() {
        super();
    }

    By actionSelect = By.xpath("//ul[@id='StateName_listbox']/li");
    By register = By.cssSelector("div.col-lg-12:nth-child(2) > a:nth-child(6)");
    By travelers = By.cssSelector("#headingTravelers > h4:nth-child(1) > a:nth-child(1)");
    By selectPremiumPlan = By.cssSelector("#collapseTravelers > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
    By selectEssentialPlan = By.xpath("//*[@id='collapseTravelers']/div/div/div[2]/a/div/div/div/button");
    By OptimumComprehensivePlan = By.xpath("//*[@id='collapseTravelers']/div/div/div[3]/a/div/div/div/button");
    By selectPrimaryPlan = By.xpath("//*[@id='collapseTravelers']/div/div/div[4]/a/div/div/div/button");

    By startDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[1]/span[2]/span/span/span");
    By startDates = By.xpath("//*[@id='TravelStartDate']");
    By endDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[2]/span[2]/span/span/span");
    By endDates = By.xpath("//*[@id='TravelEndDate']");
    By country = By.xpath("//*[@id='tabstrip-1']/div/div[2]/div/span[2]");
    By zipCode = By.xpath("//*[@name='USZip']");
    By getQuote = By.xpath("//button[text()='Get Quote']");
    By NoOfTravelers = By.xpath("//*[@id='MemberCount']");
    By next = By.xpath("//*[@id='btnPlanNext']");

    By firstName = By.xpath("//input[@id='firstName1']");
    By lastName = By.xpath("//*[@id='lastName1']");
    By dateOfBirth = By.xpath("//*[@id='DOB1']");
    By address = By.xpath("//*[@id='Address']");
    By city = By.xpath("//*[@id='CityName']");
    By state = By.xpath("//*[@id='divMembers']/div[2]/div[2]/span[2]/span/span[1]");
    By postalCode = By.xpath("//*[@id='Zip']");
    By emailUsername = By.xpath("//*[@id='Email']");
    By mobileCode = By.xpath("//*[@id='CountryCode']");
    By mobileNumber = By.xpath("//*[@id='MobileNumber']");

    By nextButtonComprehensive = By.xpath("//*[@id='divMembers']/footer/button[2]");
    By nextButtonMember = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");
    By nextButtonMemberPlan = By.xpath("//*[@id='tabstrip-1']/div/footer/button");

    By cardNumber = By.xpath("//*[@id='CardNumber']");
    By nameOnCard = By.xpath("//*[@id='NameOnCard']");
    By cvv = By.xpath("//*[@id='CVV']");
    By chkTerms = By.xpath("//*[@id='chkTerms']");
    By makePayment = By.xpath("//*[@id='tabstrip-4']/div/footer/button[2]");
    By date = By.xpath("//*[@id='divcarddetails']/div[2]/div[1]/span[3]/span");

    By dateSelect = By.xpath("//*[@id='YY_listbox']/li[2]");

    By comprehensivePlan = By.xpath("//*[@id='pivotTableEssential']/tbody/tr[1]/td[2]/label/span[1]");
    By memberPlan = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    By firstNameMember = By.xpath("//input[@id='FirstName']");
    By lastNameMember = By.xpath("//*[@id='LastName']");
    By dateOfBirthMember = By.xpath("//*[@id='DOB']");
    By addressMember = By.xpath("//*[@id='Address']");
    By cityMember = By.xpath("//*[@id='CityName']");
    By postalCodeMember = By.xpath("//*[@id='Zip']");
    By emailUsernameMember = By.xpath("//*[@id='Email']");
    By mobileCodeMember = By.xpath("//*[@id='CountryCode']");
    By mobileNumberMember = By.xpath("//*[@id='MobileNumber']");
    By nextButtonMemberMember = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");

    By dateOfExpiry = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]");
    By dateOfExpirySelect = By.xpath("//*[@id='YY_listbox']");
    By checkTermsMember = By.xpath("//*[@id='SecoundTime']");
    By makePaymentMember = By.xpath("//*[@id='tabstrip-3']/div/footer/button[2]");

    By Policy_Max = By.xpath("//*[@id='pivotTable']/tbody/tr[1]/td[2]/label/span[2]");
    By BackBTN = By.xpath("//*[@id='tabstrip-2']/div/footer/button[1]");
    By notraveler = By.xpath("//*[@id='MemberCount']");
    By Amount_Due = By.xpath("//*[@id='divRegister']/div[2]/div/div[3]/span[5]");
    By chkPreExistingConditions = By.xpath("//*[@id='chkPreExistingConditions']");
    By scroller = By.xpath("/html[@class='k-webkit k-webkit140 js ']");
    By selectMakePaymentBtn = By.xpath("//*[@id='tabstrip-4']/div/footer/button[2]");
    By TravelerAge = By.xpath("//*[@id='ageContainer']/div/span/span/span[1]");
    By SelectedTravelerAge = By.xpath("//*[@id='age1_listbox']/li[28]");
    By BlackButton = By.xpath("//*[@id='tabstrip-2']/div/footer/button[1]");
    By Username = By.xpath("//input[@id='UserName']");
    By Password = By.xpath("//*[@id='Password']");
    By BTN_login = By.xpath("//*[@id='btnLogin']");
    By NewPassword = By.xpath("//input[@id='NewPassword']");
    By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By BTNSubmit = By.xpath("//*[@id='setPasswordModal']/div[2]/div[2]/div[3]/button");

    public RegisterPageTravelers clickRegister() {
        click(register, "Click on Register");
        return this;
    }

    public RegisterPageTravelers clickTravelers() {
        click(travelers, "Click on Travelers");
        return this;
    }

    public RegisterPageTravelers selectPremiumComprehensive() {
        click(selectPremiumPlan, "Click on Select Premium Plan Travelers");
        return this;
    }

    public RegisterPageTravelers selectMakePayment() throws InterruptedException {
        click(selectMakePaymentBtn, "Click on Select Premium Plan Travelers");
        Thread.sleep(100000);
        return this;
    }

    public RegisterPageTravelers selectEssentialComprehensive() {
        click(selectEssentialPlan, "Click on Select Essential Plan For Travelers");
        return this;
    }

    public RegisterPageTravelers selectOptimumComprehensiveTravelPlan() {
        click(OptimumComprehensivePlan, "Click on Select Essential Plan For Travelers");
        return this;
    }

    public RegisterPageTravelers selectPrimaryCare() {
        click(selectPrimaryPlan, "Click on Select Primary Care Plan For Travelers");
        return this;
    }

    public void fillDatesForm() throws InterruptedException {
        click(startDate, "Click on Start Date");
        enterValue(startDates, Keys.ENTER);

        click(endDate, "Click on End Date");
        enterValue(endDates, Keys.ARROW_DOWN);
        enterValue(endDates, Keys.ENTER);

        enterValue(country, Keys.ENTER);
        Thread.sleep(10000);

        click(zipCode, "Click on Zip Code");
        enterValue(zipCode, CreatedZipNumber(), "Zip Code successfully");
        Thread.sleep(1000);
    }

    public void SelectGetQuote() throws InterruptedException {
        click(getQuote, "Click on Get Quote");
    }

    public void SelectNumberOf_Travelers() throws InterruptedException {
        clearText(NoOfTravelers);
        enterValue(NoOfTravelers,"2", "Click on Get Quote");
    }

    public void AgesOfTravelers() throws InterruptedException {
        click(TravelerAge, "");
        click(SelectedTravelerAge, "");

    }
    public void clickNext() throws InterruptedException {
        Thread.sleep(1000);
        scrollDowns(scroller, 50);
        click(next, "Click Next");
    }

    public void selectQuoteForEssentialPlan() {
        click(comprehensivePlan, "Select the plan");
    }

    public void clickNextComprehensive() {
        click(nextButtonComprehensive, "Click on Next button");
    }


    public void enterMemberLoginCredentials() {
        enterValue(password, "Tester@1", "Password");
        enterValue(confirmPassword, "Tester@1", "Confirm password");
        click(nextButtonMember, "Click on Next Button");
    }

    public void clickNextMemberPlan() {

        click(nextButtonMemberPlan, "Click on Member plan");
    }

    public void fillTravelerForm() throws InterruptedException {
        FirstName = CreatedDummyName();
        enterValue(firstName, FirstName, "First Name successfully");
        LastName = CreatedDummyName();
        enterValue(lastName, LastName, "Last Name successfully");
        enterValue(dateOfBirth, "04/20/1998", "Date of Birth successfully");
        enterValue(address, "near station", "Address successfully");
        enterValue(city, "California", "Enter City successfully");
        enterValue(postalCode, CreatedZipNumber(), "Enter Postal Code successfully");
        MemberEmail= CreatedDummyEmail();
        enterValue(emailUsername, MemberEmail, "Email/Username successfully");
        enterValue(mobileCode, "91", "Mobile Code successfully");
        enterValue(mobileNumber, CreatedPhoneNumber(), "Mobile Number successfully");
    }

    public void MemberLoginWithCredentialsFromEmail() throws InterruptedException {
        enterValue(Username, FirstName, "Username Field");
        Thread.sleep(10000);
        enterValue(Password, extractedPassword, "Password Field");
        click(BTN_login, "Click on Login");
        Thread.sleep(10000);
        enterValue(NewPassword, "Tester@1", "");
        enterValue(ConfirmPassword, "Tester@1", "");
        click(BTNSubmit, "");
        Thread.sleep(10000);
        enterValue(Password, "Tester@1", "Password Field");
        click(BTN_login, "Click on Login");
        Thread.sleep(100000);
    }

    public void selectRandomPlanAndVerifyPriceChange() throws InterruptedException {
            List<WebElement> priceElementsBefore = driver.findElements(By.xpath("//*[@id='divTravelPremium']/div[1]/div"));
            List<String> pricesBefore = new ArrayList<>();

            for (WebElement e : priceElementsBefore) {
                pricesBefore.add(e.getText().trim());
            }

            System.out.println("Prices before: " + pricesBefore);
            WebElement checkbox = driver.findElement(By.xpath("//*[@id='chkPreExistingConditions']"));
            Thread.sleep(3000);
            checkbox.click();
            Thread.sleep(3000);

            List<WebElement> priceElementsAfter = driver.findElements(By.xpath("//table//td//span"));
            List<String> pricesAfter = new ArrayList<>();

            for (WebElement e : priceElementsAfter) {
                pricesAfter.add(e.getText().trim());
            }
            System.out.println("Prices after: " + pricesAfter);
        if (!pricesBefore.equals(pricesAfter)) {
            System.out.println("Price changed after clicking checkbox!");

            List<WebElement> radioButtons = driver.findElements(By.xpath("//span[@class='custom-radio']"));
            if (!radioButtons.isEmpty()) {
                Random rand = new Random();
                int randomIndex = rand.nextInt(radioButtons.size());
                WebElement randomRadio = radioButtons.get(randomIndex);
                Thread.sleep(3000);
                randomRadio.click();
                System.out.println("Selected random price option at index: " + randomIndex);
            } else {
                System.out.println("No radio buttons found to select!");
            }

        } else {
            System.out.println("Price did not change!");
        }
    }

    public void verifyAmountDueLogic() throws InterruptedException {
            for (int i = 0; i < 2; i++) {
                String travellerText = driver.findElement(By.xpath("//*[@id='divRegister']/div[2]/div/div[2]/div[1]/span[4]")).getText();
                int travellerCount = Integer.parseInt(travellerText.trim());

                String premiumText = driver.findElement(By.xpath("//*[@id='divRegister']/div[2]/div/div[3]/span[4]")).getText();
                double travellerPremium = Double.parseDouble(premiumText.replace("$", "").replace(",", "").trim());

                String amountDueText = driver.findElement(By.xpath("//*[@id='divRegister']/div[2]/div/div[3]/span[5]")).getText();
                double displayedAmountDue = Double.parseDouble(amountDueText.replace("$", "").replace(",", "").trim());

                double expectedAmountDue = travellerPremium * travellerCount;
                if (Math.abs(expectedAmountDue - displayedAmountDue) < 0.01) {
                    System.out.println("Iteration " + (i + 1) + ": Amount Due is correct.");
                } else {
                    System.out.println("Iteration " + (i + 1) + ": Amount Due is INCORRECT!");
                }
                click(BlackButton, "");
                clearText(NoOfTravelers);
                enterValue(NoOfTravelers, String.valueOf(i + 1), "Enter Travelers");
                Thread.sleep(2000);
                SelectGetQuote();
                Thread.sleep(2000);
            }
        }


        public void fillPaymentForm() throws InterruptedException {
        enterValue(cardNumber, "4111111111111111", "Card Number successfully");
        click(date, "Click on date successfully");
        click(dateSelect, "Select date successfully");
        enterValue(nameOnCard, CreatedDummyName(), "Name on Card successfully");
        enterValue(cvv, "123", "CVV successfully");
        click(chkTerms, "Select check Terms successfully");
        Thread.sleep(100);

    }
    public void AssertCall()throws InterruptedException {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Thread.sleep(1000);
        Assert.assertTrue(actualTitle.contains("Member Registration"));
    }
    public  void NumberOfTravelers() throws InterruptedException {

        String policyMaxAmountText = getText(Policy_Max);

        click(BackBTN, "");
        clearText(notraveler);
        String actualCountNo= TravelersNumber();
        enterValue(notraveler,actualCountNo, "no successfully");
        double traverlcounts = Double.parseDouble(actualCountNo);

        click(getQuote, "Click on get Quote");
        Thread.sleep(1000);
        String policyMaxAmountText2 = getText(Policy_Max);

        double policyMaxAmount2 = Double.parseDouble(policyMaxAmountText2.replace("$", "").replace(",", "").trim());
        double totalPolicyAmount = policyMaxAmount2 * traverlcounts;

        String amountDueTotalText2 = getText(Amount_Due);
        double finalAmountDue = Double.parseDouble(amountDueTotalText2.replace("$", "").replace(",", "").trim());

        Reporter.log("Verifying that the total due amount matches the expected policy total...");

        if (finalAmountDue == totalPolicyAmount) {
            Reporter.log("Total Due Amount matches the policy amount: " + finalAmountDue);
        } else {
            Reporter.log("Total Due Amount mismatch. Expected: " + totalPolicyAmount + ", Actual: " + finalAmountDue);
            Assert.fail("Total Due Amount mismatch. Expected: " + totalPolicyAmount + ", Actual: " + finalAmountDue);
        }
    }
    public void RegistrationPreExisting() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        clickRegister();
        clickTravelers();
        selectPremiumComprehensive();
        fillDatesForm();
        SelectGetQuote();
        String policyMaxAmountText = getText(Policy_Max);
        double policyMaxAmount = Double.parseDouble(policyMaxAmountText.replace("$", "").replace(",", "").trim());
        click(chkPreExistingConditions,"Click on pre Existing Condition");

        String policyMaxAmountText2 = getText(Policy_Max);
        double policyMaxAmount2 = Double.parseDouble(policyMaxAmountText2.replace("$", "").replace(",", "").trim());
        double totalPolicyAmount = policyMaxAmount * 15 / 100.0 + policyMaxAmount;
        totalPolicyAmount = Math.round(totalPolicyAmount * 100.0) / 100.0;

        Reporter.log("Verifying that the total due amount matches the expected policy total...");

        if (policyMaxAmount2 == totalPolicyAmount) {
            Reporter.log("Total Due Amount matches the policy amount: " + policyMaxAmount2);
        } else {
            Reporter.log("Total Due Amount mismatch. Expected: " + totalPolicyAmount + ", Actual: " + totalPolicyAmount);
            Assert.fail("Total Due Amount mismatch. Expected: " + policyMaxAmount2 + ", Actual: " + totalPolicyAmount);
        }
    }
    public void registerPremiumComprehensivePlan() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        clickRegister();
        clickTravelers();
        selectPremiumComprehensive();
        fillDatesForm();
        SelectGetQuote();
        clickNext();
        fillTravelerForm();
        clickNextComprehensive();
        fillPaymentForm();
        selectMakePayment();
        AssertCall();
    }

    public void AddCoverage_to_pre_existingConditions() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        clickRegister();
        clickTravelers();
        selectPremiumComprehensive();
        fillDatesForm();
        SelectGetQuote();
    }

    public void AddCoverageWith_NumberOfTravelers_pre_existingConditions() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        clickRegister();
        clickTravelers();
        selectPremiumComprehensive();
        fillDatesForm();
        SelectNumberOf_Travelers();
        SelectGetQuote();
    }

    public void registerComprehensivePlan() throws InterruptedException {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        clickRegister();
        clickTravelers();
        selectEssentialComprehensive();
        fillDatesForm();
        SelectGetQuote();
        selectQuoteForEssentialPlan();
        clickNext();
        fillTravelerForm();
        clickNextComprehensive();
        fillPaymentForm();
        selectMakePayment();
        AssertCall();
    }
    public void registerOptimumComprehensivePlan() throws InterruptedException {
        clickRegister();
        clickTravelers();
        selectOptimumComprehensiveTravelPlan();
        fillDatesForm();
        AgesOfTravelers();
        SelectGetQuote();
        clickNext();
        fillTravelerForm();
        clickNextComprehensive();
        fillPaymentForm();
        selectMakePayment();
        AssertCall();

    }

    public void registerPrimaryCarePlan() throws InterruptedException {
        clickRegister();
        clickTravelers();
        selectPrimaryCare();
        click(memberPlan, "Select member Plan");
        clickNextMemberPlan();
        Thread.sleep(10000);

        enterValue(firstNameMember, CreatedDummyName(), "First Name successfully");
        enterValue(lastNameMember, CreatedDummyName(), "Last Name successfully");
        enterValue(dateOfBirthMember, "04/20/1998", "Date of Birth successfully");
        enterValue(addressMember, "near station", "Address successfully");
        enterValue(cityMember, "California", "City successfully");
        enterValue(postalCodeMember, CreatedZipNumber(), "Postal Code successfully");
        enterValue(emailUsernameMember, CreatedDummyEmail(), "Email/Username successfully");
        enterValue(mobileCodeMember, "91", "Mobile Code successfully");
        enterValue(mobileNumberMember, CreatedPhoneNumber(), "Mobile Number successfully");

        enterMemberLoginCredentials();

        enterValue(cardNumber, "4111111111111111", "Card Number successfully");
        click(dateOfExpiry, "Click on date");
        click(dateSelect, "Select date successfully");
        enterValue(nameOnCard, CreatedDummyName(), "Name on Card successfully");
        enterValue(cvv, "123", "CVV successfully");
        click(checkTermsMember, "Select check Terms successfully");
        click(makePaymentMember, "Click on Payment");

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "MyPhysicianPlan New Member Registration", "Registration Confirmation");

        Thread.sleep(10000);
    }
    public void RegistrationMultipleMembers() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        clickRegister();
        clickTravelers();
        selectPremiumComprehensive();
        fillDatesForm();
        SelectGetQuote();
        NumberOfTravelers();
        Reporter.log("Total Due Amount is verified");

    }

}
