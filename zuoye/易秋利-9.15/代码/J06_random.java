package test2;

import java.util.Random;

public class J06_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����
		//��ʽһ
		for(int i=0;i<10;i++) {
			int a=(int)(Math.random()*100);
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//��ʽ��
		Random r=new Random();
		for (int i=0;i<10;i++) {
			int b=r.nextInt(10);
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//math��ѧ��
		System.out.println(Math.pow(2, 3));//�η� double
		System.out.println(Math.sqrt(16));//��ƽ��(����) double
		System.out.println(Math.abs(-19));//����ֵ

	}

}
