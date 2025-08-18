package TestNGPractice;

import org.testng.annotations.Test;

public class GroupEx1 {
    @Test(groups = {"smoke"})
    public void smoke(){
        System.out.println("Smoke Testing");
    }

    @Test(groups = {"regression"})
    public void regression(){
        System.out.println("Regression Testing");
    }

    @Test(groups = {"sanity"})
    public void sanity(){
        System.out.println("Sanity Testing");
    }
}
