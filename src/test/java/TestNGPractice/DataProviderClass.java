package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @Test(dataProvider="getTestData")
    public void usernamepassword(String username, String password){
        System.out.println("Username is : "+username+" Password is : "+password);
    }

    @DataProvider(name="getTestData")
    public String[][] data(){
        String[][] data1 = {
                {"SRINATH","IT Employee"},
                {"YADAGIRI","Business"},
                {"PAVAN","Technical SDET"}};
        return data1;
    }
}
