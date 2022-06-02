package tests.day19_smokeTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelPage;
import utilities.Driver;

public class E2E_CreateHotel {
    @Test
    public void createHotel() {
        HotelPage hotelPage=new HotelPage();
        //1.Tests packagenin altına class olusturun: CreateHotel
        //2.Bir metod olusturun: createHotel
        //3.https://www.hotelmycamp.com adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com");

        hotelPage.loginButton.click();

        hotelPage.usernameBox.sendKeys("manager");
        hotelPage.passwordBox.sendKeys("Manager1!");
        hotelPage.ikinciLogınButonu.click();
        hotelPage.hotelManagementButton.click();
        hotelPage.hotelList.click();
        hotelPage.addHotel.click();


        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();


        actions.click(hotelPage.createList).sendKeys(faker.number().digit()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).
                perform();


        Select select = new Select(hotelPage.IDGroup);
        select.selectByIndex(1);

        hotelPage.saveButton.click();

// "Hotel was inserted successfully" textinin göründüğünü test edin.
        Assert.assertTrue(hotelPage.sonText.isDisplayed());

        hotelPage.okButton.click();

        //4.Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username
        //: manager
        //b. Password
        //: Manager 1
        //5.
        //Login butonuna tıklayın.
        //6
        //. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        //7
        //. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8
        //. Save butonuna tıklayın.
        //9. “Hotel was inserted successfully”
        //textinin göründüğünü test edin.
        //10
        //. OK butonuna tıklayın.
    }
}
