package Class1_Seleinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
//set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

// create a WebDriver instance
        WebDriver driver=new ChromeDriver();

// use the get() function to open up the required website
        driver.get("https://www.google.com/");

//get the url of the website
        String url=driver.getCurrentUrl();
        System.out.println(url);

// get the title
        String title=driver.getTitle();
        System.out.println(title);

// close the browser(Chrome)

         driver.quit();



    }
}
