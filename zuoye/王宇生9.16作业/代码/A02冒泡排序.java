package maker3;

public class A02ð������ {

	public static void main(String[] args) {
//		����:�������0-99�ڵ�10����,���뵽������,����ӡ����,Ȼ�����ð������,֮���ٴ�ӡ
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		System.out.print("����ǰ��");
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
		System.out.print("�����");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();

		
	}

}
