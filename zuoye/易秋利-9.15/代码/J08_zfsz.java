package test2;

import java.util.Scanner;

public class J08_zfsz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ַ�����
//		int[] arr=new int[5];
//		for(int i=0;i<5;i++) {
//			arr[i]=i;
//		}
//		System.out.println(arr);
//		
//		char[] myarr=new char[5];
//		for(int i=0;i<5;i++) {
//			myarr[i]='a';
//		}
//		
//		System.out.println(myarr);//1.�ַ��������ֱ�Ӵ�ӡ.
//		
//		String string="abcde";
//		System.out.println(string);
//		for(int i=0;i<string.length();i++) {//2.�ַ���.length()���Ի�ȡ�ַ����ĳ���
//			System.out.println(string.charAt(i));// 3.string.charAt(i)��ȡ�ַ�����ĳ���ַ�
//		}
//		for(char i:string) {//����
//			
//		}
		
//		����:�ӿ���̨�����ַ���,Ȼ����ַ����е��ַ��洢���ַ�������,Ȼ���ӡ����
//		1.str.charAt(i);���Է����ַ����е��ַ�,str���ַ���
//		2.str.length();���Է����ַ����ĳ���,str���ַ���
		
		char[] arr=new char[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ���ַ���:");
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			arr[i]=c;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(arr);
		

	}

}
