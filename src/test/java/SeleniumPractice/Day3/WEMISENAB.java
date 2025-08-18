package SeleniumPractice.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WEMISENAB {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://leafground.com/radio.xhtml");
        WebElement locationhyd = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[15]"));
        if(locationhyd.isEnabled()){
            System.out.println("location hyderabad webelement is interactable");
        }
        else{
            System.out.println("location hyderabad webelement not interactable");
        }

        if(locationhyd.isDisplayed()){
            System.out.println("location hyderabad is displayed");
        }
        else{
            System.out.println("location hyderabad webelement not displayed");
        }

        System.out.println(locationhyd.getAttribute("class"));

    }
}
