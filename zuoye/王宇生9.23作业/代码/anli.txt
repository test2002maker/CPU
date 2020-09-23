package maker6;
import java.io.FileWriter;
import java.io.FileReader;

public class A07filewrite {
	//案例:把自己的姓名,年龄,性别写入文件中,该文件生成在写代码的同级目录中
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String filename="src/inf.txt";
//		try {
//			FileWriter fw=new FileWriter(filename);
//			fw.write("shuai\n");
//			fw.write(18+"\n");
//			fw.write("男\n");
//			fw.close();
//		}catch(Exception a){
//			
//		}
		try {
			FileReader fr=new FileReader(filename);
			int c=0;
			c=fr.read();
			while(c!=-1) {
				System.out.print((char)c);
				c=fr.read();
			}
			fr.close();
		}catch(Exception a){
			
		}
		

	}

}
