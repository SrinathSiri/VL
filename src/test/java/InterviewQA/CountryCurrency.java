package InterviewQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountryCurrency {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        List<WebElement> listlements = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[2]"));

        // xpath axis -> connect to its sibling child downwards

        //table[@id='countries']/tbody/tr/td[2]/following-sibling::d[2]

    }
}
