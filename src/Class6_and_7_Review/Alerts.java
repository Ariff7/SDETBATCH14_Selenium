package Class6_and_7_Review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
//click on the button "Click Button to see alert"
        WebElement clickme = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickme.click();
        Thread.sleep(1200);
        
   //use alert interface to handle this operation
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

 //task 2
        //click on button 4 and send some text

        WebElement alertBtn4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn4.click();

      //re using the alert already declared
        alert1.sendKeys("HIS NAME IS JOHNAA CENNAAAAA");
        alert1.accept();
    }
}
