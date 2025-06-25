package File.io;
import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\sneha\\OneDrive\\Desktop\\Text1.txt"));
			String line;
			while ((line = rd.readLine())!= null) {
				System.out.println(line);
			}
			rd.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
