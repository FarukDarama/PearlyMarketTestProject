package pearlymarket.pages.emre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class BilingDetail {
    public BilingDetail(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "billing_first_name")
    public WebElement firstName;

    @FindBy(name = "billing_last_name")
    public WebElement lastName;

    @FindBy(id = "select2-billing_country-container")
    public WebElement country;

    @FindBy(xpath = "//select[@class='country_to_state country_select select2-hidden-accessible']")
    public WebElement countryBox;

    @FindBy(name = "billing_address_1")
    public WebElement address;

    @FindBy(xpath = "//input[@name='billing_city']")
    public WebElement town;

    @FindBy(id = "select2-billing_state-container")
    public WebElement state;

    @FindBy(name = "billing_postcode")
    public WebElement zipCode;

    @FindBy(id = "select2-billing_state-container")
    public WebElement province;

    @FindBy(id = "billing_state")
    public WebElement provinceSelect;

    @FindBy(name = "billing_phone")
    public WebElement phone;

    @FindBy(name = "billing_email")
    public WebElement email;




}
