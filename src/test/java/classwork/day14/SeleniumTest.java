package classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumTest {
    public static void main(String[] str) throws MalformedURLException, InterruptedException {
        WebDriver driver1 = new ChromeDriver();
        //driver1.get("https://selenium.dev");

        //WebDriver driver2 = new RemoteWebDriver(new URL("http://localhost:59461"), new ChromeOptions());
        //driver2.get("https://selenium.dev");

        driver1.get("https://google.com");
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        Thread.sleep(1000);
        driver1.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(2000);
        WebElement web = driver1.findElement(By.xpath("(//div[@role='option'])[1]"));
        web.click();
    }
}
