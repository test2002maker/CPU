package junittest;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class apptestjunit1 extends TestCase{
	@Test
	public void testAdd(){
		System.out.println("我是B02TestJunit1");
		int num=5;
		String tmp="hello";
		String str="test ceshi";
		
		//检测是否相等
		assertEquals("test ceshi",str);
		
		//检测是否为假
		assertFalse(num>6);
		
		//检测对象是否不为空
		assertNotNull(tmp);
		
	}
}