package Class8_and9_Review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitReview2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");


     //click on button "will enable 5 seconds" --will use Explicit


     //click on visible after 5 seconds-- use implicit bc have to wait some time to element to appear





    }
}
