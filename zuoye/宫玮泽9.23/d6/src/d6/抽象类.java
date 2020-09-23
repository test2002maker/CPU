package d6;

public class 抽象类 {
	public static abstract class step {
		abstract void boiling();
		abstract void soak();
		abstract void pour();
		abstract void milk();
	}
	public static class coffee extends step{
		void boiling() {
			System.out.println("煮水");
		}
		void soak() {
			System.out.println("冲泡");
		}
		void pour() {
			System.out.println("倒水");
		}
		void milk() {
			System.out.println("辅料");
		}
	}
	public static class tea extends step{
		void boiling() {
			System.out.println("煮水");
		}
		void soak() {
			System.out.println("冲泡");
		}
		void pour() {
			System.out.println("倒水");
		}
		void milk() {
			System.out.println("辅料");
		}
	}
	public static void main(String[] args) {
		coffee c = new coffee();
		tea t = new tea();
		
		
	}
}

