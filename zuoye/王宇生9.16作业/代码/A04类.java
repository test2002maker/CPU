package maker3;

public class A04�� {

	public static void main(String[] args) {
//		����:����һ��java�ļ�,дһ����,������name="maker",age=18;��set,get����ǰ���������Եķ���
//		����һ���ļ��е��ø���,���ɶ���,Ȼ��ͨ�������ӡ��2�����Ե�ֵ,�͵��÷���
		Anli m=new Anli();
		System.out.println(m.name);
		System.out.println(m.age);
		m.set("hdhfh",50);
		System.out.println(m.get_name());
		System.out.println(m.get_age());
		
		
//		����:�����������(Cube)���������������( 2*a*b + 2*a*c + 2*b*c )�����( a * b * c)���ֱ���ȫ�ֺ����ͳ�Ա�����ж������������Ƿ���ȡ�
		Lft m1=new Lft();
		m1.a_set(6, 7, 8);
		System.out.println("m1�������"+m1.mj());
		System.out.println("m1�������"+m1.mj());
		Lft m2=new Lft();
		m2.a_set(4, 9, 6);
		System.out.println("m2�������"+m2.mj());
		System.out.println("m2�������"+m2.mj());
		System.out.println("m1��m2�Ƿ���ȣ�"+m1.pdxd(m2));
		
//		����:���һ��Բ���ࣨAdvCircle������һ�����ࣨPoint����������Բ�Ĺ�ϵ��
//		����Բ������Ϊx0, y0, �뾶Ϊr���������Ϊx1, y1��
//		1������Բ�ϣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//		2������Բ�ڣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//		3������Բ�⣺(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
		AdvCircle am=new AdvCircle();
		am.set_Ad(15, 30, 5);
		Point pm=new Point();
		pm.set_Po(57, 4);
		Relation.ralation(am, pm);
		
		
		
		
		
	}

}
