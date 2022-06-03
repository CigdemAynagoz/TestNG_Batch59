package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class RentalCarTask {
    @Test
    public void test01() {
        //-> https://www.bluerentalcars.com/ adresıne gıdıp asagıdakı bılgılerle  login olalim
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        BrcPage brcPage=new BrcPage();
        brcPage.ilkLoginButonu.click();

        //brcValidEmail=customer@bluerentalcars.com
      //  brcPage.emailKutusu.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        //brcValidPassword=12345
       // brcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        brcPage.ikinciLoginButonu.click();

        //-> Audi Q8 i secip reservasyon yapalim
      //  Select select = new Select(brcPage.carDdm);
        //select.selectByVisibleText("Audi Q8");
        brcPage.getPageSelectElement().selectByVisibleText("Audi Q8");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys("izmir" + Keys.TAB)
                .sendKeys("izmir" + Keys.TAB)
                .sendKeys("12022022" + Keys.TAB)
                .sendKeys("1223" + Keys.TAB)
                .sendKeys("30072022" + Keys.TAB)
                .sendKeys("1530" + Keys.TAB).sendKeys(Keys.SPACE).perform();


        actions.click(brcPage.kartNoKutusu)
                .sendKeys(ConfigReader.getProperty("brcKartNo")+Keys.TAB)
                .sendKeys(ConfigReader.getProperty("brcKartName")+Keys.TAB)
                .sendKeys(ConfigReader.getProperty("brcKartTarih")+Keys.TAB)
                .sendKeys(ConfigReader.getProperty("brcCVCNo")+Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .perform();

        //-> reservasyon yaptigimizi dogrulayalim

    }

    @Test
    public void test02() {
        //->Servis Butonunu tiklayip

        //->Kiraladigimiz araclarin otomatik vitesli olup olmadigini kontrol edelim
    }

    @Test
    public void test03() {
        //->Login olmadan arac kiralamayacagimizi test edelim.
    }

    @Test
    public void test04() {
        //->rezervasyon için verileri girelim

        //-> continue reservation a tiklayalim

        //-> 2 saniye beleyelim ve

        //-> continue reservation hala görünür oldugunu test edelim

    }

    @Test
    public void test05() {
        //-> Servis e gidelim

        //-> En ucuz arac fiyatinin 12 saatlik dolar oldugunu test edelim

        //-> En paha li aracin fiyatinin 3500 $ oldugunu test edelim

        //-> En ucuz ve en pahali aracin ekran resmini alalim
    }

    @Test
    public void test06() {
        //-> login olalim

        //-> login olduktan sonra profile gideloim ve

        //-> bilgilerin dogru oldugunu kontrol edelim

        //-> logout u tiklayip sistemi terk edelim
    }
}
