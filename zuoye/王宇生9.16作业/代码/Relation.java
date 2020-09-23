package maker3;

public class Relation {
//	1）点在圆上：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//	2）点在圆内：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//	3）点在圆外：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
	static void ralation(AdvCircle m,Point n) {
		if ((n.p_x-m.a_x)*(n.p_x-m.a_x) + (n.p_y-m.a_y)*(n.p_y-m.a_y) == m.a_r*m.a_r) {
			System.out.print("点在圆上");
		}
		if ((n.p_x-m.a_x)*(n.p_x-m.a_x) + (n.p_y-m.a_y)*(n.p_y-m.a_y) < m.a_r*m.a_r) {
			System.out.print("点在圆内");
		}
		if ((n.p_x-m.a_x)*(n.p_x-m.a_x) + (n.p_y-m.a_y)*(n.p_y-m.a_y) > m.a_r*m.a_r) {
			System.out.print("点在圆外");
		}
	}
}
