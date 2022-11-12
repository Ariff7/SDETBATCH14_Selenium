package Class7_WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // will wait 20 seconds to find each element
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);




        //go facebook

        driver.get("https://www.facebook.com/");

        //click on create new account
        WebElement createNewAccBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccBtn.click();

Thread.sleep(1500);
        //send first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Mr.Arif");

     //


    }
}
