package TraingSession.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MercuryTest {
    WebDriver driver = null;

    @BeforeTest
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "C:\\GitProjects\\IAM_NextGenIDM\\src\\test\\java\\driverFiles\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/mercuryregister.php");
        driver.manage().window().maximize();

    }

    @Test
    public void testsPage() {
        driver.findElement(By.name("firstName")).sendKeys("kumar");
        driver.findElement(By.name("lastName")).sendKeys("muthu");
        driver.findElement(By.name("phone")).sendKeys("4511112112");
        driver.findElement(By.name("userName")).sendKeys("phone@asg.com");
        driver.findElement(By.name("address1")).sendKeys("46 Street Nagar Chennai India");
        driver.findElement(By.name("address2")).sendKeys("Ramapuram");
        driver.findElement(By.name("city")).sendKeys("chennai");
        driver.findElement(By.name("state")).sendKeys("Tamilnadu");
        driver.findElement(By.name("postalCode")).sendKeys("45454");

        Select selCountry= new Select(driver.findElement(By.name("country")));
        selCountry.selectByVisibleText("INDIA");
        driver.findElement(By.name("country")).sendKeys("India");
        driver.findElement(By.name("email")).sendKeys("aasasas@agsags.com");
        driver.findElement(By.name("password")).sendKeys("asasasasas555");
        driver.findElement(By.name("confirmPassword")).sendKeys("asasasasas555");
        driver.findElement(By.name("register")).click();
        driver.findElement(By.xpath("//b[text()=' Note: Your user name is aasasas@agsags.com.']"));
    }

    @AfterTest
    public void terminatate() {
        driver.quit();
    }
}
