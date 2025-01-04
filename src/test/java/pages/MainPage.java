package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainPage {
    private By searchField = By.xpath("//input[@placeholder='Куда вы хотите поехать?']");
    private By startDateButton = By.xpath("//button[@data-testid='date-display-field-start']");
    private By guestsButton = By.xpath("//button[@data-testid='occupancy-config']");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By currency = By.xpath("//button[@data-testid='header-currency-picker-trigger']");
    private By language = By.xpath("//button[@data-testid='header-language-picker-trigger']");

    public void enterDestination(String destination) {
        WebElement city = Driver.getDriver().findElement(By.name("ss"));
        city.clear();
        city.sendKeys(destination);
        String xPath = "//div[text()='" + destination + "']";
        Driver.getDriver().findElement(By.xpath(xPath)).click();
    }

    public void selectDates(int startInDays, int endInDays) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        String startDateXpath = String.format("//span[@data-date='%s']", now.plusDays(startInDays).format(formatter));
        String endDateXpath = String.format("//span[@data-date='%s']", now.plusDays(endInDays).format(formatter));

        Driver.getDriver().findElement(startDateButton).click();
        Driver.getDriver().findElement(By.xpath(startDateXpath)).click();
        Driver.getDriver().findElement(By.xpath(endDateXpath)).click();
    }

    public void configureGuests(int adults, int rooms) {
        Driver.getDriver().findElement(guestsButton).click();
        if (adults > 2) {
            for (int i = 0; i < adults - 2; i++) {
                Driver.getDriver().findElement(By.xpath("//input[@id='group_adults']/../div[2]/button[2]")).click();
            }
        } else if (adults == 1) {
            Driver.getDriver().findElement(By.xpath("//input[@id='group_adults']/../div[2]/button[1]")).click();
        }
        if (rooms > 1) {
            for (int i = 0; i < rooms - 1; i++) {
                Driver.getDriver().findElement(By.xpath("//input[@id='no_rooms']/../div[2]/button[2]")).click();
            }
        }
    }

    public void clickSearch() {
        Driver.getDriver().findElement(searchButton).click();
    }

    public String getCurrencyTooltipText() {
        WebElement currencyTooltip = Driver.getDriver().findElement(currency);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(currencyTooltip);
        action.perform();
        return Driver.getDriver().findElement(By.xpath("//div[@id=':r0:']")).getText().toLowerCase();
    }

    public String getLanguageTooltipText() {
        WebElement currencyTooltip = Driver.getDriver().findElement(language);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(currencyTooltip);
        action.perform();
        return Driver.getDriver().findElement(By.xpath("//div[@id=':r6:']")).getText().toLowerCase();
    }
}
