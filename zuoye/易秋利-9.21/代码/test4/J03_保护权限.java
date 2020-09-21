package test4;

import test.J0031_保护权限;
import test.J003_保护权限;

public class J03_保护权限 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在本文件
		pro();
		System.out.println(a);
		
		//在同包中
		J003_保护 b=new J003_保护();
		b.test02();
		
		//在不同包中,通过中间函数
		J003_保护权限 s=new J003_保护权限();
		s.ttt();
		System.out.println(s.ttt1());
		
		//不同包中,通过继承
		J0031_保护权限 s1=new J0031_保护权限();
		s1.fun();

	}
	
	protected static void pro() {
		System.out.println("保护权限1,同文件中");
	}
	
	protected static int a=10;
}
