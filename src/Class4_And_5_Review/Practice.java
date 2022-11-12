package Class4_And_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcc.click();

        Thread.sleep(1500);

       WebElement yr = driver.findElement(By.id("year"));
      // Select select=new Select(yr);


        List<WebElement> bdayYear = driver.findElements(By.id("year"));

        for(WebElement yrChoice: bdayYear){
            String choose= (yrChoice.getText());
            System.out.println(choose);
        }





      //  for(int i=0; i<bdayYear.size(); i++){
         //   String years=bdayYear.get(i).getText();
          //  System.out.println(years);
        //}
    }
    }

