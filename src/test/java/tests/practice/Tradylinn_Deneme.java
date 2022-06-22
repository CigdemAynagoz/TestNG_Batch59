package tests.practice;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;

public class Tradylinn_Deneme {
    @Test
    public void test01() throws InterruptedException {

        TradylinnPage tradylinnPage=new TradylinnPage();

        Driver.getDriver().get("https://tradylinn.com/");

        tradylinnPage.girisYapButton.click();

        Thread.sleep(3000);

        tradylinnPage.usernameBox.sendKeys("c.ayngz.03@gmail.com"+ Keys.ENTER);

        tradylinnPage.passwordBox.sendKeys("cgdmayngz.1"+ Keys.ENTER);

        tradylinnPage.loginButton.click();

        Driver.closeDriver();









    }
}
