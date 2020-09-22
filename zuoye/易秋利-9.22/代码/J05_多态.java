package test5;

public class J05_¶àÌ¬ {
	public static class Animal{
		String name;
		int age;
		String type;//Æ·ÖÖ
		
		void speak() {
			System.out.println("ÍôÍô½Ğ");
		}
	}
	
	public static class Dog extends Animal{
		Dog(String Name,int Age,String Type){
			name=Name;
			age=Age;
			type=Type;
		}
		void speak() {
			System.out.println(age+"ËêµÄ"+type+name+"ÍôÍôÍôµÄ½Ğ");
		}
	}
	
	public static class Cat extends Animal{
		Cat(String Name,int Age,String Type){
			name=Name;
			age=Age;
			type=Type;
		}
		void speak() {
			System.out.println(age+"ËêµÄ"+type+name+"ß÷ß÷ß÷µÄ½Ğ");
		}
	}
	
	public static class Tiger extends Animal{
		Tiger(String Name,int Age,String Type) {
			name=Name;
			age=Age;
			type=Type;
		}
		void speak() {
			System.out.println(age+"ËêµÄ"+type+name+"à»à»à»µÄ½Ğ");
		}
	}
	
	public static void test(Animal an) {
		an.speak();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Íú²Æ",2,"½ğÃ«");
		Cat cat=new Cat("Ã«Ã«",1,"éÙÃ¨");
		Tiger tiger=new Tiger("Ô¶Ô¶",3,"¶«±±»¢");
		test(dog);
		test(cat);
		test(tiger);

	}

}
