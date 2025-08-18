package SeleniumPractice.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CSSSyntax {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
        //driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys("Karimnagar");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Siddipet");
    }
}
