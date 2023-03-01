package pearlymarket.utilities;

import org.testng.annotations.DataProvider;

public class InformationVendeur {

    @DataProvider
    public Object[][] vendeurData2(){
        Object [][] vendeurDatalari={
                {"Mehmet","Yilmaz","Turkey","Ataturk caddesi 355 sokak No:3","1234567","Seyhan","Adana","987678","xyz@gmail.com"},
        };
        return vendeurDatalari;
    }
}
