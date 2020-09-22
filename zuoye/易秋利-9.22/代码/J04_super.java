package test5;

public class J04_super {
//	1.当父类没有无参构造时,子类这时创建不了对象,可以在子类的构造函数中使用super调用父类的构造函数
	public static class Father {
		Father(int a) {//当类中有有参构造函数,编译器不会提供无参构造
			System.out.println("Father中的构造函数");
			System.out.println("a="+a);
		}
		void test() {
			System.out.println("Father的test函数");
		}
		private int aa=20;
		
		int getAge() {
			return aa;
		}
	}
	
	public static class Son extends Father{
		Son() {//2.super必须写在子类的构造函数第一行
			super(30);//调用父类的有参构造
		}
		//3.当子类和父类有同名成员时,优先调用子类的,但可以使用super调用从父类继承过来的成员
		void test() {
			System.out.println("Son中的test函数");
		}
		
		void test01() {
			System.out.println("Son中的test01函数");
			super.test();//调用父类的同名函数
		}
		
		void test02() {
			System.err.println(super.aa);//aa是子类的,是从父类继承的
		}
		
		void setAA(int AA) {
			super.aa=AA;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		son.test();
		son.test01();
		
		//4.子类从父类继承过来的私有变量证明
		son.test02();//20
		son.setAA(100);
		son.test02();//100
		System.out.println("------------");
		
		Father f=new Father(10);
		System.out.println(f.getAge());//20

	}

}
