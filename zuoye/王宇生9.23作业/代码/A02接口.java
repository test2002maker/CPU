package maker6;

public class A02接口 {
	interface Jk1{
		int a=30;
		void test00();
		void test01();
		void test02();
		void test03();
	}
	interface Jk2{
		int b=30;
		void test04();
		void test05();
		void test06();
		void test07();
	}
	
	public static class FF1 implements Jk1,Jk2{
		public void test00() {
			System.out.println("我是接口1中的test00");
		}
		public void test04() {
			System.out.println("我是接口2中的test04");
		}
		public void test03() {
			System.out.println("我是接口1中的test03");
		}
		public void test01() {
			System.out.println("我是接口1中的test01");
		}
		public void test05() {
			System.out.println("我是接口2中的test05");
		}
		public void test07() {
			System.out.println("我是接口2中的test07");
		}
		public void test02() {
			System.out.println("我是接口1中的test02");
		}
		public void test06() {
			System.out.println("我是接口2中的test06");
		}
	
	}
	
	public static void main(String[] qwe) {
		FF1 f= new FF1();
		f.test00();
		f.test01();
		f.test02();
		f.test03();
		f.test04();
		f.test05();
		f.test06();
		f.test07();
		System.out.println(f.a);
		System.out.println(f.b);
		
	}

}
