package firstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;

public class FunctionalFlow {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D:/AutomationWork/Automation-Tools/BrowserDrivers/chromedriver.exe");
        // Invoke chrome driver
        WebDriver driver = new ChromeDriver();
        String[] itemsNeeded= {"MacBook","iPhone"};
        driver.get("http://localhost/opencartsite/index.php?route=common/home&language=en-gb");

        addItems(driver,itemsNeeded);
        }
        public static  void addItems(WebDriver driver,String[] itemsNeeded){
            {
                int j=0;
                List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
                for(int i=0;i<products.size();i++)
                {
                    String name=products.get(i).getText();

                    List itemsNeededList = Arrays.asList(itemsNeeded);

                    if(itemsNeededList.contains(name))
                    {
                        j++;
                        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                        if(j==itemsNeeded.length)
                        {
                            break;
                        }
                    }
                }
            }
        }
}
