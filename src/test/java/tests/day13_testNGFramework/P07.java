package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P06_QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P07 {
    @Test
    public void test01() {
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //2- login linkine basin
        P06_QdPage p06QdPage=new P06_QdPage();
        p06QdPage.login.click();

        // 3- Kullanvalid 3 farkli test method’u olusturun.
        // - gecerli username, gecersiz password
        p06QdPage.email.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        p06QdPage.sifre.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        // - gecersiz username, gecerli password
        // - gecersiz username, gecersiz password.
        //4- Login butonuna basarak login olun
        p06QdPage.giris.click();

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(p06QdPage.email.isDisplayed());

        Driver.closeDriver();
    }
}