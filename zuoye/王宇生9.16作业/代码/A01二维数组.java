package maker3;

public class A01二维数组 {

	public static void main(String[] args) {
//		案例:打印一个5行5列的*图案
		char[][] arr=new char[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]='*';
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------------------.");
//		char[][] arr1= {{'*','*','*'},{'*','*','*'},{'*','*','*'}};
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		案例:打印以下图形
//		@@@@@@@@
//		$$$
//		#####
//		@@@@@@
//		!!!!!!!!
		char[][] arr2=new char[5][];
		arr2[0]=new char[8];
		arr2[1]=new char[3];
		arr2[2]=new char[4];
		arr2[3]=new char[6];
		arr2[4]=new char[8];
		for(int j=0;j<arr2.length;j++) {
			for(int i=0;i<arr2[j].length;i++) {
				if (j==0||j==3) {
					arr2[j][i]='@';
				}else if (j==1) {
					arr2[j][i]='$';
				}else if (j==2) {
					arr2[j][i]='#';
				}else if (j==4) {
					arr2[j][i]='!';
				}
			}
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		

	}

}
