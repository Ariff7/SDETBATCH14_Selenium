package Class9_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicReview {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

//log in , find element for username and password
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        //enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //click on login Button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //check the checkbox that contains "screensaver" as a product
        //get elment for second column

        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

//traverse through the list

        for (int i = 0; i < secondColumn.size() ; i++) {
            //i=0

            String text = secondColumn.get(i).getText();

            if(text.equalsIgnoreCase("ScreenSaver")){

                //save in a variable
                int rowNumber=i+1;
                System.out.println("ScreenSaver is found on row numbers: "+rowNumber);

             //click the checkbox on the rows numbers above ^^
                WebElement chkecBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (rowNumber + 1)+"]/td[1]"));
                chkecBox.click();

            }

        }


    }
}
