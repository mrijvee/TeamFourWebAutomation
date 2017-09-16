package bestbuyhomepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BestbuyHomePage extends CommonAPI {
    @FindBy(how= How.XPATH, using = ".//*[@id='locationId']")
    public static WebElement getridofPopUp;
    @FindBy(how= How.XPATH, using = ".//*[@id='menu0']")
    public static WebElement gotoProducts;
    @FindBy(how = How.XPATH, using = ".//*[@id='header']/div[1]/div[2]/ul/li[2]/a")
    public static WebElement gotoCart;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileMenuWrap1']")
    public static WebElement clickAccount;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileMenu1']/div/div[3]/div/p/strong/a")
    public static WebElement fillNewAccount;
    @FindBy(how = How.NAME, using = "firstName")
    public static WebElement firstNameBox;
    @FindBy(how = How.NAME, using = "lastName")
    public static WebElement lastNameBox;
    @FindBy(how = How.CSS, using = "#fld-e")
    public static WebElement emailBox;
    @FindBy(how = How.XPATH, using = ".//input[@data-validation-attribute='password']")
    public static WebElement passwordBox;
    @FindBy(how = How.XPATH, using = ".//input[@data-validation-attribute='reenterPassword']")
    public static WebElement confirmPasswordBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='fld-phone']")
    public static WebElement phoneBox;
    @FindBy(how = How.XPATH, using = "html/body/section/main/div[1]/div[1]/div/div/form/button[1]")
    public static WebElement submit;
    @FindBy(how = How.XPATH, using = ".//*[@id='hf_orderStatusMenuLink']")
    public static WebElement orderStatus;
    @FindBy(how = How.CSS, using = "#hf_listsMenuLink")
    public static WebElement saveditems;
    @FindBy(how = How.XPATH, using = ".//*[@id='hf_historyMenuLink']")
    public static WebElement shoppingHistory;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileMenu1']/div/div[3]/div/a")
    public static WebElement clicksignIn;
    @FindBy(how = How.XPATH, using = ".//*[@id='shopping-history-app']/div/div[2]/div/div/div[2]/div[2]/a")
    public static WebElement fullHistory;
    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")
    public static WebElement searchItems;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileMenu1']/div/div[2]/div/div/div[3]/ul/li[3]/a")
    public static WebElement clickCreditcards;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/div/div[2]/div/div[2]/a")
    public static WebElement addCreditcard;
    @FindBy(how = How.XPATH, using = ".//*[@id='cardNumber']")
    public static WebElement creditCardnumber;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[1]/span/input")
    public static WebElement creditFirstname;
    @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[2]/span/input")
    public static WebElement creditmidName;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[3]/input")
    public static WebElement creditLastname;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[4]/input")
    public static WebElement address;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[5]/input")
    public static WebElement addressLine2;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[6]/input")
    public static WebElement creditCity;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[8]/input")
    public static WebElement creditZipcode;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[9]/input")
    public static WebElement creditPhone;
        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[3]/span[1]/input")
    public static WebElement clickaddCreditCard;
        @FindBy(how = How.XPATH, using = ".//*[@id='footer']/div[2]/div[2]/div[1]/nav/ul/li[5]/a")
    public static WebElement termsAndconditions;
        @FindBy(how = How.XPATH, using = ".//*[@id='group0']/div[1]/div[1]/ul/li[1]/a")
    public static WebElement clickiphoneX;
        @FindBy(how = How.XPATH, using = ".//*[@id='site-control-content']/div[3]/div[3]/div/div/div[1]/div/div/a")
    public static WebElement clickiphoneXbox;
        @FindBy(how = How.XPATH, using = ".//*[@id='site-control-content']/div[3]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/a")
    public static WebElement forVerizon;
        @FindBy(how = How.XPATH, using = ".//*[@id='site-control-content']/div[3]/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/a")
    public static WebElement forATandT;
        @FindBy(how = How.XPATH, using = ".//*[@id='site-control-content']/div[3]/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div/a")
    public static WebElement forSprint;
    //        @FindBy(how = How.XPATH, using = ".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[8]/input")
