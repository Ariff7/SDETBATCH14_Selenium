package Class8_Waits_and_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableBasic {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

    //print the whole table on the console
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textForAllTable = allTable.getText();
        System.out.println(textForAllTable);

    //print all the rows of  the table
    //modication --print all the rows which have the company Google
        System.out.println("----------");
        System.out.println("Printing rows in a table below");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
////table[@id='customers']/tbody/tr[3]/td[2]  - selecting indvidual row and column
        for (WebElement row:rows) {
         String rowText = row.getText();
     //         System.out.println(rowText);

     //modified task; Print only the row which has company Google

             if(rowText.contains("Google")){
                 System.out.println(rowText);
             }
        }

        System.out.println("----------");
//print all the individual colums of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
          for(WebElement column:columns){
              String columnText= column.getText();
              System.out.println(columnText);
          }



    }
}
