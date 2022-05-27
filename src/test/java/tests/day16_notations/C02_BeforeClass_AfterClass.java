package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    //JUnit te @BeforeClass ve @AfterClass notasyonuna sahip methodlar static olmak zorundaydı
    //testNG de bu zorunluluktan bizi kurtarıyor
    /*
    TestNG bize daha fazla before ve after notasyonları sunar.Diger before ve after notasyonları
    tanımlaycagımız grup,tets veya suit den once ve sonra calısırlar
    İleride xml dosyaları ile birlikte bunları gorecegiz
     */

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
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
