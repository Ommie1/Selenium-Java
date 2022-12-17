// Selector hub & Chropath extensions
// Create css selector by Class -> tagname+classname = button.signIn
// Create css selector by Id -> tagname+id = button#signIn
// Create css selector by Tagname -> tagname+id = Tagname[attribute="Value"]
// Add index in css selector input[type="text"]:nth-child(2)
// Implicit wait - Hardcoded driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
// Chrome dev tool syntax for cssSelector-> $('button.btn-primary')
// Create xPath //Tagname[@attribute='value']
// Add index in xPath //Tagname[@attribute='value'][2]
// Chrome dev tool syntax for xPath -> $x('//input[@name="email"]')

package firstPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelectLoacators {
    public static void main(String[] args){
        // Set browser
        System.setProperty("webdriver.chrome.driver","D:/AutomationWork/Automation-Tools/BrowserDrivers/chromedriver.exe");
        // Invoke chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/opencartsite/index.php?route=account/login&language=en-gb");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("input-email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("abc123");
        driver.findElement(By.cssSelector("button.btn-primary")).click();
    }

}
