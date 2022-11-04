package Class4_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PrintAllMonthsAvaible_DropDown {
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //click on create account
        WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcc.click();
        Thread.sleep(2000);

        WebElement bdayMonth= driver.findElement(By.xpath("//select[@id='month']"));

        Select selectMonth=new Select(bdayMonth);

        selectMonth.selectByVisibleText("Sep");


        List<WebElement> monthOptions = selectMonth.getOptions();

        //to print use loop
        for(int i=0; i<monthOptions.size(); i++){
            String months= monthOptions.get(i).getText();
            System.out.println(months);
        }
    }
}
