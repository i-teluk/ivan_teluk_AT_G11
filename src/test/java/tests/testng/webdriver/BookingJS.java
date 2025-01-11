package tests.testng.webdriver;

import driver.Driver;
import objects.PopUp;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.SearchResultsPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BookingJS {
    WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
    }

    @Test
    public void bookingJSTest() throws IOException {
        MainPage mainPage = new MainPage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        PopUp.closePermissionToUseCookie();
        PopUp.closeAuthorizationPopUp();

        mainPage.enterDestination("London");
        mainPage.clickSearch();
        searchResultsPage.coloringRoom_10th();
        File asfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(asfile, new File("screen.png"));

    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
