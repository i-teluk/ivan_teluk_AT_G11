package classwork.day19;

import driver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyTest {
    @Test
    public void myTestBooking() {
        open("https://booking.com");

        WebElement city = $(By.name("ss"));
        city.clear();
        city.sendKeys("Париж");
        String xPath = "//div[text()='Париж']";

        try {
            $x("//button[@aria-label='Скрыть меню входа в аккаунт.']").click();
        } catch (NoSuchElementException e) {
            System.out.println("The authorization pop-up did not appear.");
        }

        $x(xPath).click();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String futureDaysStart = String.format("//span[@data-date='%s']", now.plusDays(3).format(formatter));
        String futureDaysEnd = String.format("//span[@data-date='%s']", now.plusDays(10).format(formatter));

        $x("//button[@data-testid='date-display-field-start']").click();
        $x(futureDaysStart).click();
        $x(futureDaysEnd).click();
        $x("//button[@data-testid='occupancy-config']").click();

        WebElement plusPeople = $x("//input[@id='group_adults']/../div[2]/button[2]");
        plusPeople.click();
        plusPeople.click();
        WebElement plusRoom = $x("//input[@id='no_rooms']/../div[2]/button[2]");
        plusRoom.click();
        $x("//button[@type='submit']").click();

    }
}
