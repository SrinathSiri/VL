package ScreenshotListener.PracticeListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Titlecheck{

    public static WebDriver driver;

    @Test(priority=1)
    public void eenaduTitle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.eenadu.net/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "EENADU";
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.quit();
    }

    @Test(priority=2)
    public void namecheck(){
        String name1 = "PAVAN";
        String name2 = "SUMAN";
        Assert.assertEquals(name1, name2);
    }
}
