package tests.junit.webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import driver.Driver;
import pages.MainPage;
import objects.PopUp;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BookingTooltips {
    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
    }

    @Test
    public void bookingTooltipsTest() {
        MainPage mainPage = new MainPage();
        PopUp.closePermissionToUseCookie();

        String currencyTooltipsText = mainPage.getCurrencyTooltipText();
        assertEquals("Test fail! currencyTooltips doesn't contain expected text!", "выберите валюту", currencyTooltipsText);

        String languageTooltipsText = mainPage.getLanguageTooltipText();
        assertEquals("Test fail! languageTooltips doesn't contain expected text!", "выберите язык", languageTooltipsText);
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}
