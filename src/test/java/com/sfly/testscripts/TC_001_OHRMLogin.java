package com.sfly.testscripts;

import com.sfly.base.Browser;
import com.sfly.helper.ExcelReader;
import com.sfly.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_001_OHRMLogin extends Browser {

    @Test(dataProvider = "getdata",dataProviderClass = ExcelReader.class)
    public void tc_001_OHRMLogin(String username,String passwd) throws Exception{
        driver.get(p.getProperty("OrangeHRMurl"));
        Thread.sleep(2000);
        LoginPage lp = new LoginPage(driver);
        lp.loginOHRM(username,passwd);
    }
}
