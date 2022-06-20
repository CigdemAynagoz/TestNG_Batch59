package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Giriş Yap']")
    public WebElement girisYapButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;
}
