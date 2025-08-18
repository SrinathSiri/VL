package TestNGPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionsEx1 {
    @Test
    public void m1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = null;

        SoftAssert softassert = new SoftAssert();
        softassert.assertNull(driver);
        driver = new ChromeDriver();
        softassert.assertNull(driver);
        softassert.assertAll();

    }
}
