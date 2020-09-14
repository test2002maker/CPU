package test1;

public class J04_Yunsuanfu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.算术运算符
		int a=10;
		int b=20;
		int c=a+b;
		int c1=a-b;
		int c2=a*b;
		int c3=a/b;
		int c4=a%b;
		int c5=++c4;
		int c6=--c4;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println("------------------------");
		
		//2.赋值运算符
		int f=10;
		System.out.println(f+=3);
		System.out.println(f-=9);
		System.out.println(f*=30);
		System.out.println(f/=2);
		System.out.println(f%=2);
		System.out.println("------------------------");
		
		//3.比较运算符
		int x=10;
		int y=2;
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println("------------------------");
		
		//4.逻辑运算符
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&b2);//按位与
		System.out.println(b1&&b2);//逻辑与
		System.out.println(b1|b2);
		System.out.println(b1||b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		System.out.println("------------------------");
		
		int d=10;
		int d1=2;
		System.out.println(d&d1);
		System.out.println(d|d1);
		System.out.println(d^d1);
	}

}
