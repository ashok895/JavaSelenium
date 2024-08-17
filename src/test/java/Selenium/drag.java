package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class drag

{
    public WebDriver driver ;
    @SuppressWarnings("deprecation")
    @BeforeClass
    public void setup() {

        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok kumar\\OneDrive\\Documents\\drivers\\latest\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void run() {

        driver.switchTo().frame(0);
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}




