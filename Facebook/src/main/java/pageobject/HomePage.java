package pageobject;

import common.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {

    @FindBy(how = How.ID, using = "email")
    public static WebElement emailBox;
    @FindBy(how = How.ID, using = "pass")
    public static WebElement passswordBox;
    @FindBy(how = How.ID, using = "u_0_2")
    public static WebElement loginBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
    public static WebElement forgotPassword;
    @FindBy(how = How.NAME, using = "firstname")
    public static WebElement firstNameBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='reg_pages_msg']/a")
    public static WebElement createAPage;
    @FindBy(how = How.NAME, using = "lastname")
    public static WebElement lastNameBox;
    @FindBy(how = How.NAME, using = "reg_email__")
    public static WebElement getEmailBoxBox;
    @FindBy(how = How.NAME, using = "reg_passwd__")
    public static WebElement newPasswordBox;
    @FindBy(how = How.NAME, using = "reg_email_confirmation__")
    public static WebElement reEnterEmailBox;
    @FindBy(how = How.ID, using = "u_0_6")
    public static WebElement femaleNameBox;
    @FindBy(how = How.NAME, using = "websubmit")
    public static WebElement createAccBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='navItem_217974574879787']/a/span/i")
    public static WebElement messengerButton;
    @FindBy(how = How.XPATH, using = ".//*[@id='rc.u_0_12']/div[1]/span[1]/a/span/span[1]")
    public static WebElement createAPost;
    @FindBy(how = How.XPATH, using = ".//*[@id='js_12v']/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div")
    public static WebElement writeAPost;
    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_d']")
    public static WebElement homePage;

    public void setLoginBox() throws InterruptedException {
        emailBox.sendKeys("sukantasaha91@gmail.com");
        passswordBox.sendKeys("No171717");
        loginBox.click();
       messengerButton.click();
       Thread.sleep(5000);
    }

    public void createAPost() throws InterruptedException {
        emailBox.sendKeys("sukantasaha91@gmail.com");
        passswordBox.sendKeys("No171717");
        loginBox.click();
        Alert popup = driver.switchTo().alert();
        popup.dismiss();
        Thread.sleep(5000);
        createAPost.click();
        homePage.click();
        createAPost.click();
        writeAPost.sendKeys("fck");
    }



    public void ForgotPassword() {
        forgotPassword.click();
    }

    public void createPage() {
        createAPage.click();
    }


    public void signUp() throws InterruptedException {
        firstNameBox.sendKeys("mou");
        lastNameBox.sendKeys("gadhi");
        getEmailBoxBox.sendKeys("sukantasaha91@gmail.com");
        newPasswordBox.sendKeys("abcd");
        reEnterEmailBox.sendKeys("sukantasaha91@gmail.com");

        Select sell = new Select(driver.findElement(By.name("birthday_month")));
        sell.selectByIndex(6);
        Select sell2 = new Select(driver.findElement(By.name("birthday_day")));
        sell.selectByIndex(6);
        Select sell3 = new Select(driver.findElement(By.name("birthday_year")));
        sell3.selectByIndex(9);

        femaleNameBox.click();
        createAccBox.click();
        Thread.sleep(5000);
    }
}