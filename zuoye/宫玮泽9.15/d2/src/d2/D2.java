package d2;
import java.awt.print.Printable;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntConsumer;

import javax.print.DocFlavor.CHAR_ARRAY;

public class D2 {
	public static void main(String[] args) {
//		float a=0;
//		int b=0;
//		while (a<100) {
//			a+=2.5;
//			b++;
//			if(b%5==0) {
//				a=a-6;
//			}
//		}
//		System.out.print(b);
//		int a=0;
//		do {
//			if(a%2==1) {
//			System.out.println(a);
//			}
//			a++;
//		}while(a<=100);	
//		
//		int a=0;
//		do {
//			int b=0;
//			while (b<=a) {	
//				System.out.print("* ");
//				b++;
//			}
//			a++;
//			System.out.println("");
//		} while (a<5);
//		Scanner scan = new Scanner(System.in);
//		System.out.println("����");
//		int a = scan.nextInt();
//		int sum=0;
//		for(int b=a;b>0;b--) {
//			sum+=b;
//		}
//		System.out.println(sum);
//		Scanner scan = new Scanner(System.in);
//		System.out.println("����");
//		int a = scan.nextInt();
//		int sum=1;
//		for(int b=a;b>0;b--) {
//			sum=sum*b;
//		}
//		System.out.println(sum);
//		for(int i=1;i<10;i++) {
//			for(int j=1;j<=i;j++) {
//				int p=j*i;
//				System.out.print(j+"*"+i+"="+p+"\t");
//			}
//			System.out.println();
//		}
		
//		int a=1;
//		while (true) {
//			a+=1;
//			if(a==6) {
//				break;
//			}
//			System.out.println(a);
//		}
//		for (int i = 0; i < 10; i++) {
//			if (i==6) {
//			break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("------------");
//		int b=0;
//		while (true) {
//			while (true) {
//				b+=1;
//				if (b==6) {
//					break;
//				}
//			}
//		System.out.println(b);	
//		break;
//		}
//		System.out.println("--------");
//		aa:for (int i = 1; i < 3; i++) {
//			for (int j = 1; j < args.length; j++) {
//				if (j%2==0) {
//					
//				}
//			};
			
//		}
		//���������һ
//		for(int i=0;i<10;i++) {
//			int a=(int)(Math.random()*100);
//		}
//		System.out.println(a);
		//�����������
//		Random r = new Random();
//		for (int i = 0; i < 10; i++) {
//			int a = r.nextInt(100);
//			System.out.print(a+" ");
//		}
//		System.out.println("-----------");
		//math��ѧ��
//		System.out.println(Math.pow(3, 2));//ƽ��
//		System.out.println(Math.sqrt(9));//������
//		System.out.println(Math.abs(-3));//����ֵ
//		int a=5;
////		int[] arr=new int[5];
//		int[] arr=new int[a];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		arr[5]=60;
//		for (int i = 0; i < 5; i++) {
//			arr[i]=(i+1)*10;
//			System.out.println(arr[i]);
//		}
////		
//		int[] arr=new int[8];
//		for (int i=0;i<8;i++) {
//			arr[i]=(int)(Math.random()*100);
//		}
//		for (int i = 9; i > 0; i--) {
//			System.out.println(arr[i]);		
//		}
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int c = a.length();
		char[] arr=new char[c];
		for(int i=0;i<c;i++) {
			arr[i]=a.charAt(i);
		}
		
		System.out.println(arr);
		
		
	}
}
