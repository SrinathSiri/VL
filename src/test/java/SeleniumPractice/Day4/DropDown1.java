package SeleniumPractice.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown1 {
    public static void main(String[] args) throws Exception{
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
       driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
       driver.get("https://leafground.com/select.xhtml;jsessionid=node01xktteuu7cqid1wssoak0ulbbw3441308.node0");
       WebElement selectdpdn = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
       Select select = new Select(selectdpdn);
       select.selectByIndex(1);
       Thread.sleep(3000);
       select.selectByVisibleText("Cypress");
       Thread.sleep(3000);
       driver.switchTo().newWindow(WindowType.TAB).get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
       Thread.sleep(3000);
       WebElement iframeele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
       driver.switchTo().frame(iframeele);
       Thread.sleep(3000);
       WebElement selcars = driver.findElement(By.xpath("//select[@id='cars']"));
       Select select2 = new Select(selcars);
       select2.selectByValue("audi");
       Thread.sleep(2000);
       driver.close();
    }
}
