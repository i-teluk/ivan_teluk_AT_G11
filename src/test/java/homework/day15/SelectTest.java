package homework.day15;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectTest {
    @Test
    public void selectTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        driver.get("https://demoqa.com/select-menu");

        WebElement selectValueField = driver.findElement(By.xpath("//div[@id='withOptGroup']/div[1]/div[2]"));
        selectValueField.click();
        WebElement selectValue = driver.findElement(By.id("react-select-2-option-0-0"));
        selectValue.click();

        WebElement selectOneField = driver.findElement(By.xpath("//div[@id='selectOne']/div[1]/div[2]"));
        selectOneField.click();
        WebElement selectOne = driver.findElement(By.id("react-select-3-option-0-2"));
        selectOne.click();

        WebElement oldSelect = driver.findElement(By.id("oldSelectMenu"));
        Select select_old = new Select(oldSelect);
        select_old.selectByValue("6");

        WebElement standartSelect = driver.findElement(By.id("cars"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", standartSelect);
        Select select_standart = new Select(standartSelect);
        select_standart.selectByValue("opel");

        executor.executeScript("arguments[0].scrollIntoView(true);", selectOneField);
        WebElement multiselectField = driver.findElement(By.xpath("//p[contains(., 'Multiselect drop down')]//following-sibling::div"));
        multiselectField.click();
        WebElement multiselect1 = driver.findElement(By.id("react-select-4-option-0"));
        multiselect1.click();
        WebElement multiselect2 = driver.findElement(By.id("react-select-4-option-3"));
        multiselect2.click();
    }
}
