package test4;

public class J02_公有权限 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:在本文件内写一个函数,函数的权限是公有的,然后在main中使用这个函数,这个函数的功能是加法功能
		add(10, 20);
//		案例:在别的文件写一个类,类里有一个方法,可以排序的,然后在本文件调用使用
		int[] arr= {1,5,3,7,4,7,4,8};
		J002_公有 a =new J002_公有();
		a.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}

}
