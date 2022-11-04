package Class5_DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAll_Links {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");

//get all the links
        List<WebElement> ebayLinks= driver.findElements(By.tagName("a"));

//print the size of the list
        System.out.println("Size of the list is : "+ebayLinks.size());

//implementing a for loop to traverse through the the list of WebElements
        for(WebElement ebaylink: ebayLinks){

            //extracting the value of Attribute of Href bc  it contains the link in it
            String links= ebaylink.getAttribute("href");

            //print the links
            System.out.println(links);
        }
    }
}
