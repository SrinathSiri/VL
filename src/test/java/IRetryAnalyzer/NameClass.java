package IRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NameClass {
    @Test(retryAnalyzer = RetryClass.class)
    public void namemethod(){
        String Actual = "SRINATH";
        String Expected = "SIRIMALLA";
        Assert.assertEquals(Actual,Expected);
    }

}
