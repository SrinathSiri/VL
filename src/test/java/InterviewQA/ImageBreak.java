package InterviewQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.net.ssl.HttpsURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

public class ImageBreak {

    // HYR Tutorials - How to Check Broken Images in Selenium WebDriver -> https://www.youtube.com/watch?v=6NXZQYs-Eig&t=752s

    public static void main(String[] args) throws Exception {
        brokenImageCheck();
    }

    public static void brokenImageCheck() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://practice.expandtesting.com/broken-images");
        //driver.get("https://the-internet.herokuapp.com/broken_images");
        List<WebElement> images = driver.findElements(By.tagName("img"));

        String srcaddress = null;
        try {
            for (WebElement image : images) {
                srcaddress = image.getAttribute("src");
                URL url = new URL(srcaddress);
                URLConnection urlconnection = url.openConnection();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlconnection; //HttpsURLConnection is an abstract class
                httpsURLConnection.setConnectTimeout(5000);
                httpsURLConnection.connect();

                if (httpsURLConnection.getResponseCode() == 200) {
                    System.out.println(srcaddress + " >> " + httpsURLConnection.getResponseCode() + " " + httpsURLConnection.getResponseMessage());
                } else {
                    System.err.println(srcaddress + " >> " + httpsURLConnection.getResponseCode() + " " + httpsURLConnection.getResponseMessage());
                }
                httpsURLConnection.disconnect();
            }

        } catch (Exception e) {
            System.err.println("Error checking image: " + srcaddress + " >> " + e.getMessage());
        }
                Thread.sleep(3000);
                driver.close();

    }

}
