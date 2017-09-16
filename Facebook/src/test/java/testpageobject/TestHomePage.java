package testpageobject;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TestHomePage extends CommonAPI {

    @Test
    public void login() throws InterruptedException {
        HomePage login = PageFactory.initElements(driver, HomePage.class);
        login.setLoginBox();
    }
    @Test
    public void forgotAccount(){
        HomePage forgotPass = PageFactory.initElements(driver, HomePage.class);
        forgotPass.ForgotPassword();
    }
    @Test
    public void createAPage(){
        HomePage createpg = PageFactory.initElements(driver, HomePage.class);
        createpg.createPage();
    }
    @Test
    public void createAcc() throws InterruptedException {
        HomePage createAccount = PageFactory.initElements(driver, HomePage.class);
        createAccount.setLoginBox();
    }
    @Test
    public void createPost() throws InterruptedException {
        HomePage createAPostWall = PageFactory.initElements(driver, HomePage.class);
        createAPostWall.createAPost();

    }
}
