package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelPage {
    public HotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement loginButton;

    @FindBy (xpath = "//input[@class='form-control required']")
    public WebElement usernameBox;

    @FindBy (xpath = "//span[text()='ListOfUsers']")
    public WebElement listOfUsersText;

    @FindBy (xpath = "//span[text()='Try again please']")
    public WebElement tryAgainText;

    @FindBy (xpath="//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy (xpath="//input[@class='btn btn-primary py-3 px-5']")
    public WebElement ikinciLogınButonu;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy(xpath = "//*[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@class='form-control input-lg required']")
    public WebElement createList;

    @FindBy(xpath = "//select[@title='Select Group']")
    public WebElement IDGroup;

    @FindBy (xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(className = "bootbox-body")
    public WebElement sonText;

    @FindBy(className = "btn btn-primary")
    public WebElement okButton;
}
