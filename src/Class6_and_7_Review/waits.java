package Class6_and_7_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class waits {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        //get the text of the element once clicking

        WebElement textElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println("text is : "+textElement.getText());

    }
}
