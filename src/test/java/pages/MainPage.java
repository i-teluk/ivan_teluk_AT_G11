package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    private By startDateButton = By.xpath("//button[@data-testid='date-display-field-start']");
    private By guestsButton = By.xpath("//button[@data-testid='occupancy-config']");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By currency = By.xpath("//button[@data-testid='header-currency-picker-trigger']");
    private By language = By.xpath("//button[@data-testid='header-language-picker-trigger']");

    public void enterDestination(String destination) {
        WebElement city = driver.findElement(By.name("ss"));
        city.clear();
        city.sendKeys(destination);
        String xPath = "//div[text()='" + destination + "']";
        driver.findElement(By.xpath(xPath)).click();
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
        driver.findElement(guestsButton).click();
        if (adults > 2) {
            for (int i = 0; i < adults - 2; i++) {
                driver.findElement(By.xpath("//input[@id='group_adults']/../div[2]/button[2]")).click();
            }
        } else if (adults == 1) {
            driver.findElement(By.xpath("//input[@id='group_adults']/../div[2]/button[1]")).click();
        }
        if (rooms > 1) {
            for (int i = 0; i < rooms - 1; i++) {
                driver.findElement(By.xpath("//input[@id='no_rooms']/../div[2]/button[2]")).click();
            }
        }
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String getCurrencyTooltipText() {
        WebElement currencyTooltip = driver.findElement(currency);
        Actions action = new Actions(driver);
        action.moveToElement(currencyTooltip);
        action.perform();
        return driver.findElement(By.xpath("//div[@id=':r0:']")).getText().toLowerCase();
    }

    public String getLanguageTooltipText() {
        WebElement currencyTooltip = driver.findElement(language);
        Actions action = new Actions(driver);
        action.moveToElement(currencyTooltip);
        action.perform();
        return driver.findElement(By.xpath("//div[@id=':r6:']")).getText().toLowerCase();
    }
}
