package tests.testng.webdriver;

import driver.Driver;
import pages.selenium.PopUp;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.selenium.MainPage;
import pages.selenium.RoomPage;
import pages.selenium.SearchResultsPage;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class BookingPrague {
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

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
