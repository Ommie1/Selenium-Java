// Chrome Driver -> Driver object here has all the methods of Chrome Driver are defined in chrome driver interface
// ChromeDriver driver = new ChromeDriver();
// ----------------------------------------------------------------------------------------------------------------
// Webdriver -> Driver object here has all the methods of Webdriver which are defined in webdriver interface
// WebDriver driver1 = new ChromeDriver();
// ------------------------------------------------------
// Chromedriver.exe is third party driver from Google
// ------------------------------------------------------
// Close -> Close current window
// Quit -> Close all windows opened by selenium
// Cannot use both commands at once
// -------------------------------------------------------
// In selenium 4.6.0 this command is option to invoke driver. Its manage by selenium manager
// System.setProperty("webdriver.chrome.driver","D:/AutomationWork/Automation-Tools/BrowserDrivers/chromedriver.exe");
// If you add the command then selenium manager will be disabled

package firstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args){
        // Set browser
        System.setProperty("webdriver.chrome.driver","D:/AutomationWork/Automation-Tools/BrowserDrivers/chromedriver.exe");
        // Invoke chrome driver
        WebDriver driver = new ChromeDriver();

//        // Set browser
//        System.setProperty("webdriver.gecko.driver","D:/AutomationWork/Automation-Tools/BrowserDrivers/geckodriver.exe");
//        // Invoke Firefox driver
//        WebDriver driver = new FirefoxDriver();

//        // Set browser
//        System.setProperty("webdriver.edge.driver","D:/AutomationWork/Automation-Tools/BrowserDrivers/msedgedriver.exe");
//        // Invoke Edge driver
//        WebDriver driver = new EdgeDriver();

        // Open site
        driver.get("http://localhost/opencartsite/");
        // Get title of web page
        System.out.println(driver.getTitle());
        // Get current URL
        System.out.println(driver.getCurrentUrl());
        // Close -> Close current window
        driver.close();
    }
}
