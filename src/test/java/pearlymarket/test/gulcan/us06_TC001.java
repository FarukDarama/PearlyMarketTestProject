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

public class us06_TC001 { HomePage homePage;
    UserLoginPage userLoginPage;

    @Test
    public void us06_tc001() {
        HomePage homePage = new HomePage();
        UserLoginPage userLoginPage = new UserLoginPage();
        MyAccount myAccount = new MyAccount();
        ShoppingPage shoppingPage= new ShoppingPage();

        //Verilen adrese git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Sayfaya emaille giris yap
        ReusableMethods.clickByJS(homePage.signInButton);
        userLoginPage.emailBox.sendKeys(ConfigReader.getProperty("email"));
        userLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.clickByJS(userLoginPage.loginButton);
        ReusableMethods.waitFor(3);

        //MyAccount sayfasina gec
        ReusableMethods.clickByJS(homePage.icon);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(myAccount.myAccountText.isDisplayed());

    }
}