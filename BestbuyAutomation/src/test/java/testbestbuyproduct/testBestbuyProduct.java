package testbestbuyproduct;

import bestbuyhomepage.BestbuyHomePage;
import bestbuyhomepage.BestbuyLogin;
import bestbuyhomepage.BestbuyShopMac;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testBestbuyProduct extends CommonAPI {
//    @Test
//    public void gotoBestbuycart () throws InterruptedException {
//        BestbuyHomePage Bestbuycart = PageFactory.initElements(driver, BestbuyHomePage.class);
//        Bestbuycart.gotoBestbuyCart();
//    }
//    @Test
//    public void title () throws InterruptedException {
//        BestbuyHomePage bestbuyTitle = PageFactory.initElements(driver, BestbuyHomePage.class);
//        bestbuyTitle.Title();
//    }
//
//    @Test
//    public void signUp() throws InterruptedException {
//        BestbuyHomePage createACC = PageFactory.initElements(driver, BestbuyHomePage.class);
//        createACC.createAccount("Savin", "Boltons", "pntautomationtest@gmail.com","Fall2017selenium","Fall2017selenium","3477614311");
//    }
//
//    @Test
//    public void positiveBestbuysignIn() throws InterruptedException {
//        BestbuyLogin bestbuySignIn = PageFactory.initElements(driver, BestbuyLogin.class);
//        bestbuySignIn.SignIn("pntautomationtest@gmail.com", "Fall2017selenium");
//    }
//    @Test
//    public void negativeBestbuysignIn() throws InterruptedException {
//        BestbuyLogin bestbuySignIn = PageFactory.initElements(driver, BestbuyLogin.class);
//        bestbuySignIn.SignIn("pntautomationtest@gmail.com", "Fall2017sele4nium");
//    }


//    @Test
//    public void buyMac () throws InterruptedException {
//        BestbuyShopMac macDeal = PageFactory.initElements(driver, BestbuyShopMac.class);
//        macDeal.shopMac();
//    }
//
//    @Test
//    public void buyMacOnDeal () throws InterruptedException {
//        BestbuyShopMac macDealOnDeal = PageFactory.initElements(driver, BestbuyShopMac.class);
//        macDealOnDeal.shopMacOndeal();
//    }
//
//    @Test
//    public void buyMacByPrice () throws InterruptedException {
//        BestbuyShopMac macDealByPrice = PageFactory.initElements(driver, BestbuyShopMac.class);
//        macDealByPrice.shopMacByPrice();
//    }
//
//    @Test
//    public void buyMacByRatings () throws InterruptedException {
//        BestbuyShopMac macDealByRatings = PageFactory.initElements(driver, BestbuyShopMac.class);
//        macDealByRatings.shopMacByRatings();
//    }
//    @Test
//    public void orderstatus () throws InterruptedException {
//        BestbuyHomePage orderstatussignIn = PageFactory.initElements(driver, BestbuyHomePage.class);
//        orderstatussignIn.orderStatus();
//    }
//    @Test
//    public void bestbuysavedItems() throws InterruptedException {
//        BestbuyHomePage bestbuysaveditems = PageFactory.initElements(driver, BestbuyHomePage.class);
//        bestbuysaveditems.savedItems();
//    }
//    @Test
//    public void bestbuyshoppingHistory () throws InterruptedException {
//        BestbuyHomePage shoppingHistory = PageFactory.initElements(driver, BestbuyHomePage.class);
//        shoppingHistory.bestbuyshoppingHistory();
//    }
//    @Test
//    public void addCreditCardINFO () throws InterruptedException {
//        BestbuyHomePage creditcardINFO = PageFactory.initElements(driver, BestbuyHomePage.class);
//        creditcardINFO.addcreditCard("1234567812345678", 3, 3, "Savin", "Bolton", "37st", "1st Floor", "New York", 38, "11103", "7186884355");
//    }
//    @Test
//    public void termsAndConditions () throws InterruptedException {
//        BestbuyHomePage termsandconditions = PageFactory.initElements(driver, BestbuyHomePage.class);
//        termsandconditions.termsandCondition();
//    }
    @Test
    public void buyIphoneX () throws InterruptedException {
        BestbuyHomePage buyiphonex = PageFactory.initElements(driver, BestbuyHomePage.class);
        buyiphonex.iphoneX("Verizon", "", "");
    }


}