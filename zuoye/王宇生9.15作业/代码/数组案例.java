package maker2;
public class 数组案例 {

	public static void main(String[] args) {
//		案例:定义一个整型数数组,然后赋予数据,然后逆序打印
		int[] arr1=new int[10];
//		数组赋值
		for(int i=0;i<10;i++) {
			arr1[i]=(int)(Math.random()*100);
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		System.out.println("*********************");
		
//		逆序输出
		for(int i=0;i<(arr1.length/2);i++) {
			int q=arr1[i];
			int p=arr1[arr1.length-1-i];
			arr1[i]=p;
			arr1[9-i]=q;
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		
		System.out.println("");
		System.out.println("*********************");

//		大小排序
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					int m=arr1[i];
					int n=arr1[j];
					arr1[i]=n;
					arr1[j]=m;
				}
			}
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("*********************");
		
		
//		案例:求一维数组的最值
		int[] arr2=new int[10];
		for(int i=0;i<10;i++) {
			arr2[i]=(int)(Math.random()*100);
		}
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		int m=0;
		int n=999999;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>m) {
				m=arr2[i];
			}
			if(arr2[i]<n) {
				n=arr2[i];
			}
		}
		System.out.println("最大值为："+m);
		System.out.println("最小值为："+n);

		
	}

}
