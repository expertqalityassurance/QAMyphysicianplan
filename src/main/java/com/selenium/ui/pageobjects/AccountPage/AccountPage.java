package com.selenium.ui.pageobjects.AccountPage;

import com.selenium.dataprovider.GlobalPropertiesReader;
import com.selenium.ui.pageobjects.common.BasePage;
import org.openqa.selenium.By;

public class AccountPage extends BasePage{

    public AccountPage()
        {
            super();
        }


        By ChangePassword =By.xpath("//*[@id='liChangePassword']");
        By OldPassword =By.xpath("//*[@id='OldPassword']");
        By NewPassword =By.xpath("//*[@id='NewPassword']");
        By ConfirmPassword =By.xpath("//*[@id='ConfirmPassword']");

        public void ChangePassword() throws Exception {
            Thread.sleep(10000);
            checkElementIsVisible(ChangePassword, "Change password should be visible");
            click(ChangePassword,"Click on change password");
            enterValue(OldPassword, GlobalPropertiesReader.propReader().username()," username successfully");
            enterValue(NewPassword,"Tester@1","Password successfully");
            enterValue(ConfirmPassword,"Tester@1","Confirm Password successfully");
        }

}
