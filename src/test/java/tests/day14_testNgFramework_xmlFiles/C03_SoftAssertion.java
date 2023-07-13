package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
public class C03_SoftAssertion {
    @Test
    public void nutellaTesti(){
        // amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 1- Soft Assert kullanmak icin obje olusturmaliyiz

        SoftAssert softAssert = new SoftAssert();
        // 2- istediginiz tum testleri softAssert objesini kullanarak yapin
        // title'in best icermedigini test edin
        String unexpectedIcerik = "best";
        String actualTitle = Driver.getDriver().getTitle();

        softAssert.assertFalse(actualTitle.contains(unexpectedIcerik));

        // url'in "https://www.amazon.com/" oldugunu test edin
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"amazon url'si hatalımı");
        //Nutella aratin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // arama sonuclarinin Nutella icerdigini test edin
        String expectedUrunIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        softAssert.assertTrue(actualSonucYazisi.contains(expectedUrunIcerik),"sonuc yazısı hatalı");
        // 3- Tum testlerimiz bittiginde
        //    softAssert objesinin not aldigi hatalari raporlamasini isteyelim

        softAssert.assertAll();

        Driver.closeDriver();


    }
}
