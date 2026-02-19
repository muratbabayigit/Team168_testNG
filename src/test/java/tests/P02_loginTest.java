package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LocPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P02_loginTest {
           /*
        1-https://ozelders.iyikoc.com/ adresine gidin
        2-Giriş Yap butonuna tıklayın
        3-Username kısmına “wise” yazdırın
        4-Password kısmına wise123 yazdırın
        5-Login butonuna tıklayın
        6-Pasword kısmına “Wise3471&” yazdırın.
        7-Login butonuna tıklayın
        8-Sayfayı kaptın
     */

    @Test
    public void logintest(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        LocPage locPage = new LocPage();
        locPage.loginButton.click();
        ReusableMethods.bekle(2);
        locPage.userName.sendKeys(ConfigReader.getProperty("username"));
        locPage.password.sendKeys("wise123"+ Keys.ENTER);
       // locPage.loginButton.click();
        ReusableMethods.bekle(3);
        // Assert.assertTrue(locPage.hataMessage.isDisplayed());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(locPage.hataMessage.isDisplayed());
        locPage.userName.sendKeys(ConfigReader.getProperty("username"));
        locPage.password.sendKeys("Wise3471&"+ Keys.TAB);
        ReusableMethods.bekle(3);
        softAssert.assertTrue(locPage.profile.isDisplayed());
       // Assert.assertTrue(locPage.profile.isDisplayed());
        Driver.quitDriver();


    }
}
