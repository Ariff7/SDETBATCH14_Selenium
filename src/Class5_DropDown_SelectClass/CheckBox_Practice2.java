package Class5_DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox_Practice2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

//find all the checkboxes"
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

//traverse through list of checkboxes to find the desired one
        for(WebElement checkbox: checkBoxes){
     //get the attribute value to check if this is the right option
            String optionName=checkbox.getAttribute("value");
            if(optionName.equalsIgnoreCase("Option-2")){
                checkbox.click();
            }
        }



    }
}