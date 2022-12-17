//Implicit Wait - Define wait time globally till webdriver instance. Max time it will wait like 5s. It will execute if
// element appears in 2s

//Explicit Wait - Target specific element

//Thread.Sleep - It halts the execution

//Fluent Wait

package firstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementWait {
    public static void main(String[] args) {
        // Set browser
        System.setProperty("webdriver.chrome.driver", "D:/AutomationWork/Automation-Tools/BrowserDrivers/chromedriver.exe");
        // Invoke chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/opencartsite/index.php?route=account/login&language=en-gb");
    }
}
