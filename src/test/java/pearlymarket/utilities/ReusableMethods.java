package pearlymarket.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import pearlymarket.pages.HomePage;
import pearlymarket.pages.emre.AccountPage;
import pearlymarket.pages.emre.HomePagefr;
import pearlymarket.pages.emre.SearchsResultsPages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
public class ReusableMethods {
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new java.util. Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
    public static void takeScreenshotOfElement(WebElement element) throws IOException {
        //        1. take screenshot
        File image = element.getScreenshotAs(OutputType.FILE);
        //        2. save screenshot
        //        path
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new java.util.Date());
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentTime+"image.png";
        FileUtils.copyFile(image,new File(path));
    }
    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }
    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second => Thread.sleep(5000)
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }
    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }
    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1))////Check for the element every 1 second
                .ignoring(NoSuchMethodException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }
    /**
     * Performs double click action on an element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }
    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }
    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     *
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }
    /**
     * Verifies whether the element matching the provided locator is displayed on page
     * fails if the element matching the provided locator is not found or not displayed
     *
     * @param by
     */
    public static void verifyElementDisplayed(By by) {
        try {
            assertTrue("Element not visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + by);
        }
    }
    /**
     * Verifies whether the element matching the provided locator is NOT displayed on page
     * fails if the element matching the provided locator is not found or not displayed
     *
     * @param by
     */
    public static void verifyElementNotDisplayed(By by) {
        try {
            assertFalse("Element should not be visible: " + by, Driver.getDriver().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    /**
     * Verifies whether the element matching the provided WebElement is NOT displayed on page
     * fails if the element matching the WebElement is not found or not displayed
     *
     * @paramWebElement
     */
    public static void verifyElementNotDisplayed(WebElement element) {
        try {
            assertFalse("Element should not be visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
    /**
     * Verifies whether the element is displayed on page
     * fails if the element is not found or not displayed
     *
     * @param element
     */
    public static void verifyElementDisplayed(WebElement element) {
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + element);
        }
    }

    //    SCROLLINTOVIEWJS
//    @param : WebElement
//    Verilen webelementin uzerine kaydirir
    public static void scrollIntoViewJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    //    SAYFANIN EN ALTINA IN
//    Bu method ile sayfanin en altina inebiliriz
    public static void scrollEndJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
    //    Bu metot ile sayfanin en ustune cikabiliriz
    public static void scrollTopJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //    Bu metot ile belirli bir elemente JS executor ile tiklanabilir
    public static void clickByJS(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();",element);
    }

    //   gitmis oldugum metni elemente yazdirir
//    bu method sendKeys metotuna bir alternatifdir.
//    sendKeys oncelikli tercihimizdir
    public static void typeWithJS(WebElement element, String metin){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','"+metin+"')",element);

    }

    //    input elementindeki degerleri(value) al
//   Belirli bir WebElement'in id de??erini String olarak al??r ve value attribute de??erini String olarak d??nd??r??r
//    return
//    document HTML'E GIT
//    .getElementById('" + idOfElement + "') ID'si VERILEN ELEMENTI BUL
//    .value")
//    .toString();
    public static void getValueByJS(String idOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = js.executeScript("return document.getElementById('" + idOfElement + "').value").toString();
        System.out.println("Kutudaki value: " + text);
//        NOT: document.querySelector("p").value;  -> TAG KULLANILABILIR
//             document.querySelector(".example").value; -> CSS DEGERI KULLANILABILIR
//             document.querySelector("#example").value; -> CSS DEGERI KULLANILABILIR
    }
    public static void loginSingIn(String email, String Password) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.loginButton.click();
         homePage.usernameTextbox.sendKeys(email);
         homePage.passwordTextbox.sendKeys(Password);
         homePage.signInButton.click();
    }




















































    public static List<String> webTableData(int row, int column){
        List<WebElement> data = Driver.getDriver().findElements(By.xpath("//table//tbody//tr["+row+"]//td["+column+"]//span"));
        List<String> tableData = new ArrayList<>();
        data.stream().forEach(t->tableData.add(t.getText()));

        return tableData;
    }
    public static List<String> webTableData(int column){
        List<WebElement> data = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td["+column+"]//span"));
        List<String> tableData = new ArrayList<>();
        data.stream().forEach(t->tableData.add(t.getText()));

        return tableData;
    }

    public static double webTableDataSubPrix(int column){ //Bu METHODA TEKRAR BAKMAK GEREKIYOR CUNKU $ ve , var sonuclarda.
        List<String> tableData = new ArrayList<>(webTableData(column));
        List<String> tableDataDolarsiz = new ArrayList<>();
        List<Double> tableDataNumeric = new ArrayList<>();

        tableData.stream().map(t->t.replaceAll("$","")).forEach(t->tableData.add(t));
        System.out.println(tableData);
        tableDataDolarsiz.stream().map(t->Double.valueOf(t)).forEach(t->tableDataNumeric.add(t));
        double toplamPrix = tableDataNumeric.stream().reduce(0.0,Double::sum);

        return toplamPrix;
    }
    public static void loginVendeur(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_url"));
        HomePagefr homePagefr = new HomePagefr();
        homePagefr.signIn.click();
        homePagefr.userName.sendKeys(ConfigReader.getProperty("usernamefr"));
        homePagefr.password.sendKeys(ConfigReader.getProperty("passwordfr"));
        homePagefr.okSignIn.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollUpJS();

    }
    static List<String> secilenUrunler = new ArrayList<>();
    public static String choisirEtAjouterDesProduit(String urunKey, int urunindex){
        AccountPage accountPage = new AccountPage();
        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();

        accountPage.searchButton.sendKeys(ConfigReader.getProperty(urunKey), Keys.ENTER);

        secilenUrunler.clear();

        //searchsResultsPages.iphone13Image.get(0).click();
        secilenUrunler.add(searchsResultsPages.iphone14Image.get(urunindex).getText());
        ReusableMethods.clickByJS(searchsResultsPages.iphone14Image.get(urunindex));
        ReusableMethods.waitFor(3);
        //searchsResultsPages.addToCartButton.click();
        ReusableMethods.clickByJS(searchsResultsPages.addToCartButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollUpJS();

        return secilenUrunler.get(0);

    }

    public static void effacerDeLaCarte(){
        SearchsResultsPages searchsResultsPages = new SearchsResultsPages();
        searchsResultsPages.shoppingCartfr.click();
        ReusableMethods.clickByJS(searchsResultsPages.clearCartfr);
    }

    public static void scrollUpJS(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        //window da scroll yap x koordinati sifir, y koordinati ise Height yani sayfanin uzunlugu
        //ve sayfanin yuksekliginin tersine git.

    }







    public static void login1 (){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.signIn.click();
        waitFor(2);
        homePage.email.sendKeys(ConfigReader.getProperty("musteri_email"));
        waitFor(2);
        homePage.password.sendKeys(ConfigReader.getProperty("musteri_password"));
        waitFor(2);
        homePage.signInButonu.click();
        waitFor(2);}




}
