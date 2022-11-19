package Class7_WindowHandle_andSome_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {
    public static void main(String[] args) {
/*
HomeWork3: (do not use thread .sleep  or Explicit wait)
1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty
write down  whatever the reason you understand  of text being empty after exploring DOM
 */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        WebElement welcome = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcome.getText();
        System.out.println("Text is : "+ text); //text is not showing because the DOM has display:none

                                                 //the webDriver sees the text on DOM before it shows on the UI
                                                //YOU NEED AN EXPLICIT WAIT TO SYNC WITH BOTH DOM and ui







    }
}
