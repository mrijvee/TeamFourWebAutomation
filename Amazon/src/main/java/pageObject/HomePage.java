package pageObject;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-accountList']/span[1]")
    public static WebElement homeSignin;
    @FindBy(how = How.XPATH, using = ".//*[@id='ap_email']")
    public static WebElement email;
    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    public static WebElement passBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-shopall']/span[2]")
    public static WebElement departMentDropDown;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-shopAll']/div[2]/span[1]/span")
    public static WebElement amazonName;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span")
    public static WebElement fireTv;
    @FindBy(how = How.XPATH, using = ".//*[@id='twotabsearchtextbox']")
    public static WebElement search;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-your-amazon']")
    public static WebElement amazonmy;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-xshop']/a[3]")
    public static WebElement dealsOfTheDay;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-xshop']/a[4]")
    public static WebElement gift;
    @FindBy(how = How.CSS, using = ".//*[@id='nav-xshop']/a[5]")
    public static WebElement sell;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-accountList']/span[1]")
    public static WebElement accountAndList;
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-al-your-account']/a[1]/span")
    public static WebElement yourAcoount;
    @FindBy(how = How.XPATH, using = ".//*[@id='a-page']/div[3]/div/div[2]/div[1]/a/div/div/div/div[2]/div/span")
    public static WebElement yourAddress;
    @FindBy (how = How.XPATH,using = ".//*[@id='signInSubmit']")
    public static WebElement siginSubmit;
    @FindBy (how = How.XPATH,using = ".//*[@id='ya-myab-address-add-link']/div/div/h2")
    public static WebElement addAdderss;


    public void clickOnHomePage() throws InterruptedException {
        homeSignin.click();
        Thread.sleep(5000);
    }

    public void logIn() throws InterruptedException {
        email.sendKeys("pntselenium@gmail.com");
        passBox.sendKeys("7866dcba");
        Thread.sleep(5000);
    }

    public void departmentName() throws InterruptedException {
        Actions action = new Actions(driver);

        action.moveToElement(departMentDropDown).build().perform();
        action.moveToElement(amazonName).build().perform();
        action.moveToElement(fireTv).build().perform();
    }

    public void searchBook() throws InterruptedException {
        search.sendKeys("java");
    }

    public void pageHistory() throws InterruptedException {
        amazonmy.click();
    }

    public void deals() throws InterruptedException {
        dealsOfTheDay.click();
    }

    public void giftcard() {
        gift.click();
    }

    public void pagehover() {
        Actions act = new Actions(driver);
        act.moveToElement(accountAndList).perform();
    }
}


