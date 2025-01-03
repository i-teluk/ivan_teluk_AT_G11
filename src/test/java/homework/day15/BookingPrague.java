package homework.day15;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BookingPrague {
    @Test
    public void bookingTest() {
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

        driver.findElement(By.xpath("//input[@placeholder='Куда вы хотите поехать?']")).sendKeys("Прага");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement high_rating = driver.findElement(By.xpath("//div[@data-filters-item='review_score:review_score=90']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", high_rating);

        try {
            WebElement closeAuth = driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"));
            if (closeAuth.isDisplayed()) {
                closeAuth.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("The authorization pop-up did not appear.");
        }

        high_rating.click();

        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@aria-label='Вариант жилья'][1]/div/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.getWindowHandles().size() > 1);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        WebElement rating = driver.findElement(By.xpath("//div[@data-testid='review-score-right-component']/div/div[1]"));
        String ratingText = rating.getText();
        Double ratingNumber = Arrays.stream(ratingText.split(" ")).skip(1).mapToDouble(Double::parseDouble).findFirst().orElseThrow();

        assertTrue(ratingNumber >= 9.0);
    }
}
