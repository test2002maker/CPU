package maker1;

public class A05运算符 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
//		算术运算符
		int a=40;
		int b=20;
		int c=a+b;
		int c1=a-b;
		int c2=a*b;
		int c3=a/b;
		int c4=a%b;
		c4++;
		--c4;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
//		赋值运算符
		int x=10;
		x+=35;
		x-=2;
		x*=4;
		x/=6;
		x%=7;
		System.out.println(x);
		
//		比较运算符
		int y=30;
		int z=20;
		System.out.println(y==z);
		System.out.println(y>=z);
		System.out.println(y<=z);
		System.out.println(y<z);
		System.out.println(y>z);
		System.out.println(y!=z);
		
//		逻辑运算符
		boolean d=true;
		boolean f=false;
		System.out.println(d&f);
		System.out.println(d&&f);
		System.out.println(d|f);
		System.out.println(d||f);
		System.out.println(d^f);
		System.out.println(!f);
		
//		逻辑位运算
		int h=20;//0001 0100
		int j=30;//0001 1110
		System.out.println(h&j);
		System.out.println(h|j);
		System.out.println(h^j);//异或相等为0，不等为1;
		
//		instanceof用来判断一个实例是否的哪个对象生成的
		System.out.println("ewr" instanceof String);//t
		
		
	}

}
