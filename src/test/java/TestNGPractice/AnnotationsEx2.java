package TestNGPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsEx2 {
    private WebDriver driver = null;

    @BeforeClass
    public void browserLaunch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void googleTitle() throws Exception{
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        System.out.println("Google browser title is : "+driver.getTitle());
    }

    @Test(priority = 2)
    public void leafgroundTitle() throws Exception{
        Thread.sleep(2000);
        driver.navigate().to("https://leafground.com/");
        Thread.sleep(2000);
        System.out.println("LeafGround title is : "+driver.getTitle());
    }

    @AfterClass
    public void browserClose(){
        driver.close();
    }


}
