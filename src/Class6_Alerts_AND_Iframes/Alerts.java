package Class6_Alerts_AND_Iframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        //find the button "Click me" Java Script Alert Box- and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(1000);

        //Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();
        Thread.sleep(1200);

        //find the button click me "JavaScript Confirm Box" and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Thread.sleep(1000);

        //handling the alert
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

        //find the prompt alert "Java Script Alert Box" and send some text and accept it
        WebElement promptBox = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptBox.click();

        //Switch the focus to the alert Interface
        Alert promotBoxAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        promotBoxAlert.sendKeys("HEYyyyyyyooo");
        promotBoxAlert.accept();
    }
}
