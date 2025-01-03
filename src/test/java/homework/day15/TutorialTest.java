package homework.day15;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TutorialTest {
    @Test
    public void tutorialTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        driver.get("https://www.w3schools.com/java/");
        WebElement tutorial = driver.findElement(By.cssSelector("span.color_h1"));

        Actions make = new Actions(driver);

        make
                .doubleClick(tutorial)
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .build().perform();

        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.name("q"));

        make
                .click(searchField)
                .keyDown(Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ENTER)
                .build().perform();

        WebElement pagesBottom = driver.findElement(By.xpath("//tbody"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", pagesBottom);
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".Hdw6tb"));

        for (WebElement element : searchResults) {
            String elementText = element.getText().toLowerCase();
            if (elementText.contains("tutorial")) {
                System.out.println("Элемент содержит tutorial");
            } else {
                System.out.println("Элемент не содержит tutorial: " + elementText);
            }

        }
        driver.quit();
    }
}
