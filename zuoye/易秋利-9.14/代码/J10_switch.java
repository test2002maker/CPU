package test1;

import java.util.Scanner;

public class J10_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����:�����������ͱ���,Ȼ��ӿ���̨��ȡһ���ַ�,�����+��ô���������������,����ʲô���žͶ�Ӧ����ʲô
//		//�ӿ���̨��ȡһ���ַ�
//		char d=scan.next().charAt(0);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ���ַ�:");
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
			System.out.println("�������");
			break;
		}
	}

}
