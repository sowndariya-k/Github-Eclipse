package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStream {

	public static void main(String[] args) {
		try(BufferedReader buffInput=new BufferedReader(new FileReader(args[0]));
			BufferedWriter buffOutput=new BufferedWriter(new FileWriter(args[1]))) {
				String line="";
				while((line=buffInput.readLine())!=null) {
					buffOutput.write(line);
					buffOutput.newLine();
				}
				
			}catch(FileNotFoundException f) {
				System.out.println("File not Found: "+f);
			}catch (IOException e) {
				System.out.println("Exception: "+e);
			}

	}

}
