package pageObjec;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".//*[@id='mini-navigation']/ul/li[3]/a")
    public static WebElement worldBtn;
    public void logo() {
        worldBtn.click();
    }

}
