package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import javax.swing.*;

public class BrcPage {
    public Alert emailTextBox;
    public Alert passwordTextBox;
    public AbstractButton kullaniciProfilIsmi;

    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButonu;

    @FindBy(id = "dropdown-basic-button")
    public WebElement kullanıcıProfilIsmi;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public  WebElement servicesButonu;

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement ProfilIsmiButonu;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "//a[text()='Reservations']")
    public  WebElement rezervasyonButonu;

    @FindBy(xpath = "//select[@name='car']")
    private WebElement selectElement;
    public Select getPageSelectElement(){
        return new Select(selectElement);
    }
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement selectPlace1;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement kartNoKutusu;

    @FindBy(xpath ="//*[text()='Please first login']")
    public WebElement loginUyariMesaji;
}
