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
//		//不能使用未赋值的变量
//		int c;
//		int cc=c;
//		System.out.println(c);//报错
//		int d1=20,d2=30,d3=40;
//		System.out.println("d1="+d1+"d2="+d2+"d3="+d3);
//		
//		//整形byte,//-128到127
//		byte a3=20;
//		byte a4=200;//报错
//		//整形short
//		short b=5000;
//		short b1=50000;//报错
//		//整形int(常用)
//		int c=234234;
//		//长整型
//		long d=234243244;
//		//浮点型,单精度
//		float f=20.222222222f;
//		//浮点型,双精度(常用)
//		double d1=20.22222222;
//		System.out.println(f);
//		System.out.println(d1);	
//		
//		//字符型(常用)
//		char g='a';
//		//布尔型(常用)
//		boolean bo=true;
//		boolean bo1=1;//不能赋值数字给boolean类型的变量
//		
//		//字符串,字符串是类(常用)
//		String name="maker";
//		System.out.println(name);
//		
//		
//		//1.算术运算符
//		int a=10;
//		int b=20;
//		int c=a+b;
//		int c1=a-b;
//		int c2=a*b;
//		int c3=a/b;
//		int c4=a%b;//余的10
//		c4++;
//		--c4;
//		System.out.println(c);//30
//		System.out.println(c1);//-10
//		System.out.println(c2);//200
//		System.out.println(c3);//0
//		System.out.println(c4);//10
//		
//		//赋值运算符
//		int x=10;
//		x+=1;//11
//		x-=2;//9
//		x*=10;//90
//		x/=2;//45
//		x%=2;//1
//		System.out.println(x);//1
//		
//		//比较运算符
//		int y=20;
//		int z=10;
//		System.out.println(y==z);//f
//		System.out.println(y>z);//t
//		System.out.println(y<z);//f
//		System.out.println(y!=z);//t
//		System.out.println(y>=z);//t
//		System.out.println(y<=z);//f
//		//instanceof用来判断一个实例是否的哪个对象生成的
//		System.out.println("hello" instanceof String);//t
//		System.out.println("---------------");
//		//逻辑运算符
//		boolean k=true;
//		boolean kk=false;
//		System.out.println(k&&kk);//f
//		System.out.println(k&kk);//f 与   可以位运算(二进制)
//		System.out.println(k|kk);//t 或  可以位运算(二进制)
//		System.out.println(k||kk);//t
//		System.out.println(k^kk);//t 异或  相等为0,不等为1
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
//		String string1 = scan.next();//不管回车
//		System.out.println(string1);
//		String string2 = scan.nextLine();//回车会被收入
//		System.out.println(string2);
//		System.out.println("函数结束");

//		int a=10;
//		int b=20;
//		int c=a>b?a:b;//为真返回a,为假返回b
//		System.out.println(c);

//		Scanner scan = new Scanner(System.in);
//		System.out.print("输入三个数");
//		int p = scan.nextInt();
//		int q = scan.nextInt();
//		int w = scan.nextInt();
//		int e = p>q?(p>w?p:w):(q>w?q:w);
//		System.out.print(e);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("输入");
//		int a = scan.nextInt();
//		if(a>10) {
//		System.out.print("输入的数据大于10");
//			
//		Scanner scan = new Scanner(System.in);
//		System.out.print("输入三个数");
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
//		System.out.println("输入月份");
//		int a = scan.nextInt();
//		if(1<=a&3>=a) {
//			System.out.print("春季");
//		}else if(4<=a&6>=a){
//			System.out.print("夏季");
//		}else if(7<=a&9>=a) {
//			System.out.print("秋季");
//		}else if(10<=a&12>=a) {
//			System.out.print("冬季");
//		}else {
//			System.out.print("输入错误");
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
		System.out.println("输入数字:");
		int a = scan.nextInt();
		if(a>q) {
		System.out.print("输入的数字大了");
		}else if (a<q) {
		System.out.print("输入的数字小了");
		}else {
		System.out.println("正确");
		}
		
		}
		
	}


