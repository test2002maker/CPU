package maker5;

public class A03fengzhuang {
//	案例:封装一个狗类,属性有名字,年龄,品种,提供对外接口,通过接口才能访问属性和修改属性,
//	修改年龄属性时需要验证合法性.有构造函数先给这些属性赋值
	public static class Dog{
		private String name;
		private int age;
		private String cate;
		
		Dog(String name,int age,String cate){
			this.name=name;
			if(age>=0 && age<=20) {
				this.age=age;
			}else {
				System.out.println("年龄不合理！");
			}
			this.cate=cate;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getCate() {
			return cate;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			if(age>=0 && age<=20) {
				this.age=age;
			}else {
				System.out.println("年龄不合理！");
			}
		}
		public void setCate(String cate) {
			this.cate=cate;
		}
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog d=new Dog("小奶狗",18,"蔡徐坤");
		System.out.println("狗名："+d.getName()+"\n"+"年龄："+d.getAge()+"\n"+"种类："+d.getCate()+"\n");
		d.setName("小奶屌");
		d.setAge(19);
		d.setCate("范丞丞");
		System.out.println("狗名："+d.getName()+"\n"+"年龄："+d.getAge()+"\n"+"种类："+d.getCate()+"\n");

	}

}
