package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P02_FacebookPage {

   public P02_FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(id = "email")
    public WebElement email;

   @FindBy(id = "pass")
    public WebElement sifre;

   @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

}
