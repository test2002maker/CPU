package maker2;
public class ���鰸�� {

	public static void main(String[] args) {
//		����:����һ������������,Ȼ��������,Ȼ�������ӡ
		int[] arr1=new int[10];
//		���鸳ֵ
		for(int i=0;i<10;i++) {
			arr1[i]=(int)(Math.random()*100);
		}
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		System.out.println("*********************");
		
//		�������
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

//		��С����
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
		
		
//		����:��һά�������ֵ
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
		System.out.println("���ֵΪ��"+m);
		System.out.println("��СֵΪ��"+n);

		
	}

}
