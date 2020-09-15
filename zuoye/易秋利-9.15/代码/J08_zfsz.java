package test2;

import java.util.Scanner;

public class J08_zfsz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//字符数组
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
//		System.out.println(myarr);//1.字符数组可以直接打印.
//		
//		String string="abcde";
//		System.out.println(string);
//		for(int i=0;i<string.length();i++) {//2.字符串.length()可以获取字符串的长度
//			System.out.println(string.charAt(i));// 3.string.charAt(i)获取字符串中某个字符
//		}
//		for(char i:string) {//报错
//			
//		}
		
//		案例:从控制台输入字符串,然后把字符串中的字符存储到字符数组中,然后打印出来
//		1.str.charAt(i);可以返回字符串中的字符,str是字符串
//		2.str.length();可以返回字符串的长度,str是字符串
		
		char[] arr=new char[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个字符串:");
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
