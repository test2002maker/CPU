package d3;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class q {
//		myprint1("hello");
//		myprint2();
//		System.out.println(test01());
//		System.out.println(add(30,40));
//		add(20.22, 30.33);
//最大值		
	static int getMax(int[] arr) {
			int max=0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
			}
//最小值
	static int getMin(int[] arr) {
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}	
			}
		return min;
		}
	
	static int add(int c,int d) {
		return c+d;
	}
	static double add(double c,double d) {
		return c+d;
	}
	
	static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		}
	static class Maker{
		int a=10;
		int b=20;
	}
	String name = "maker";
	int age=18;
	void set(String a,int b) {
		if(a!="*") {
			name=a;	
		}
		if (b!=00) {
			age=b;
		}
	}
	static String get_name(){
		q s = new q();
		if(b1=="name") {
		return a.name();
	}
	}
	public static void main(String[] args) {
		
		Maker maker=new Maker();
		System.out.println(maker.a);
		System.out.println(maker.b);
	}
}
	





