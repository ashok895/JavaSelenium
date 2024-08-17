package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Machine_test {
public WebDriver driver;

@BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashok kumar\\OneDrive\\Documents\\drivers\\latest\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

    }
@Test
    public void test() throws InterruptedException {
    driver.findElement(By.xpath("//input[@type='email']")).click();
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ashokperumal461@gmail.com");

    driver.findElement(By.xpath("//input[@type='submit']")).click();

    //driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("6383406711");
    driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Ashok");
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Ashok@123");
    driver.findElement(By.xpath("//input[@id='continue']")).click();



}

@AfterTest
    public void teardown(){
    driver.quit();
}
}
