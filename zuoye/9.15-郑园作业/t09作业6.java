package z915;

public class t09作业6 {
//	6．	编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=1;	
		for(int i=0;i<arr.length;i++) {
			int a=arr[i];
			if(a==3) {
				System.out.println(i);
				break;
			}
		}
	}
}
