package z915;

public class t09��ҵ6 {
//	6��	����⣺����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
