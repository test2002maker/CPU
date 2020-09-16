package maker3;

public class Anli {
//	最大值
	static int getMax(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
//	最小值
	static int getMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
//	打印数组
	static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
//	案例:写2个同名的加法函数,可以传入double类型和int类型的数据
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
	
//	类变量
	String name="maker";
	int age=18;
//	修改
	void set(String a,int b) {
		name=a;
		age=b;
	}
	String get_name() {
		return name;
	}
	int get_age() {
		return age;
	}
	

	
}
