package test1;

import java.util.Scanner;

public class J06_Smysf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ŀ�����
		//��ʽ:���ʽ?����1:����2
		
		//����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������������:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
//		int x=a>b?a:b;
//		int y=x>c?x:c;
//		System.out.println("���������Ϊ:"+y);
		System.out.println("���������Ϊ:"+(a>b?(a>c?a:c):(b>c?b:c)));
		
	}

}
