package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {
    WebDriver driver = Driver.getDriver();
    private By fiveStarFilter = By.xpath("//div[@data-filters-item='class:class=5'][1]");
    private By sortDropdown = By.xpath("//button[@data-testid='sorters-dropdown-trigger']");
    private By sortByRating = By.xpath("//button[@aria-label='Оценка объекта (по возрастанию)']");
    private By firstRoomAttribute = By.xpath("//div[@aria-label='Вариант жилья']//span/div[1]");
    private By room10th = By.xpath("//div[@aria-label='Вариант жилья'][10]");
    private By highRatingField = By.xpath("//div[@data-filters-item='review_score:review_score=90']");
    private By firstRoomCard = By.xpath("//div[@aria-label='Вариант жилья'][1]/div/div[1]");

    public void applyFiveStarFilter() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement stars = driver.findElement(fiveStarFilter);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stars);
        stars.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void sortByRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        driver.findElement(sortDropdown).click();
        driver.findElement(sortByRating).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String getFirstRoomRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(firstRoomAttribute));
        WebElement firstRoomElement = driver.findElement(firstRoomAttribute);
        return firstRoomElement.getDomAttribute("aria-label");
    }

    public void coloringRoom_10th() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(room10th));
        WebElement room_10thCard = driver.findElement(room10th);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", room_10thCard);
        executor.executeScript("arguments[0].style.backgroundColor = 'green'", room_10thCard);
        executor.executeScript("arguments[0].style.color = 'red'", room_10thCard);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void applyHighRatingFilter() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        WebElement high_rating = driver.findElement(highRatingField);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", high_rating);
        high_rating.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void goingToFirstRoomPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(firstRoomCard));
        driver.findElement(firstRoomCard).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
