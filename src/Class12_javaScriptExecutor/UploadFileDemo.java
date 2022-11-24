package Class12_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFileDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

//find element choose file
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
    //send keys - the path to the file
        chooseFile.sendKeys("C:\\Users\\Arif\\Pictures\\2022-08-12_21-04-25.jpg");

Thread.sleep(2000);
    //click on upload
        WebElement upLoad = driver.findElement(By.xpath("//input[@id='file-submit']"));
        upLoad.click();




    }
}
