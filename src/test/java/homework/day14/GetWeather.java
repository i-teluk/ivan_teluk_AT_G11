package homework.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class GetWeather {
    public static void main(String[] str) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        List<String> days = Arrays.asList("понедельник","вторник","среда","четверг","пятница","суббота","воскресенье");

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(2000);
        WebElement web = driver.findElement(By.xpath("(//div[@role='option'])[1]"));
        web.click();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        String tomorrowDay = "";
        for (int i = 0; i < days.size(); i++) {
            if (days.get(i).equals(now.format(formatter))) {
                if (i == days.size() - 1) {
                    tomorrowDay = days.getFirst();
                } else {
                    tomorrowDay = days.get(i+1);
                }
            }
        }
        String xPath = String.format("//*[contains(@aria-label, '°Celsius %s 12:00')]", tomorrowDay);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
        List<WebElement> elements = driver.findElements(By.xpath(xPath));
        if (!elements.isEmpty()) {
            String ariaLabelText = elements.get(0).getDomAttribute("aria-label");
            System.out.println(ariaLabelText);
        } else {
            System.out.println("Элементы с данным XPath не найдены.");
        }
    }
}
