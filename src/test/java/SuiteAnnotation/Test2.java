package SuiteAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
    @BeforeTest
    public void beforetest(){
        System.out.println("Before Test");
    }

    @Test
    public void leafTile(){
        System.out.println("LeafGround title captured");
    }

    @AfterTest
    public void browserClose(){
        System.out.println("After Test");
    }
}
