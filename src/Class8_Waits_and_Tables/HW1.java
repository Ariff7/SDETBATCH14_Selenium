package Class8_Waits_and_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
/*

go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
 */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement removeBox = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBox.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

     //verfiy text
        WebElement removeBtn = driver.findElement(By.xpath("//p[@id='message']"));
        String text= removeBtn.getText();
        System.out.println(text);

    //click on enable
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();

    //verfiy the textbox is enabled
        WebDriverWait wait2=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement verifyEnableBtn = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(verifyEnableBtn.getText());

   //send text in textbox
        WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
        box.sendKeys("Allah is the greatest !");

   //click on disable
        WebElement clickDisable = driver.findElement(By.xpath("//button[text()='Disable']"));
        clickDisable.click();

    //verfiy textbox is disabled
        WebDriverWait wait3=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement disableText = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(disableText.getText());


    }
}
