package junittest;

import junit.framework.TestCase;

public class junittest extends TestCase{
	protected int m,n;
	protected void setUp(){
		m=3;
		n=4;
		System.out.println("测试之前调用");
	}
	public void testadd(){
		double a=m+n;
		assertTrue(a==7);
	}
	public void tearDown(){
		System.out.println("测试之后调用");
	}

}
