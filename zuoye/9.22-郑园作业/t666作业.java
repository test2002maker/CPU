package z922;
//8.	дһ�������Ķ�̬����,���������Ǹ���,����������,������ӡ���������Ʒ��
//�ش�:
public class t666��ҵ {
	public static class cars{
		String name;
		void f() {
		}
	}
	public static class bmw extends cars{
		bmw(String name){
			this.name=name;
		}
		void f() {
			System.out.println("����");
		}
	}
	public static class bc extends cars{
		bc(String name){
			this.name=name;
		}
		void f() {
			System.out.println("����");
		}
	}
	public static class byd extends cars{
		byd(String name){
			this.name=name;
		}
		void f() {
			System.out.println("���ǵ�");
		}
	}
	public static void n(cars c) {
		c.f();
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		bmw bm=new bmw("����");
		bc bc=new bc("����");
		byd by=new byd("���ǵ�");
		n(bm);
		n(bc);
		n(by);
	}
}
