package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P02 {
    @Test
    public void test01() {
        // amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

// title'in best icermedigini test edin
        Assert.assertFalse(Driver.getDriver().getTitle().contains("best"),"başlık best içermiyor");

// url'in "https://www.amazon.com/" oldugunu test edin
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.amazon.com/","url beklenenden farklı");


//Nutella aratin

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

// arama sonuclarinin Nutella icerdigini test edin
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("nutella"));

        Driver.closeDriver();
    }
}