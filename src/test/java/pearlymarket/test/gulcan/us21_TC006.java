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

public class us21_TC006 {

    HomePage homePage;
    UserLoginPage userLoginPage;

    @Test
    public void us06_tc005() {
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

        //sayfada cikis yap
        ReusableMethods.clickByJS(myAccount.signOutButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(myAccount.logOut);
        ReusableMethods.waitFor(2);

        //sayfayi kapat
        Driver.closeDriver();

    }
}
