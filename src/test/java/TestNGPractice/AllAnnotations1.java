package TestNGPractice;

import org.testng.annotations.*;

public class AllAnnotations1 {

    @BeforeSuite
    public void beforeSuiteAA1(){
        System.out.println("This is before suite");
    }

    @AfterSuite
    public void afterSuiteAA1(){
        System.out.println("This is after suite");
    }

    @BeforeClass
    public void beforeClassAA1(){
        System.out.println("This is before class -1");
    }

    @AfterClass
    public void afterClassAA1(){
        System.out.println("This is after class -1");
    }

    @BeforeTest
    public void beforeTestAA1(){
        System.out.println("This is before test");
    }

    @AfterTest
    public void afterTestAA1(){
        System.out.println("This is after test");
    }

    @BeforeMethod
    public void beforeMethodAA1(){
        System.out.println("This is before method -1");
    }

    @AfterMethod
    public void afterMethodAA1(){
        System.out.println("This is after method -1");
    }

    @Test(priority = 1)
    public void testMethod1(){
        System.out.println("This is @Test first in 1 ");
    }

    @Test(priority=2)
    public void testMethod2(){
        System.out.println("This is @Test second in 1");
    }


}
