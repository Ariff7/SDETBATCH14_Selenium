package Class7_WindowHandle_andSome_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {

        /*
        1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php

        2. click on get New User
        3. get the firstname  of user and print it on console (edited)

         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");

        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUserBtn.click();

        WebElement firstname = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String firstNameText = firstname.getText();
        System.out.println("The First Name is :" +firstNameText);

    }
}
