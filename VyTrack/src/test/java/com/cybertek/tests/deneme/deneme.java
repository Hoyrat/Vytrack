package com.cybertek.tests.deneme;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.cybertek.pages.LoginPage;

public class deneme extends TestBase {
    @Test
    public void wrongPasswordTest(){
        //how to use page object model locators?
        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys("user1");
        loginPage.passwordInput.sendKeys("somepassword");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
    }
    @Test
    public  void wrongUsername(){
        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("Useruser123");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");

    }
}
