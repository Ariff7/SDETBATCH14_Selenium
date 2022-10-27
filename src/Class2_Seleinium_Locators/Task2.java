package Class2_Seleinium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Task2 {
    /*
    navigate to fb.com
click on create new account
fill up all the textboxes

close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Arif");
        driver.findElement(By.name("lastname")).sendKeys("Aliyev");
        driver.findElement(By.name("reg_email__")).sendKeys("314-777-8888");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password123");
        driver.findElement(By.id("month")).sendKeys("December");
        driver.findElement(By.id("day")).sendKeys("1");
        driver.findElement(By.id("year")).sendKeys("1960");

       driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/img")).click();
Thread.sleep(1000);
driver.close();


    }
}
