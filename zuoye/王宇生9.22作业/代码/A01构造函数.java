package maker5;

public class A01构造函数 {
	public static class lei{
//	案例:在别的文件定义一个类,类中有属性name,age,score,其中age赋值时要判断合法性
//	可以通过构造函数赋值,可以调用打印这些属性的方法
		String name;
		int age;
		double score;
			
		lei(String Name,int Age,double Score){
			name=Name;
			if(Age>=0 && Age<=140) {
				age=Age;
			}else {
				System.out.println("年龄不合法！");
			}
			if(Score>=0 && Score<=100) {
				score=Score;
			}else {
				System.out.println("分数不合法！");
			}
		}
		
		void getName() {
			System.out.println("姓名："+name);
		}
		void getAge() {
			System.out.println("年龄："+age);
		}
		void getScore() {
			System.out.println("分数："+score);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		lei m=new lei("小王",18,100);
		m.getName();
		m.getAge();
		m.getScore();

	}

}
