package SeleniumPractice.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EdgeBrowser {
    public static void main(String[] args) throws Exception{
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.eenadu.net/");
        Thread.sleep(3000);
        driver.close();
    }
}
