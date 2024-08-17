package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Javascript_exe {

    static WebDriver driver;

    public static void main(String[] args){
        // TODO Auto-generated method stub





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok kumar\\OneDrive\\Documents\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.name("login"));
        border(driver, element);
        alert(driver,"Error");

    }

    public static void border(WebDriver driver , WebElement element) {

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].style.border='3px solid red'", element);


    }
    public static void alert(WebDriver driver ,String message) {

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("alert('"+message+"')");


    }



}


