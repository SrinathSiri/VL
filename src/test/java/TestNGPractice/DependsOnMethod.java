package TestNGPractice;

import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void login(){
        System.out.println("EE login Successfully");
    }

    @Test(dependsOnMethods="login")
    public void homepage(){
        System.out.println("EE able to retrieve homepage url successfully");
    }
}
