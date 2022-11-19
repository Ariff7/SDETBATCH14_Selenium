package Class8_Waits_and_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImpilcitWaitDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

  //click on button "Change Text to Selenium WebDriver"

        WebElement btn1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        btn1.click();

//get the text Selenium WebDriver
        WebElement btnText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(btnText.getText());



    }
}
