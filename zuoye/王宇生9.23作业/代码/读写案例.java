package maker6;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class 读写案例 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//案例:把前面的FileWrite文件写读出,然后写到一个后缀为.java的文件,然后在读出打印
		String filename1="E:\\java_worker\\A06day\\src\\maker6\\A07filewrite.java";
		String filename2="E:\\java_worker\\A06day\\src\\maker6\\anli.txt";
		String r="";
		String r2="";
		try {
			BufferedReader re=new BufferedReader(new FileReader(filename1));
			BufferedWriter wr=new BufferedWriter(new FileWriter(filename2));
			r=re.readLine();
			while(r!=null) {
				wr.write(r+"\n");
				r=re.readLine();
			}
			wr.close();
			re.close();
			
			BufferedReader re2=new BufferedReader(new FileReader(filename2));
			r2=re2.readLine();
			while(r2!=null) {
				System.out.println(r2);
				r2=re.readLine();
			}
			re2.close();
		}catch(Exception a) {
			
		}

	}

}
