package test1;

import java.util.Scanner;

public class J06_Smysf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//三目运算符
		//格式:表达式?参数1:参数2
		
		//案例:从控制台输入三次整数,然后打印出最大的数值
		Scanner sc=new Scanner(System.in);
		
		System.out.println("输入三个整数:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
//		int x=a>b?a:b;
//		int y=x>c?x:c;
//		System.out.println("输入最大数为:"+y);
		System.out.println("输入最大数为:"+(a>b?(a>c?a:c):(b>c?b:c)));
		
	}

}
