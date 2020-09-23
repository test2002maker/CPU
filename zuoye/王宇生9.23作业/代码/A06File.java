package maker6;
import java.io.File;
public class A06File {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("C:/Users/22546/Desktop/121.txt");
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.lastModified());
		file.delete();

	}

}
