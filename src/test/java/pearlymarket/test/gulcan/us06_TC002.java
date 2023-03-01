package pearlymarket.test.gulcan;


import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.pages.MyAccount;
import pearlymarket.pages.ShoppingPage;
import pearlymarket.pages.UserLoginPage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class us06_TC002 {
    HomePage homePage;
    UserLoginPage userLoginPage;

    @Test
    public void us06_tc002() {
        HomePage homePage = new HomePage();
        UserLoginPage userLoginPage = new UserLoginPage();
        MyAccount myAccount = new MyAccount();
        ShoppingPage shoppingPage = new ShoppingPage();

        //Verilen adrese git
        Driver.getDriver().get(ConfigReader.getProperty("url"));


        //MyAccount sayfasina gec
        ReusableMethods.clickByJS(homePage.icon);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(myAccount.myAccountText.isDisplayed());

        //Ilk istedigin ürünü ara
        homePage.searchBox.sendKeys(ConfigReader.getProperty("product1"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(shoppingPage.searchButton);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(shoppingPage.secondProduct);
        ReusableMethods.waitFor(3);

        //Istedigin ürünü sepete ekle
        ReusableMethods.clickByJS(shoppingPage.addCartButton);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(shoppingPage.messageText.isDisplayed());
    }
}