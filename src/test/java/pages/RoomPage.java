package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class RoomPage {
    private By rating = By.xpath("//div[@data-testid='review-score-right-component']/div/div[1]");

    public Double getRatingNumber() {
        WebElement ratingElement = Driver.getDriver().findElement(rating);
        String ratingText = ratingElement.getText();
        Double ratingNumber = Arrays.stream(ratingText.split(" ")).skip(1).mapToDouble(Double::parseDouble).findFirst().orElseThrow();
        return ratingNumber;
    }
}
