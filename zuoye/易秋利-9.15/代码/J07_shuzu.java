package test2;

public class J07_shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组
//		int a=5;
////		int arr[]=new int[a];
//		int arr1[]=new int[5];
//		arr1[0]=1;
//		arr1[1]=2;
//		arr1[2]=3;
//		arr1[3]=4;
//		arr1[4]=5;
//		for(int i=0;i<5;i++) {
//			arr1[i]=(i+1)*10;
//			System.out.println(arr1[i]);
//		}
//		System.out.println("------------");
//		
//		//定义数组
//		int[] arr2=null;
//		arr2=new int[2];
//		arr2[0]=11;
//		arr2[1]=21;
//		//打印数组
//		for(int i:arr2) {
//			System.out.println(i);
//		}
//		System.out.println("------------");
//		
//		//定义数组并初始化
//		int arr3[]= {1,2,3,4,5,6,3,2,6};
//		for(int i=0;i<arr3.length;i++) {
//			System.out.println(arr3[i]);
//		}
		
		
//		案例:定义一个整型数数组,然后赋予数据,然后逆序打印
		//1.用随机数给数组赋值
		//2.遍历数组
		//3.逆序
		//	1.{1,2,3,4}
			//arr[0]=1;
		//	arr[3]=4;
		//4.遍历数组
		int arr4[]=new int[5];
		for(int i=0;i<5;i++) {
			arr4[i]=(int)(Math.random()*10);
		}
		for(int i:arr4) {
			System.out.print(i+" ");
		}
		System.out.println();
		//逆序打印
//		for(int i=arr4.length-1;i>=0;i--) {
//			System.out.print(arr4[i]+" ");
//		}
		//先逆序数组元素,在打印
		int a;
		for(int i=0,j=arr4.length-1;i<j;i++,j--) {
			a=arr4[i];
			arr4[i]=arr4[j];
			arr4[j]=a;
		}
		for(int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
//		
		
		
//		案例:求一维数组的最值
		/*
		 * 1.用随机数给数组赋值
		 * 2.遍历数组
		 * 3.求数组的最大值
		 * 	//1.定义一个变量,用来存储最大值
		 * 	//2.假设数组第一个元素是最大值
		 *  //3.遍历数组时进行判断,如果有元素比变量存储的数值更大,那么就把这个数赋值给变量
		 */
		int arr5[]=new int[5];
		for(int i=0;i<5;i++) {
			arr5[i]=(int)(Math.random()*10);
		}
		for(int j:arr5) {
			System.out.print(j+" ");
		}
		System.out.println();
		int b=arr5[0];
		for(int i=1;i<arr5.length;i++) {
			if(b<arr5[i]) {
				b=arr5[i];
			}
		}
		System.out.println(b);

	}

}
