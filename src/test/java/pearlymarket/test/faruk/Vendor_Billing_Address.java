package pearlymarket.test.faruk;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.pages.MyAccount;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.ReusableMethods;

import java.io.IOException;

public class Vendor_Billing_Address {

//    @AfterClass
//    public void bitis(){
//
//        Driver.closeDriver();
//    }

    @Test
    public void us12_Testcase01() throws IOException, InterruptedException {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        ReusableMethods.loginSingIn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.icon);
        ReusableMethods.clickByJS(myAccount.dbAddresses);
        ReusableMethods.clickByJS(myAccount.editBillingAddressButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(myAccount.billingFirstName);
        myAccount.billingFirstName.clear();
        myAccount.billingFirstName.sendKeys("Faruk");
        myAccount.billingLastName.click();
        myAccount.billingLastName.clear();
        myAccount.billingLastName.sendKeys("Darama",Keys.TAB);
        Select select= new Select(myAccount.billingCountryDropdown);
        select.selectByVisibleText("Germany");
        myAccount.billingStreetAddress.clear();
        myAccount.billingStreetAddress.sendKeys("Jakob str");
        myAccount.billingZipCode.clear();
        myAccount.billingZipCode.sendKeys("63500");
        myAccount.billingCity.clear();
        myAccount.billingCity.sendKeys("Frankfurt");
        myAccount.billingPhone.clear();
        myAccount.billingPhone.sendKeys("05555555555");
       String mail = myAccount.billingEmailAdresse.getAttribute("value");
        System.out.println(mail);
        Assert.assertTrue(mail.contains(ConfigReader.getProperty("email")));
        ReusableMethods.clickByJS(myAccount.saveButton);
        String alert =  myAccount.alert.getText();
        System.out.println(alert);
        Assert.assertTrue("Address changed successfully.".contains(alert));
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenshotOfElement(myAccount.alert);
        ReusableMethods.clickByJS(myAccount.dbLogout);
    }
}
