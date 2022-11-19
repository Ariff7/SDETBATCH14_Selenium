package Class7_WindowHandle_andSome_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
**WindowHandles**
1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your user name in form

 */


public class HW1_Window_Handles {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

     //store the window handle title in a variable
        String mainPage = driver.getWindowHandle();

        //click on Help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
         helpBtn.click();

        //click On privay
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();


     //get all the window handles in a set
        Set<String> allHandles = driver.getWindowHandles();

     //loop through the window Handles a
        for(String handle:allHandles) {
            WebDriver page = driver.switchTo().window(handle);
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            System.out.println(title); //prints the title of window handles and get the correct title you are looking for

            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }

        }

//click on community Button
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

  //go to gmail.com and enter your username
        driver.switchTo().window(mainPage);
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Arif");







    }
}
