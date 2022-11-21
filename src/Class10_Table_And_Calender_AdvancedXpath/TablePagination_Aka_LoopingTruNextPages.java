package Class10_Table_And_Calender_AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePagination_Aka_LoopingTruNextPages {
    public static void main(String[] args) {

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


      //go through columnofIds with loop

        boolean idFound=false;

  while(!idFound) {

      List<WebElement> columnOfIds = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

      for (int i = 0; i < columnOfIds.size(); i++) {

          String idText = columnOfIds.get(i).getText();

          if (idText.equalsIgnoreCase("40907A")) {
              //check the checkbox that ssoiciated with that particular row

              WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
              checkbox.click();
              idFound=true;
              break;

          }
      }
      if(!idFound){
          WebElement nxtButton = driver.findElement(By.xpath("//a[text()='Next']"));
          nxtButton.click();
      }


  }
    }
}
