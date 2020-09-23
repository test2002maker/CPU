package maker6;

public class A05static {
//	案例:调用10次某个函数,函数内有一个变量是来计算该函数被调用多少次
	static int a=0;
	static void test() {
		a++;
	}
	public static void main(String[] qwe) {
		for(int i=0;i<10;i++) {
			test();
		}
		System.out.println(a);
	}

}
