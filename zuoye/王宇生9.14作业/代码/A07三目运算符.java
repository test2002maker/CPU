package maker1;
import java.util.Scanner;
public class A07��Ŀ����� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		Scanner input=new Scanner(System.in);
		System.out.print("�����1������");
		int a=input.nextInt();
		System.out.print("�����2������");
		int b=input.nextInt();
		System.out.print("�����3������");
		int c=input.nextInt();
		int g=a>b?a:b;
		int g1=c>g?c:g;
		System.out.println(g1);
		
		
		
	}

}
