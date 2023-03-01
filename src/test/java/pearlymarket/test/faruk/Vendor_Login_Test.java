package pearlymarket.test.faruk;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pearlymarket.pages.HomePage;
import pearlymarket.pages.MyAccount;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

import java.io.IOException;

@Listeners(pearlymarket.utilities.Listeners.class)
public class Vendor_Login_Test {





    @Test
    public void us11_Testcase01()  {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        ReusableMethods.loginSingIn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        //Kullanıcı URL'yi girer
        //Acılan sayfada Sign In butonuna tıklar
         Driver.getDriver().get(ConfigReader.getProperty("url"));
        //homePage.loginButton.click();
        //Acılan sayfada Kullanıcı Username or email address kısmına valid bir email adresi girer
        //homePage.usernameTextbox.sendKeys(ConfigReader.getProperty("email"));
        //Daha sonra kullanıcı Password kısmına valid bir password girer
        //homePage.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));
        //Sonra kullanıcı Sign In butonuna tıklar
        //homePage.signInButton.click();
        //Kullacıcı insan iconuna tıklar
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.icon);
        //Acılan sayfada My Account yazisini görür
        WebElement myAccountText =  myAccount.myAccountText;
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myAccountText.isDisplayed());
       ReusableMethods.clickByJS(myAccount.dbLogout);


    }

    @Test
    public void us11_Testcase02() throws IOException {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        ReusableMethods.loginSingIn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        //Kullanıcı URL'yi girer
        //  Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Acılan sayfada Sign In butonuna tıklar
       // ReusableMethods.waitForClickablility(homePage.loginButton,2);
       // ReusableMethods.clickByJS(homePage.loginButton);
        //Acılan sayfada Kullanıcı Username or email address kısmına valid bir email adresi girer
       // homePage.usernameTextbox.sendKeys(ConfigReader.getProperty("email"));
        //Daha sonra kullanıcı Password kısmına valid bir password girer
       // homePage.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));
        //Sonra kullanıcı Sign In butonuna tıklar
       // homePage.signInButton.click();
        //Acılan sayfada kullanıcı insan iconuna tıklar
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.icon);
        //Kullanıcı sayfanın ortasında (Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli) seceneklerinin görünür oladugunu dogrular
        Assert.assertTrue(myAccount.orders.isDisplayed());
        Assert.assertTrue(myAccount.downloads.isDisplayed());
        Assert.assertTrue(myAccount.addresses.isDisplayed());
        Assert.assertTrue(myAccount.accountDetails.isDisplayed());
        Assert.assertTrue(myAccount.wishlist.isDisplayed());
        Assert.assertTrue(myAccount.logout.isDisplayed());
        ReusableMethods.getScreenshot("goruntu1");
        ReusableMethods.clickByJS(myAccount.dbLogout);


    }

    @Test
    public void us11_Testcase03() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        //Kullanıcı URL'yi girer
        ReusableMethods.loginSingIn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
      //  Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        // ReusableMethods.waitForClickablility(homePage.loginButton,5);
        //Acılan sayfada Sign In butonuna tıklar
      //  ReusableMethods.clickByJS(homePage.loginButton);
        //Acılan sayfada Kullanıcı Username or email address kısmına valid bir email adresi girer
      //  homePage.usernameTextbox.sendKeys(ConfigReader.getProperty("email"));
        //Daha sonra kullanıcı Password kısmına valid bir password girer
      //  homePage.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));
        //Sonra kullanıcı Sign In butonuna tıklar
      //  homePage.signInButton.click();
        ReusableMethods.waitFor(2);
        //Acılan sayfada kullanıcı insan iconuna tıklar
        ReusableMethods.clickByJS(homePage.icon);
        //Kullanıcı sayfanın solunda Dashboard altında; Store manager, orders, downloads, addresses ,
        // account details, wishlist, Support tickets, followings ve log out seceneklerini görünür oldugunu dogrular
        Assert.assertTrue(myAccount.dbStoreManager.isDisplayed());
        Assert.assertTrue(myAccount.dbOrders.isDisplayed());
        Assert.assertTrue(myAccount.dbDownloads.isDisplayed());
        Assert.assertTrue(myAccount.dbAddresses.isDisplayed());
        Assert.assertTrue(myAccount.dbAccountDetails.isDisplayed());
        Assert.assertTrue(myAccount.dbWishlist.isDisplayed());
        Assert.assertTrue(myAccount.dbSupportTickets.isDisplayed());
        Assert.assertTrue(myAccount.dbFollowings.isDisplayed());
        Assert.assertTrue(myAccount.dbLogout.isDisplayed());
        ReusableMethods.clickByJS(myAccount.dbLogout);

    }

}
