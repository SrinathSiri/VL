package TestNGPractice;

import org.testng.annotations.*;

public class AllAnnotations2 {

    @BeforeClass
    public void beforeClassAA2(){
        System.out.println("This is before class -2");
    }

    @AfterClass
    public void afterClassAA2(){
        System.out.println("This is after class -2");
    }

    @BeforeMethod
    public void beforeMethodAA2(){
        System.out.println("This is before method -2");
    }

    @AfterMethod
    public void afterMethodAA2(){
        System.out.println("This is after method -2");
    }

    @Test(priority=1)
    public void testMethod1(){
        System.out.println("This is @Test first in 2 ");
    }

    @Test(priority=2)
    public void testMethod2(){
        System.out.println("This is @Test second in 2");
    }
}
