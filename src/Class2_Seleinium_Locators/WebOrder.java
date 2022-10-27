package Class2_Seleinium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
  //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver=new ChromeDriver();
 //go to smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
  //maximize the window
        driver.manage().window().maximize();
  //enter the user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

   //make sure that the title is correct ex: Web Orders

       String title= driver.getTitle();
      if(title.equalsIgnoreCase("Web Orders")){
          System.out.println("The Title is correct");
      }else{
          System.out.println("The Title is incorrect ");
      }

    }
}
