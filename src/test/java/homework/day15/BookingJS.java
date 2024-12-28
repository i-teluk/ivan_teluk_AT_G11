package homework.day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BookingJS {
    @Test
    public void bookingJSTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://booking.com");

        try {
            WebElement acceptCookie = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
            if (acceptCookie.isDisplayed()) {
                acceptCookie.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Permission to use cookies was not requested.");
        }

        driver.findElement(By.xpath("//input[@placeholder='Куда вы хотите поехать?']")).sendKeys("London");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement room_10th = driver.findElement(By.xpath("//div[@aria-label='Вариант жилья'][10]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", room_10th);
        executor.executeScript("arguments[0].style.backgroundColor = 'green'", room_10th);
        executor.executeScript("arguments[0].style.color = 'red'", room_10th);

        try {
            WebElement closeAuth = driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"));
            if (closeAuth.isDisplayed()) {
                closeAuth.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("The authorization pop-up did not appear.");
        }

        File asfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(asfile, new File("screen.png"));
    }
}
