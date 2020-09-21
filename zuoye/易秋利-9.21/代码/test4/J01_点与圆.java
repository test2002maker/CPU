package test4;

public class J01_点与圆 {
//	案例:设计一个圆形类（Circle），和一个点类（Point），计算点和圆的关系。
//	假如圆心坐标为x0, y0, 半径为r，点的坐标为x1, y1：
//	1）点在圆上：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//	2）点在圆内：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//	3）点在圆外：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setP(10, 10);
		circle.setR(8);
		Point point=new Point();
		point.setX(25);
		point.setY(20);
		circle.fun(point);
	}
	
}
