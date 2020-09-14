package test1;

import java.util.Scanner;

public class J07_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//案例:从控制台输入一个数据,用变量a接收,如这个变量大于10,就打印"输入的数据大于10
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数据");
		int a=sc.nextInt();
		if(a>10) {
			System.out.println("输入的数据大于10");
		}

	}

}
