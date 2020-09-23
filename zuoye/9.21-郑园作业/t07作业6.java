package z921;

public class t07作业6 {
//	6.	编写一个游戏人物类,单独文件编写,游戏人物的属性有姓名,年龄,门派,性别,
//	写出这些属性的getter和setter方法,年龄和性别要检验才能赋值
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		t07作业6人物类 p=new t07作业6人物类();
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getsect());
		System.out.println(p.getsex());
		p.setage(99);
		p.setname("洪七公");
		p.setsect("昆仑派");
		p.setsex("女");
		System.out.println(p.getname());
		System.out.println(p.getage());
		System.out.println(p.getsect());
		System.out.println(p.getsex());
	}

}
