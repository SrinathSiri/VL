package ScreenshotListener.TryCatch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TryCatchScreen {

    WebDriver driver = null;

    @Test
    public void tryCatchScreenshot() throws Exception {

        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://accounts.shutterfly.com/?redirectUri=https%3A%2F%2Fwww3.shutterfly.com%2F");
            String actualsflytitle = driver.getTitle();
            String expectedsflytitle = "Shutterfly";
            Assert.assertEquals(actualsflytitle, expectedsflytitle);

        } catch (Throwable e) {
            System.out.println("The Assertion throwable error is: " + e.getMessage());
            File Input = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\VL\\src\\test\\java\\ScreenshotListener\\TryCatch\\screenshot1.png");
            FileHandler.copy(Input, dest);
            Thread.sleep(3000);

        }


    }
}
