package maker5;

public class A05��̬ {
	//����:����һ��������Ϊ����,�����ж��������,����,Ʒ��.������������,��,è,�ϻ�,Ȼ���ӡ
	//����Ϣ,��:2����������������������Ľ� 
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
			System.out.printf("%d���%s%s�������Ľ�",super.age,super.cate,super.name);
			System.out.println("");
		}
	}
	public static class Cat extends Animal{
		Cat(String name,int age,String cate){
			super(name,age,cate);
		}
		void speak() {
			System.out.printf("%d���%s%s�������Ľ�",super.age,super.cate,super.name);
			System.out.println("");
		}
	}
	public static class Tiger extends Animal{
		Tiger(String name,int age,String cate){
			super(name,age,cate);
		}
		void speak() {
			System.out.printf("%d���%s%s����Ľ�",super.age,super.cate,super.name);
			System.out.println("");
		}
	}
	public static void speak(Animal sp) {
		sp.speak();
	}
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog d=new Dog("����",2,"����");
		Cat c=new Cat("Сè",4,"��è");
		Tiger t=new Tiger("С�Ը�",3,"����");
		
		speak(d);
		speak(c);
		speak(t);

	}

}
