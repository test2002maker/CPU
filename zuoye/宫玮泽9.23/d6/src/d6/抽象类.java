package d6;

public class ������ {
	public static abstract class step {
		abstract void boiling();
		abstract void soak();
		abstract void pour();
		abstract void milk();
	}
	public static class coffee extends step{
		void boiling() {
			System.out.println("��ˮ");
		}
		void soak() {
			System.out.println("����");
		}
		void pour() {
			System.out.println("��ˮ");
		}
		void milk() {
			System.out.println("����");
		}
	}
	public static class tea extends step{
		void boiling() {
			System.out.println("��ˮ");
		}
		void soak() {
			System.out.println("����");
		}
		void pour() {
			System.out.println("��ˮ");
		}
		void milk() {
			System.out.println("����");
		}
	}
	public static void main(String[] args) {
		coffee c = new coffee();
		tea t = new tea();
		
		
	}
}

