package Day2Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestApp {
    WebDriver driver ;
    LoginPage lp;

    @BeforeTest
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "C:\\GitProjects\\IAM_NextGenIDM\\src\\test\\java\\driverFiles\\chromedriver.exe");
        driver = new ChromeDriver();
        /*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();*/

    }

    @Test
    public void test1(){
        lp=new LoginPage(driver);
        lp= PageFactory.initElements(driver, LoginPage.class);
        lp.get();
    }
}
