package z921;

public class t07��ҵ6 {
//	6.	��дһ����Ϸ������,�����ļ���д,��Ϸ���������������,����,����,�Ա�,
//	д����Щ���Ե�getter��setter����,������Ա�Ҫ������ܸ�ֵ
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		t07��ҵ6������ p=new t07��ҵ6������();
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getsect());
		System.out.println(p.getsex());
		p.setage(99);
		p.setname("���߹�");
		p.setsect("������");
		p.setsex("Ů");
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getsect());
		System.out.println(p.getsex());
	}

}
