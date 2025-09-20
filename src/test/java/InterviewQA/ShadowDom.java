package InterviewQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");

        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        String shadowelement= shadow0.findElement(By.cssSelector("#shadow-element")).getText();
        System.out.println("Shadow host -> shadowroot element is : "+shadowelement);

        SearchContext shadow_0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        SearchContext shadow_1 = shadow_0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        String nestedshadowele = shadow_1.findElement(By.cssSelector("#nested-shadow-element")).getText();
        System.out.println("Shadow host -> nested shadowroot element is : "+nestedshadowele);


        SearchContext shadow_0_0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        SearchContext shadow_1_1 = shadow_0_0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        SearchContext shadow_2_2 = shadow_1_1.findElement(By.cssSelector("nested-shadow-dom")).getShadowRoot();
        String multinestedshadowele = shadow_2_2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
        System.out.println("Shadow host -> nested shadowroot element is : "+multinestedshadowele);
    }
}
