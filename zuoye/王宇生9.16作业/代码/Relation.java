package maker3;

public class Relation {
//	1������Բ�ϣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//	2������Բ�ڣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//	3������Բ�⣺(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
	static void ralation(AdvCircle m,Point n) {
		if ((n.p_x-m.a_x)*(n.p_x-m.a_x) + (n.p_y-m.a_y)*(n.p_y-m.a_y) == m.a_r*m.a_r) {
			System.out.print("����Բ��");
		}
		if ((n.p_x-m.a_x)*(n.p_x-m.a_x) + (n.p_y-m.a_y)*(n.p_y-m.a_y) < m.a_r*m.a_r) {
			System.out.print("����Բ��");
		}
		if ((n.p_x-m.a_x)*(n.p_x-m.a_x) + (n.p_y-m.a_y)*(n.p_y-m.a_y) > m.a_r*m.a_r) {
			System.out.print("����Բ��");
		}
	}
}
