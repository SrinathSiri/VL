package InterviewQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDownSort {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.get("https://leafground.com/select.xhtml;jsessionid=node01gwtctp7gddv9oov19u5ubnv53659495.node0");
        WebElement dpdwn = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select sel = new Select(dpdwn);
        List<WebElement> listeles = sel.getOptions();
        ArrayList al = new ArrayList();
        for(WebElement ecele:listeles){
            //System.out.println(ecele.getText());
            al.add(ecele.getText());
        }
        System.out.println("Before sorting an arraylist : "+al);
        Collections.sort(al);
        System.out.println("After sorting an arraylist : "+al);
    }
}
