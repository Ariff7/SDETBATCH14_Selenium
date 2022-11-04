package Class4_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox_Practice {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        List<WebElement> colorOptions = driver.findElements(By.xpath("//input[@name='color']"));


        for(WebElement colorOption: colorOptions){
             String color=(colorOption.getAttribute("value"));
             if(color.equalsIgnoreCase("blue")){
                 colorOption.click();
                 break;
             }
        }



    }
}
