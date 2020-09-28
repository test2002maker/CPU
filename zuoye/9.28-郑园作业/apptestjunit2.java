package junittest;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class apptestjunit2 extends TestCase{
	protected double v1;
	protected double v2;
	
	//��������֮ǰ���õĺ���
	@Before
	public void setUp(){
		v1=5.0;
		v2=8.0;
	}
	
	@Test
	public void testAdd(){
		
		//��ȡ��run�Ĵ���
		System.out.println("�����õĴ���:"+this.countTestCases());
		
		//��ȡTestCase������,Ĭ���Ǻ�����
		String name=this.getName();
		System.out.println("name="+name);
		
		//�趨TestCase������
		this.setName("testNewAdd");
		String name2=this.getName();
		System.out.println("name2="+name2);
		
		
	}
	
	public void tearDown(){
		System.out.println("�������������"+(v1+v2));
	}
}