//    public static WebElement creditZipcode;

    public void gotoBestbuyCart () throws InterruptedException {
        getridofPopUp.click();
        Thread.sleep(3000);
        gotoCart.click();
        driver.getTitle();
    }
    public void Title () throws InterruptedException {
        getridofPopUp.click();
        Thread.sleep(3000);
        getridofPopUp.click();
        driver.getTitle();
    }
    public void createAccount (String firstName, String lastName, String email, String password, String confirmPassword, String phone ) throws InterruptedException {
        getridofPopUp.click();
        gotoCart.click();
        clickAccount.click();
        fillNewAccount.click();
        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        Thread.sleep(3000);
        confirmPasswordBox.sendKeys(confirmPassword);
        phoneBox.sendKeys(phone);
        submit.click();
    }
    public void orderStatus () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        orderStatus.click();
        emailBox.sendKeys("pntautomationtest@gmail.com");
        passwordBox.sendKeys("Fall2017selenium");
        submit.click();
        orderStatus.click();
        Thread.sleep(3000);
    }
    public void savedItems () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        orderStatus.click();
        emailBox.sendKeys("pntautomationtest@gmail.com");
        passwordBox.sendKeys("Fall2017selenium");
        submit.click();
        saveditems.click();
        Thread.sleep(3000);
    }
    public void bestbuyshoppingHistory () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        clickAccount.click();
        clicksignIn.click();
        emailBox.sendKeys("pntautomationtest@gmail.com");
        passwordBox.sendKeys("Fall2017selenium");
        submit.click();
        shoppingHistory.click();
        fullHistory.click();
        Thread.sleep(3000);
    }
    public void addcreditCard (String creditcardNumber, int inputMonth, int inputYear, String creditmidname, String creditlastname, String Address, String AddressLine2, String city, int inputState, String zipCode, String phone ) throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        clickAccount.click();
        clicksignIn.click();
        emailBox.sendKeys("pntautomationtest@gmail.com");
        passwordBox.sendKeys("Fall2017selenium");
        submit.click();
        clickAccount.click();
        clickCreditcards.click();
        addCreditcard.click();
        creditCardnumber.sendKeys(creditcardNumber);
        Select month = new Select(driver.findElement(By.cssSelector("#expiryMonth")));
        month.selectByIndex(inputMonth);
        Select year = new Select(driver.findElement(By.cssSelector("#expiryYear")));
        year.selectByIndex(inputYear);
        creditmidName.sendKeys(creditmidname);
        creditLastname.sendKeys(creditlastname);
        address.sendKeys(Address);
        addressLine2.sendKeys(AddressLine2);
        creditCity.sendKeys(city);
        Select state = new Select(driver.findElement(By.xpath(".//*[@id='profileCreditCards']/div[2]/form/div[2]/fieldset[2]/p[7]/select")));
        state.selectByIndex(inputState);
        creditZipcode.sendKeys(zipCode);
        creditPhone.sendKeys(phone);
        clickaddCreditCard.click();
        Thread.sleep(15000);
    }
    public void termsandCondition () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        termsAndconditions.click();
        Thread.sleep(15000);
    }
    public void iphoneX (String verizon, String AtandT,String sprint ) throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        gotoProducts.click();
        clickiphoneX.click();
        clickiphoneXbox.click();
        if (verizon.contains("Verizon")) {
            forVerizon.click();
        } else if (AtandT.contains("AT&T")) {
            forATandT.click();
        } else if (sprint.contains("Spring")){
            forSprint.click();
        }
        Thread.sleep(3000);
        getridofPopUp.click();
    }
    public void forgetPassword () {
        getridofPopUp.click();
        getridofPopUp.click();
        clickAccount.click();
        clicksignIn.click();

    }
}
