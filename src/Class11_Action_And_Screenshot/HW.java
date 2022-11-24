package Class11_Action_And_Screenshot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) throws InterruptedException {

/*
goto https://demo.guru99.com/test/simple_context_menu.html
right click  on the button, select edit and handle the alert

double click on the button and handle the alert
 */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

//right click on "Right Click Me" and select edit
        WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickMe).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickMe = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        action.doubleClick(doubleClickMe).perform();
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.accept();




    }
}
