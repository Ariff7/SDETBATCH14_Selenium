package Class1_3_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_FromClass2 {
    public static void main(String[] args) throws InterruptedException {

        //setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

// create a WebDriver instance
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();

        //click on Simple Form Demo

        //driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();

        //    use 'index' when no other option left            (//a[@class='list-group-item'])[1]

        Thread.sleep(1000);
       // driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Simple')] ")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();                                //a[@class='list-group-item' and @href='basic-first-form-demo.php']
    }
}
