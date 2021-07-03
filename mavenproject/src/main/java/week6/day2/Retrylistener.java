package week6.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
 
public class Retrylistener implements IAnnotationTransformer{
	
	Public void transform(ITestAnnotation annotation,Class TestClass, Constructor testConstructor,Method testMethod) {
	 annotation.setRetryAnalyzer(Retryfailed.class);	
		
	}

	
}
