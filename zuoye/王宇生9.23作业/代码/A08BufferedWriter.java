package maker6;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class A08BufferedWriter {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String filename="src//bigfile.txt";
		try {
			BufferedWriter wr=new BufferedWriter(new FileWriter(filename));
			wr.write("hello,java");
			wr.newLine();
			wr.write("lgagaga\n");
			wr.write("fhsgfyu");
			wr.close();
		}catch(Exception a) {
			
		}

	}

}
