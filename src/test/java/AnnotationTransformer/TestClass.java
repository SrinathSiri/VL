package AnnotationTransformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void testMethod() {
        String actualjob = "SDET";
        String expectedjob = "Automation Engineer";
        Assert.assertEquals(actualjob, expectedjob);
    }
}
