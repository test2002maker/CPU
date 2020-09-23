package homework9_17;

import java.util.Scanner;

public class Game_user {
//	6.编写一个游戏人物类,单独文件编写,
//	游戏人物的属性有姓名,年龄,门派,性别,写出这些属性的getter和setter方法,
//	年龄和性别要检验才能赋值
	Scanner input=new Scanner(System.in);
	private String name="脚跟净村";
	private String sex="男";
	private int age=18;
	private String sect="天安门";
	
	
	//获取属性
	String getName() {
		return name;
	}
	String getSex() {
		return sex;
	}
	int getAge() {
		return age;
	}
	String getSect() {
		return sect;
	}
	
	//修改属性
	String setName() {
		System.out.print("请输入要修改的姓名：");
		String setname=input.next();
		name=setname;
		return name;
	}
	
	String setSex() {
		System.out.print("请输入要修改的性别：");
		String mysex=input.next();
		if(mysex.equals("男") || mysex.equals("女")) {
			sex=mysex;
		}else {
			System.out.println("性别填写错误！");
		}
		return sex;
	}
	
	int setAge() {
		System.out.print("请输入要修改的年龄：");
		int setage=input.nextInt();
		if(0<=setage && setage<=140) {
			age=setage;
		}else{
			System.out.println("年龄超出范围！");
		}
		return age;
	}
	
	String setSect() {
		System.out.print("请输入要修改的门派：");
		String setsect=input.next();
		sect=setsect;
		return sect;
	}

}
