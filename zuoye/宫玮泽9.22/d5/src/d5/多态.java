package d5;

public class 多态 {
	//案例:定义一个动物类为父类,里面有动物的名字,年龄,品种.定义三个子类,狗,猫,老虎,然后打印
		//出信息,如:2岁的拉布拉多旺财汪汪汪的叫 
	public static class Animal{
		String name;
		int age;
		String cat;
		Animal(String name,int age,String cat) {
			// TODO 自动生成的构造函数存根
			this.name=name;
			this.age=age;
			this.cat=cat;
		}
		void speak() {
			System.out.println("Animal speak");
		}
		
	}
}
