package test5;

public class J03_封装 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:封装一个狗类,属性有名字,年龄,品种,提供对外接口,通过接口才能访问属性和修改属性,
//		修改年龄属性时需要验证合法性.有构造函数先给这些属性赋值----Dog.java
		Dog dog=new Dog("yoyo", 2, "金毛");
		dog.Prindog();
		
	}

}
