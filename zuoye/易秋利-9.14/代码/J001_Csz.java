package test1;

import java.util.Scanner;

public class J001_Csz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		/*
		 * ������,���趨һ������,Ȼ��ӿ���̨����һ������,������趨�����ִ�,��ʾ����������ִ���,
		 * ������������С��,��ʾ�����������С��,���������ȷ,��ʾ�����������ȷ
		 */
		int a=49;
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("����һ������");
			int b=sc.nextInt();
			if (a>b) {
				System.out.println("����С��");
			}else if (a<b) {
				System.out.println("���ִ���");
			}else if (a==b) {
				System.out.println("������ȷ");
				break;
			}else {
				System.out.println("�������");
			}
			
		}
		
		 
	}

}
