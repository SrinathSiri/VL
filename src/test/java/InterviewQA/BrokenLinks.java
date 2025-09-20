package InterviewQA;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.net.ssl.HttpsURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            String hrefurl = link.getAttribute("href");
            URL url = new URL(hrefurl);
            URLConnection urlconnection = url.openConnection();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlconnection;
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.connect();
            if(httpsURLConnection.getResponseCode()==200){
                System.out.println(hrefurl+">>>"+httpsURLConnection.getResponseCode()+">>>"+httpsURLConnection.getResponseMessage());
            }
            else{
                System.err.println(hrefurl+">>>"+httpsURLConnection.getResponseCode()+">>>"+httpsURLConnection.getResponseMessage());
            }
            httpsURLConnection.disconnect();
        }

    }
}
