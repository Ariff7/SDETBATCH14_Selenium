package Class10_Table_And_Calender_AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderWithPagination {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");

    //click on depart calender
        WebElement deparBtn = driver.findElement(By.xpath("//span[text()='Depart']"));
        deparBtn.click();

     //get the month and check if it is desired month
        WebElement monthChoice = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound=false;
        while(!isFound){
            String monthName = monthChoice.getText();
            if(monthName.equalsIgnoreCase("March")){

            //get all the dates from the tables
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar'][1]/tbody/tr/td"));
                                                                               ////table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
              //travser thru the list to find your desired data
                for(WebElement date: dates){
                    String desiredeDate=date.getText();
                    if(desiredeDate.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }
                }

                isFound=true;
            }else{
                WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
            }
        }


    }
}
