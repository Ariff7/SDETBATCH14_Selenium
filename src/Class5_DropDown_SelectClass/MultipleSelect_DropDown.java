package Class5_DropDown_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelect_DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

//find the WebElement that contains the select class
         WebElement DD=driver.findElement(By.xpath("//select[@name='States']"));

//use select class
         Select select=new Select(DD);

//select New york by using index
         select.selectByIndex(3);

//Select texas by using visible text
         select.selectByVisibleText("Texas");
         Thread.sleep(1000);
//deSelect by index
         select.deselectByIndex(3);

 //select ALL the OPtions in the dropDown

        List<WebElement> options = select.getOptions();

         for(int i=0; i< options.size(); i++){
            select.selectByIndex(i);
         }

         //OR
        List<WebElement> optionz=select.getOptions();

        for (int i=0; i<optionz.size(); i++) {
            WebElement newElements = optionz.get(i);
            String list = newElements.getText();
            System.out.println(list);
        }
        select.deselectAll();

//how to check if DropDown is multiSelect or not
        boolean MultiSelect= select.isMultiple();
        System.out.println("Is this DropDown Multiple DropDown? True or False : "+ MultiSelect);


      //  for(int i=0; i<options.size(); i++){
           // WebElement option= options.get(i);
            //String text=option.getText();
          //  if(text.equalsIgnoreCase("Friday")){
              //  select.selectByIndex(i);
        //    }

           // System.out.println(option.getText());

    }
}
