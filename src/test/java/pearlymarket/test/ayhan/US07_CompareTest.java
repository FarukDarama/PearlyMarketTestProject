package pearlymarket.test.ayhan;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pearlymarket.pages.ayhan.PearlyPage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;


public class US07_CompareTest {
    @Test
    public void compareTest1() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.birinciCompare);

        pearlyPage.searchBox.sendKeys("samsung", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(2);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.ikinciCompare);

        ReusableMethods.waitFor(2);
        pearlyPage.searchBox.sendKeys("tv", Keys.ENTER);
        ReusableMethods.waitFor(2);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.ucuncuCompare);

        pearlyPage.searchBox.sendKeys("car", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.dorduncuCompare);

        pearlyPage.searchBox.sendKeys("xiaomi", Keys.ENTER);
        ReusableMethods.waitFor(2);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.dorduncuCompare);

        pearlyPage.startCompareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.compareIsHere);

        Driver.closeDriver();
    }
    @Test
    public void compareTest2() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.birinciCompare);

        pearlyPage.searchBox.sendKeys("samsung", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.ikinciCompare);
        ReusableMethods.waitFor(3);

        pearlyPage.cleanAllButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.zero);

        pearlyPage.searchBox.sendKeys("car", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();

        pearlyPage.searchBox.sendKeys("xiaomi", Keys.ENTER);
        ReusableMethods.waitFor(2);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        pearlyPage.startCompareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.compareIsHere);

        Driver.closeDriver();
    }
    @Test
    public void compareTest3() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.birinciCompare);

        pearlyPage.searchBox.sendKeys("samsung", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.ikinciCompare);

        ReusableMethods.waitFor(2);
        pearlyPage.startCompareButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(pearlyPage.compareIsHere);

        Driver.closeDriver();
    }
    @Test
    public void compareTest4() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.birinciCompare);

        pearlyPage.searchBox.sendKeys("samsung", Keys.ENTER);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.ikinciCompare);

        pearlyPage.searchBox.sendKeys("tv", Keys.ENTER);
        ReusableMethods.waitFor(3);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        pearlyPage.compareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.ucuncuCompare);

        ReusableMethods.waitFor(3);
        pearlyPage.startCompareButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.compareIsHere);

        pearlyPage.compareDelete.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementNotDisplayed(pearlyPage.compareDelete);

        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
}
