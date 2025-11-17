package AnnotationTransformer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SkipTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        String ecmethodname = testMethod.getName();
        for (int i=40;i<=50;i++){ // Skip test cases from 40 to 50
            if(ecmethodname.equals("testcase"+i)){
                annotation.setEnabled(false); // Disable the test
            }
        }


    }
}
