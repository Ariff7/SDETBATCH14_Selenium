package Class10_Table_And_Calender_AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*
Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023
 */
public class HW {
    public static void main(String[] args) throws IOException {

        String path="Data/Class9HW.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
   
        driver.get(properties.getProperty("url"));
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();

        WebElement calenderBtn = driver.findElement(By.id("candidateSearch_fromDate"));
        calenderBtn.click();

        WebElement monthOptions = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select month=new Select(monthOptions);
        month.selectByVisibleText("Aug");

        WebElement yearOptions = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year=new Select(yearOptions);
        year.selectByVisibleText("2023");

        List<WebElement> dayOptions = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement day:dayOptions){
            String dayChoice=day.getText();
            if(dayChoice.equalsIgnoreCase("8")){
                day.click();
                break;
            }
        }

     /*
        for (int i=0; i< dayOptions.size(); i++){
            int column=i+1;
            String day=dayOptions.get(i).getText();
            if(day.equals("8")){
                dayOptions.get(i).click();
            }
        }
*/


    }
}
