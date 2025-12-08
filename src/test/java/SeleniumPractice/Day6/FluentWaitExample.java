package SeleniumPractice.Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class FluentWaitExample {

    @Test
    public void waitFluent() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shutterfly.com");

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(NoAlertPresentException.class);

        wait.until(WebDriver -> {
            String title = driver.getTitle();
            return title.contains("Shutterfly");
        });


        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoAlertPresentException.class)
                .ignoring(ElementClickInterceptedException.class);

        wait1.until(WebDriver -> {
            return driver.getTitle().contains("Shutterfly");
        });

    }

}
