package test2;

public class J001_zuoye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6．编程题：数组元素查找(查找指定元素第一次在数组中出现的索引)
		int arr[]= {1,2,5,15,76,2,8,16,90,1,3,2};
		int a=2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println(a+"出现的位置是"+i);
				break;
			}
		}
		
		

	}

}
