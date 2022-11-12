package Class6_and_7_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");


   //Check inner frame CheckBox
        //switch the focus of the driver to the parent iframe 'frame1' then to the child to get access to checkbox
        driver.switchTo().frame("frame1");

        //now switch to frame3 (child frame) by index to get access to the checkbox
        driver.switchTo().frame(0);

     //click on checkbox
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

     //HAVE TO GO BACK TO MAIN PAGE NOW
        driver.switchTo().defaultContent();

//select BABY CAT now , go to it's frame  using webElement

        WebElement animalFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(animalFrame);


    //find the select tag for animals
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));

        //use select now for dropdowns
        Select sel=new Select(dropdown);

        sel.selectByIndex(1);

      //go back to main in order to go to frame 1 to reach "Topic"
      driver.switchTo().defaultContent();

      driver.switchTo().frame("frame1");

     //send keys to "topic" box
        WebElement topicBox = driver.findElement(By.xpath("//input"));
      topicBox.sendKeys("DONEEEE");

    }
}
