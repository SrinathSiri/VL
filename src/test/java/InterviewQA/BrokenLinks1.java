package InterviewQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BrokenLinks1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        Thread.sleep(5000);

        Set<String> brokenlinkUrls = new HashSet<String>();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link : links) {
            String linkURL = link.getAttribute("href");
            Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80));
            URL url = new URL(linkURL);
            URLConnection urlConnection = url.openConnection(proxy);
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if(httpURLConnection.getResponseCode() != 200)
            {
                brokenlinkUrls.add(linkURL);
            }
//				System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
//			else
//				System.err.println(linkURL + " - " + httpURLConnection.getResponseCode() + " - " + httpURLConnection.getResponseMessage());

            httpURLConnection.disconnect();
        }

        driver.quit();

        for (String brokenLinkUrl : brokenlinkUrls) {
            System.err.println(brokenLinkUrl);
        }
    }
}
