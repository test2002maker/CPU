package junittest;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class apptestjunit1 extends TestCase{
	@Test
	public void testAdd(){
		System.out.println("����B02TestJunit1");
		int num=5;
		String tmp="hello";
		String str="test ceshi";
		
		//����Ƿ����
		assertEquals("test ceshi",str);
		
		//����Ƿ�Ϊ��
		assertFalse(num>6);
		
		//�������Ƿ�Ϊ��
		assertNotNull(tmp);
		
	}
}