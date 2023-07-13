package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03 {
    @Test
    public void test01() {
        SoftAssert softAssert=new SoftAssert();

        // amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

// title'in best icermedigini test edin
softAssert.assertFalse(Driver.getDriver().getTitle().contains("best"),"title da istenmeyen içerik var");

// url'in "https://www.amazon.com/" oldugunu test edin
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://www.amazon.com/"),"hatalı url");


//Nutella aratin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


// arama sonuclarinin Nutella icerdigini test edin
        softAssert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("Nutella"),"istenmeyen sonuc yazısı");


    softAssert.assertAll();
    Driver.closeDriver();
    }
}