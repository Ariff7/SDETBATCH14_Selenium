package Class4_And_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

 //User Sends Wrong Password                                             //using xpath below
        WebElement passWord=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Password");

//click on login Button                                               //using xpath below
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

 //VERIFY THE ERROR "Invalid Creditianls"
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error=errorMsg.getText();

        //VERIFY ERROR USING IF

        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println(" The correct Error message is displayed-----> verified  ");
        }else{
            System.out.println(" The correct ERROR message is not there ");
        }


    }
}
