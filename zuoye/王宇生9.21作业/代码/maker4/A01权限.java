package maker4;
import make.paixu;
import make.Protect;

public class A01Ȩ�� {
	public static void test01(){
		System.out.println("����Ȩ��");
	}
	public static int add(int a,int b){
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		test01();
		
//		����:�ڱ��ļ���дһ������,������Ȩ���ǹ��е�,Ȼ����main��ʹ���������,��������Ĺ����Ǽӷ�����
		int he=add(3,5);
		System.out.println("��="+he);
//		����:�ڱ���ļ�дһ����,������һ������,���������,Ȼ���ڱ��ļ�����ʹ��
		int[] arr= {23,4523,23,534,63,6,54,7,46,758,568};
		paixu.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
//		Protect.project();����ֱ�ӵ����������ڱ���
//		ͨ�����ñ����������еĹ��г�Ա
		jicheng.test();
		
	}
	

}
