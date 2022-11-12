package Class7_WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.TreeSet;

public class Window_Handle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

   //Go to gmail signup and get the window handle of that page

      //go to gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

      //get the window handle of the current page
        String gmailHandle = driver.getWindowHandle();

      //print it out
        System.out.println("Window Handle of the current page is: "+gmailHandle);


    }
}
