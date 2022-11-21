package Class10_Table_And_Calender_AdvancedXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdvancedXpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //div[@id='globalContainer']

        //div[@id='contentCurve']/preceding-sibling::ul

        //div[text()='Recent logins']/following-sibling;;div

    }
}
