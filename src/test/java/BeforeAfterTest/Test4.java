package BeforeAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

    @Test
    public void leafTile(){
        System.out.println("LeafGround tile captured");
    }

    @AfterTest
    public void browserClose(){
        System.out.println("ChromeBrowser Closed");
    }
}
