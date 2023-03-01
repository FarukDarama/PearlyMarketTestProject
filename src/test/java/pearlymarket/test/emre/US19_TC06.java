package pearlymarket.test.emre;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.emre.BilingDetail;
import pearlymarket.pages.emre.SearchsResultsPages;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.InformationVendeur;
import pearlymarket.utilities.ReusableMethods;

public class US19_TC06 {

    @Test(dataProvider = "vendeurData2",dataProviderClass = InformationVendeur.class)
    public void alisverisiTamamlamaTest(String firstName, String lastName, String ulke, String adress, String zip, String town, String sehir, String phone, String email){
        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();
        Actions actions = new Actions(Driver.getDriver());
        BilingDetail bilingDetail = new BilingDetail();

        ReusableMethods.loginVendeur();
        ReusableMethods.choisirEtAjouterDesProduit("urun1",0);
        ReusableMethods.waitFor(1);
        searchsResultsPages.cartButton.click();
        ReusableMethods.waitFor(1);
        searchsResultsPages.checkOut.click();

        actions.doubleClick(bilingDetail.firstName).sendKeys(Keys.BACK_SPACE,firstName).perform();

        actions.doubleClick(bilingDetail.lastName).sendKeys(Keys.BACK_SPACE,lastName).perform();
        bilingDetail.country.click();



        Select country = new Select(bilingDetail.countryBox);

        country.selectByVisibleText(ulke);
        ReusableMethods.waitFor(5);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        bilingDetail.address.sendKeys(Keys.CLEAR);
        ReusableMethods.typeWithJS(bilingDetail.address,adress);

        bilingDetail.zipCode.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(1);
        ReusableMethods.typeWithJS(bilingDetail.zipCode,zip);

        bilingDetail.town.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(5);

        ReusableMethods.typeWithJS(bilingDetail.town,town);
        ReusableMethods.waitFor(2);

        ReusableMethods.clickByJS(bilingDetail.province);
        Select province = new Select(bilingDetail.provinceSelect);
        province.selectByVisibleText(sehir);

        bilingDetail.phone.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(1);
        ReusableMethods.typeWithJS(bilingDetail.phone,phone);

        ReusableMethods.waitFor(1);
        bilingDetail.email.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(1);
        ReusableMethods.typeWithJS(bilingDetail.email,email);

        searchsResultsPages.wireTreansfer.click();
        searchsResultsPages.placeOrder.click();
        ReusableMethods.waitFor(3);
        Assert.assertEquals(searchsResultsPages.onayMessage.getText(),"Thank you. Your order has been received.");

        Driver.closeDriver();
    }
}
