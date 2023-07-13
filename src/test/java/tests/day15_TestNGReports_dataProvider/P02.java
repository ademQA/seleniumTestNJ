package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class P02 extends TestBaseRapor {

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Raporlu Nutella Arama Testi", "Kullanıcı Amazonda Nutella arayabilmeli");
        // amazona gidin

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon sayfasına gitme");
        // Nutella icin arama yapin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        extentTest.info("Amazonda Nutella Aratma işlemi");
        // sonuclarin Nutella icerdigini test edin
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("Nutella"));
        extentTest.pass("title başlığının doğruluğu");

        // sayfayi kapatin
        Driver.closeDriver();
    }
}