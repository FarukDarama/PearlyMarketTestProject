package pearlymarket.test.salih;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pearlymarket.pages.salih.*;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class US18 {
    @Test
    public void US18_TC01ExternalAffiliateProductSeçilebilmeli(){

        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        Select select=new Select(storeManager.productType);
        select.selectByVisibleText("External/Affiliate Product ");
        Driver.closeDriver();

    }
    @Test
    public void US18_TC02URLButtonTextPriceSalePriceYazılabilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        US18_TC01ExternalAffiliateProductSeçilebilmeli();
       storeManager.urlBox.sendKeys("www.deneme.com");
       storeManager.buttonTextBox.sendKeys("deneme");
       storeManager.priceBox.sendKeys("deneme200");
       storeManager.salePriceBox2.sendKeys("deneme250");
       Driver.closeDriver();


    }
    @Test
    public void US14_TC01SimpleProductVariableProductGroupeProductExternalAffiliatProductSeçenekleriOlmalı() {
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
    public void US14_TC02UrünFotoğrafıEklenebilmeli() {
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
    public void US14_TC03ProductTitleShortDescriptionVeDescriptionYazılabilmeli() {
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
    public void US14_TC04CategoriesSeçilebilmeli() {
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
    public void US14_TC06ProductBrandsSeçilebilmeli() {
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

        storeManager.productBrandsName.sendKeys("lkjöoj");
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
    public void US14_TC09CatalogVisibilityShopAndSearchResultsShopOnlySearchResultsOnlyHiddenOlarakSeçilebilmeli() {
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
    public void US18_TC03UrününEklendiğiniProductKısmındaGörebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        Product product=new Product();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        storeManager.productButton.click();
        assert product.urunKontrolAraba.isDisplayed();
        Driver.closeDriver();

    }



}
