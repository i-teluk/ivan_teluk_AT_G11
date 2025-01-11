package tests.junit.webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import driver.Driver;
import pages.MainPage;
import pages.SearchResultsPage;
import objects.PopUp;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BookingParis {
    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
    }

    @Test
    public void bookingTest() {
        MainPage mainPage = new MainPage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        PopUp.closePermissionToUseCookie();
        PopUp.closeAuthorizationPopUp();

        mainPage.enterDestination("Париж");
        mainPage.clickSearch();
        mainPage.selectDates(3, 10);
        mainPage.configureGuests(4,2);
        mainPage.clickSearch();
        searchResultsPage.applyFiveStarFilter();
        searchResultsPage.sortByRating();
        String aria_label = searchResultsPage.getFirstRoomRating();

        assertEquals("Test fail! First room does not have 5 stars!", "5 из 5", aria_label);
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}
