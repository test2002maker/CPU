package maker6;

public class A01抽象类 {
//	案例:写一个抽象父类,里面有四个抽象方法,分别是煮水,冲泡,导入容器,加点辅料
//	写2个子类去继承抽象父类,然后实现抽象方法,在定义子类对象,再去调用这些方法
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
			System.out.println("煮开水");
		}
		void chong() {
			System.out.println("冲泡咖啡");
		}
		void zhuang() {
			System.out.println("装入咖啡杯");
		}
		void fuliao() {
			System.out.println("加点糖");
		}
	}
	public static class Tea extends Chong{
		void water() {
			System.out.println("煮开水");
		}
		void chong() {
			System.out.println("冲泡茶叶");
		}
		void zhuang() {
			System.out.println("装入茶杯");
		}
		void fuliao() {
			System.out.println("加点石灰");
		}
	
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Coffee c=new Coffee();
		Tea t=new Tea();
		c.Bz();
		t.Bz();

	}

}
