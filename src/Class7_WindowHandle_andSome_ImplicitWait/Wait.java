package Class7_WindowHandle_andSome_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


    //implicit was is going to wait until the element is found
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        //click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        //find the text once clicking start
        WebElement welcomeTxt = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeTxt.getText();
        System.out.println("Text is : "+ text);



    }
}
