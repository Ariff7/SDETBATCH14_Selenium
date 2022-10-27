package Class2_Seleinium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*  https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Arif");
        driver.findElement(By.name("customer.lastName")).sendKeys("Aliyev");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Adrress Drive");
        driver.findElement(By.id("customer.address.city")).sendKeys("St.Louis");
        driver.findElement(By.id("customer.address.state")).sendKeys("Missouri");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("314-123-4567");
        driver.findElement(By.id("customer.ssn")).sendKeys("You wish lol");
        driver.findElement(By.id("customer.username")).sendKeys("Baller777");
        driver.findElement(By.id("customer.password")).sendKeys("password");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password");

        driver.findElement(By.className("button")).click();

        Thread.sleep(4000);
        driver.close();


    }
}
