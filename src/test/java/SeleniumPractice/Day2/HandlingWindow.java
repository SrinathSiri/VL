package SeleniumPractice.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingWindow {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://chatgpt.com/");
        Thread.sleep(2000);
        String firstwindow = driver.getWindowHandle();
        System.out.println("First Window Handle is : "+firstwindow);
        driver.switchTo().newWindow(WindowType.TAB).get("https://mvnrepository.com/");
        Thread.sleep(2000);
        Set<String> handles = driver.getWindowHandles();
        String secondhandle = "";
        for(String handle:handles){
            if(!handle.equals(firstwindow)){
                secondhandle = handle;
                break;
            }
        }
        System.out.println("Second Window Handle is : "+secondhandle);
    }
}
