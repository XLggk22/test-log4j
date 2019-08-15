package my.test.log.log.test.log4j;

import java.lang.reflect.ParameterizedType;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App implements TestClassInfo<TestClass1,TestClass2>{
	public static void main(String[] args) {
	}
	
	@Test
	public void getClassInfo(){
		System.out.println(getClass().getGenericSuperclass());
	}
}
