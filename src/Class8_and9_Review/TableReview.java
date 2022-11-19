package Class8_and9_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TableReview {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("Data/Class9HW.properties");
        prop.load(fis);

        String username= prop.getProperty("username");
        String password=prop.getProperty("password");

        driver.get(prop.getProperty("url"));


        WebElement user = driver.findElement(By.id("txtUsername"));
        user.sendKeys(username);


        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys(password);

        //click on login
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

        //click on PIM
        WebElement pimBtn = driver.findElement(By.xpath(" //b[text()='PIM']"));
        pimBtn.click();

    //get a particticular id 44969A and click the checkbox

        //will select all ID/s aviable in a column
        List<WebElement> listOfId = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        //loop through it
        for (int i = 0; i <listOfId.size() ; i++) {
           String id= listOfId.get(i).getText();
           if(id.equalsIgnoreCase("44969A")){
               //System.out.println(i); //will be 3 --BUT we need 4



               //click the checkbox
             //  WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]"));  //will select [3] but we need 4!
               WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1)+ "]/td[1]"));
               checkBox.click();
               break;
           }

        }

    }
}
