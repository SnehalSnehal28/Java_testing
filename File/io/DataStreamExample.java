package File.io;
import java.io.FileInputStream;

public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\sneha\\OneDrive\\Desktop\\Text1.txt");
			int i;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
				
			}
			fin.close();
		}catch (Exception e) {
			System.out.print(e);
		}

	}

}
