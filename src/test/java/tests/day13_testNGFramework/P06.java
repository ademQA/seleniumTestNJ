package tests.day13_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P06_QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P06 {
    @Test
    public void test01(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //2- login linkine basin
        P06_QdPage p06QdPage=new P06_QdPage();
        p06QdPage.login.click();

        // 3- Kullanici email’i olarak valid email girin
        p06QdPage.email.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

        // 4- Kullanici sifresi olarak valid sifre girin
        p06QdPage.sifre.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // 5- Login butonuna basarak login olun
        p06QdPage.giris.click();

        // 6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(p06QdPage.basariliGirisKontrolElementi.isDisplayed());
        Driver.closeDriver();

    }
}
