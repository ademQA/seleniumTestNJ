package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03 {


    @DataProvider
    public static Object[][] AranacakUrunListesi() {
        String[][] urunList={{"Nutella"}, {"Cokokrem"}, {"Java"}, {"Selenium"}, {"Apple"}, {"Samsung"}};

        return urunList;
    }

    @Test(dataProvider = "AranacakUrunListesi")
    public void cokluAramaTest01(String aranacakUrun) {
        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // verilen listedeki her bir urun icin ayri ayri
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakUrun+ Keys.ENTER);
        // arama yapip , sonuclarin o urunu icerdigini test edin
        // Nutella, Cokokrem, Java, Selenium, Apple, Samsung
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains(aranacakUrun));
        //sayfayı kapatın
        Driver.closeDriver();
    }
}