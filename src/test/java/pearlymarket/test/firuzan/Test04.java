package pearlymarket.test.firuzan;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class Test04 {


    @Test
    public void negativeUS04_Test04_NotFirstName() {
        ReusableMethods.login1();
        HomePage homePage=new HomePage();
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.addresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.add2);
        homePage.firstName2.clear();
        homePage.firstName2.sendKeys(ConfigReader.getProperty("negativefirstname"));
        homePage.lastName2.clear();
        homePage.lastName2.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage.country2);
        select.selectByVisibleText("Netherlands");
        ReusableMethods.waitFor(2);
        homePage.streetAddress2.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.postCode2.clear();
        homePage.postCode2.sendKeys(ConfigReader.getProperty("postCode"));
        homePage.townCity2.clear();
        homePage.townCity2.sendKeys(ConfigReader.getProperty("townCity"));
        homePage.saveAddressButonu.submit();
        //ReusableMethods.getScreenshot("Negative Firstname");
        Assert.assertTrue(homePage.firstNameMessage.getText().contains("First name is a required field."));
        Driver.closeDriver();
    }
    @Test
    public void negativeUS04_Test05_NotFirstName() {
        ReusableMethods.login1();
        HomePage homePage=new HomePage();
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.clickByJS(homePage.addresses);
        ReusableMethods.clickByJS(homePage.add2);
        homePage.firstName2.clear();
        homePage.firstName2.sendKeys(ConfigReader.getProperty("firstName"));
        homePage.lastName2.clear();
        homePage.lastName2.sendKeys(ConfigReader.getProperty("negativelastname"));
        Select select=new Select(homePage.country2);
        select.selectByVisibleText("Netherlands");
        homePage.streetAddress2.clear();
        homePage.streetAddress2.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.postCode2.clear();
        homePage.postCode2.sendKeys(ConfigReader.getProperty("postCode"));
        homePage.townCity2.clear();
        homePage.townCity2.sendKeys(ConfigReader.getProperty("townCity"));
        homePage.saveAddressButonu.submit();
        //  ReusableMethods.getScreenshot("Negative Lastname");
        Assert.assertTrue(homePage.lastNameMessage.getText().contains("Last name is a required field."));
        Driver.closeDriver();
    }








}
