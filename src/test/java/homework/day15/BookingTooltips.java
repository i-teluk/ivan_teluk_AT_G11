package homework.day15;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BookingTooltips {
    @Test
    public void bookingTooltipsTest() {
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

        WebElement currency = driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
        Actions action = new Actions(driver);
        action.moveToElement(currency);
        action.perform();
        WebElement currencyTooltips = driver.findElement(By.xpath("//div[@id=':r0:']"));
        String currencyTooltipsText = currencyTooltips.getText().toLowerCase();
        assertEquals("Test fail! currencyTooltips doesn't contain expected text!", "выберите валюту", currencyTooltipsText);

        WebElement language = driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
        action.moveToElement(language);
        action.perform();
        WebElement languageTooltips = driver.findElement(By.xpath("//div[@id=':r6:']"));
        String languageTooltipsText = languageTooltips.getText().toLowerCase();
        assertEquals("Test fail! languageTooltips doesn't contain expected text!", "выберите язык", languageTooltipsText);
        driver.quit();
    }
}
