package maker3;

public class A02冒泡排序 {

	public static void main(String[] args) {
//		案例:随机生成0-99内的10个数,放入到数组中,并打印出来,然后进行冒泡排序,之后再打印
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		System.out.print("排序前：");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int num=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=num;
				}
			}
		}
		System.out.print("排序后：");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();

		
	}

}
