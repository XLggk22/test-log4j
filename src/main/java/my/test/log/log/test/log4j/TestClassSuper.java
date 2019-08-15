package my.test.log.log.test.log4j;

import org.junit.Test;

public abstract class TestClassSuper {

	@Test
	public void getClassInfo(){
		System.out.println(getClass().getGenericSuperclass());
	}
}
