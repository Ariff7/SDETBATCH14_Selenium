package Class1_3_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_FromClass2 {
    public static void main(String[] args) throws InterruptedException {

//setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

// create a WebDriver instance
        WebDriver driver=new ChromeDriver();
// open the Facebook.com
        driver.navigate().to("https://www.facebook.com/");
//Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(1000);
//click on create account using Xpath
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//Enter first name
        Thread.sleep(1000);  //needs sleep or else it wont show up
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arif");
//enter last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Aliyev");
//close the x button window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();


driver.close();

    }
}
