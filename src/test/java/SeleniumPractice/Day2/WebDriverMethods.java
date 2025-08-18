package SeleniumPractice.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverMethods {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.eenadu.net/"); // get method to load application url
        Thread.sleep(2000);
        String firstwindow = driver.getWindowHandle();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().to("https://www.carwale.com/");
        Thread.sleep(2000);
        String title2 = driver.getTitle();
        System.out.println(title2);
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        driver.getPageSource();
        Thread.sleep(2000);
        //driver.switchTo().newWindow(WindowType.TAB).get("https://www.joyalukkas.in/");
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.joyalukkas.in/");
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(firstwindow);
        Thread.sleep(2000);
        driver.close();
    }
}
