package com.selenium.ui.pageobjects.ValidationChecks;

import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class ValidationCheckForExtendPlanPage extends BasePage {

    public ValidationCheckForExtendPlanPage()
    {
        super();
    }

    By ExtenedPlan= By.xpath("//*[@id=\"PlansGrid\"]/table/tbody/tr/td/div/div[6]/div/a");
    By ExtendtoDate=By.xpath("//*[@id='NewPlanTerm']");
    By ExtendPlanBTN= By.xpath("//*[@id='btnExtendPlan']");
    By confirmingextension= By.xpath("//span[contains(text(),'Please select a new plan term date.')]");
    By CloseBTN= By.xpath("/html/body/div[9]/div[2]/div/button");


    public void ValidationCheckForExtendDate() throws Exception {
        Reporter.log("********* " + new Throwable().getStackTrace()[0].getMethodName() + " *********");
        Thread.sleep(10000);
        click(ExtenedPlan,"");
        enterValue(ExtendtoDate,getLastMonthDate(),"Enter last month date");
        Thread.sleep(10000);
        click(ExtendPlanBTN,"Click on extend plan button");
        Thread.sleep(10000);
        String message= getText(confirmingextension);
        Assert.assertEquals(message,"Please select a new plan term date.");
        Reporter.log("All expected validation messages related to the report are present and have been verified successfully.");
    }


}