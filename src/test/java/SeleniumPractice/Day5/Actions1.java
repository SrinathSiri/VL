package SeleniumPractice.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
    public static void main(String[] args)throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cypress.io/");
        Thread.sleep(3000);
        WebElement producte = driver.findElement(By.xpath("//a[@id='dropdownProduct']"));
        Actions action = new Actions(driver);
        action.moveToElement(producte).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Browser Testing']")).click();

    }

}
