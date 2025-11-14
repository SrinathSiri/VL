package IRetryAnalyzer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Retrylistener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        // Check if the test method does not already have a retry analyzer
        /*if (annotation.getRetryAnalyzerClass() == null) {
            // If not, set our custom retry analyzer
            annotation.setRetryAnalyzer(RetryClass.class);
            System.out.println("RetryListener applied to: " + testMethod.getName());
        }*/

        annotation.setRetryAnalyzer(RetryClass.class);
        System.out.println("RetryListener applied to: " + testMethod.getName());
    }
}
