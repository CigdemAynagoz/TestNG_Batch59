package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    /*
    TestNG test methodlarını isim sırasına gore calıstırır.Eger isim sıralamasının dısında bir
     sıralama ile calısmasını ısterseniz o zaman test methodlarını oncelik( priority) tanımlayabiliriz
     Priority kucukten buyuge gore calısır.
     Eger bir test methoduna priority degeri atanmamıssa default olarak priority=0 olarak kabul edilir
     */
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
    @Test(priority = -5)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test(priority = -2)
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
