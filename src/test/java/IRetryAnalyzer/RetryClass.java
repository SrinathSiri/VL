package IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {

    private int initialcount = 0;
    private static final int retrycount= 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(initialcount<retrycount){
            initialcount++;
            return true; // retry
        }

        return false; // no retry
    }
}
