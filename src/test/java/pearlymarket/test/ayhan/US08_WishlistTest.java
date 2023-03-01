package pearlymarket.test.ayhan;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pearlymarket.pages.ayhan.PearlyPage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class US08_WishlistTest {
    @Test
    public void wishListTest1() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);

        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();

        ReusableMethods.hover(pearlyPage.moveToSecond);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();
        ReusableMethods.waitFor(3);
        pearlyPage.wishListButton.click();

        ReusableMethods.verifyElementDisplayed(pearlyPage.wishListPage);
        Driver.closeDriver();
    }

    @Test
    public void wishListTest2() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);
        ReusableMethods.waitFor(2);
        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(2);
        pearlyPage.addToWishlist.click();

        ReusableMethods.hover(pearlyPage.moveToSecond);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();
        ReusableMethods.waitFor(3);
        pearlyPage.wishListButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.wishListPage);

        pearlyPage.quickViewButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.getQuickViewTest);
        Driver.closeDriver();
    }

    @Test
    public void wishListTest3() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);

        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();

        ReusableMethods.hover(pearlyPage.moveToSecond);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();

        pearlyPage.wishListButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.wishListPage);

        pearlyPage.addToCartButton.click();
        ReusableMethods.waitFor(3);

        pearlyPage.cartPageButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.cartCheck);
        Driver.closeDriver();
    }

    @Test
    public void wishListTest4() {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));

        pearlyPage.searchBox.sendKeys("iphone", Keys.ENTER);

        ReusableMethods.hover(pearlyPage.moveToFirst);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();

        ReusableMethods.hover(pearlyPage.moveToSecond);
        ReusableMethods.waitFor(3);
        pearlyPage.addToWishlist.click();

        pearlyPage.wishListButton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(pearlyPage.wishListPage);

        pearlyPage.addToCartButton.click();
        ReusableMethods.waitFor(3);

        pearlyPage.cartPageButton.click();
        ReusableMethods.waitFor(3);

        pearlyPage.checkOutButton.click();

        pearlyPage.firstName.sendKeys("Ali",
                Keys.TAB, "Veli",
                Keys.TAB,
                Keys.TAB, "Turkey",
                Keys.ENTER,
                Keys.TAB, "Adres",
                Keys.TAB,
                Keys.TAB, "32456",
                Keys.TAB, "Afyon",
                Keys.TAB, "Afyon",
                Keys.ENTER,
                Keys.TAB,
                Keys.TAB, "05326589632",
                Keys.TAB, "35florya35@gmail.com");

        ReusableMethods.waitFor(5);
        pearlyPage.placeOrderButton.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(pearlyPage.thankYou);
        Driver.closeDriver();
    }
}