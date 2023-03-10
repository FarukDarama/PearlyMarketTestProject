package pearlymarket.test.salih;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pearlymarket.pages.salih.*;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;
import org.openqa.selenium.interactions.Actions;

public class US16 {


    @Test
    public void US16_TC01_TestSimpleProductDefaultOlarakGelmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton);
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        assert storeManager.simpleProduct.isDisplayed();
        Select select1 = new Select(storeManager.productType);
        select1.selectByVisibleText("Simple Product");

        Driver.closeDriver();


    }

    @Test
    public void US16_TC02_TestVirtualAndDownloadableSe├žilebilmeli() {

        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.virtualRadioButton.click();
        storeManager.downloadableRadioButton.click();
        Driver.closeDriver();

    }

    @Test
    public void US16_TC03_TestpriceBoxunaDegerlerGirilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.priceBox.sendKeys("10");
        Driver.closeDriver();

    }

    @Test
    public void US16_TC04_TestSalePriceBoxunaDegerlerGirilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.salePriceBox.sendKeys("100");
        Driver.closeDriver();
    }
/* US14
    1.Simple Product, Variable Product, Grouped Product, External - Affiliate Product se├ženekleri olmal─▒
    2. ├ťr├╝n foto─čraf─▒ eklenebilmeli
    3. Product Title, Short Description ve Description yaz─▒labilmeli
    4.Categories se├žilebilmeli
    5.Yeni Categories eklenebilmeli
    6.Product brands se├žilebilmeli
    7.Yeni Product brands eklenebilmeli
    8.Tags eklenebilmeli
    9.Catalog visibility; Shop and search results, Shop only, Search results only, Hidden olarak se├žilebilmeli

    US15
    1.Inventory, Shipping, Attributes, Linked, Seo, Toptan ├ťr├╝n G├Âsterme Ayarlar─▒, Advanced men├╝leri g├Âr├╝lebilmeli
    2.Inventory i┼člemleri yap─▒labilmeli (SKU, Manage Stock, Stock status, Sold Individually)
    3.Shipping i┼člemleri yap─▒labilmeli (Weight, Dimensions, Shipping class, Processing Time)
    4.Attributes i┼člemleri yap─▒labilmeli (Color, Size)
    5.Linked i┼člemleri yap─▒labilmeli (Up-sells, Cross-sells)
    6.Seo i┼člemleri yap─▒labilmeli (Enter a focus keyword, Meta description)
    7.Toptan ├ťr├╝n G├Âsterme Ayarlar─▒ i┼člemleri yap─▒labilmeli (Piece Type, Units Per Piece, Min Order Quantity)
    8.Advanced i┼člemleri yap─▒labilmeli (Menu Order, Purchase Note)





 */


    @Test
    public void US14_TC01SimpleProductVariableProductGroupeProductExternalAffiliatProductSe├ženekleriOlmal─▒() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);

        Select select1 = new Select(storeManager.productType);
        select1.selectByVisibleText("Simple Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("Grouped Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.waitFor(3);
    }

    @Test
    public void US14_TC02Ur├╝nFoto─čraf─▒Eklenebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        storeManager.chooseImg.click();
        ReusableMethods.waitFor(3);
        String dosyaYolu = System.getProperty("user.home") + "/Desktop/12.png";
        chooseImage.uploadFilesButton.click();
        chooseImage.selectFilesButton.sendKeys(dosyaYolu);
        ReusableMethods.waitFor(3);
        ReusableMethods.waitFor(10);
        chooseImage.selectButton.click();

        Driver.closeDriver();


    }

    @Test
    public void US14_TC03ProductTitleShortDescriptionVeDescriptionYaz─▒labilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        storeManager.productTitle.sendKeys("salih");

        Driver.getDriver().switchTo().frame(storeManager.shortDescription);//????
        storeManager.shortDescription.sendKeys("hshshshs"); //????
    }

    @Test
    public void US14_TC04CategoriesSe├žilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.categories.click();

    }

    @Test
    public void US14_TC05YeniCategoriesEklenebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.addNewCategory.click();
        ReusableMethods.waitFor(3);
        storeManager.categoryName.sendKeys("gunay");
        ReusableMethods.waitFor(3);
        Select select = new Select(storeManager.parentCategory);
        ReusableMethods.waitFor(3);
        select.selectByVisibleText("Besin Takviyeleri");
        ReusableMethods.waitFor(3);
        storeManager.add1.click();
        Driver.closeDriver();


    }

    @Test
    public void US14_TC06ProductBrandsSe├žilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.productBrands.click();
    }

    @Test
    public void US14_TC07YeniProductBrandsEklenebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.addNewProductsBrands.click();
        ReusableMethods.waitFor(3);

        storeManager.productBrandsName.sendKeys("lkj├Âoj");
        Select select = new Select(storeManager.parentProductBrand);
        select.selectByVisibleText("Elegant Auto Group");
        ReusableMethods.waitFor(3);
        storeManager.add2.click();

    }

    @Test
    public void US14_TC08TagsEklenebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);

    }

    @Test
    public void US14_TC09CatalogVisibilityShopAndSearchResultsShopOnlySearchResultsOnlyHiddenOlarakSe├žilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();

    }

    @Test
    public void US16_TC06_TesturunEklendigiProductKismindaGorulebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Product product = new Product();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        storeManager.productButton.click();
        assert product.urunKontrolAraba.isDisplayed();
        Driver.closeDriver();

   }

}

