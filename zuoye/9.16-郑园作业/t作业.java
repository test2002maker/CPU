package z916;
public class t��ҵ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������	

		a();
		int[] arr1= {6,5,7,8,55,7};
		a1(arr1);
		a2(arr1);
	}
 //	2.	дһ����������ĺ���
	
	static void a() {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
			arr[i]=8;
			}
			if(i==1) {
			arr[i]=6;
			}
			if(i==2) {
			arr[i]=5;
			}
			if(i==3) {
			arr[i]=7;
			}
			if(i==4) {
			arr[i]=3;
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
//	3.	дһ����ӡ����ĺ���
	static void a1(int[] arr1) {
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
//		4.	дһ��������������ĺ���
	
		static void a2(int[] arr1) {
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					int t=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=t;
				}
			}
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}
}


