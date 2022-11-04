package Class5_DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

//Find the Webelement dropDown by looking for select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

//   use Select Class
        Select select=new Select(dropDown);

//now select an option by index
       select.selectByIndex(5);
       Thread.sleep(2000);

// select by visible Text
       select.selectByVisibleText("Friday");
       Thread.sleep(2000);

//select by Value----  value="Sunday"
       select.selectByValue("Saturday");

 // get all the options avaiable in the dropDown
        List<WebElement> options = select.getOptions();

 //traverse through the options
      for(int i=0; i<options.size(); i++){
          WebElement option= options.get(i);
          System.out.println(option.getText());

      }


    }
}
