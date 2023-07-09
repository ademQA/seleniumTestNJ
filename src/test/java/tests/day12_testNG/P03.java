package tests.day12_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class P03 {

    // 3 farkli test method'u olusturup, su testleri yapin
    @Test(priority = 0)
    public void amazonUrlTesti() {
        // amazon anasayfaya gidin
        Driver.getDriver().get("https://amazon.com");
        // 1- url'in amazon icerdigini test edin
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon"));

    }

    @Test(dependsOnMethods ="amazonUrlTesti" )
    public void nutellaAramaTesti() {
        // 2- Nutella aratip sonucun nutella icerdigini test edin
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+ Keys.ENTER);
    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText().contains("nutella"));

    }

    @Test(dependsOnMethods = "nutellaAramaTesti")
    public void nutellaIceriyormuTesti() {
        // 3- ilk urune click yapip, acilan sayfadaki urun isminin Nutella icerdigini test edin
        Driver.getDriver()
                .findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]"))
                .click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']")).getText().contains("Nutella"));
        Driver.closeDriver();
    }
}