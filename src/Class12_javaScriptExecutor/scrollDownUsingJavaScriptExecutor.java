package Class12_javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class scrollDownUsingJavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

   //scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
     //google for syntax "How to scroll down in Selenium-JavscriptExecutor
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-2000)");
    }
}
