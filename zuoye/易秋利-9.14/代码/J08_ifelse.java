package test1;

import java.util.Scanner;

public class J08_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("�����Ϊ"+a);
			}else {
				System.out.println("�����Ϊ"+c);
			}
		}else {
			if (b>c) {
				System.out.println("�����Ϊ"+b);
			}else {
				System.out.println("�����Ϊ"+c);
			}
		}
		
	}

}
