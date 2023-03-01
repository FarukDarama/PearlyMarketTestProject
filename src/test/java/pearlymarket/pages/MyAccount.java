package pearlymarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

import javax.security.auth.x500.X500Principal;

public class MyAccount {
    public MyAccount(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountText;
    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[1]")
    public WebElement orders;
    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[2]")
    public WebElement downloads;
    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[3]")
    public WebElement addresses;
    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[4]")
    public WebElement accountDetails;
    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[5]")
    public WebElement wishlist;
    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[6]")
    public WebElement logout;
    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement dbStoreManager;
    @FindBy(xpath = "(//*[text()='Orders'])[1]")
    public WebElement dbOrders;
    @FindBy(xpath = "(//*[text()='Downloads'])[1]")
    public WebElement dbDownloads;
    @FindBy(xpath = "(//*[text()='Addresses'])[1]")
    public WebElement dbAddresses;
    @FindBy(xpath = "(//*[text()='Account details'])[1]")
    public WebElement dbAccountDetails;
    @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
    public WebElement dbWishlist;
    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement dbSupportTickets;
    @FindBy(xpath = "//*[text()='Followings']")
    public WebElement dbFollowings;
    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement dbLogout;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement addShippingButton;
    @FindBy(xpath = "//*[@id='shipping_first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingFirstName;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement billingLastName;
    @FindBy(xpath = "//*[@id='shipping_last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//select[@id='shipping_country']")
    public WebElement countryDropdown;
    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement billingCountryDropdown;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement billingStreetAddress;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement billingZipCode;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingCity;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement billingPhone;
    @FindBy(xpath = "//*[@id='shipping_postcode']")
    public WebElement zipcodeTextbox;
    @FindBy(xpath = "//*[text()='Save address']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@id='shipping_address_1']")
    public WebElement streetTextbox;
    @FindBy(xpath = "//*[@id='shipping_city']")
    public WebElement townCity;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;
    @FindBy(xpath = "//*[text()='Edit Your Shipping Address']")
    public WebElement editShippingAddressButton;
    @FindBy(xpath = "//*[text()='Edit Your Billing Address']")
    public WebElement editBillingAddressButton;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phoneBox;
    @FindBy(xpath = "//*[@id='billing_email']")
    public WebElement billingEmailAdresse;

    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement logOut;


}
