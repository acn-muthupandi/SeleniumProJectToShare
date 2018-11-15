package Day2Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPage extends LoadableComponent<LoginPage> {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "login.htm") WebElement signInButton;
    @FindBy(linkText = "logOut.htm") WebElement signOutButton;
    @FindBy(name = "userName") WebElement userName;
    @FindBy(name = "password") WebElement password;
    @FindBy(name = "Login") WebElement login;



    @Override
    protected void isLoaded() throws Error {

    String url=driver.getCurrentUrl();
        System.out.println("url=="+url);
    Assert.assertTrue(signOutButton.isDisplayed());
    }

    @Override
    protected void load() {
        driver.get("http://localhost:8083/TestMeApp/f");
        driver.manage().window().maximize();
        userName.sendKeys("Lalitha");
        password.sendKeys("Password123");
        login.click();

    }

}
