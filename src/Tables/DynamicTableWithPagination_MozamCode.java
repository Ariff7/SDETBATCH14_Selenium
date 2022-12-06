package Tables;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTableWithPagination_MozamCode {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

        //go to the table and look for the ID 45156A and check the checkBox associated with it

        //get all the data in the column ID of the table

    //        counter variable
    int rowCount = 0;
    boolean notfound=true;
//        a while loop continues to execute till the condition in the paranthesis is TRUE
        while (notfound) {
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (WebElement id : idColumn) {
            String personID = id.getText();

            if (personID.equals("41694A")) {
                System.out.println("the row number of the desired id is" + (rowCount + 1));
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                checkBox.click();
                notfound=false;
                break;
            }
            rowCount = rowCount + 1;
        }
        if(notfound) {
            WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
            nextBtn.click();
            rowCount=0;
        }
            TakesScreenshot ss=(TakesScreenshot)driver;
            File sourceFile = ss.getScreenshotAs(OutputType.FILE);

            //save the file from your variable into the location into your computer
            FileUtils.copyFile(sourceFile,new File("screenshots/SmartBear/checkBoxID.png"));

    }
}

}
