package Class6_Alerts_AND_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
    public static void main(String[] args) {
        /*
           1.check the checkBox
          2.Select BabyCat from drop dwon
           3. Send text in text box "DONE"
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");

    driver.switchTo().frame("frame1");
    driver.switchTo().frame("frame3");

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        WebElement animals = driver.findElement(By.id("animals"));

        Select select=new Select(animals);
        select.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("DONE ");






    }
}
