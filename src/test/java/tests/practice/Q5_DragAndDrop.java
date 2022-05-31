package tests.practice;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DHtmlPage;
import utilities.Driver;
import utilities.TestBase;

public class Q5_DragAndDrop extends TestBase {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


      @Test
      public void test() {
            Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
            DHtmlPage dhtmlPage = new DHtmlPage();
            Actions actions = new Actions(Driver.getDriver());

            actions.dragAndDrop(dhtmlPage.Oslo,dhtmlPage.Norway)
                    .dragAndDrop(dhtmlPage.Stockholm,dhtmlPage.Sweden)
                    .dragAndDrop(dhtmlPage.washington,dhtmlPage.UnitedStates)
                    .dragAndDrop(dhtmlPage.Copenhagen, dhtmlPage.Denmark)
                    .dragAndDrop(dhtmlPage.Seoul,dhtmlPage.southKorea)
                    .dragAndDrop(dhtmlPage.Madrid,dhtmlPage.Spain)
                    .dragAndDrop(dhtmlPage.Roma, dhtmlPage.Italy).perform();
            Driver.closeDriver();
      }
}