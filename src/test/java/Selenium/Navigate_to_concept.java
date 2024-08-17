package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class Navigate_to_concept

{
    public WebDriver driver ;
    @SuppressWarnings("deprecation")
    @BeforeClass
    public void setup() {

        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashok kumar\\OneDrive\\Documents\\drivers\\latest\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void run() {

        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}




