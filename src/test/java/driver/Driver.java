package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized", "--incognito", "--disable-notifications");
            driver = new ChromeDriver(options);
            return driver;
        }
    }

    public static void changeBrowserTab() {
        String originalWindow = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getWindowHandles().size() > 1);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
