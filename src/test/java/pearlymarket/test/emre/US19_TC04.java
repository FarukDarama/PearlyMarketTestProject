package pearlymarket.test.emre;

import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.emre.SearchsResultsPages;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US19_TC04 {

    @Test
    public void toplamOdenecekFiyatTest() {

        List<String> secilenUrunler = new ArrayList<>();
        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();
        ReusableMethods.loginVendeur();


        secilenUrunler.add(ReusableMethods.choisirEtAjouterDesProduit("urun1",0));
        secilenUrunler.add(ReusableMethods.choisirEtAjouterDesProduit("urun2",1));


        searchsResultsPages.cartButton.click();
        ReusableMethods.waitFor(1);
        searchsResultsPages.checkOut.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(searchsResultsPages.prix.isDisplayed());
        ReusableMethods.waitFor(1);

        ReusableMethods.effacerDeLaCarte();
        Driver.closeDriver();

    }
}
