package test1;

import java.util.Scanner;

public class J10_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:定义两个整型变量,然后从控制台获取一个字符,如果是+那么这两个变量就相加,输入什么符号就对应运算什么
//		//从控制台获取一个字符
//		char d=scan.next().charAt(0);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个字符:");
		char c=sc.next().charAt(0);
		int a=10;
		int b=8;
		switch (c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;

		default:
			System.out.println("输入错误");
			break;
		}
	}

}
