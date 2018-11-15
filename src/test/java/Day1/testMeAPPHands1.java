package TraingSession.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testMeAPPHands1 {
    WebDriver driver = null;

 /*   @BeforeTest
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "C:\\GitProjects\\IAM_NextGenIDM\\src\\test\\java\\driverFiles\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
        driver.manage().window().maximize();

    }*/
    @Test
    public void test(){
        driver.findElement(By.xpath("//a[text()='Accept Cookies']")).click();;
        //WebElement src=driver.findElement(By.xpath("//span[text()='1 Week Package']../"));
        WebElement src=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div"));
        WebElement dest=driver.findElement(By.xpath("//td[contains(text(),'Drag and drop packages here...')]"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(src,dest).perform();
        WebElement priceXpath=driver.findElement(By.xpath("//*[@class='rgFooter gridFooter']/td[2]"));
        WebDriverWait wait=new WebDriverWait(driver,10);
try {
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    wait.until(ExpectedConditions.textToBePresentInElement(priceXpath, "$4999"));
}
catch (TimeoutException e){
    Assert.fail("Expected== $4999 & actual=="+priceXpath.getText());
    MercuryTest mt=new MercuryTest();

}




    }
}
