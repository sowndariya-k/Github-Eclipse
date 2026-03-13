package streams;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String data="Welcome to java Portal!!! Have a happy learning";
		try {
			FileOutputStream output=new FileOutputStream("C:\\Users\\Sowndariya\\Desktop\\Expleo\\Java Core (Expleo)\\Control_Flow_Statements\\src\\streams\\output.txt");
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
