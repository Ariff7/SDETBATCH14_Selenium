package Class2_Seleinium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {

        /*
         1.) Go to facebook.com
         2.) Enter username
         3.) Enter Password
         4.) Press login
         */


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.Facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("djarif0@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("Magamed2020!");

        driver.findElement(By.name("login")).click();



    }
}
