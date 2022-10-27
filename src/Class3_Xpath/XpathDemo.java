package Class3_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

//set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//go to fb.com
        driver.get("https://www.facebook.com/");
//enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Djarif0@gmail.com");

//click on forgot password
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

//click on forgot password using "contains for text"
       //driver.findElement(By.xpath(("//a[contains(text(),'Forgot')]"))).click();

//click on login using xpath with method
        // driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();

    }
}
