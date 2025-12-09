package SeleniumPractice.Day11;

import org.testng.annotations.Test;

public class DataProvider_Example {

    @Test(dataProvider="testdata", dataProviderClass= DataProvider_TestData.class)
    public void exampleMethod(String username,String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
