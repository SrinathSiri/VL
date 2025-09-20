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
import java.util.List;

public class ImageBreak {

    public static void main(String[] args) throws Exception {
        brokenImageCheck();
    }

    public static void brokenImageCheck() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/broken-images");
        List<WebElement> images = driver.findElements(By.tagName("img"));

        String srcaddress = null;
        try {
            for (WebElement image : images) {
                srcaddress = image.getAttribute("src");
                URL url = new URL(srcaddress);
                URLConnection urlconnection = url.openConnection();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlconnection;
                httpsURLConnection.setConnectTimeout(5000);
                httpsURLConnection.connect();

                if (httpsURLConnection.getResponseCode() == 200) {
                    System.out.println(srcaddress + " >> " + httpsURLConnection.getResponseCode() + " " + httpsURLConnection.getResponseMessage());
                } else {
                    System.err.println(srcaddress + " >> " + httpsURLConnection.getResponseCode() + " " + httpsURLConnection.getResponseMessage());
                }
            }

        } catch (Exception e) {
            System.err.println("Error checking image: " + srcaddress + " >> " + e.getMessage());
        }


    }

}
