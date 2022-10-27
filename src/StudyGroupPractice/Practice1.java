package StudyGroupPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com/");

        driver.manage().window().maximize();
        Thread.sleep(1200);
        driver.close();

    }
}
