package test2;

import java.util.Scanner;

public class J03_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和
		//5
		//0 1 2 3 4 5
		//15
		
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个整数:");
		int a=sc.nextInt();
		int sum1=0;
		for (int i = 0; i <= a; i++) {
			System.out.print(i+" ");
			sum1+=i;
		}
		System.out.print("\n");
		System.out.println(sum1);
		System.out.println("----------------------------");
		
		
		
//		案例:n的阶乘，从外部键盘输入一个数字n
//		5
//		5*24=120
//		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数字:");
		int b=sc.nextInt();
		int sum2=1;
		for (int i = 1; i <= b; i++) {
			sum2*=i;	
		}
		System.out.println(sum2);
		

	}

}
