package Class6_Alerts_AND_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Iframe_Demo {
    public static void main(String[] args) {

        //how to find Iframes -- //iframe


        //Task1 :Print the animals on the screen and then  Select baby cat from animals dropdown

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");

//switch to the frame using index
        driver.switchTo().frame(1);

        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text=animalText.getText();
        System.out.println(text);

   //NOW check "Inner Frame Check box :  "
        //go back to main page

       driver.switchTo().defaultContent();

//now switch to iframe containing the subframe  using ID

        driver.switchTo().frame("frame1");

        //send text to make sure you are in correct frame
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
     inputTxt.sendKeys("Hey Sugaaa");

     //switch to iframe  using XPATH , where it contains the check "Inner Frame Check box:
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        

       //find the checkbox and click
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();


        //back to main
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement animals = driver.findElement(By.id("animals"));

        Select select=new Select(animals);
        select.selectByValue("babycat");

        List<WebElement> animalOptions = select.getOptions();
       for(int i=0; i<animalOptions.size(); i++){
           WebElement choice = animalOptions.get(i);
           System.out.println(choice.getText());
       }

        //select babycat now

    }
}
