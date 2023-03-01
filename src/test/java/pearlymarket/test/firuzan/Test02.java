package pearlymarket.test.firuzan;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

import java.io.IOException;

public class Test02 {


    //1.Kullanici ana sayfaya gider
    //2.Kullanici sag ustteki My Account yazisina tiklar
    //3.Kullanici My Account sayfasina gelir
    //4.Kullanici My acoount sayfasinda adresses yazisina tiklar.
    //5.Kullanici Adresses sayfasindaki Billing basligi altinda add yazisina tiklar
    //6.Kullanici Billing address sayfasina gelir
    //7.Kullanici Billing address sayfasina geldigini dogrular
    //8.Kullanici FirstName alanini bos birakir
    //9.Kullanici LastName alanina soyismini girer
    //10.Kullanici Country/Region alanina ulke ismini girer
    //11.Kullanici Street address alanina cadde ismini girer
    //12.Kullanici Town / City alanina kasaba/sehir ismini girer
    //13.Kullanici ZIP Code alanina postakodunu girer
    //14.Kullanici  Phone alanina telefon numarasini  girer
    //15.Kullanici kayit olunan email-adresini otomatik olarak gorur.
    //16.Kullanici sayfadaki save address butonuna tiklar.
    //17.Kullanici bir uyari mesaji alir.
    //18.Kullanici uyari mesajini dogrular
    @Test
    public void negativeUS03_Test02_NotFirstName()  {
        ReusableMethods.login1();
        HomePage homePage=new HomePage();
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.addresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.add);
        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("negativefirstname"));
        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage.country);
        select.selectByVisibleText("Netherlands");
        ReusableMethods.waitFor(2);
        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);
        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);

        Assert.assertEquals(homePage.firstNameMessage.getText(),"First name is a required field.");
        Driver.closeDriver();
    }
    @Test
    public void negativeUS03_Test02_NotLastName() throws IOException {
        ReusableMethods.login1();
        HomePage homePage=new HomePage();
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.addresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.add);
        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("negativelastname"));
        Select select=new Select(homePage.country);
        select.selectByVisibleText("Netherlands");
        ReusableMethods.waitFor(2);
        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);
        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.lastNameMessage.getText().contains("Last name is a required field."));
        Driver.closeDriver();
    }





}
