package pearlymarket.pages.ayhan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;


public class PearlyPage {
    //İlk yapmamız gereken bir tane constructor oluşturmak
    public PearlyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//a[@title='Compare'])[1]")
    public WebElement compareButton;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]")
    public WebElement moveToFirst;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]")
    public WebElement moveToSecond;

    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded']")
    public WebElement startCompareButton;

    @FindBy(xpath = "//a[@data-product_id='23399']")
    public WebElement birinciCompare;

    @FindBy(xpath = "(//a[@data-product_id='21963'])[3]")
    public WebElement ikinciCompare;

    @FindBy(xpath = "(//a[@data-product_id='14171'])[3]")
    public WebElement ucuncuCompare;

    @FindBy(xpath = "//img[@src='http://pearlymarket.com/wp-content/uploads/2022/10/0x0-e1665660070443-300x300.jpg']")
    public WebElement dorduncuCompare;

    @FindBy(xpath = "(//*[text()='Compare'])[1]")
    public WebElement compareIsHere;

    @FindBy(xpath = "//a[text()='Clean All']")
    public WebElement cleanAllButton;

    @FindBy(xpath = "(//*[text()='0'])[5]")
    public WebElement zero;

    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[3]")
    public WebElement compareDelete;

    @FindBy(xpath = "(//a[@data-title='Add to wishlist'])[1]")
    public WebElement addToWishlist;

    @FindBy(xpath = "//span[text()='Wishlist']")
    public WebElement wishListButton;

    @FindBy(xpath = "(//h2[text()='Wishlist'])[1]")
    public WebElement wishListPage;

    @FindBy(xpath = "(//button[@title='Quick View'])[1]")
    public WebElement quickViewButton;

    @FindBy(xpath = "//span[@class='posted_in']")
    public WebElement getQuickViewTest;

    @FindBy(xpath = "(//a[@class='btn btn-dark btn-rounded btn-sm add_to_cart alt'])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement cartPageButton;

    @FindBy(xpath = "//*[text()='Subtotal:']")
    public WebElement cartCheck;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public WebElement thankYou;

}