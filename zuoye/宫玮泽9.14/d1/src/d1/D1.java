package d1;

import java.awt.print.Printable;
import java.util.Scanner;

public class D1 {
	public static void main(String[] args) {
//		int a;
//		a=10;
//		int a1=10;
//		System.out.println("a="+a);
//		System.out.println("a1="+a1);
//		int b1,b2,b3;
//		b1=10;
//		b2=20;
//		b3=30;
//		System.out.printf("b1=%d"+"b2=%d"+"b3=%d\n",b1,b2,b3);
//		//����ʹ��δ��ֵ�ı���
//		int c;
//		int cc=c;
//		System.out.println(c);//����
//		int d1=20,d2=30,d3=40;
//		System.out.println("d1="+d1+"d2="+d2+"d3="+d3);
//		
//		//����byte,//-128��127
//		byte a3=20;
//		byte a4=200;//����
//		//����short
//		short b=5000;
//		short b1=50000;//����
//		//����int(����)
//		int c=234234;
//		//������
//		long d=234243244;
//		//������,������
//		float f=20.222222222f;
//		//������,˫����(����)
//		double d1=20.22222222;
//		System.out.println(f);
//		System.out.println(d1);	
//		
//		//�ַ���(����)
//		char g='a';
//		//������(����)
//		boolean bo=true;
//		boolean bo1=1;//���ܸ�ֵ���ָ�boolean���͵ı���
//		
//		//�ַ���,�ַ�������(����)
//		String name="maker";
//		System.out.println(name);
//		
//		
//		//1.���������
//		int a=10;
//		int b=20;
//		int c=a+b;
//		int c1=a-b;
//		int c2=a*b;
//		int c3=a/b;
//		int c4=a%b;//���10
//		c4++;
//		--c4;
//		System.out.println(c);//30
//		System.out.println(c1);//-10
//		System.out.println(c2);//200
//		System.out.println(c3);//0
//		System.out.println(c4);//10
//		
//		//��ֵ�����
//		int x=10;
//		x+=1;//11
//		x-=2;//9
//		x*=10;//90
//		x/=2;//45
//		x%=2;//1
//		System.out.println(x);//1
//		
//		//�Ƚ������
//		int y=20;
//		int z=10;
//		System.out.println(y==z);//f
//		System.out.println(y>z);//t
//		System.out.println(y<z);//f
//		System.out.println(y!=z);//t
//		System.out.println(y>=z);//t
//		System.out.println(y<=z);//f
//		//instanceof�����ж�һ��ʵ���Ƿ���ĸ��������ɵ�
//		System.out.println("hello" instanceof String);//t
//		System.out.println("---------------");
//		//�߼������
//		boolean k=true;
//		boolean kk=false;
//		System.out.println(k&&kk);//f
//		System.out.println(k&kk);//f ��   ����λ����(������)
//		System.out.println(k|kk);//t ��  ����λ����(������)
//		System.out.println(k||kk);//t
//		System.out.println(k^kk);//t ���  ���Ϊ0,����Ϊ1
//		System.out.println(!kk);//t
		
//		int a1=10;
//		int b1=8;
//		/*
//		 * 0000 1010
//		 * 0000 1000
//		 * 0000 1000
//		 * 
//		 */
//		int d1=a1&b1;
//		System.out.println(d1);
//		
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		System.out.println(i);
//		float f = scan.nextFloat();
//		float f1=20.22f;
//		System.out.println(f);
//		String string1 = scan.next();//���ܻس�
//		System.out.println(string1);
//		String string2 = scan.nextLine();//�س��ᱻ����
//		System.out.println(string2);
//		System.out.println("��������");

//		int a=10;
//		int b=20;
//		int c=a>b?a:b;//Ϊ�淵��a,Ϊ�ٷ���b
//		System.out.println(c);

//		Scanner scan = new Scanner(System.in);
//		System.out.print("����������");
//		int p = scan.nextInt();
//		int q = scan.nextInt();
//		int w = scan.nextInt();
//		int e = p>q?(p>w?p:w):(q>w?q:w);
//		System.out.print(e);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("����");
//		int a = scan.nextInt();
//		if(a>10) {
//		System.out.print("��������ݴ���10");
//			
//		Scanner scan = new Scanner(System.in);
//		System.out.print("����������");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		if(a>b) {
//			if(c>a) {
//				System.out.print(c);
//			}else {
//				System.out.print(a);
//			}
//		}else {
//			if(c>b) {
//				System.out.print(c);
//			}else {
//				System.out.print(b);
//			}
//			
//		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�����·�");
//		int a = scan.nextInt();
//		if(1<=a&3>=a) {
//			System.out.print("����");
//		}else if(4<=a&6>=a){
//			System.out.print("�ļ�");
//		}else if(7<=a&9>=a) {
//			System.out.print("�＾");
//		}else if(10<=a&12>=a) {
//			System.out.print("����");
//		}else {
//			System.out.print("�������");
//		}
		
//		int a = 19;
//		int b = 20;
//		Scanner scan = new Scanner(System.in);
//		char d=scan.next().charAt(0);
//		switch (d) {
//		case '+':
//			System.out.print(a+b);
//			break;
//		case '-':
//			System.out.print(a-b);
//			break;
//		case '*':
//			System.out.print(a*b);
//			break;
//		case '/':
//			System.out.print(a/b);
//			break;
//		default:
//			break;
		Scanner scan = new Scanner(System.in);
		int q=66;
		System.out.println("��������:");
		int a = scan.nextInt();
		if(a>q) {
		System.out.print("��������ִ���");
		}else if (a<q) {
		System.out.print("���������С��");
		}else {
		System.out.println("��ȷ");
		}
		
		}
		
	}


