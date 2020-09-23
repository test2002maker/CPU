package maker5;

public class A05多态 {
	//案例:定义一个动物类为父类,里面有动物的名字,年龄,品种.定义三个子类,狗,猫,老虎,然后打印
	//出信息,如:2岁的拉布拉多旺财汪汪汪的叫 
	public static class Animal{
		String name;
		int age;
		String cate;
		
		Animal(String name,int age,String cate){
			this.name=name;
			this.age=age;
			this.cate=cate;
		}
		void speak() {
			System.out.printf("Animal speak");
		}
	}
	public static class Dog extends Animal{
		Dog(String name,int age,String cate){
			super(name,age,cate);
		}
		void speak() {
			System.out.printf("%d岁的%s%s汪汪汪的叫",super.age,super.cate,super.name);
			System.out.println("");
		}
	}
	public static class Cat extends Animal{
		Cat(String name,int age,String cate){
			super(name,age,cate);
		}
		void speak() {
			System.out.printf("%d岁的%s%s喵喵喵的叫",super.age,super.cate,super.name);
			System.out.println("");
		}
	}
	public static class Tiger extends Animal{
		Tiger(String name,int age,String cate){
			super(name,age,cate);
		}
		void speak() {
			System.out.printf("%d岁的%s%s哄哄哄的叫",super.age,super.cate,super.name);
			System.out.println("");
		}
	}
	public static void speak(Animal sp) {
		sp.speak();
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog d=new Dog("旺财",2,"土狗");
		Cat c=new Cat("小猫",4,"土猫");
		Tiger t=new Tiger("小脑斧",3,"土虎");
		
		speak(d);
		speak(c);
		speak(t);

	}

}
