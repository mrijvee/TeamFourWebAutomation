package TestPageObject;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObject.HomePage;


public class TestHomePage extends CommonAPI {

    // @Test
    public void amazonHomePage() throws InterruptedException {
        HomePage homeobj = PageFactory.initElements(driver, HomePage.class);
        homeobj.clickOnHomePage();
    }
    // @Test
    public void logInToAmazon() throws InterruptedException {
        HomePage homeobj2 = PageFactory.initElements(driver, HomePage.class);
        homeobj2.clickOnHomePage();
        homeobj2.logIn();
    }
    //@Test
    public void clickOnDept() throws InterruptedException {
        HomePage homeobj3 = PageFactory.initElements(driver, HomePage.class);
        homeobj3.departmentName();
    }
    //@Test
    public void javaBook() throws InterruptedException {
        HomePage homeobj4 = PageFactory.initElements(driver, HomePage.class);
        homeobj4.searchBook();
    }
    //@Test
    public void bHistory() throws InterruptedException {
        HomePage homeobj5 = PageFactory.initElements(driver, HomePage.class);
        homeobj5.pageHistory();
    }

    // @Test
    public void deals() throws InterruptedException {
        HomePage homeobj6 = PageFactory.initElements(driver, HomePage.class);
        homeobj6.deals();
    }
    // @Test
    public void giftOfTheday() throws InterruptedException {
        HomePage homeobj7 = PageFactory.initElements(driver, HomePage.class);
        homeobj7.giftcard();
    }
    @Test
    public void myAccountAndList() throws InterruptedException {
        HomePage homeobj8 = PageFactory.initElements(driver, HomePage.class);
        homeobj8.pagehover();
    }
}



















