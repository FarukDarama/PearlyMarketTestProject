package pearlymarket.test.firuzan;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class Test01 {




    //    Kullanici anasayfaya gider
//    Kullanici sag ustteki MY ACCOUNT yazisina tiklar
//    Kullanici MY ACCOUNT sayfasina gelir
//    Kullanici My account sayfasinda ADRESSES yazisina tiklar
//    Kullanici Adresses sayfasinda billing basligi altinda ADD secenegine tiklar
//    Kullanici Billing Adres sayfasina gelir
//    Kullanici Billing adres sayfasinda oldugunu dogrular
//    Kullanici First Name alanina valid bir deger girer
//    Kullanici Lastname alanina valid bir deger girer.
//    Kullanici Country/Region alanina ulke ismi girer
//    Kullanici Street adress alanina valid bir deger girer
//    Kullanici TOWN/CITY alanina valid bir deger girer
//    Kullanici STATE alaninda valid bir eyalet ismi secer
//    Kullanici ZIP/POSTCODE alanina valid bir deger girer
//    Kullanici PHONE alanina valid bir numara girer
//    Kullanici kayit olunan EMAIL adresini otomatik olarak gorur
//    Kullanici email adresini otomatik olarak gordugunu dogrular
//    Kullanici sayfadaki SAVE ADRESS butonuna tiklar
//    Kullanici Billing Adresine eklendigine dair mesaj alir
//    kullanici aldigi bilgi mesajini dogrular

    @Test
    public void positiveTest010203(){
        Reporter.log("Login butonuna Tikla");
        ReusableMethods.login1();
        Reporter.log("Go to Webpage");
        HomePage homePage=new HomePage();
        Reporter.log("Click on MyAccount");
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.waitFor(2);
        Reporter.log("Click On Addresses ");
        ReusableMethods.clickByJS(homePage.addresses);
        ReusableMethods.waitFor(2);
        Reporter.log("Click on Add Button");
        ReusableMethods.clickByJS(homePage.add);
        homePage.firstName.clear();
        Reporter.log("Enter the First Name");
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage.lastName.clear();
        Reporter.log("Enter the Last Name");
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage.country);
        Reporter.log("Select the country");
        select.selectByVisibleText("Netherlands");
        ReusableMethods.waitFor(2);
        homePage.streetAddress.clear();
        Reporter.log("Enter the streetAddress");
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.postCode.clear();
        Reporter.log("Enter the postCode");
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage.townCity.clear();
        Reporter.log("Enter the townCity");
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);
        homePage.phone.clear();
        Reporter.log("Enter the phone");
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        Reporter.log("Enter the emailAddress");
        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);
        Reporter.log("Submit Save Button");
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Reporter.log("Verify that Billing Address information has been entered");
        Assert.assertEquals(homePage.accountChangeMessage.getText(),"Address changed successfully.");

        ReusableMethods.waitFor(2);
        Driver.closeDriver();



    }






}
