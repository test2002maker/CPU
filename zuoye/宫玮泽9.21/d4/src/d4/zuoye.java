package d4;
import java.util.Scanner;
public class zuoye {
	Scanner input = new Scanner(System.in);
	private String name = "啊啊";
	private String sex = "女";
	private int age = 12;
	private String mp = "阿巴阿巴";
	String getName() {
		return name;
	}
	String getSex() {
		return sex;
	}
	int getAge() {
		return age;
	}
	String getMp() {
		return mp;
	}
	//修改属性
	String setName() {
		System.out.println("请输入要修改的姓名：");
		String setname = input.next();
		name = setname;
		return name;
	}
	String setMp() {
		System.out.println("请输入要修改的门派：");
		String setmp = input.next();
		mp = setmp;
		return mp;
	}
	int setAge() {
		System.out.println("请输入要修改的年龄：");
		int setage = input.nextInt();
		if(0<=setage && setage<=140) {
			age = setage;
		}else {
			System.out.println("输入错误");
		}
		return age;
	}
	String setSex() {
		System.out.println("请输入要修改的性别：");
		String setmp = input.next();
		if (setmp.equals("男")||setmp.equals("女")) {
			
			mp = setmp;
		}else {
			System.out.println("输入错误");
		}
		
		return mp;
	}
}
