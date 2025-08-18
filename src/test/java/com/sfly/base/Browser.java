package com.sfly.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Browser {
    protected WebDriver driver = null;
    protected Properties p = null;

    @Parameters({"browser"})
    @BeforeTest
    public void LaunchBrowser(String browser) throws IOException {

        p = new Properties();
        FileReader fr = new FileReader("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\VL\\src\\test\\resources\\config.properties");
        p.load(fr);

        switch(browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
    }

    @AfterTest
    public void closeBrowser() throws Exception{
        Thread.sleep(5000);
        driver.close();
    }
}
