package d6;

public class �ؼ��� {
	final static class Father{
		int a=20;
		void test() {
			System.out.println("����father�е�test");
		}
	}
	public static class Father1{
		int b=20;
		void test1() {
			System.out.println("����father1�е�test1");
		}
	}
	public static class Son extends Father1{
			
	}
	public static void main(String[] args) {
		Son son=new Son();
		System.out.println("b="+son.b);
		son.test1();
		son.b=2000;
		System.out.println("b="+son.b);
	}
	

}
