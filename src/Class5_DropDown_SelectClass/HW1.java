package Class5_DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    //  Go to facebook
    //  2.click on create New Account
    //  3.Fill out the whole form
    //  4.Take screen shot of filled out form manually and share in HW channel along with code
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Arif");

        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Aliyev");

        WebElement emailOrNumber=driver.findElement(By.name("reg_email__"));
        emailOrNumber.sendKeys("314-852-8888");

        WebElement newPass=driver.findElement(By.xpath("//input[contains(@id , 'password')]"));
        newPass.sendKeys("Baller777");

        WebElement bdayMonth= driver.findElement(By.name("birthday_month"));
        Select selectMonth= new Select(bdayMonth);
        selectMonth.selectByIndex(8);

        WebElement bday_Day=driver.findElement(By.name("birthday_day"));
        Select selectDay=new Select(bday_Day);
        selectDay.selectByIndex(20);

        WebElement bdayYear=driver.findElement(By.name("birthday_year"));
        Select selectYr=new Select(bdayYear);
        selectYr.selectByValue("2000");

        WebElement gender= driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
Thread.sleep(3000);
        driver.quit();










    }
}
