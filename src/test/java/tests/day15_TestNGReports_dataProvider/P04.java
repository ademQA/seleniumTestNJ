package tests.day15_TestNGReports_dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class P04 extends TestBaseRapor {
    @DataProvider
    public static Object[][] kullaniciListesi() {
        String[][] kullaniciAdiSifre = {{"adem", "1234"}, {"murat", "1234"}, {"ali", "1235"}};
        return kullaniciAdiSifre;
    }

    @Test(dataProvider = "kullaniciListesi")
    public void test01(String kullaniciAdi, String sifre) {
        extentTest = extentReports.createTest("quality test");
        // Qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // liste olarak verilen kullanici adi ve sifreleri ile
        // giris yapilamadigini test edin
        QdPage qdPage = new QdPage();


        // ilk login linkine tiklayin
        qdPage.ilkLoginLinki.click();
        extentTest.info("login olmalı");

        // kullanici adi ve sifresini yazip giris yapmayi deneyin
        qdPage.emailKutusu.sendKeys(kullaniciAdi);
        qdPage.passwordKutusu.sendKeys(sifre);
        qdPage.loginButonu.click();
        extentTest.info("kullanıcı adı ve şifre girildi");
        // giris yapilamadigini test edin
        Assert.assertTrue(qdPage.emailKutusu.isDisplayed());
        extentTest.pass("giriş yapılamamalı");
        // sayfayi kapatin
        Driver.closeDriver();
    }
}