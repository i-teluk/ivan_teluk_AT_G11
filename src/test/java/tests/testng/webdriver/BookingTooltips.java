package tests.testng.webdriver;

import driver.Driver;
import objects.PopUp;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class BookingTooltips {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
    }

    @Test
    public void bookingTooltipsTest() {
        MainPage mainPage = new MainPage();
        PopUp.closePermissionToUseCookie();
        PopUp.closeAuthorizationPopUp();

        String currencyTooltipsText = mainPage.getCurrencyTooltipText();
        assertEquals(currencyTooltipsText, "выберите валюту", "Test fail! currencyTooltips doesn't contain expected text!");

        String languageTooltipsText = mainPage.getLanguageTooltipText();
        assertEquals(languageTooltipsText, "выберите язык", "Test fail! languageTooltips doesn't contain expected text!");
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
