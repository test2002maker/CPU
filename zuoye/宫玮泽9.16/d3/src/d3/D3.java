package d3;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class D3 {
	public static void main(String[] args) {
	// TODO �Զ����ɵķ������
			//1.�����ά����ͬʱ��ʼ��,��ά�����Ԫ����һά����
//			int[][] arr= {{1,2,3},{4,5,6}};
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[i].length;j++) {
//					System.out.println(arr[i][j]);
//				}
//				System.out.println();
//			}
//			int b=arr[1][0];
//			System.out.println("b="+b);
//			arr[1][2]=88;//����ά�������λ���ϸ�ֵ
//			System.out.println("----------");
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[i].length;j++) {
//					System.out.println(arr[i][j]);
//				}
//			}
//			System.out.println("-----------");
//			//2.�����ά����,�ֲ�
//			int[][] arr2;//���ﲢû�п��ٿռ�
//			arr2=new int[3][2];//���ٿռ�
//			//��arr2��ά���鸳ֵ
//			for(int i=0;i<arr2.length;i++) {
//				for(int j=0;j<arr2[i].length;j++) {
//					arr2[i][j]=i*j;
//					System.out.print(arr2[i][j]+" ");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("-----------");
//			//3.���岻����Ķ�ά����
//			int[][] arr3;
//			arr3=new int[3][];//������
//			arr3[0]=new int[2];//������
//			arr3[1]=new int[3];
//			arr3[2]=new int[4];
//			for(int i=0;i<arr3.length;i++) {
//				for(int j=0;j<arr3[i].length;j++) {
//					arr3[i][j]=i*j;
//					System.out.print(arr3[i][j]+" ");
//				}
//				System.out.println();
//			}
//		char[][] arr = new char[5][5];
//		for(int i=0;i<arr.length;i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j]='*';
//			}
//			System.out.println(arr[i]);
//		}
//		char[][] arr1;
//		arr1=new char[5][];
//		arr1[0]=new char[8];
//		arr1[1]=new char[3];
//		arr1[2]=new char[5];
//		arr1[3]=new char[6];
//		arr1[4]=new char[8];
//		for(int i=0;i<arr1.length;i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				if(i==0) {
//					arr1[i][j]='@';
//				}
//				if (i==1) {
//					arr1[i][j]='$';
//				}
//				if (i==2) {
//					arr1[i][j]='#';
//				}
//				if (i==3) {
//					arr1[i][j]='@';
//				}
//				if (i==4) {
//					arr1[i][j]='!';
//				}
//			
//			}
//			System.out.println(arr1[i]);
//				
//			}
//		int[] arr=new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=(int)(Math.random()*99);
//			System.out.print(arr[i]+" ");
//		}
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if (arr[j]<arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
//			}
//			
//		}
		 
//		int[] arr = {21,1,4};
//		int a=q.getMax(arr);
//		int b=q.getMin(arr);
//		q.printArr(arr);
//		System.out.println("");
//		System.out.println("���ֵ"+a);
//		System.out.println("��Сֵ"+b);
//		double sum=q.add(123.12, 123.1);
//		System.out.println(sum);
//		int emm=q.add(123, 111);
//		System.out.println(emm);
//		System.out.println(q.get_name());
//		System.out.println();
		
		}
		
		
	
//	static int[] createArr(int num) {
//		int[] arr=new int[num];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=(int)(Math.random()*999999999);
//		}
//		return arr;
//	
//		}
//	
//	static void printArr(int[] arr) {
//		for(int i:arr) {
//			System.out.println(i+" ");
//		}
//	System.out.println("");
//	}
	static int[] sortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]<arr[j+1]) {
					int num=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=num;
					
				}
			}
		}
	return arr;
	}
	
	
}


