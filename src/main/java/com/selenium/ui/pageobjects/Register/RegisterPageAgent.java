package com.selenium.ui.pageobjects.Register;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RegisterPageAgent extends BasePage {
    public static String MemberFirstName, MemberLastName;

    public RegisterPageAgent() {
        super();
    }

    By SelectComprehensivePlan = By.xpath("(//button[@type='button'][normalize-space()='Select'])[1]");
    By SelectEssentialPlan = By.xpath("(//button[@type='button'][normalize-space()='Select'])[2]");
    By SelectPrimaryCarePlan= By.xpath("(//button[@type='button'][normalize-space()='Select'])[3]");
    By actionSelect = By.xpath("//ul[@id='StateName_listbox']/li");
    By ActionForState = By.xpath("//ul[@id='State1_listbox']/li");
    By ActionEndDate = By.xpath("//ul[@id='EndDate_listbox']/li");
    By firstName = By.xpath("//input[@id='firstName1']");
    By lastName = By.xpath("//*[@id='lastName1']");
    By dateOfBirth = By.xpath("//*[@id='DOB1']");
    By address = By.xpath("//*[@id='Address']");
    By Address = By.xpath("//*[@id='Address11']");
    By city = By.xpath("//*[@id='CityName']");
    By City = By.xpath("//*[@id='City1']");
    By state = By.xpath("//*[@id='divMembers']/div[2]/div[2]/span[2]/span/span[1]");
    By State = By.xpath("//*[@id='familyPanelBar-1']/div/div[5]/div[2]/span[2]/span/span[1]");
    By postalCode = By.xpath("//*[@id='Zip']");
    By ZipCode =By.xpath("//*[@id='Zip1']");
    By emailUsername = By.xpath("//*[@id='Email']");
    By EmailName = By.xpath("//*[@id='Email1']");
    By mobileCode = By.xpath("//*[@id='CountryCode']");
    By CountryCode = By.xpath("//*[@id='CountryCode1']");
    By mobileNumber = By.xpath("//*[@id='MobileNumber']");
    By MobileNum = By.xpath("//*[@id='MobileNumber1']");
    By SelectedStartDate = By.xpath("//*[@id='StartDate']");
    By startDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[1]/span[2]/span/span/span");
    By endDate = By.xpath("(//span[@class='k-input'])[1]");
    By SelectedEndDate = By.xpath("//*[@id='tabstrip-1']/div/div[1]/div[2]/span[2]/span/span[1]");
    By NxtBtn = By.xpath("//*[@id='tabstrip-1']/div/footer/button");
    By MemberNxtBtn = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");
    By selectMakePaymentBtn = By.xpath("//*[@id='tabstrip-3']/div/footer/button[2]");
    By selectExpiryDate = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]/span/span[1]");
    By cardNumber = By.xpath("//*[@id='CardNumber']");
    By dateSelect = By.xpath("//*[@id='YY_listbox']/li[2]");
    By nameOnCard = By.xpath("//*[@id='NameOnCard']");
    By cvv = By.xpath("//*[@id='CVV']");
    By chkTerms = By.xpath("//*[@id='chkTerms']");
    By SelectFilter = By.xpath("//*[@id='gridMembers']/div[1]/div/table/thead/tr/th[2]/a[1]/span");
    By MemberName = By.xpath("/html/body/div[19]/form/div[1]/input");
    By SearchName = By.xpath("/html/body/div[19]/form/div[1]/div[2]/button[1]");
    By MemberID = By.xpath("//*[@id='gridMembers']/div[2]/table/tbody/tr/td[2]");
    By ComprehensivePlan = By.xpath("//*[@id='liComprehensiveDashboard']");
    By EssentialComprehensivePlan = By.xpath("//*[@id='liEssentialDashboard']");


    public RegisterPageAgent selectPremiumComprehensive() throws InterruptedException {
        click(SelectComprehensivePlan, "Click on Select Premium Plan Travelers");
        return this;
    }

    public RegisterPageAgent selectEssentialComprehensive() throws InterruptedException {
        click(SelectEssentialPlan, "Click on Select Premium Plan Travelers");
        return this;
    }
    public RegisterPageAgent selectPrimaryCare() throws InterruptedException {
        click(SelectPrimaryCarePlan, "Click on Select Premium Plan Travelers");
        return this;
    }

    public RegisterPageAgent selectMakePayment() {
        click(selectMakePaymentBtn, "Click on Select Premium Plan Travelers");
        return this;
    }



    public void registerPremiumComprehensivePlanWithAgent() throws InterruptedException {
    selectPremiumComprehensive();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
}

    public void registerEssentialComprehensivePlanWithAgent() throws InterruptedException {
        selectEssentialComprehensive();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
    }

    public void registerPrimaryCarePlanWithAgent() throws InterruptedException {
        selectPrimaryCare();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(windowHandles);
        driver.switchTo().window(tabs.get(1));
    }
    public void fillTravelerForm() throws InterruptedException {
        MemberFirstName=CreatedDummyName();
        enterValue(firstName,MemberFirstName, "First Name successfully");
        MemberLastName= CreatedDummyName();
        enterValue(lastName,MemberLastName, "Last Name successfully");
        enterValue(dateOfBirth, "04/20/1998", "Date of Birth successfully");
        enterValue(address, "near station", "Address successfully");
        enterValue(city, "California", "Enter City successfully");
        click(state,"");
        selectCategoryByIndex(2);
        enterValue(postalCode, CreatedZipNumber(), "Enter Postal Code successfully");
        enterValue(emailUsername, CreatedDummyEmail(), "Email/Username successfully");
        enterValue(mobileCode, "91", "Mobile Code successfully");
        enterValue(mobileNumber, CreatedPhoneNumber(), "Mobile Number successfully");
    }


    public void fillPrimaryCarePlanForm() throws InterruptedException {
        MemberFirstName= CreatedDummyName();
        enterValue(firstName, MemberFirstName, "First Name successfully");
        MemberLastName= CreatedDummyName();
        enterValue(lastName, MemberLastName, "Last Name successfully");
        enterValue(dateOfBirth, "04/20/1998", "Date of Birth successfully");
        enterValue(Address, "near station", "Address successfully");
        enterValue(City, "California", "Enter City successfully");
        click(State,"");
        SelectStateByIndex(3);
        enterValue(ZipCode, CreatedZipNumber(), "Enter Postal Code successfully");
        enterValue(EmailName, CreatedDummyEmail(), "Email/Username successfully");
        enterValue(CountryCode, "91", "Mobile Code successfully");
        enterValue(MobileNum, CreatedPhoneNumber(), "Mobile Number successfully");
        click(MemberNxtBtn,"");

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

    public String selectEndDateByIndex(int index) throws InterruptedException {
        int flag = 0;
        List<WebElement> allOptions = driver.findElements(ActionEndDate);
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
    public String SelectStateByIndex(int index) throws InterruptedException {
        int flag = 0;
        List<WebElement> allOptions = driver.findElements(ActionForState);
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

    public void  VerifyRegistration() {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wndMessage\"]")));
         String popupText = popup.getText();
         System.out.println(popupText);
         String expectedMessage = "You are registered successfully.\n\nYou will receive an email shortly confirming your registration.";
         Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
     }

    public void fillPrimaryCareForm() throws InterruptedException {
        click(startDate, "Click on Start Date");
        enterValue(SelectedStartDate, Keys.ENTER);

        click(endDate, "Click on End Date");
        selectEndDateByIndex(2);
        click(NxtBtn,"");

    }

    public void fillPrimaryCarePaymentForm() throws InterruptedException {
        enterValue(cardNumber, "4111111111111111", "Card Number successfully");
        click(selectExpiryDate, "Click on date successfully");
        click(dateSelect, "Select date successfully");
        enterValue(nameOnCard, CreatedDummyName(), "Name on Card successfully");
        enterValue(cvv, "123", "CVV successfully");
        click(chkTerms, "Select check Terms successfully");
        Thread.sleep(10000);
    }

    public void SearchAddedMember() throws InterruptedException {
        click(SelectFilter,"");
        Thread.sleep(10000);
        enterValue(MemberName,MemberFirstName,"");
        click(SearchName,"");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gridMembers']/div[2]/table/tbody/tr/td[2]")));
        String popupText = popup.getText();
        System.out.println(popupText);
        String expectedMessage = MemberFirstName + " " + MemberLastName;
        Assert.assertEquals(popupText.trim(), expectedMessage, "Popup message is not as expected!");
    }

    public void ClickOnModuleComprehensivePlan() throws InterruptedException {
        click(ComprehensivePlan, "");
    }
    public void ClickOnModuleEssentialComprehensivePlan() throws InterruptedException {
        click(EssentialComprehensivePlan, "");
    }
}
