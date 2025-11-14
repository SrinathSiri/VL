package IRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NameClass {

    // Suresh SDET Automation Video reference
    // Server down,network issue,Application down issue -> flaky test case

    @Test(retryAnalyzer = RetryClass.class)
    public void namemethod(){
        String Actual = "SRINATH";
        String Expected = "PAVAN";
        Assert.assertEquals(Actual,Expected);
    }

}
