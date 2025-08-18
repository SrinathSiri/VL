package SeleniumPractice.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions3 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        WebElement framew = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(framew);
        Thread.sleep(3000);
        Actions action  = new Actions(driver);
        action.keyDown(Keys.CONTROL).perform();
        action.click(driver.findElement(By.xpath("//option[@value='volvo']"))).perform();
        Thread.sleep(2000);
        action.click(driver.findElement(By.xpath("//option[@value='audi']"))).perform();
        Thread.sleep(2000);
        action.keyUp(Keys.CONTROL);

    }
}
