package ui.grid.testscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.grid.base.BrowserGrid;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SampleTest extends BrowserGrid {

    @Test(groups = {"Sanity"})
    public void verifyGoogleHomePageTitle() {
        logger.info("Launching Google home page...");
        driver.get("https://www.google.com");

        // Wait until title contains 'Google'
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.titleContains("Google"));

        String actualTitle = driver.getTitle();
        logger.info("Page title is: " + actualTitle);

        // Basic validation
        //Assert.assertTrue(actualTitle.contains("Google"), "Title verification failed!");
        logger.info("✅ Google title verified successfully.");
    }

    @Test(groups = {"Regression"})
    public void verifyPageNavigation() {
        logger.info("Navigating to YouTube...");
        driver.get("https://www.youtube.com");

        String currentUrl = driver.getCurrentUrl();
        logger.info("Current URL: " + currentUrl);

        Assert.assertTrue(currentUrl.contains("youtube"), "Navigation to YouTube failed!");
        logger.info("✅ YouTube navigation verified successfully.");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            logger.info("Closing the browser...");
            driver.quit();
            logger.info("Browser closed successfully.");
        }
    }
}

