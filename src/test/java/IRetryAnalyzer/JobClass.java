package IRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JobClass {
    @Test
    public void m1() {
        String actual = "Analyst";
        String expected = "Lead Analyst";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void m2() {
        String job1 = "Developer";
        String job2 = "Tester";
        Assert.assertEquals(job1,job2);
    }
}
