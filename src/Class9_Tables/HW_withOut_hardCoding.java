package Class9_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HW_withOut_hardCoding {
    public static void main(String[] args) throws IOException {




        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("Data/Class9HW.properties");
        prop.load(fis);

        String username= prop.getProperty("username");
        String password=prop.getProperty("password");

        driver.get(prop.getProperty("url"));


        WebElement user = driver.findElement(By.id("txtUsername"));
        user.sendKeys(username);


        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys(password);

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
    }
}
