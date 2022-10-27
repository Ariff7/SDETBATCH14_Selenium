package Class1_Seleinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        /* Task
        go to google.com
        maximize your window
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com/");

//maximize
        //driver.manage().window().maximize();

//fullscreen -- hides url

        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();





    }
}
