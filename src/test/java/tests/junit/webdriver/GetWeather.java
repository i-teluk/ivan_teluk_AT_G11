package tests.junit.webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.Driver;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GetWeather {
    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.com");
    }

    @Test
    public void getWeather() throws InterruptedException {

        driver.findElement(By.name("q")).sendKeys("погода Минск");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option'][1]")));
        driver.findElement(By.xpath("//div[@role='option'][1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        String tomorrowDay = now.plusDays(1).format(formatter);

        String xPath = String.format("//*[contains(@aria-label, '°Celsius %s 12:00')]", tomorrowDay);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
        List<WebElement> elements = driver.findElements(By.xpath(xPath));
        if (!elements.isEmpty()) {
            String ariaLabelText = elements.get(0).getDomAttribute("aria-label");
            System.out.println(ariaLabelText);
        } else {
            System.out.println("Элементы с данным XPath не найдены.");
        }
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}
