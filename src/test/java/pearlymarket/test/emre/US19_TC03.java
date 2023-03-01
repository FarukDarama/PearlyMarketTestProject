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

public class US19_TC03 {



    @Test(dataProvider = "vendeurData2",dataProviderClass = InformationVendeur.class)
    public void faturaAyrintilariTest(String firstName, String lastName, String ulke, String adress, String zip, String town, String sehir, String phone, String email) {
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

        Assert.assertEquals(bilingDetail.firstName.getAttribute("value"),firstName);

        actions.doubleClick(bilingDetail.lastName).sendKeys(Keys.BACK_SPACE,lastName).perform();
        Assert.assertEquals(bilingDetail.lastName.getAttribute("value"),lastName);


        bilingDetail.country.click();



        Select country = new Select(bilingDetail.countryBox);

        country.selectByVisibleText(ulke);
        ReusableMethods.waitFor(5);
        Assert.assertEquals(country.getFirstSelectedOption().getText(),ulke);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        bilingDetail.address.sendKeys(Keys.CLEAR);
        ReusableMethods.typeWithJS(bilingDetail.address,adress);
        Assert.assertEquals(bilingDetail.address.getAttribute("value"),adress);

        bilingDetail.zipCode.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(1);
        ReusableMethods.typeWithJS(bilingDetail.zipCode,zip);
        Assert.assertEquals(bilingDetail.zipCode.getAttribute("value"),zip);

        bilingDetail.town.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(5);

        ReusableMethods.typeWithJS(bilingDetail.town,town);
        Assert.assertEquals(bilingDetail.town.getAttribute("value"),town);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(bilingDetail.province);

        Select province = new Select(bilingDetail.provinceSelect);
        province.selectByVisibleText(sehir);
        Assert.assertEquals(province.getFirstSelectedOption().getText(),sehir);

        bilingDetail.phone.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(1);
        ReusableMethods.typeWithJS(bilingDetail.phone,phone);
        Assert.assertEquals(bilingDetail.phone.getAttribute("value"),phone);

        ReusableMethods.waitFor(1);
        bilingDetail.email.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(1);
        ReusableMethods.typeWithJS(bilingDetail.email,email);
        Assert.assertEquals(bilingDetail.email.getAttribute("value"),email);

        Driver.closeDriver();

    }


}
