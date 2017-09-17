package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    private String saucelabs_username = "mhossain";
    private String browserstack_username = "mdmhossain1";
    private String saucelabs_accesskey = "mo855";
    private String browserstack_accesskey = "pS2NT6eb2HqKz5xPd56v";

    @Parameters({"useCloudEnv", "cloudEnvName", "os", "os_version", "browserName", "browserVersion", "url"})
    @BeforeMethod
    public void setUp(boolean useCloudEnv, String cloudEnvName, String os, String os_version, String browserName,
                      String browserVersion, String url) throws IOException {
        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version,
                        browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelab")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version,
                        browserName, browserVersion);
            }
        }
        getLocalDriver(os, browserName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public WebDriver getCloudDriver(String envName, String envUserName, String envAccessKey, String os, String
            os_version, String browserName, String browser_Version) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browserVersion", browser_Version);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if (envName.equalsIgnoreCase("saucaelav")) {
            driver = new RemoteWebDriver(new URL("http://" + envUserName + envAccessKey + "ahnc@gamo.com"), cap);
        } else if (envName.equalsIgnoreCase("browserStack")) {
            driver = new RemoteWebDriver(new URL("htttp://www.amazon.com" + envUserName + envAccessKey + "pS2NT6eb2HqKz5xPd56v"), cap);
        }
        return driver;
    }

    public WebDriver getLocalDriver(String os, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hm Rupon\\IdeaProjects\\seleniumAutomation\\Geneirc\\Drive\\chromedriver.exe");
            } else if (os.equalsIgnoreCase("mac") || os.equalsIgnoreCase("os x")) {
                System.setProperty("webdriver.gecko.driver", "Geneirc/Drive/geckodriver.exee");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdirver.chrome.driver", "Geneirc/Drive/geckodriver.exe");
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.gecko.driver", "Geneirc/Drive/geckodriver.exe");

            }
            driver = new FirefoxDriver();
        }
        return driver;
    }

    @AfterMethod
    public void cleanup() {
        driver.quit();
    }
}