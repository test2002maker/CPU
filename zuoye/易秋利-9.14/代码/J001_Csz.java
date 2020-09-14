package test1;

import java.util.Scanner;

public class J001_Csz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//猜数字
		/*
		 * 猜数字,先设定一个数字,然后从控制台输入一个数字,如果比设定的数字大,提示你输入的数字大了,
		 * 如果输入的数字小了,显示你输入的数字小了,如果输入正确,显示输入的数字正确
		 */
		int a=49;
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("输入一个数字");
			int b=sc.nextInt();
			if (a>b) {
				System.out.println("数字小了");
			}else if (a<b) {
				System.out.println("数字大了");
			}else if (a==b) {
				System.out.println("数字正确");
				break;
			}else {
				System.out.println("输入错误");
			}
			
		}
		
		 
	}

}
