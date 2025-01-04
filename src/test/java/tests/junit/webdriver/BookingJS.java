package tests.junit.webdriver;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import driver.Driver;
import pages.MainPage;
import pages.SearchResultsPage;
import objects.PopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BookingJS {
    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
    }

    @Test
    public void bookingJSTest() throws IOException {
        MainPage mainPage = new MainPage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        PopUp.closePermissionToUseCookie();

        mainPage.enterDestination("London");
        mainPage.clickSearch();
        searchResultsPage.coloringRoom_10th();
        File asfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(asfile, new File("screen.png"));

    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}
