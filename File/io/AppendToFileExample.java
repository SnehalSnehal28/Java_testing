package File.io;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class AppendToFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = "From Tops";
			FileWriter fw = new FileWriter("C:\\Users\\sneha\\OneDrive\\Desktop\\Text1.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			FileReader fr = new FileReader("C:\\Users\\sneha\\OneDrive\\Desktop\\Text1.txt");
			String str="";
			int j=0;
			while((j=fr.read())!=-1) 
				str+=(char)j;
			System.out.println(str);
			System.out.println("Done");
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
