package d4;
import bb02.BB02保护;

public class A03保护权限 {
	protected static void test() {
		System.out.println("我是保护权限的test");
		
	}
	protected static int a=10;
		
	public static void main(String[] args) {
		//1.调用本文件的保护成员
		B02保护 m=new B02保护();
		m.test02();
		System.out.println(m.b);
		//3.调用另一个包中的类里的保护成员
		BB02保护 m2 = new BB02保护();
		//m2.tset02();//不能直接访问另一个包类的保护成员
		//System.out.println(m2.myb);
		//不能直接访问另一个包中类的保护成员
		//可以间接的调用该类的公有成员来调用保护成员
		m2.test003();
	System.out.println(m2.getMyb());
	//4.通过调用BB02保护类的子类中的公有成员来间接调用BB02保护类中的保护成员
		aa m3 = new aa();
		m3.test022();
	}
}
