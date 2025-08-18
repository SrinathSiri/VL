package SeleniumPractice.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://leafground.com/");
        driver.findElement(By.id("email")).sendKeys("srinathstage2@yopmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("stage2srinath@gmail.com");

    }
}
