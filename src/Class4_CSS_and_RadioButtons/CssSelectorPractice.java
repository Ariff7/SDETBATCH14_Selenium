package Class4_CSS_and_RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

//get the webElement textbox
       // driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Hello");

//another method of doing the above operation^^^

        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("H E L L O");
Thread.sleep(1000);

//press the button show message
        WebElement clickShowMessage =driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
        clickShowMessage.click();

    }
}
