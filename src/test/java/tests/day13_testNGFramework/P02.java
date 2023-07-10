package tests.day13_testNGFramework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class P02 {
    @Test
    public void facebookTesti() {

        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        Faker faker=new Faker();
        P02_FacebookPage p02FacebookPage=new P02_FacebookPage();


        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        p02FacebookPage.email.sendKeys(faker.internet().emailAddress());
        p02FacebookPage.sifre.sendKeys(faker.internet().password());
        p02FacebookPage.login.click();
        ReusableMethods.bekle(3);

        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(p02FacebookPage.email.isDisplayed());


        //Driver.closeDriver();

    }
}