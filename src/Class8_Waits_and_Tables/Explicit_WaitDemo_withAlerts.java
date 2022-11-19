package Class8_Waits_and_Tables;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Explicit_WaitDemo_withAlerts {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

   //click on button "click me to open an alert after 5 seconds"
        WebElement btn = driver.findElement(By.xpath("//button[@id='alert']"));
        btn.click();

   //bc we DONT have a webElement associated with the alert in the DOM , there is NO purpose of using
   //implicit wait(which waits for webElement to be found)
   //so we use expilicit wait in this scenario

       WebDriverWait wait= new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.alertIsPresent());

    //now handle the alert
        Alert alert1=driver.switchTo().alert();
        alert1.accept();



    }
}
