package com.selenium.ui.pageobjects.Admin;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;

public class Management extends BasePage {

    public Management() {
        super();
    }
    public static String State;
    By RxSetupTab = By.xpath("//*[@id='liRxPrices']");
    By AddPharmacy = By.xpath("//*[@id='gridPharmacy']/div[1]/div/div/a");
    By StateCode = By.xpath("//*[@id='StateCode']");
    By County    = By.xpath("//*[@id='County']");
    By PharmacyName = By.xpath("//*[@id='PharmacyName']");
    By CorrectIcon = By.xpath("//*[@id=\"gridPharmacy\"]/div[3]/table/tbody/tr[1]/td[1]/a[1]");
    By OkIcon = By.xpath("(//span[@class='glyphicon glyphicon-ok'])[1]");
    By AddRx = By.xpath("//*[@id='gridRxPricing']/div[1]/div/div/a");
    By Medication = By.xpath("//*[@id='Medication']");
    By Dosage = By.xpath("//*[@id='Dosage']");
    By Quantity = By.xpath("//*[@id='Quantity']");
    By LowestPrice = By.xpath("//*[@id='LowestPrice']");
    By HighestPrice = By.xpath("//*[@id='HighestPrice']");
    By EditeIcon = By.xpath("//*[@id='gridPharmacy']/div[3]/table/tbody/tr[1]/td[1]/a[1]/span");
    By FitterIcon = By.xpath("//div[@id='gridPharmacy']//th[2]//a[1]//span[1]");
    By FitterContent = By.xpath("//form[contains(@class,'k-filter-menu')]//input[@type='text']");
    By FitterBTN = By.xpath("/html/body/div[15]/form/div[1]/div[2]/button[1]");

    public void AddPharmacy() throws InterruptedException {
        click(RxSetupTab,"");
        Thread.sleep(10000);
        click(AddPharmacy,"");
        Thread.sleep(10000);
        String State= generateRandomState();
        enterValue(StateCode,generateRandomState(),"");
        enterValue(County,generateRandomCountry(),"");
        enterValue(PharmacyName,"HealthPlus Pharmacy","");
        Thread.sleep(10000);
        click(CorrectIcon,"");
    }
    public void EditPharmacyDetails() throws InterruptedException {
        click(EditeIcon,"");
        Thread.sleep(100000);
        enterValue(StateCode,generateRandomState(),"");
        Thread.sleep(10000);
        click(CorrectIcon,"");
        Thread.sleep(10000);
    }
    public void AddRx() throws InterruptedException {
        click(RxSetupTab,"");
        Thread.sleep(10000);
        click(AddRx,"");
        Thread.sleep(10000);
        enterValue(Medication,generateRandomMedicationName(),"");
        enterValue(Dosage,generateRandomNumber(2)+"Mg","");
        enterValue(Quantity,generateRandomNumber(2),"");
        enterValue(LowestPrice,generateRandomNumber(2),"");
        enterValue(HighestPrice,generateRandomNumber(2),"");
        Thread.sleep(10000);
        click(OkIcon,"");
    }
}
