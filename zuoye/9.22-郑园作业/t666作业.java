package z922;
//8.	写一个汽车的多态案例,如汽车类是父类,宝马是子类,操作打印各自子类的品牌
//回答:
public class t666作业 {
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
			System.out.println("宝马");
		}
	}
	public static class bc extends cars{
		bc(String name){
			this.name=name;
		}
		void f() {
			System.out.println("奔驰");
		}
	}
	public static class byd extends cars{
		byd(String name){
			this.name=name;
		}
		void f() {
			System.out.println("比亚迪");
		}
	}
	public static void n(cars c) {
		c.f();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		bmw bm=new bmw("宝马");
		bc bc=new bc("奔驰");
		byd by=new byd("比亚迪");
		n(bm);
		n(bc);
		n(by);
	}
}
