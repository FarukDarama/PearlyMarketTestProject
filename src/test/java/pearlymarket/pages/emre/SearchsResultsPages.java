package pearlymarket.pages.emre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

import java.util.List;

public class SearchsResultsPages {
    public SearchsResultsPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   /*
    @FindBy(className = "product-wrap")
    public List<WebElement> iphone13Image;
    */
   @FindBy(xpath = "//h3//a")
   public List<WebElement> iphone14Image;

    @FindBy(xpath = "//h3//a")
    public List<WebElement> samsungGalaxyImage;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(className = "cart-label")
    public WebElement cartButton;

    @FindBy(xpath = "//li//div//a//span")
    public List<WebElement> contenueCart;

    @FindBy(xpath = "//a[.='Checkout']")
    public WebElement checkOut;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingCartfr;

    @FindBy(xpath = "//button[.='Clear cart']")
    public WebElement clearCartfr;

    @FindBy(xpath = "//table//tfoot//tr//td//strong")
    public WebElement prix;

    @FindBy(id = "payment_method_bacs")
    public WebElement wireTreansfer;

    @FindBy(id = "payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id="place_order")
    public WebElement placeOrder;

    @FindBy(xpath = "//p[.='Thank you. Your order has been received.']")
    public WebElement onayMessage;

    @FindBy(xpath = "//a[@class='showcoupon']")
    public WebElement couponLink;

    @FindBy(name = "coupon_code")
    public WebElement couponBox;

    @FindBy(xpath = "//button[.='Apply coupon']")
    public WebElement couponButton;

    @FindBy(xpath = "//table//tfoot//tr[2]//th[1]")
    public WebElement couponKoduYazisi;

    @FindBy(xpath = "//a[.='[Remove]']")
    public WebElement reductionRemove;


}
