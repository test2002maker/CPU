package maker5;

public class A04继承 {
	public static class Father{
//		Father(){
//			System.out.println("我是father中的无参构造函数");
//		}
//		Father(int a){
//			System.out.println("我是father中的有参构造函数");
//		}
		void test() {
			System.out.println("我是father中的test函数");
		}
		void test02() {
			System.out.println("我是father中的test02函数");
		}
		private int a=30;
		public int getA() {
			return a;
		}
	}
	
	public static class Son extends Father {
		Son(){
			super();//Father中没有无参构造时使用；
			System.out.println("我是son中的无参构造函数");
		}
		void test() {
			super.test();
			System.out.println("我是son中的test函数");
		}
		void test02() {
			System.out.println("我是son中的test02函数");
		}
		void test03() {
			System.out.println(super.getA());
		}
		int setA(int b) {
			super.a=b;
			return super.a;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Son son=new Son();
		son.test();
		son.test02();
		son.test03();
		son.setA(200);
		son.test03();
		
		Father f=new Father();
		System.out.println(f.getA());//20

	}

}
