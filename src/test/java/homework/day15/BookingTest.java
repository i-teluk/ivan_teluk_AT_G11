package homework.day15;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BookingTest {
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
            System.out.println("Элемент не найден");
        }

        driver.findElement(By.xpath("//input[@placeholder='Куда вы хотите поехать?']")).sendKeys("Париж");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String futureDaysStart = String.format("//span[@data-date='%s']", now.plusDays(3).format(formatter));
        String futureDaysEnd = String.format("//span[@data-date='%s']", now.plusDays(10).format(formatter));

        driver.findElement(By.xpath("//button[@data-testid='date-display-field-start']")).click();
        driver.findElement(By.xpath(futureDaysStart)).click();
        driver.findElement(By.xpath(futureDaysEnd)).click();
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement plusPeople = driver.findElement(By.xpath("//input[@id='group_adults']/../div[2]/button[2]"));
        plusPeople.click();
        plusPeople.click();
        WebElement plusRoom = driver.findElement(By.xpath("//input[@id='no_rooms']/../div[2]/button[2]"));
        plusRoom.click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement stars = driver.findElement(By.xpath("//div[@data-filters-item='class:class=5'][1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", stars);
        try {
            WebElement closeAuth = driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"));
            if (closeAuth.isDisplayed()) {
                closeAuth.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден");
        }
        stars.click();

        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Оценка объекта (по возрастанию)']")).click();

        WebElement firstRoom = driver.findElement(By.xpath("//div[@aria-label='Вариант жилья']//span/div[1]"));
        String aria_label = firstRoom.getDomAttribute("aria-label");

        if (aria_label != null) {
            if (aria_label.equals("5 из 5")) {
                System.out.println("Test pass!");
            } else {
                System.out.println("Test fail! First room does not have 5 stars!");
            }
        } else {
            System.out.println("Test fail! Room not found");
        }

        driver.quit();
    }
}
