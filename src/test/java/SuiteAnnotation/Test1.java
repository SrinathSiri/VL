package SuiteAnnotation;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    public void bs(){
        System.out.println("Before Suite");
    }

    @Test
    public void googleTile(){
        System.out.println("Google title captured");
    }

    @AfterSuite
    public void as(){
        System.out.println("After Suite");
    }
}
