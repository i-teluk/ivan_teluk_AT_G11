package tests.testng.webdriver;

import driver.Driver;
import pages.selenium.PopUp;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.selenium.MainPage;
import pages.selenium.SearchResultsPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BookingJS {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
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
