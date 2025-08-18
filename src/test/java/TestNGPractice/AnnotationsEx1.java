package TestNGPractice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsEx1 {

    private WebDriver driver = null;

    @BeforeMethod
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void googleApplicationName() throws Exception{
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        System.out.println("Google browser title is : "+driver.getTitle());
    }

    @Test
    public void leafgroundApplicationName() throws Exception{
        driver.get("https://leafground.com/");
        Thread.sleep(2000);
        System.out.println("LeafGround title is : "+driver.getTitle());
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
