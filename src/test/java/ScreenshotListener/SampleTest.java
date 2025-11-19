package ScreenshotListener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class SampleTest extends BaseTest {

    @Test
    public void failingTest() {
        driver.get("https://www.google.com");
        // This element does not exist, so the test will fail
        driver.findElement(By.id("nonexistent-element"));
        Assert.assertTrue(true);
    }
}
