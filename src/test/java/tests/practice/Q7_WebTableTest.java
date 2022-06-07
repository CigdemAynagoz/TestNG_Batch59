package tests.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebTablePages;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Q7_WebTableTest extends TestBaseRapor {

     /*
   go to url : https://en.wikipedia.org/wiki/Dell
   go to table which name is 'List of companies acquired by Dell Inc.'
   print row 4 of the table on console
   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
   ( 2nd and 3rd elements : November 2, Cloud integration leader)
     Verify that Compellent appears in the first cell of line 6

   url'ye gidin: https://en.wikipedia.org/wiki/Dell
    'List of companies acquired by Dell Inc.' isimli tabloya gidin,
    tablonun 4. satırını konsolda yazdırın
    ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
    ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
    6. satirin ilk hucresinde Compellent yazisinin goruntulendigini dogrulayin

    */
    @Test
    public void test() {
        extentTest=extentReports.createTest("wikipedia webtable test","table test");
        // url'ye gidin: https://en.wikipedia.org/wiki/Dell
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");
       extentTest.info("istenen url e gidildi");

        //    'List of companies acquired by Dell Inc.' isimli tabloya gidin,
        WebTablePages webTablePages=new WebTablePages();
        //    tablonun 4. satırını konsolda yazdırın
        System.out.println("4.satir: "+webTablePages.fourthRow.getText());
        extentTest.info("4.satir consolda yazildi");

        //    ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
        //    ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
        System.out.println("5.ci satirdaki 2.element: "+webTablePages.secondElement.getText());
        extentTest.info("5.ci satirdaki 2.element consolda yazıldı");

        System.out.println("5.ci satirdaki 3.element :"+ webTablePages.thirdElement.getText());
        extentTest.info("5.ci satirdaki 3.element consolda yazıldı");

        //    6. satirin ilk hucresinde Compellent yazisinin goruntulendigini dogrulayin
        Assert.assertTrue(webTablePages.sixthElement.isDisplayed());
        extentTest.pass("Compellent yazisi goruldu");
    }
}
