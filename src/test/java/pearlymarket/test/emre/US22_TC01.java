package pearlymarket.test.emre;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.emre.SearchsResultsPages;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class US22_TC01 {
    @Test
    public void couponAlisverisTest(){
        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();
        ReusableMethods.loginVendeur();
        ReusableMethods.choisirEtAjouterDesProduit("urun3",0);
        ReusableMethods.waitFor(1);
        searchsResultsPages.cartButton.click();
        ReusableMethods.waitFor(1);
        searchsResultsPages.checkOut.click();

        searchsResultsPages.couponLink.click();
        ReusableMethods.waitFor(3);
        searchsResultsPages.couponBox.sendKeys("remise4", Keys.ENTER);
        ReusableMethods.waitFor(3);
        System.out.println("kupon:"+searchsResultsPages.couponKoduYazisi.getText());
        Assert.assertTrue(searchsResultsPages.reductionRemove.isDisplayed());
        Assert.assertEquals(searchsResultsPages.couponKoduYazisi.getText(),"Coupon: remise4");
        ReusableMethods.effacerDeLaCarte();
        Driver.closeDriver();
    }
}
