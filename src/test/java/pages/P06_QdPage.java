package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P06_QdPage {
  public   P06_QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement login;

  @FindBy(xpath ="//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement giris;

  @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement email;

  @FindBy(xpath = "(//input[@class='form-control'])[3]")
  public WebElement sifre;

  @FindBy(xpath = "(//a[text()='My courses'])[1]")
  public WebElement basariliGirisKontrolElementi;
}
