package junittest;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class apptest测试套件 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//TestSuite是测试集合,把B02TestJunit,B02TestJunit2添加到集合中
		TestSuite su=new TestSuite(apptestjunit1.class,apptestjunit2.class);
		//这个对象是装执行测试用例结果
		TestResult r=new TestResult();
		//执行测试用例,把结果放入r对象中
		su.run(r);
		
		//获取运行测试的数量
		System.out.println("运行数量:"+r.runCount());
	}

}
