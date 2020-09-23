package test;

public class J003_保护权限 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	protected void pro1() {
		System.out.println("保护权限2,不同包中");
	}
	protected int b=100;
	
	public void ttt() {
		pro1();
	}
	public int ttt1() {
		return b;
	}

}
