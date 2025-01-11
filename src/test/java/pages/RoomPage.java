package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class RoomPage {
    WebDriver driver = Driver.getDriver();
    private By rating = By.xpath("//div[@data-testid='review-score-right-component']/div/div[1]");

    public Double getRatingNumber() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid='skeleton-loader']")));
        WebElement ratingElement = driver.findElement(rating);
        String ratingText = ratingElement.getText();
        Double ratingNumber = Arrays.stream(ratingText.split(" ")).skip(1).mapToDouble(Double::parseDouble).findFirst().orElseThrow();
        return ratingNumber;
    }
}
