package ui.grid.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class BrowserGrid {

    public static WebDriver driver;
    public static Logger logger;
    public static Properties p;

    @Parameters({ "os", "browser" })
    @BeforeClass(groups = { "Sanity", "Regression", "Master" })
    public void setup(String os, String browser) throws IOException {
        // Load config_grid.properties
        p = new Properties();
        FileReader file = new FileReader("./src/test/resources/config_grid.properties");
        p.load(file);

        logger = LogManager.getLogger(this.getClass());

        String execEnv = p.getProperty("execution_env");
        logger.info("Execution environment: " + execEnv);
        logger.info("OS: " + os + " | Browser: " + browser);

        if (execEnv.equalsIgnoreCase("remote")) {
            // Remote Execution (e.g., Selenium Grid or BrowserStack)
            DesiredCapabilities capabilities = new DesiredCapabilities();

            // OS setup
            if (os.equalsIgnoreCase("windows"))
                capabilities.setPlatform(Platform.WIN11);
            else if (os.equalsIgnoreCase("linux"))
                capabilities.setPlatform(Platform.LINUX);
            else if (os.equalsIgnoreCase("mac"))
                capabilities.setPlatform(Platform.MAC);
            else {
                System.out.println("No matching OS found!");
                return;
            }

            // Browser setup
            if (browser.equalsIgnoreCase("chrome"))
                capabilities.setBrowserName("chrome");
            else if (browser.equalsIgnoreCase("firefox"))
                capabilities.setBrowserName("firefox");
            else if (browser.equalsIgnoreCase("edge"))
                capabilities.setBrowserName("MicrosoftEdge");
            else {
                System.out.println("No matching browser found!");
                return;
            }

            driver = new RemoteWebDriver(new URL(p.getProperty("hubURL")), capabilities);
        }
        else {
            // Local Execution
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Invalid browser specified for local execution!");
                return;
            }
        }

        driver.manage().window().maximize();
        logger.info("Driver initialized successfully for " + browser + " on " + os);
    }
}

