package maker2;
import java.util.Scanner;
public class A06�ַ����� {

	public static void main(String[] args) {
//		�ַ������ֱ����println��ӡ
//		�ַ����ɸ����±���.charAt(�±�)��Ϊ�����ַ�����ӡ
//		.length()�ɻ�ȡ�ַ�������
		String str="eyusgfs";
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		
		
//		����:�ӿ���̨�����ַ���,Ȼ����ַ����е��ַ��洢���ַ�������,
//		Ȼ���ӡ����
		Scanner input=new Scanner(System.in);
		System.out.print("�������ַ�����");
		String str1=input.next();
		int a=str1.length();
		char[] char_arr=new char[a];
		for(int i=0;i<a;i++) {
			char_arr[i]=str1.charAt(i);
		}
		System.out.println(char_arr);
		

	}

}
