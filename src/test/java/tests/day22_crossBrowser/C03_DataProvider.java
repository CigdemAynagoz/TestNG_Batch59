package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {

    @Test
    public void test01() {
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //nutella ıcın arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonucların nutella icerdigini test edelim
        String expectedKelime="Nutella";
        String actualSonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

        //sayfayı kapatalım
        Driver.closeDriver();
    }
    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] arananKelimeArr={{"Nutella"},{"Java"},{"cigdem"},{"Netherlands"}};
        return  arananKelimeArr;
    }


    @Test(dataProvider = "AranacakKelimeler")
    //arayacagımız kelimeleri bir liste gibi tutup bana yollayacak bir veri saglayicisi olusturacagiz
    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();

        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Nutella,cigdem,Java ve Netherlands icerdigini test edin
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);

        //sonucların aradıgımız kelımeyı icerdigini test edelim
        String expectedKelime=arananKelime;
        String actualSonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

        //sayfayı kapatalım
        Driver.closeDriver();
    }
}
