package pages.selenium;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainPage {
    WebDriver driver = Driver.getDriver();

    String nameSearchField = "ss";
    String guestsButton = "//button[@data-testid='occupancy-config']";
    String adultsPlus = "//input[@id='group_adults']/../div[2]/button[2]";
    String adultsMinus = "//input[@id='group_adults']/../div[2]/button[1]";
    String roomsPlus = "//input[@id='no_rooms']/../div[2]/button[2]";
    String searchButton = "//button[@type='submit']";
    String skeletonLoader = "//div[@data-testid='skeleton-loader']";
    String currency = "//button[@data-testid='header-currency-picker-trigger']";
    String currencyTooltips = "//div[@id=':r0:']";
    String language = "//button[@data-testid='header-language-picker-trigger']";
    String languageTooltips = "//div[@id=':r6:']";

    public void enterDestination(String destination) {
        WebElement city = driver.findElement(By.name(nameSearchField));
        city.clear();
        city.sendKeys(destination);
        String searchCity = "//div[text()='" + destination + "']";
        driver.findElement(By.xpath(searchCity)).click();
    }

    public void selectDates(int startInDays, int endInDays) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        String startDateXpath = String.format("//span[@data-date='%s']", now.plusDays(startInDays).format(formatter));
        String endDateXpath = String.format("//span[@data-date='%s']", now.plusDays(endInDays).format(formatter));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(startDateXpath)));
        driver.findElement(By.xpath(startDateXpath)).click();
        driver.findElement(By.xpath(endDateXpath)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void configureGuests(int adults, int rooms) {
        driver.findElement(By.xpath(guestsButton)).click();
        if (adults > 2) {
            for (int i = 0; i < adults - 2; i++) {
                driver.findElement(By.xpath(adultsPlus)).click();
            }
        } else if (adults == 1) {
            driver.findElement(By.xpath(adultsMinus)).click();
        }
        if (rooms > 1) {
            for (int i = 0; i < rooms - 1; i++) {
                driver.findElement(By.xpath(roomsPlus)).click();
            }
        }
    }

    public void clickSearch() {
        driver.findElement(By.xpath(searchButton)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(skeletonLoader)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String getCurrencyTooltipText() {
        WebElement currencyTooltip = driver.findElement(By.xpath(currency));
        Actions action = new Actions(driver);
        action.moveToElement(currencyTooltip);
        action.perform();
        return driver.findElement(By.xpath(currencyTooltips)).getText().toLowerCase();
    }

    public String getLanguageTooltipText() {
        WebElement currencyTooltip = driver.findElement(By.xpath(language));
        Actions action = new Actions(driver);
        action.moveToElement(currencyTooltip);
        action.perform();
        return driver.findElement(By.xpath(languageTooltips)).getText().toLowerCase();
    }
}
