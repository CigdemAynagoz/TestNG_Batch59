package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_YoutubeAssertion extends TestBase {
    @Test
    public void test01() {
        //1) Bir class oluşturun: YoutubeAssertions
        //2) https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");

        //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    }

    @Test
    public void titleTest() {
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        driver.get("https://www.youtube.com");
        String expectedTitle ="YouTube";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(expectedTitle.contains(actualTitle),"Sayfa baslıgı Youtube iceriyor");
    }

    @Test
    public void imageTest() {
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        driver.get("https://www.youtube.com");
        WebElement youtubeLogo=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(youtubeLogo.isDisplayed());
    }

    @Test
    public void searchBoxTest() {
        driver.get("https://www.youtube.com");
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        Assert.assertTrue(searchBox.isEnabled());
    }

    @Test
    public void wrongTitleTest() {
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        driver.get("https://www.youtube.com");
        String expectedTitle ="youTube";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedTitle));
    }
}
