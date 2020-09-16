package maker3;

public class A04类 {

	public static void main(String[] args) {
//		案例:创建一个java文件,写一个类,类中有name="maker",age=18;有set,get设置前面两个属性的方法
//		再另一个文件中调用该类,生成对象,然后通过对象打印出2个属性的值,和调用方法
		Anli m=new Anli();
		System.out.println(m.name);
		System.out.println(m.age);
		m.set("hdhfh",50);
		System.out.println(m.get_name());
		System.out.println(m.get_age());
		
		
//		案例:设计立方体类(Cube)，求出立方体的面积( 2*a*b + 2*a*c + 2*b*c )和体积( a * b * c)，分别用全局函数和成员函数判断两个立方体是否相等。
		Lft m1=new Lft();
		m1.a_set(6, 7, 8);
		System.out.println("m1的面积："+m1.mj());
		System.out.println("m1的体积："+m1.mj());
		Lft m2=new Lft();
		m2.a_set(4, 9, 6);
		System.out.println("m2的面积："+m2.mj());
		System.out.println("m2的体积："+m2.mj());
		System.out.println("m1与m2是否相等："+m1.pdxd(m2));
		
//		案例:设计一个圆形类（AdvCircle），和一个点类（Point），计算点和圆的关系。
//		假如圆心坐标为x0, y0, 半径为r，点的坐标为x1, y1：
//		1）点在圆上：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//		2）点在圆内：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//		3）点在圆外：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
		AdvCircle am=new AdvCircle();
		am.set_Ad(15, 30, 5);
		Point pm=new Point();
		pm.set_Po(57, 4);
		Relation.ralation(am, pm);
		
		
		
		
		
	}

}
