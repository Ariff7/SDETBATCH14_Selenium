package Class4_CSS_and_RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) {
/*
HW 2
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

Hint:
you can use if else condition for verification of message
 */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement usernameBox=driver.findElement(By.cssSelector("input#txtUsername"));
        usernameBox.sendKeys("Arif777");

        WebElement loginBtn= driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();


        WebElement passwordEmpty= driver.findElement(By.cssSelector("span#spanMessage"));
        boolean displayMsg= passwordEmpty.isDisplayed();

if(displayMsg){
    System.out.println("Is password cannot be empty displayed 'True' or 'False :'" +displayMsg);
}

    }
}
