package Class9_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

//log in , find element for username and password
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

      //enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

     //click on login Button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

 //check the checkbox that contains "screensaver" as a product
    //get elment for second column

        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

//traverse through the list

        for (int i = 0; i < secondColumn.size() ; i++) {
  //i=0

            String columnText = secondColumn.get(i).getText();  //ScreenSaver

      //check for desired value
         if(columnText.equalsIgnoreCase("ScreenSaver")){

         //print out the index of the column or row where desired value is at (ScreenSaver)

             System.out.println("The index of the row which contains ScreenSaver is :"+(i+1));

 //get the checkbox Element
             //first xpath for first checkbox : //table[@class='SampleTable']/tbody/tr[2]/td[1]
             // first xpath for second checkbox : //table[@class='SampleTable']/tbody/tr[4]/td[1]
             WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
             checkBox.click();
  //click on it



         }
        }



    }
}
