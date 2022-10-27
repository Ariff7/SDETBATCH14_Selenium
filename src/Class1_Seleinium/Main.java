package Class1_Seleinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        String path="https://www.google.com/";

        driver.get(path);

        String url= driver.getCurrentUrl();

        System.out.println(path);
        System.out.println(url);

        String title= driver.getTitle();

        if(path.equalsIgnoreCase(url)){
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }
        if(title.equalsIgnoreCase("Google")){
            System.out.println("Match");
        }else{
            System.out.println("No Match, not google");
        }

        driver.quit();
    }
}