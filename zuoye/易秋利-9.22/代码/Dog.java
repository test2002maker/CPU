package test5;
//案例:封装一个狗类,属性有名字,年龄,品种,提供对外接口,通过接口才能访问属性和修改属性,
//修改年龄属性时需要验证合法性.有构造函数先给这些属性赋值
public class Dog {
	private String name;
	private int age;
	private String type;//品种
	
	Dog(String Name,int Age,String Type){
		name=Name;
		age=Age;
		type=Type;
	}
	
	void Prindog() {//打印
		System.out.println("姓名: "+getName()+" "+"年龄: "+getAge()+" "
				+"品种: "+getType());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<=15) {
			this.age = age;
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
