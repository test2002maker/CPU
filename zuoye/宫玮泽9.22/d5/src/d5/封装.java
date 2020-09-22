package d5;

public class 封装 {
	public static class dog {
		private String name;
		private int age;
		private String cat;
		
		dog(String name,int age,String cat){
			this.name=name;
			this.age=age;
			this.cat=cat;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getCat() {
			return cat;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			if (age>=0&&age<=20) {
				this.age=age;
			}else {
				System.out.println("年龄不合理");
			}
			
		}
		public void setCat(String cat) {
			this.cat=cat;
		}
		public static void main(String[] args) {
			dog d=new dog("dog", 1, "土狗");
			System.out.println("狗名:"+d.getName()+"\n"+"年龄:"+d.getAge()+"\n"+"种类:"+d.getCat());
			d.setAge(2);
			d.setCat("大狗");;
			System.out.println("狗名:"+d.getName()+"\n"+"年龄:"+d.getAge()+"\n"+"种类:"+d.getCat());
			
		}
		
		
	}

}
