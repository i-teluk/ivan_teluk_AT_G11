package tests.testng.webdriver;

import driver.Driver;
import objects.PopUp;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.SearchResultsPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class BookingParis {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
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
        mainPage.configureGuests(4, 2);
        mainPage.clickSearch();
        searchResultsPage.applyFiveStarFilter();
        searchResultsPage.sortByRating();
        String aria_label = searchResultsPage.getFirstRoomRating();

        assertEquals(aria_label, "5 из 5", "Test fail! First room does not have 5 stars!");
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
