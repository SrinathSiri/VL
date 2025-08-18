package SeleniumPractice.Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FORLOOP {

    public static void main(String[] args){

        for(int index=0;index<=2;index++){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.quit();
        }
    }



}
