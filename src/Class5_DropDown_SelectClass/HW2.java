package Class5_DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
/*
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
 */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");


        WebElement categories= driver.findElement(By.id("gh-cat"));

        Select select= new Select(categories);

        List<WebElement> options = select.getOptions();
        for(WebElement option:options){
            String category= option.getText();
            System.out.println(category);
        }
        System.out.println("-----------");


        WebElement ComputerAndNetWorking= driver.findElement(By.xpath("//option[text()='Computers/Tablets & Networking']"));
        ComputerAndNetWorking.click();

        WebElement clickSearch= driver.findElement(By.id("gh-btn"));
        clickSearch.click();

        String title= driver.getTitle();

        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println(title+ " is verified");
        }else{
            System.out.println(title+ " is not verified");
        }
        System.out.println("The title is "+title);


    }
}
