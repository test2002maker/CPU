package z921;
//6.编写一个游戏人物类,单独文件编写,游戏人物的属性有姓名,年龄,门派,性别,
//写出这些属性的getter和setter方法,年龄和性别要检验才能赋值
public class t07作业6人物类 {
	
		String name="明明";
		int age=18;
		String sex="男";
		String sect="丐帮";
		String getname() {
			return name;
		}
		String getsex() {
			return sex;
		}
		String getsect() {
			return sect;
		}
		int getage() {
			return age;
		}
		void setname(String name1) {
			name=name1;
		}
		void setsect(String sect1) {
			sect=sect1;
		}
		void setage(int age1) {
			if(age1>0&&age1<150) {
				age=age1;
			}else {
				System.out.println("数据有误");
			}
		}
		void setsex(String sex1) {
			if(sex1=="女" || sex1=="男") {
				sex=sex1;
			}else {
				System.out.println("数据有误");
			}
		}
		
}
