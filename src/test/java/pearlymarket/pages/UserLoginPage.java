package pearlymarket.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class UserLoginPage {
    public UserLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement register;
    @FindBy(id="reg_username")
    public WebElement username;
    @FindBy(id="reg_email")
    public WebElement email_address;
    @FindBy(id="reg_password")
    public WebElement password;
    @FindBy(id="register-policy")
    public WebElement register_policy;
    @FindBy(xpath = "(//button[@ type='submit'])[2]")
    public WebElement sign_up_button;

    @FindBy(xpath ="//*[@id='username']" )
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;

}
