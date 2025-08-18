package TestNGPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParameterClass {

    private WebDriver driver = null;

    @Parameters({"Browser"})
    @BeforeTest
    public void browserLaunch(@Optional("firefox") String Browser){
        switch(Browser.toLowerCase()){
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
    }

    @BeforeClass
    public void loginin(){
        System.out.println("Login Application");
    }

    @Test(priority = 1)
    public void addCart(){
        System.out.println("Adding to Cart");
    }

    @Test(priority = 2)
    public void removeCart(){
        System.out.println("Removing from cart");
    }

    @AfterClass
    public void logout(){
        System.out.println("Logout Application");
    }

    @AfterTest
    public void browserClose(){
        driver.close();
    }
}
