package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullnaimi {
    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //nutella aratalım
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //sonucyazısının nutella içerdigini test edelim
        String actuelSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";
        Assert.assertTrue(actuelSonuc.contains(arananKelime));
        Driver.closeDriver();
    }
}
