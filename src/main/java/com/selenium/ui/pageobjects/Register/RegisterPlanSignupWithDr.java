package com.selenium.ui.pageobjects.Register;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;
public class RegisterPlanSignupWithDr extends BasePage {

    static double priceValue;

    public RegisterPlanSignupWithDr() {
        super();
    }

    By memberPlan = By.xpath("//*[@id='gridDefaultPlans']/div[2]/table/tbody/tr[1]/td[1]/input");
    By nextButtonMemberPlan = By.xpath("//*[@id='tabstrip-1']/div/div[4]/div/button");
    By scroller = By.xpath("(//html)[1]");
    By cardNumber = By.xpath("//*[@id='CardNumber']");
    By nameOnCard = By.xpath("//*[@id='NameOnCard']");
    By cvv = By.xpath("//*[@id='CVV']");
    By date = By.xpath("//*[@id='divCarddetails']/div[4]/div[1]/span[3]");
    By dateSelect = By.xpath("//*[@id='YY_listbox']/li[2]");
    By Checkbox = By.xpath("//input[@id='chkTerms']");
    By MakePayment = By.xpath("//*[@id='tabstrip-3']/div/footer/button[2]");
    By nextButtonMember = By.xpath("//button[@onclick='OnMemberNextClick()']");
    By NextButton = By.xpath("//*[@id='tabstrip-2']/footer/button[2]");


    public void clickNextMemberPlan() {
        scrollDowns(scroller,20);
        click(nextButtonMemberPlan, "Click on Next Button");
    }

    public void RegisterPlanSignupWithDoctor() throws InterruptedException {
        click(memberPlan, "Select member Plan");
        Thread.sleep(1000);
        scrollDowns(scroller,400);
        clickNextMemberPlan();
    }
    public void clickNextPlan() {
        scrollDowns(scroller,400);
        click(nextButtonMember, "Click on Next");
    }

    public void fillPaymentFormForDoctor() throws InterruptedException {
        enterValue(cardNumber, "4111111111111111", "Card Number successfully");
        click(date, "Click on date");
        click(dateSelect, "Select date successfully");
        enterValue(nameOnCard, CreatedDummyName(), "Name on Card successfully");
        enterValue(cvv, "123", "CVV successfully");
        click( Checkbox, "Select check Terms successfully");
        click(MakePayment,"Payment successfully");
        Thread.sleep(1000);

    }
    public void selectRandomPlan() throws InterruptedException {
        Thread.sleep(2000);
        // Get all plan radio buttons
        List<WebElement> allPlans = driver.findElements(By.xpath("//input[@class='defaultPlanRadio']"));
        if (allPlans.isEmpty()) {
            System.out.println("❌ No plans found!");
            return;
        }
        scrollDowns(scroller,70);
        Thread.sleep(1000);
        // Pick a random one
        Random rand = new Random();
        int randomIndex = rand.nextInt(allPlans.size());
        WebElement randomPlan = allPlans.get(randomIndex);
        Thread.sleep(10000);
        randomPlan.click();
        Thread.sleep(10000);

        // Get the plan name text using parent/ancestor lookup
        WebElement planNameElement = randomPlan.findElement(By.xpath("./ancestor::tr//a"));
        String planName = planNameElement.getText().trim();

        String price = planName.replaceAll(".*\\$(\\d+(?:\\.\\d+)?).*", "$1");

        priceValue = Double.parseDouble(price);
        System.out.println("Plan value" + priceValue);
    }

    public void clickOnNextMember() throws InterruptedException {
        scrollDowns(scroller,100);
        Thread.sleep(1000);
        click(NextButton,"Click on Next");
    }

    public void verifyAmountDue() {
        WebElement AmountElement = driver.findElement(By.xpath("//*[@id='sidebarPayment']/span[2]"));
        String AmountDue = AmountElement.getText(); // get the text

        String dueAmount = AmountDue.replaceAll(".*\\$(\\d+(?:\\.\\d+)?).*", "$1");

        double amountduetotal = Double.parseDouble(dueAmount);
        System.out.println("Due amount is " + amountduetotal);

        WebElement enrollmentFeeElement = driver.findElement(By.xpath("//*[@id='spnEnrollFee']"));

        String enrollmentfee = enrollmentFeeElement.getText(); // get the text
        double enrollmentFeeEle = Double.parseDouble(enrollmentfee);
        System.out.println("✅ Selected random plan: " + enrollmentFeeEle);
        double total = priceValue + enrollmentFeeEle;
        System.out.println("Total is " + total);

        Assert.assertEquals(total, amountduetotal,  "Total amount mismatch!");
    }
}




