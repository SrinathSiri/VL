package BeforeAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeTest
    public void browserLaunch(){
        //chrome browser launching
        System.out.println("ChromeBrowser Launched");
    }

    @Test
    public void googleTile(){
        System.out.println("Google tile captured");
    }

    @AfterTest
    public void browserClose(){
        System.out.println("ChromeBrowser Closed");
    }
}
