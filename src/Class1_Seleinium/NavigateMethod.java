package Class1_Seleinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        /* Task
           Go to google.com
           Go to facebook.com
           Go to google.com
           Go to facebook.com
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

   //create the Webdrive instance
        WebDriver driver=new ChromeDriver();

   //go to google.com
        driver.get("https://google.com/");

   //go to facebook.com after google
        driver.navigate().to("https://www.facebook.com/");

   //intorudce some sleep which is basically wait

   //pause for 2000mili seconds-->> 2 seconds
        Thread.sleep(1000);

   //go BACK TO google.com
        driver.navigate().back();

    //wait for 2 seconds
        Thread.sleep(1000);

   //go back to facebook.com
        driver.navigate().forward();

    //wait for 2 seconds
        Thread.sleep(1000);

    //refresh the page
        driver.navigate().refresh();

    //quit everything
       driver.quit();


    }
}
