package classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
    public static void main(String[] str) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://booking.com");
        driver.findElement(By.xpath("//input[@placeholder='Куда вы хотите поехать?']")).sendKeys("Париж");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String futureDaysStart = String.format("//span[@data-date='%s']", now.plusDays(3).format(formatter));
        String futureDaysEnd = String.format("//span[@data-date='%s']", now.plusDays(10).format(formatter));

        driver.findElement(By.xpath("//button[@data-testid='date-display-field-start']")).click();
        driver.findElement(By.xpath(futureDaysStart)).click();
        //driver.findElement(By.xpath("//button[@data-testid='date-display-field-end']")).click();
        driver.findElement(By.xpath(futureDaysEnd)).click();
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement plusPeople = driver.findElement(By.xpath("//input[@id='group_adults']/../div[2]/button[2]"));
        plusPeople.click();
        plusPeople.click();
        WebElement plusRoom = driver.findElement(By.xpath("//input[@id='no_rooms']/../div[2]/button[2]"));
        plusRoom.click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
