package z914;
import java.util.*;
public class test999 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��Ŀ�����
		int m=22;
		int n=33;
		int a=m>n?m:n;
		System.out.println(a);
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		Scanner scan=new Scanner(System.in);
		System.out.println("�������һ������");
		int x=scan.nextInt();
		System.out.println("������ڶ�������");
		int y=scan.nextInt();
		System.out.println("���������������");
		int z=scan.nextInt();
		int b=x>y?(x>z?x:z):(y>z?y:z);
		System.out.println(b);
//		if���
		int a1=10;
		if(a1==10) {//Ϊtrue���ܽ���
			System.out.println("����if��������");
		}
		int b1=10;
		int c1=20;
		if(b1>c1) {
			System.out.println("����if��������");
		}
//		if else-if else���
		int m1=22;
		int n1=33;
		if(m1>n1) {
			System.out.println("m1>n1");
		}else if(m1<n1) {
			System.out.println("m1<n1");
		}else {
			System.out.println("m1==n1");
		}
//		switch���
		int x1=99;
		switch(x1) {
		case 99:
			System.out.println("99");
			break;
		case 88:
			System.out.println("88");
			break;
		case 77:
			System.out.println("77");
			break;
		default:
			System.out.println("����");
			break;
		}
	}
	
}
