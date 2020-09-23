package maker4;

public class A02set和get函数 {
	public static class Maker{
		private int age=10;
		int getAge() {
			return age;
		}
		void setAge(int Age) {
			if(Age>0 && Age<140) {
				age=Age;
			}else {
				System.out.println("输入年龄不合法");
			}
		}
	}	
}


