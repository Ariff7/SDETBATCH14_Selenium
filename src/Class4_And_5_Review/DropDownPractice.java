package Class4_And_5_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPractice {
    public static void main(String[] args) throws InterruptedException {

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //click on create account
        WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcc.click();

        //sleep for 2 seconds to wait for the window to open up
        Thread.sleep(2000);

        //use select  class --select the date from the DropDown
        //1.) Find the webElement that contains the select Tag
        //2.) use Select class ----- Select sel=new Select(WebElement );

        //find the WebElement that contains the select tag
        WebElement bdayDay = driver.findElement(By.xpath("//select[@id='day']"));

        //use select class --- Select sel=new Select(WebElement)
        Select select=new Select(bdayDay);

//select by index (day = 5)
        select.selectByIndex(4);
Thread.sleep(1000);
//select by VisibleText
        select.selectByVisibleText("6");
Thread.sleep(1000);
 //select by Value (attribute = " "
        select.selectByValue("7");
        select.selectByValue("21");

  //Bday - Day
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
