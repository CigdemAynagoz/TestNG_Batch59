package tests.day21_reusableMethods_HtmlPeports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C01_WindowHandleREusableMethods {
    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle = Driver.getDriver().getWindowHandle();

        //Click Here butonuna abasın
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();
        String ikinciSayfaWindowHandle = "";
        for (String each: windowHandleSeti) {
            if (!each.equals(ilkSayfaWindowHandle)){
                ikinciSayfaWindowHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandle);
        System.out.println(Driver.getDriver().getTitle());
        //acılan yeni tab ın title nin new window oldugunu test edin
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle = Driver.getDriver().getWindowHandle();

        //Click Here butonuna abasın
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        //acılan yeni tab ın title nin new window oldugunu test edin
        ReusableMethods.switchToWindow("New Window");

        Driver.closeDriver();
    }

}
