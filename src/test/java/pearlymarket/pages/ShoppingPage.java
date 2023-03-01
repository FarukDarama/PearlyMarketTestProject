package pearlymarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class ShoppingPage {

    public ShoppingPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Search results for “iPhone”']")
    public WebElement iphoneSearchResults;

    @FindBy(xpath = "//*[@class='w-icon-search']")
    public WebElement search;

    @FindBy(xpath = "//*[@class='w-icon-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Apple iPhone 13']")
    public WebElement secondProduct;


    @FindBy(xpath = ("//*[@class='single_add_to_cart_button button alt']"))
    public WebElement addCartButton;

    @FindBy (xpath = "//*[@class='woocommerce-message alert alert-simple alert-btn alert-success']")
    public WebElement messageText;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//*[class='woocommerce-message alert alert-simple alert-btn alert-success']")
    public WebElement messageText2;

    @FindBy(xpath = "//*[@class='w-icon-cart']")
    public WebElement iconCartButton;

    @FindBy(xpath = "//*[text()='View cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']")
    public WebElement plusButton;

    @FindBy(xpath = "//*[@class='quantity-minus w-icon-minus']")
    public WebElement minusButton;

    @FindBy(xpath = "//*[text()='Update cart']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement updateMessage;

    @FindBy(xpath = "//*[@class='input-text form-control mb-4']")
    public WebElement couponBox;

    @FindBy(xpath = "//*[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")
    public WebElement applyCoupon;

    @FindBy(xpath = "//*[@class='woocommerce-notices-wrapper']")
    public WebElement validMessage;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//*[@class='button alt']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@class='input-radio']")
    public WebElement eftButton;

    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement approvalMessage;

}
