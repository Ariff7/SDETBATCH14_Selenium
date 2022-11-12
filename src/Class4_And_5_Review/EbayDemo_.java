package Class4_And_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo_ {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");

//select from the drop down
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel=new Select(dropDown);
        sel.selectByValue("58058");

        WebElement clckSearch = driver.findElement(By.xpath("//input[@type='submit']"));
        clckSearch.click();

        //Verify the Title

       String title =driver.getTitle();

       if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
           System.out.println("Title is verified");
       }else{
           System.out.println("The title is incorrect");
       }

       // String titleText = title.getText();


    }
}
