package example.serenity;/** * @author : ABDUL SAIF * @date   : 24/11/2016 */import net.serenitybdd.core.annotations.findby.FindBy;import net.serenitybdd.core.pages.PageObject;import net.serenitybdd.core.pages.WebElementFacade;import net.thucydides.core.annotations.DefaultUrl;import org.openqa.selenium.Keys;//SPECIFY and INITIALISE URL address@DefaultUrl("http://amazon.co.uk")public class HomePageS extends PageObject {    //ATTRIBUTES by ID    String BASKET = "#add-to-cart-button";    String SIGNINSUBMIT = "#signInSubmit";    //ATTRIBUTES by XPATH    @FindBy(xpath="//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2")    WebElementFacade SELECTITEM;//    @FindBy(xpath="//*[@id=\"intl_pop_continue\"]")//    WebElementFacade DECLINE;    String DECLINE = "#bb_noThanks_link";    @FindBy(xpath="//*[@id='hlb-next-steps']/a")    WebElementFacade CART;    @FindBy(xpath="//*[@id='sc-buy-box-ptc-button']/span/input")    WebElementFacade CHECKOUT;    //METHODS    //1. SEARCH for input    public void search(String actionName)    {        $("#twotabsearchtextbox").type(actionName).then().sendKeys(Keys.ENTER);    }    //2. SELECT and ENTER first item on page    public void selectItem()    {        $(SELECTITEM).click();    }    //3. ADD selected item into basket    public void basket()    {        $(BASKET).sendKeys(Keys.ENTER);    }    //4. SELECT and SUBMIT decline addon    public void declineAddOn()    {        $(DECLINE).click();//        $(DECLINE).sendKeys(Keys.ENTER);    }    //5. SELECT the cart    public void cart()    {        $(CART).click();    }    //6. SELECT the checkout    public void checkout()    {        $(CHECKOUT).click();    }    //7. CHECK the signin page    public void signIn()    {        String SIGNIN = $(SIGNINSUBMIT).getText();        System.out.println("Successfully ran Amazon: "+SIGNIN);    }} // END of HomePageS class