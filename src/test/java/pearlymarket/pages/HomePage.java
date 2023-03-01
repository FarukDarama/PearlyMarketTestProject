package pearlymarket.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;


    public class HomePage {
        public HomePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath="//a[.='Shop Now']")
        public WebElement shopNowButton;
        @FindBy(xpath="//a[text()='My Account']")
        public WebElement myAccountLink;
        @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
        public WebElement login;
        //REGISTER DATALARI
        @FindBy(xpath = "//a[@class='register inline-type']")
        public WebElement register;
        @FindBy(xpath="//input[@id='reg_username']")
        public WebElement registerUsername;
        @FindBy(xpath="//input[@id='reg_email']")
        public WebElement registerEmail;
        @FindBy(xpath = "//input[@id='reg_password']")
        public WebElement registerPassword;
        @FindBy(xpath="//input[@id='register-policy']")
        public WebElement checkbox;
        @FindBy(xpath = "//button[text()='Sign Up']")
        public WebElement registerSignUp;
        //LOGIN DATALARI
        @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
        public WebElement signIn;
        @FindBy(xpath = "//input[@id='username']")
        public WebElement email;
        @FindBy(xpath ="//input[@id='password']")
        public WebElement password;
        @FindBy(xpath = "(//button[@class='woocommerce-button button woocommerce-form-login__submit'])[1]")
        public WebElement signInButonu;
        //MY ACCOUNT DATALARI
        @FindBy(xpath = "(//a[text()='My Account'])[1]")
        public WebElement myAccount;
        @FindBy(xpath = "//a[text()='Addresses']")
        public WebElement addresses;
        @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
        public WebElement add;
        //BILLING ADDRESS DATA
        @FindBy(xpath = "//input[@id='billing_first_name']")
        public WebElement firstName;
        @FindBy(xpath = "//input[@id='billing_last_name']")
        public WebElement lastName;
        @FindBy(xpath = "//select[@id='billing_country']")
        public WebElement country;//dropdown
        @FindBy(xpath = "//input[@id='billing_address_1']")
        public WebElement streetAddress;
        @FindBy(xpath = "//input[@id='billing_city']")
        public WebElement townCity;
        @FindBy(xpath = "//select[@id='billing_state']")
        public WebElement state;//dropdown
        @FindBy(xpath = "//input[@id='billing_postcode']")
        public WebElement postCode;
        @FindBy(xpath = "//input[@id='billing_phone']")
        public WebElement phone;
        @FindBy(xpath = "//input[@id='billing_email']")
        public WebElement emailAddress;
        @FindBy(xpath = "//button[@class='btn btn-dark btn-rounded btn-sm']")
        public WebElement saveAddressButonu;
        @FindBy(xpath = "//div[@role='alert']")
        public WebElement accountChangeMessage;
        //SHIPPING ADDRESS DATA
        @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
        public WebElement add2;
        @FindBy(xpath = "//input[@id='shipping_first_name']")
        public WebElement firstName2;
        @FindBy(xpath = "//input[@id='shipping_last_name']")
        public WebElement lastName2;
        @FindBy(xpath = "//select[@id='shipping_country']")
        public WebElement country2;//dropdown
        @FindBy(xpath = "//input[@id='shipping_address_1']")
        public WebElement streetAddress2;
        @FindBy(xpath = "//input[@id='shipping_city']")
        public WebElement townCity2;
        @FindBy(xpath = "//select[@id='shipping_state']")
        public WebElement state2;//dropdown
        @FindBy(xpath = "//input[@id='shipping_postcode']")
        public WebElement postCode2;
        //BILLING ADDRESS NEGATIVE MESSAGE TEST DATA
        @FindBy(xpath ="//ul[@role='alert']")
        public WebElement firstNameMessage;
        @FindBy(xpath ="//ul[@role='alert']")
        public WebElement lastNameMessage;
        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement streetAddressMessage;
        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement postCodeMessage;
        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement townCityMessage;
        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement phoneMessage;
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameTextbox;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordTextbox;
    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement signInButton;
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public  WebElement icon;
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement searchBox;





}

