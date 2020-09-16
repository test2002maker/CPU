package test2;

import java.util.Random;

public class J06_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//随机数
		//方式一
		for(int i=0;i<10;i++) {
			int a=(int)(Math.random()*100);
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//方式二
		Random r=new Random();
		for (int i=0;i<10;i++) {
			int b=r.nextInt(10);
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//math数学类
		System.out.println(Math.pow(2, 3));//次方 double
		System.out.println(Math.sqrt(16));//开平方(根号) double
		System.out.println(Math.abs(-19));//绝对值

	}

}
