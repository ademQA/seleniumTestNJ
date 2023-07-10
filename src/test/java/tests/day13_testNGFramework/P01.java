package tests.day13_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class P01 {
@Test
    public void amazontest(){
    // amazon anasayfaya gidin
    Driver.getDriver().get("https:amazon.com");
    P01_AmazonPage p01AmazonPage=new P01_AmazonPage();
    // Nutella icin arama yapin
    p01AmazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    // sonuclarin Nutella icerdigini test edin
    Assert.assertTrue(p01AmazonPage.aramaSonucu.getText().contains("Nutella"));
    // Sayfayi kapatin
    ReusableMethods.bekle(3);
    Driver.closeDriver();
}

}
