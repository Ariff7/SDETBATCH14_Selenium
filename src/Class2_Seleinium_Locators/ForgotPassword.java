package Class2_Seleinium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ForgotPassword {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.Facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(1000);

//task2
   //Click on forgot password using linkText locator

       // driver.findElement(By.linkText("Forgot password?")).click();  //  <a href  (<a "text")

 //task3 :
     //Click on forgot password using Partial linkText Locator
        driver.findElement(By.partialLinkText("Forgot")).click();


    }
}
