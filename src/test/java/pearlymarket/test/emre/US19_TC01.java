package pearlymarket.test.emre;

import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.emre.SearchsResultsPages;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US19_TC01 {



    /*
Kullanıcı adrese gider
Vendeur olarak siteye giris yapar.
Kullanici search boxina bir urun girer ve urunu arar.
Arama sonuc sayfasinda ilk cikan urunu secer
ADD TO CART butonuna tiklar ve sepete ekler
Sonra tekrar search boxina bir urun girer ve urunu arar.
Arama sonuc sayfasinda ikinci cikan urunu secer
ADD TO CART butonuna tiklar
Daha sonra Cart butonuna basar ve sepet icerigini goruntuler.
Secilen urunlerin sepete eklendigini dogrular.
     */

    @Test
    public void urunSepeteEkleTest() {
        List<String> secilenUrunler = new ArrayList<>();
        List<String> sepettekiUrunler = new ArrayList<>();
        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();

        ReusableMethods.loginVendeur();

        secilenUrunler.add(ReusableMethods.choisirEtAjouterDesProduit("urun1",2));
        secilenUrunler.add(ReusableMethods.choisirEtAjouterDesProduit("urun2",1));


        searchsResultsPages.cartButton.click();
        searchsResultsPages.contenueCart.stream().forEach(t->sepettekiUrunler.add(t.getText()));

        Assert.assertEquals(secilenUrunler,sepettekiUrunler);

        searchsResultsPages.checkOut.click();
        ReusableMethods.effacerDeLaCarte();

        Driver.closeDriver();



















    }
}
