package SeleniumPractice.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class WebTable1 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://datatables.net/");
        List<WebElement> locations = driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td[3]"));
        for(WebElement ecloc:locations){
            System.out.println("Location : "+ecloc.getText());
        }
    }
}
