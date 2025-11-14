package IRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Job1Class {
    @Test
    public void m3() {
        String actor1 = "Hero";
        String actor2 = "Villain";
        Assert.assertEquals(actor1,actor2);
    }
}
