package pearlymarket.test.faruk;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.pages.MyAccount;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

import java.io.IOException;

public class Vendor_Shipping_Address {

    @AfterClass
    public void bitis(){

        Driver.closeDriver();
    }
    @Test
    public void us13_testcase01() throws IOException {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        ReusableMethods.loginSingIn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.icon);
        ReusableMethods.clickByJS(myAccount.dbAddresses);
        ReusableMethods.clickByJS(myAccount.editShippingAddressButton);
        myAccount.firstName.click();
        myAccount.firstName.clear();
        myAccount.firstName.sendKeys("Faruk");
        myAccount.lastName.click();
        myAccount.lastName.clear();
        myAccount.lastName.sendKeys("Darama", Keys.TAB);
        Select select= new Select(myAccount.countryDropdown);
        select.selectByVisibleText("Germany");
        myAccount.streetTextbox.clear();
        myAccount.streetTextbox.sendKeys("Jakob str");
        myAccount.zipcodeTextbox.clear();
        myAccount.zipcodeTextbox.sendKeys("63500");
        myAccount.townCity.clear();
        myAccount.townCity.sendKeys("Frankfurt");
        ReusableMethods.clickByJS(myAccount.saveButton);
        String alert =  myAccount.alert.getText();
        System.out.println(alert);
        Assert.assertTrue("Address changed successfully.".contains(alert));
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenshotOfElement(myAccount.alert);
        ReusableMethods.clickByJS(myAccount.dbLogout);




    }
}
