package maker6;

public class A01������ {
//	����:дһ��������,�������ĸ����󷽷�,�ֱ�����ˮ,����,��������,�ӵ㸨��
//	д2������ȥ�̳г�����,Ȼ��ʵ�ֳ��󷽷�,�ڶ����������,��ȥ������Щ����
	public static abstract class Chong{
		abstract void water();
		abstract void chong();
		abstract void zhuang();
		abstract void fuliao();
		
		public void Bz() {
			water();
			chong();
			zhuang();
			fuliao();
		}
	}
	public static class Coffee extends Chong{
		void water() {
			System.out.println("��ˮ");
		}
		void chong() {
			System.out.println("���ݿ���");
		}
		void zhuang() {
			System.out.println("װ�뿧�ȱ�");
		}
		void fuliao() {
			System.out.println("�ӵ���");
		}
	}
	public static class Tea extends Chong{
		void water() {
			System.out.println("��ˮ");
		}
		void chong() {
			System.out.println("���ݲ�Ҷ");
		}
		void zhuang() {
			System.out.println("װ��豭");
		}
		void fuliao() {
			System.out.println("�ӵ�ʯ��");
		}
	
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Coffee c=new Coffee();
		Tea t=new Tea();
		c.Bz();
		t.Bz();

	}

}
