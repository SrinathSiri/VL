package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteParameter {

    @Parameters({"username","password"})
    @Test
    public void suiteParameter(String username1,String password1){
        System.out.println("Username is : "+username1);
        System.out.println("Password is : "+password1);
    }
}
