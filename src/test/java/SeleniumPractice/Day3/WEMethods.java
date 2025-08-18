package SeleniumPractice.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WEMethods {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://leafground.com/radio.xhtml");
        WebElement browsercheckbox = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]"));
        if(browsercheckbox.isSelected()){
            System.out.println("Chrome browser checkbox selected");
        }
        else{
            System.out.println("Chrome browser checkbox not selected, Please select now");
            Thread.sleep(2000);
            browsercheckbox.click();
        }
        Thread.sleep(5000);
        driver.close();
    }
}
