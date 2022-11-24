package Class11_Action_And_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass2_Drag_and_Drop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

   //have to switch to iframe other drag and drop wont work bc the elements DragleElement and DropLocation is not in the iframe
        driver.switchTo().frame(0);

        //        dragable
        WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//        drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action= new Actions(driver);

  //both do same thing below
        action.dragAndDrop(dragableElement,dropLocation).perform();
        action.clickAndHold(dragableElement).moveToElement(dropLocation).release().build().perform();



    }
}
