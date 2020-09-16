package maker3;

public class A03方法 {

	public static void main(String[] args) {
//		hah();
//		gag("rihguirg");
//		System.out.println(heh());
//		int h=Bbb类.huh(3, 4);
//		System.out.println(h);
		int[] arr= {34,5,346,34,6,54,74,7,45,76,3474,6346,3632};
		int a=Anli.getMax(arr);
		int b=Anli.getMin(arr);
		Anli.printArr(arr);
		System.out.println("最大值为："+a);
		System.out.println("最小值为："+b);
		System.out.println(Anli.add(26.435, 546.435));
		

	}
	
	static void hah() {
		System.out.println("greuiguaufd");
	}
	static void gag(String str) {
		System.out.println(str);
	}
	static int heh() {
		int a=10;
		int b=20;
		return a+b;
	}

	
}
