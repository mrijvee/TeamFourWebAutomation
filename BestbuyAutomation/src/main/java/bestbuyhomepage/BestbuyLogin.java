package bestbuyhomepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestbuyLogin extends CommonAPI {

    @FindBy(how= How.XPATH, using = ".//*[@id='locationId']")
    public static WebElement getridofPopUp;
    @FindBy(how= How.XPATH, using = ".//*[@id='profileMenuWrap1']")
    public static WebElement account;
    @FindBy(how= How.XPATH, using = ".//*[@id='profileMenu1']/div/div[3]/div/a")
    public static WebElement signInBox;
    @FindBy(how= How.XPATH, using = ".//*[@id='fld-e']")
    public static WebElement emailBox;
    @FindBy(how= How.XPATH, using = ".//*[@id='fld-p1']")
    public static WebElement passwordBox;
    @FindBy(how= How.XPATH, using = "html/body/section/main/div[1]/div[1]/div/div/form/button[1]")
    public static WebElement clicksignIn;

    public void SignIn (String email, String password) throws InterruptedException {
        getridofPopUp.click();
        getridofPopUp.click();
        account.click();
        signInBox.click();
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        clicksignIn.click();
    }

}
