package tests.junit.webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import driver.Driver;
import pages.MainPage;
import pages.RoomPage;
import pages.SearchResultsPage;
import objects.PopUp;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BookingPrague {
    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
    }

    @Test
    public void bookingTest() {
        MainPage mainPage = new MainPage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        RoomPage roomPage = new RoomPage();

        PopUp.closePermissionToUseCookie();
        PopUp.closeAuthorizationPopUp();

        mainPage.enterDestination("Прага");
        mainPage.clickSearch();
        searchResultsPage.applyHighRatingFilter();
        searchResultsPage.goingToFirstRoomPage();
        Driver.changeBrowserTab();
        Double ratingNumber = roomPage.getRatingNumber();
        assertTrue(ratingNumber >= 9.0);
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}
