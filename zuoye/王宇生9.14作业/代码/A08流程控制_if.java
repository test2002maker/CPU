package maker1;
import java.util.Scanner;
public class A08���̿���_if {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		boolean a=50>40;
		if(a){//ֻ��������ͻ򷵻ز������͵ı��ʽ
			System.out.println("dsjngdh");
		}
//		����:�ӿ���̨����һ������,�ñ���a����,�������������10,�ʹ�ӡ"��������ݴ���10"
		Scanner input=new Scanner(System.in);
		System.out.print("����һ�����ݣ�");
		int i=input.nextInt();
		if(i>10) {
			System.out.printf("%d����10",i);
		}else if(i==10){
			System.out.printf("%d����10",i);
		}else {
			System.out.printf("%dС��10\n",i);
		}
		

//		����:�ӿ���̨������������,Ȼ���ӡ��������ֵ
		System.out.print("�����һ������");
		int j=input.nextInt();
		System.out.print("����ڶ�������");
		int k=input.nextInt();
		System.out.print("�������������");
		int l=input.nextInt();
		if(j>k) {
			if(j>l) {
				System.out.println(j);
			}else {
				System.out.println(l);
			}
		}else {
			if(k>l) {
				System.out.println(k);
			}else {
				System.out.println(l);
			}
		}
		
//		����:�����·ݣ������Ӧ�ļ��ڣ�
//		1~3--����
//		4~6--�ļ�
//		7~9--�＾
//		10~12--����
		System.out.print("�����·ݣ�");
		int m=input.nextInt();
		if(1<=m&&m<=3){
			System.out.println("����");
		}else if(4<=m&&m<=6){
			System.out.println("�ļ�");
		}else if(7<=m&&m<=9){
			System.out.println("�＾");
		}else if(10<=m&&m<=12){
			System.out.println("����");
		}else {
			System.out.println("�����·�");
		}

		
		
		
		
	}

}
