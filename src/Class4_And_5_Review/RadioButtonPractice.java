package Class4_And_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonPractice {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //find the radio button
        List<WebElement> radionBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //traverse through the webElements (loop)
        for(WebElement radionBtn: radionBtns){

            //find the desired radio button
             String option = radionBtn.getAttribute("value");

             if(option.equalsIgnoreCase("5 - 15")){

                 //click on the radio Btn
                 radionBtn.click();
             }
        }




    }
}
