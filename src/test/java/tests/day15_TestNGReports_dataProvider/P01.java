package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class P01 {
    @Test
    public void tes01() {
        //https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        //Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//a[text()='Click Here']")).click();

        //Acilan yeni pencerenin sayfa başlığının (title) "New Window" oldugunu dogrulayin.
        ReusableMethods.switchToWindow("New Window");

        Assert.assertEquals(Driver.getDriver().getTitle(),"New Window");

        // sayfalari kapatin
        Driver.quitDriver();
    }
}