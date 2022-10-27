package Class3_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        /*
Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxprojects.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(@id,'example')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[starts-with(@class,'list-grou')]")).click();

        //driver.findElement(By.xpath("a[@class='list-group-item'and text()='Simple Form Demo']"));  //combination ^^

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Helloooo");
        Thread.sleep(100);

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(1000);

        driver.quit();


    }
}
