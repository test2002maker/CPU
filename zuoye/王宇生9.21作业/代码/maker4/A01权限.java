package maker4;
import make.paixu;
import make.Protect;

public class A01权限 {
	public static void test01(){
		System.out.println("公有权限");
	}
	public static int add(int a,int b){
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		test01();
		
//		案例:在本文件内写一个函数,函数的权限是公有的,然后在main中使用这个函数,这个函数的功能是加法功能
		int he=add(3,5);
		System.out.println("和="+he);
//		案例:在别的文件写一个类,类里有一个方法,可以排序的,然后在本文件调用使用
		int[] arr= {23,4523,23,534,63,6,54,7,46,758,568};
		paixu.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
//		Protect.project();不可直接调用其他包内保护
//		通过调用保护类子类中的公有成员
		jicheng.test();
		
	}
	

}
