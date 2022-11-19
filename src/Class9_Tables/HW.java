package Class9_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
/*
got to the url

click on PIM
click on Employee List

from the table choose one id (it must be from the first page)

and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)

the user name is
admin
the password is
Hum@nhrm123
 */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");



//find element for username box and send right username
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("admin");
//find element of password box and enter the right password
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("Hum@nhrm123");

   //click on login
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

    //click on PIM
        WebElement pimBtn = driver.findElement(By.xpath(" //b[text()='PIM']"));
        pimBtn.click();

   //click on Employee List
        WebElement employeeBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeBtn.click();

   //from the table choose one id (it must be from the first page)
        List<WebElement> IdRowNumber = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < IdRowNumber.size() ; i++) {
            String text=IdRowNumber.get(i).getText();

            if(text.equalsIgnoreCase("12050096")) {


                int rowNumber = i + 1;
                System.out.println("This number is found on Row : " + rowNumber);

                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();

            }
        }


  //and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)




        //table[@id='resultTable']


















    }
}
