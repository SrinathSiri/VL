package BeforeAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {
    @BeforeTest
    public void browserLaunch(){
        System.out.println("ChromeBrowser Launched");
    }

    @AfterTest
    public void browserClose(){
        System.out.println("ChromeBrowser Closed");
    }

}
