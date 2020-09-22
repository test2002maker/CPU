package bb02;

public class BB02保护 {
	protected void test03() {
		System.out.println("我是别的包中的test03函数");
		
	}
	//可以间接地让外面调用本类的保护成员
	public void test003() {
		test03();
		
	}
	protected int myb=200;
	public int getMyb() {
		return myb;
			
		
	}
	
}
