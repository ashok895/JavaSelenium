package Selenium;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class Screenshot_concept

{
    public WebDriver driver ;
    @SuppressWarnings("deprecation")
    @BeforeClass
    public void setup() {

        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok kumar\\OneDrive\\Documents\\drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void run() throws IOException {

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("D:\\ASHOK/priyanka.png"));
        System.out.println("Screenshot saved successfully.");

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}




