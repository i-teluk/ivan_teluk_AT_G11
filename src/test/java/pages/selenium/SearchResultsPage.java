package pages.selenium;

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
    String fiveStarFilter = "//div[@data-filters-item='class:class=5'][1]";
    String sortDropdown = "//button[@data-testid='sorters-dropdown-trigger']";
    String sortByRating = "//button[@aria-label='Оценка объекта (по возрастанию)']";
    String firstRoomAttribute = "//div[@aria-label='Вариант жилья']//span/div[1]";
    String room10th = "//div[@aria-label='Вариант жилья'][10]";
    String highRatingField = "//div[@data-filters-item='review_score:review_score=90']";
    String firstRoomCard = "//div[@aria-label='Вариант жилья'][1]/div/div[1]";
    String skeletonLoader = "//div[@data-testid='skeleton-loader']";

    public void applyFiveStarFilter() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement stars = driver.findElement(By.xpath(fiveStarFilter));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stars);
        stars.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(skeletonLoader)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void sortByRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(skeletonLoader)));
        driver.findElement(By.xpath(sortDropdown)).click();
        driver.findElement(By.xpath(sortByRating)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(skeletonLoader)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String getFirstRoomRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstRoomAttribute)));
        WebElement firstRoomElement = driver.findElement(By.xpath(firstRoomAttribute));
        return firstRoomElement.getDomAttribute("aria-label");
    }

    public void coloringRoom_10th() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(room10th)));
        WebElement room_10thCard = driver.findElement(By.xpath(room10th));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", room_10thCard);
        executor.executeScript("arguments[0].style.backgroundColor = 'green'", room_10thCard);
        executor.executeScript("arguments[0].style.color = 'red'", room_10thCard);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void applyHighRatingFilter() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(skeletonLoader)));
        WebElement high_rating = driver.findElement(By.xpath(highRatingField));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", high_rating);
        high_rating.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(skeletonLoader)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void goingToFirstRoomPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstRoomCard)));
        driver.findElement(By.xpath(firstRoomCard)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
