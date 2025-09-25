package SeleniumPractice.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown2 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        Thread.sleep(3000);
        WebElement iframeele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iframeele);
        Thread.sleep(3000);
        WebElement selcars = driver.findElement(By.xpath("//select[@id='cars']"));
        Select select2 = new Select(selcars);
        select2.selectByValue("audi");
        Thread.sleep(2000);
        driver.close();
    }
}
