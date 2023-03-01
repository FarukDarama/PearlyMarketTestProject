package pearlymarket.test.firuzan;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.HomePage;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class Test03 {


    //Pre condition:Kullanici siteye login olmali(email address:yeison.garett@foundtoo.com,password:dkmvy8T$)
    //1.Kullanici ana sayfaya gider
    //2.Kullanici sag ustteki My Account yazisina tiklar
    //3.Kullanici My Account sayfasina gelir
    //4.Kullanici My acoount sayfasinda adresses yazisina tiklar.
    //5.Kullanici Adresses sayfasindaki Shipping basligi altinda add yazisina tiklar
    //6.Kullanici Shipping address sayfasina gelir
    //7.Kullanici Shipping address sayfasina geldigini dogrular
    //8.Kullanici FirstName alanina ismini girer
    //9.Kullanici LastName alanina soyismini girer
    //10.Kullanici Country/Region alanina ulke ismini girer
    //11.Kullanici Street address alanina cadde ismini girer
    //12.Kullanici Town / City alanina kasaba/sehir ismini girer
    //13.Kullanici  State alanina eyalet ismini girer
    //14.Kullanici ZIP Code alanina posta kodunu girer
    //15.Kullanici sayfadaki SAVE ADRESS butonuna tiklar
    //16.Kullanici Shipping Adresine eklendigine dair mesaj alir
    //17.kullanici aldigi bilgi mesajini dogrular
    @Test
    public void positiveTest010203() {
        ReusableMethods.login1();
        HomePage homePage = new HomePage();
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.addresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.add2);
        homePage.firstName2.clear();
        homePage.firstName2.sendKeys(ConfigReader.getProperty("firstName"));
        homePage.lastName2.clear();
        homePage.lastName2.sendKeys(ConfigReader.getProperty("lastName"));
        Select select = new Select(homePage.country2);
        select.selectByVisibleText("Netherlands");
        ReusableMethods.waitFor(2);
        homePage.streetAddress2.clear();
        homePage.streetAddress2.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.townCity2.clear();
        homePage.townCity2.sendKeys(ConfigReader.getProperty("townCity"));
        homePage.postCode2.clear();
        homePage.postCode2.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);
        homePage.saveAddressButonu.submit();

        ReusableMethods.waitFor(3);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        Driver.closeDriver();


    }}










