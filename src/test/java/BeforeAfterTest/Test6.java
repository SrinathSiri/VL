package BeforeAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test6 {

    @Test
    public void leafTile(){
        System.out.println("LeafGround tile captured");
    }

    @Test
    public void googleTile(){
        System.out.println("Google tile captured");
    }
}
