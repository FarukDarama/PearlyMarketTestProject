package pearlymarket.test.emre;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.emre.AccountPage;
import pearlymarket.pages.emre.HomePagefr;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class US19_TC07 {

    /*
Kullanıcı adrese gider
Vendeur olarak siteye giris yapar.
"Orders" sekmesine tiklar.
Listesindeki 2. siradaki alisverisi icin "VIEW" butonuna tiklar
Alsveris detaylarini goruntuler

 */

    @Test
    public void myAccountOrdersYapilanAlisverisTest() {
        ReusableMethods.loginVendeur();
        AccountPage accountPage = new AccountPage();
        HomePagefr homePagefr = new HomePagefr();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.ARROW_UP);
        ReusableMethods.waitFor(1);


        ReusableMethods.clickByJS(homePagefr.myAccount);
        accountPage.orders.click();

        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(accountPage.urunDetayiWiew);

        for (WebElement each: accountPage.urunDetaylari) {
            Assert.assertTrue(each.isDisplayed());
        }

        Driver.closeDriver();


    }
}
