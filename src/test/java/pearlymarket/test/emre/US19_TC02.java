package pearlymarket.test.emre;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.emre.SearchsResultsPages;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US19_TC02 {



    @Test
    public void chartCheckoutUrunGoruntulemeTest() {
        ReusableMethods.loginVendeur();

        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();

        List<String> secilenUrunler = new ArrayList<>();
        List<String> sepettekiUrunler = new ArrayList<>();

        secilenUrunler.add(ReusableMethods.choisirEtAjouterDesProduit("urun1",0));

        searchsResultsPages.cartButton.click();
        ReusableMethods.waitFor(3);

        searchsResultsPages.contenueCart.stream().forEach(t->sepettekiUrunler.add(t.getText()));
        Assert.assertEquals(secilenUrunler,sepettekiUrunler);

        ReusableMethods.waitFor(1);
        searchsResultsPages.checkOut.click();

        ReusableMethods.waitFor(1);
        Assert.assertEquals(secilenUrunler,ReusableMethods.webTableData(1));

        ReusableMethods.effacerDeLaCarte();
        Driver.closeDriver();


    }

}
