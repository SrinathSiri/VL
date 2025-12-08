package SeleniumPractice.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class BootStrap {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.w3schools.com/bootstrap5/tryit.asp?filename=trybs_dropdown-menu&stacked=h");
        WebElement frameele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frameele);
        Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
        Thread.sleep(3000);
        List<WebElement> bootdps = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu show\"]//li//a"));
        for(WebElement ecdpdn:bootdps){
            if(ecdpdn.getText().equals("Link 2")){
                System.out.println("Link text is : "+ecdpdn.getText());
                ecdpdn.click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.close();

    }
}
