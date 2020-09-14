package test1;

import java.util.Scanner;

public class J08_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:从控制台输入三次整数,然后打印出最大的数值
		Scanner sc=new Scanner(System.in);
		System.out.println("输入三个整数");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("最大数为"+a);
			}else {
				System.out.println("最大数为"+c);
			}
		}else {
			if (b>c) {
				System.out.println("最大数为"+b);
			}else {
				System.out.println("最大数为"+c);
			}
		}
		
	}

}
