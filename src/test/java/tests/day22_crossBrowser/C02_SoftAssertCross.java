package tests.day22_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;
import utilities.TestBaseCross;

public class C02_SoftAssertCross extends TestBaseCross {
    @Test()
    public void test01() {
        /*
        Softassertion baslangıc ve bıtıs satirlari arasındaki tum assertion lari yapıp
        bitis satırına geldiginde bize buldugu tum hataları rapor eder
         */

        //Softassertion un baslangıcı obje olusturmaktr
        SoftAssert softAssert=new SoftAssert();

        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //2-title in Amazon içerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle),"title amazon icermiyor");

        //3-arama kutusnun erişilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"arama kutusuna erisilemiyor");

        //4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isDisplayed(),"arama yapılamadı");

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonucYaziElementi.getText().contains("Nutella"),"sonuc yazısı kutella ıcermıyor");

        //softassert e bitis satırını belirtmek icin assertAll() kullanılır
        softAssert.assertAll();
        /*
        Softassert un hata bulsa bile calısmaya devam etme ozelligi asserall a kadardır.
        eger assertAll da failed rapor edilirse calısma durur ve claassın kalan kısmı calıstırılmaz
        Yani assertAll HardAssert deki her bir assert gibidir.
        Hatayi yakalarsa calısma durur.
         */

        System.out.println("assertion'lardan failed olan olursa burası calısmaz");

    }
}
