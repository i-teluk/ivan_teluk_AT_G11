package pages.selenium;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopUp {
    static String authorizationPopUpLocator = "//button[@aria-label='Скрыть меню входа в аккаунт.']";
    static String agreeToUseCookie = "//button[@id='onetrust-accept-btn-handler']";

    public static void closePermissionToUseCookie() {
        try {
            WebElement acceptCookie = Driver.getDriver().findElement(By.xpath(agreeToUseCookie));
            if (acceptCookie.isDisplayed()) {
                acceptCookie.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Permission to use cookies was not requested.");
        }
    }

    public static void closeAuthorizationPopUp() {
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(authorizationPopUpLocator)));
            Driver.getDriver().findElement(By.xpath(authorizationPopUpLocator)).click();
        } catch (NoSuchElementException e) {
            System.out.println("The authorization pop-up did not appear.");
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
