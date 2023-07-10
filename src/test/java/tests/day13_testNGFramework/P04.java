package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P04 {

    @Test
    public void amazontest02() {
        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella icin arama yapin
        P01_AmazonPage p01AmazonPage=new P01_AmazonPage();
        p01AmazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime")+ Keys.ENTER);

        // sonuclarin Nutella icerdigini test edin
        Assert.assertTrue(p01AmazonPage.aramaSonucu.getText().contains(ConfigReader.getProperty("amazonArananKelime")));


        // sayfayi kapatin
        Driver.closeDriver();
    }
}