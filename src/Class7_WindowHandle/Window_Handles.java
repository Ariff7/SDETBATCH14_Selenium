package Class7_WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window_Handles {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    //open gmail signup page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        
   //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        
   //click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        
   //the title of my desired page is -- "Google Account Help
   
   //Get all the window handles 
        Set<String> allHandles = driver.getWindowHandles();     

    //Loop through to get all Titles
        for(String handle:allHandles){

            //now switch to the focus to the current handle from the list
            driver.switchTo().window(handle);

            //get the title of the window which the driver has switched
            String title = driver.getTitle();

            //now compare, is the title of the help page
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is : "+title);
                break;
            }


        }
    }
}
