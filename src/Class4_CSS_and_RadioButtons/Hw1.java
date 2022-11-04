package Class4_CSS_and_RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
   /*
   HW1
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner
    */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement usernameBox=driver.findElement(By.cssSelector("input#txtUsername"));
        usernameBox.sendKeys("Admin");

        WebElement passwordBox= driver.findElement(By.cssSelector("input#txtPassword"));
        passwordBox.sendKeys("Hum@nhrm123");

        WebElement loginBtn= driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();

        WebElement verifyWelcomeAdmin =driver.findElement(By.cssSelector("a#welcome"));
        System.out.println("Is Welcome Admin on the top right corner of the screen: 'True' or 'False' : " +verifyWelcomeAdmin.isDisplayed());

        Thread.sleep(1000);
        driver.close();


    }
}
