package ScreenshotListener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
        WebDriver driver = BaseTest.driver;
        if (driver instanceof TakesScreenshot) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
            String screenshotName = "failure_" + result.getName() + "_" + timestamp + ".png";
            Path destination = Paths.get("screenshots", screenshotName);
            try {
                Files.createDirectories(destination.getParent());
                Files.copy(screenshotFile.toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Screenshot saved to: " + destination.toAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
