package pearlymarket.pages.emre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

import java.util.List;

public class AccountPage {
    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchButton;

    @FindBy(linkText = "Orders")
    public WebElement orders;

    @FindBy(xpath = "//table//tbody//tr[2]//td[5]//a")
    public WebElement urunDetayiWiew;

    @FindBy(xpath = "//table//tbody//tr//td[1]//a")
    public List<WebElement> urunDetaylari;

    //FACTURE



}
