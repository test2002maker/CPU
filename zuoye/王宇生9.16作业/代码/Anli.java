package maker3;

public class Anli {
//	���ֵ
	static int getMax(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
//	��Сֵ
	static int getMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
//	��ӡ����
	static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
//	����:д2��ͬ���ļӷ�����,���Դ���double���ͺ�int���͵�����
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
	
//	�����
	String name="maker";
	int age=18;
//	�޸�
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
