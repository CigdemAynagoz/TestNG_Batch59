package tests.practice;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebDriverUniversityPage;
import utilities.Driver;
import utilities.TestBase;

public class Q4_Alert_DependsOn  {

       /*
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2. CLICK ME of JavaScript Alert e tıklayın
     // 3. pop up text i alın
     // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
     // 5. pop up i kabul edin

     // Yine ayni class da baska test methodu olusturun
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
     // 3.  pop up text i alın
     // 4. Mesajın "Press a button!" olduğunu doğrulayın
     // 5. Açılır pencereyi kapat
     // 6. pop up i iptal edin,
     // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
     // 8. alert1'e göre dependsOnMethods kullanın
 */

    @Test
    public void alertTest01() {
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        WebDriverUniversityPage wdu=new WebDriverUniversityPage();
        wdu.javaScriptAlert.click();
        String actualMsj=Driver.getDriver().switchTo().alert().getText();
        String expectedMsj="I am an alert box!";
       Assert.assertEquals(actualMsj,expectedMsj);
       Driver.getDriver().switchTo().alert().getText();

    }

    @Test(dependsOnMethods = "alertTest01")
    public void alertTest02() {
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        WebDriverUniversityPage wdu=new WebDriverUniversityPage();
        wdu.javaScriptConfirmBox.click();

        Alert alert=Driver.getDriver().switchTo().alert();

        String expectedMessage="Press a button!";

        Assert.assertEquals(alert.getText(),expectedMessage);

        alert.dismiss();
        Assert.assertTrue(wdu.yaziElementi.isDisplayed());

    }
}

