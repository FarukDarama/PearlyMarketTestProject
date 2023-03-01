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


public class us21_TC005 {

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

        //Alisverise sepetine git
        ReusableMethods.clickByJS(shoppingPage.iconCartButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(shoppingPage.viewCartButton);
        ReusableMethods.waitFor(5);


        //sectigin ürüne kupon ekle
        ReusableMethods.clickByJS(shoppingPage.couponBox);
        ReusableMethods.waitFor(2);
        shoppingPage.couponBox.sendKeys(ConfigReader.getProperty("coupon"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(shoppingPage.applyCoupon);
        ReusableMethods.waitFor(5);
        Assert.assertTrue(shoppingPage.validMessage.isDisplayed());

        //ödeme icin fatura detaylarina gec
        ReusableMethods.clickByJS(shoppingPage.checkoutButton);
        ReusableMethods.waitFor(3);

        //EFT ödemeyi sec
        ReusableMethods.clickByJS(shoppingPage.eftButton);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(shoppingPage.placeOrderButton);

        //ödemeyi onaylat
        ReusableMethods.waitFor(5);
        Assert.assertTrue(shoppingPage.approvalMessage.isDisplayed());

    }
}
