package test1;

import java.util.Scanner;

public class J09_ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����:�����·ݣ������Ӧ�ļ��ڣ�
//		1~3--����
//		4~6--�ļ�
//		7~9--�＾
//		10~12--����
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�����·�:");
		int month=sc.nextInt();
//		if (month>=1 && month<=3) {
//			System.out.println("����");
//		}else if (month>=4 && month<=6) {
//			System.out.println("�ļ�");
//		}else if (month>=7 && month<=9) {
//			System.out.println("�＾");
//		}else if (month>=10 && month<=12) {
//			System.out.println("����");
//		}else {
//			System.out.println("�������");
//		}
		
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("����");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("�ļ�");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("�＾");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("����");
			break;
		default:
			System.out.println("�������");
			break;
			
		}

	}

}
