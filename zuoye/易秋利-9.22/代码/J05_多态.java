package test5;

public class J05_��̬ {
	public static class Animal{
		String name;
		int age;
		String type;//Ʒ��
		
		void speak() {
			System.out.println("������");
		}
	}
	
	public static class Dog extends Animal{
		Dog(String Name,int Age,String Type){
			name=Name;
			age=Age;
			type=Type;
		}
		void speak() {
			System.out.println(age+"���"+type+name+"�������Ľ�");
		}
	}
	
	public static class Cat extends Animal{
		Cat(String Name,int Age,String Type){
			name=Name;
			age=Age;
			type=Type;
		}
		void speak() {
			System.out.println(age+"���"+type+name+"�������Ľ�");
		}
	}
	
	public static class Tiger extends Animal{
		Tiger(String Name,int Age,String Type) {
			name=Name;
			age=Age;
			type=Type;
		}
		void speak() {
			System.out.println(age+"���"+type+name+"��໵Ľ�");
		}
	}
	
	public static void test(Animal an) {
		an.speak();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("����",2,"��ë");
		Cat cat=new Cat("ëë",1,"��è");
		Tiger tiger=new Tiger("ԶԶ",3,"������");
		test(dog);
		test(cat);
		test(tiger);

	}

}
