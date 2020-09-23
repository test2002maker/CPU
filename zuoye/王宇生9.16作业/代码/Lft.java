package maker3;

public class Lft {
//	案例:设计立方体类(Cube)，
//	求出立方体的面积( 2*a*b + 2*a*c + 2*b*c )和体积( a * b * c)，
//	分别用全局函数和成员函数判断两个立方体是否相等。
	int a_l;
	int a_w;
	int a_h;
	void a_set(int l,int w,int h) {
		a_l=l;
		a_w=w;
		a_h=h;
	} 
	int tj() {
		return a_l*a_w*a_h;
	}
	
	int mj() {
		return (2*a_l*a_w)+(2*a_h*a_w)+(2*a_l*a_h);
	}
	
	boolean pdxd(Lft m2) {
		boolean p=true;
		if(a_l==m2.a_l&&a_h==m2.a_h&&a_w==m2.a_w) {
			p=true;
		}else {
			p=false;
		}
		return p;
	}

	
}
