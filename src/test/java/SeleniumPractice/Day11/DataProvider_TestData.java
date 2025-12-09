package SeleniumPractice.Day11;

import org.testng.annotations.DataProvider;

public class DataProvider_TestData {

    @DataProvider(name="testdata")
    public String[][] testData_DP(){
        String[][] data = {{"user1","passwd1"},{"user2","passwd2"},{"user3","passwd3"}};

        return data;
    }
}
