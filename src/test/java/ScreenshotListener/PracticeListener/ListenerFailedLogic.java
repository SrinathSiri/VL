package ScreenshotListener.PracticeListener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListenerFailedLogic implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        // Add logic to capture screenshot or log additional information
        WebDriver driver = Titlecheck.driver;
        if(driver instanceof TakesScreenshot){
            File input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File output = new File("./screenshots/" + result.getName() + ".png");
           // output.getParentFile().mkdirs(); // Ensure the directory exists

            try {
                FileHandler.copy(input, output);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }
}
