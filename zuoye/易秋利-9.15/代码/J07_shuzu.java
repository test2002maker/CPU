package test2;

public class J07_shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
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
//		//��������
//		int[] arr2=null;
//		arr2=new int[2];
//		arr2[0]=11;
//		arr2[1]=21;
//		//��ӡ����
//		for(int i:arr2) {
//			System.out.println(i);
//		}
//		System.out.println("------------");
//		
//		//�������鲢��ʼ��
//		int arr3[]= {1,2,3,4,5,6,3,2,6};
//		for(int i=0;i<arr3.length;i++) {
//			System.out.println(arr3[i]);
//		}
		
		
//		����:����һ������������,Ȼ��������,Ȼ�������ӡ
		//1.������������鸳ֵ
		//2.��������
		//3.����
		//	1.{1,2,3,4}
			//arr[0]=1;
		//	arr[3]=4;
		//4.��������
		int arr4[]=new int[5];
		for(int i=0;i<5;i++) {
			arr4[i]=(int)(Math.random()*10);
		}
		for(int i:arr4) {
			System.out.print(i+" ");
		}
		System.out.println();
		//�����ӡ
//		for(int i=arr4.length-1;i>=0;i--) {
//			System.out.print(arr4[i]+" ");
//		}
		//����������Ԫ��,�ڴ�ӡ
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
		
		
//		����:��һά�������ֵ
		/*
		 * 1.������������鸳ֵ
		 * 2.��������
		 * 3.����������ֵ
		 * 	//1.����һ������,�����洢���ֵ
		 * 	//2.���������һ��Ԫ�������ֵ
		 *  //3.��������ʱ�����ж�,�����Ԫ�رȱ����洢����ֵ����,��ô�Ͱ��������ֵ������
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
