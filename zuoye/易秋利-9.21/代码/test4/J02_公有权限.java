package test4;

public class J02_����Ȩ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����:�ڱ��ļ���дһ������,������Ȩ���ǹ��е�,Ȼ����main��ʹ���������,��������Ĺ����Ǽӷ�����
		add(10, 20);
//		����:�ڱ���ļ�дһ����,������һ������,���������,Ȼ���ڱ��ļ�����ʹ��
		int[] arr= {1,5,3,7,4,7,4,8};
		J002_���� a =new J002_����();
		a.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}

}
