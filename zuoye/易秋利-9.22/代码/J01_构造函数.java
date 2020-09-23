package test5;

public class J01_构造函数 {
	
//	public static class Maker{
//		String name;
//		int age;
//		//构造函数是编译器去调用的,实例化对象必然有构造函数被调用
//		Maker(){
//			System.out.println("我是无参构造函数");
//		}
//		Maker(String Name,int Age){
//			name=Name;
//			age=Age;
//		}
//	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Maker maker=new Maker();//调用无参构造
//		Maker maker2=new Maker("小花",18);//调用有参构造
//		System.out.println(maker.name+" "+maker.age);//name,age是没有值的
//		System.out.println(maker2.name+" "+maker2.age);//name,age有值
		
//		案例:在别的文件定义一个类,类中有属性name,age,score,其中age赋值时要判断合法性
//		可以通过构造函数赋值,可以调用打印这些属性的方法------Score.java
		Score score=new Score("liu", 18, 98);
		System.out.println(score.name+" "+score.age+" "+score.score);
	}

}
