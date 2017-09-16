package bestbuyhomepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestbuyShopMac extends CommonAPI {

    @FindBy(how= How.XPATH, using = ".//*[@id='locationId']")
    public static WebElement getridofPopUp;
    @FindBy(how = How.XPATH, using = ".//*[@id='header']/div[1]/div[2]/ul/li[2]/a")
    public static WebElement gotoCart;
    @FindBy(how= How.XPATH, using = ".//*[@id='menu0']")
    public static WebElement clickProducts;
    @FindBy(how= How.XPATH, using = ".//*[@id='level2Menu2']/a")
    public static WebElement clickComputer;
    @FindBy(how= How.XPATH, using = ".//*[@id='level2Group2']/div[1]/div[1]/div[1]/ul[1]/li[1]/a")
    public static WebElement clickLaptops;
    @FindBy(how= How.XPATH, using = ".//*[@id='widget-2e653f32-90fb-42f1-9432-0242303c2ab9']/div[2]/div/div[2]/div[2]/div/a")
    public static WebElement clickMac;
    @FindBy(how= How.XPATH, using = ".//*[@id='currentoffers_facet']/div[2]/ul/li[1]/label/span[1]/span/i")
    public static WebElement currentDealOnsale;

    @FindBy(how= How.XPATH, using = ".//*[@id='currentoffers_facet']/div[2]/ul/li[1]/label/span[1]/span/i")
    public static WebElement priceRange;
    @FindBy(how= How.XPATH, using = ".//*[@id='customerreviews_facet']/div[2]/ul/li[3]/label/span[1]/span/i")
    public static WebElement basedOnRatings;
    public void shopMac () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        getridofPopUp.click();
        clickProducts.click();
        clickComputer.click();
        clickLaptops.click();
        clickMac.click();
        Thread.sleep(3000);
    }
    public void shopMacOndeal () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        getridofPopUp.click();
        clickProducts.click();
        clickComputer.click();
        clickLaptops.click();
        clickMac.click();
        currentDealOnsale.click();
        Thread.sleep(3000);
    }
    public void shopMacByPrice () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        Thread.sleep(1000);
        getridofPopUp.click();
        clickProducts.click();
        clickComputer.click();
        clickLaptops.click();
        clickMac.click();
        priceRange.click();
        Thread.sleep(3000);
    }
    public void shopMacByRatings () throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        getridofPopUp.click();
        clickProducts.click();
        clickComputer.click();
        clickLaptops.click();
        clickMac.click();
        basedOnRatings.click();
        Thread.sleep(3000);
    }


}
