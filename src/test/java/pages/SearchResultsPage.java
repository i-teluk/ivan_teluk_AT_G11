package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import objects.PopUp;

public class SearchResultsPage {
    private By fiveStarFilter = By.xpath("//div[@data-filters-item='class:class=5'][1]");
    private By sortDropdown = By.xpath("//button[@data-testid='sorters-dropdown-trigger']");
    private By sortByRating = By.xpath("//button[@aria-label='Оценка объекта (по возрастанию)']");
    private By firstRoomAttribute = By.xpath("//div[@aria-label='Вариант жилья']//span/div[1]");
    private By room10th = By.xpath("//div[@aria-label='Вариант жилья'][10]");
    private By highRatingField = By.xpath("//div[@data-filters-item='review_score:review_score=90']");
    private By firstRoomCard = By.xpath("//div[@aria-label='Вариант жилья'][1]/div/div[1]");

    public void applyFiveStarFilter() {
        WebElement stars = Driver.getDriver().findElement(fiveStarFilter);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", stars);
        PopUp.closeAuthorizationPopUp();
        stars.click();
    }

    public void sortByRating() {
        Driver.getDriver().findElement(sortDropdown).click();
        Driver.getDriver().findElement(sortByRating).click();
    }

    public String getFirstRoomRating() {
        WebElement firstRoomElement = Driver.getDriver().findElement(firstRoomAttribute);
        return firstRoomElement.getDomAttribute("aria-label");
    }

    public void coloringRoom_10th() {
        WebElement room_10thCard = Driver.getDriver().findElement(room10th);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", room_10thCard);
        executor.executeScript("arguments[0].style.backgroundColor = 'green'", room_10thCard);
        executor.executeScript("arguments[0].style.color = 'red'", room_10thCard);
    }

    public void applyHighRatingFilter() {
        WebElement high_rating = Driver.getDriver().findElement(highRatingField);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", high_rating);
        PopUp.closeAuthorizationPopUp();
        high_rating.click();
    }

    public void goingToFirstRoomPage() {
        Driver.getDriver().findElement(firstRoomCard).click();

    }
}
