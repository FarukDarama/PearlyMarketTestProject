package pearlymarket.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.UserLoginPage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;

public class PearlyMarketLogin extends UserLoginPage {
    @Test
    public void pearlyMarketLogin () {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        PearlyMarketLogin pearlyMarketLogin = new PearlyMarketLogin();
        pearlyMarketLogin.register.click();
        pearlyMarketLogin.username.sendKeys(ConfigReader.getProperty("pearlyMarket_username"));
        pearlyMarketLogin.email_address.sendKeys(ConfigReader.getProperty("pearlyMarket_email_address"));
        pearlyMarketLogin.password.sendKeys(ConfigReader.getProperty("pearlyMarket_password"));
        pearlyMarketLogin.register_policy.click();
        pearlyMarketLogin.sign_up_button.click();
      //  PearlyMarketDashboardPage pearlyMarketDashboardPage = new PearlyMarketDashboardPage();
      //  Assert.assertTrue(pearlyMarketDashboardPage.isDisplayed());
        Driver.closeDriver();
    }
}
