package streams;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteIOStream {

	public static void main(String[] args) {
		byte[] b=new byte[128];
		try(FileInputStream fs=new FileInputStream("C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\streams\\input.txt");
				FileOutputStream fos=new FileOutputStream("C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\streams\\output.txt")) {
			System.out.println("Bytes available: "+fs.available());
			int count=0; int read=0;
			while((read=fs.read(b))!=-1) {
				fos.write(b);
				count+=read;
			}
			System.out.println("Total count: "+count);
		}catch(FileNotFoundException f) {
			System.out.println("File not found: "+f);
			
		}catch(IOException e) {
			System.out.println("IOException: "+e);
		}

	}

}
