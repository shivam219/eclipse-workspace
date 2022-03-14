package serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serialization_class {
	public static void main(String[] args) throws IOException {
		System.out.println("h");
//		Employee e = new Employee();
		File f = new File("file.txt");
		FileOutputStream  fos = new FileOutputStream("employee");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.write(new byte[] {10,52});
		dos.writeUTF(null);
		dos.writeBoolean(true);
		System.out.println("File is Save");
		
		
		FileInputStream fios = new FileInputStream(f);
		DataInputStream dios = new DataInputStream(fios);
		System.out.println(dios.readBoolean());
		
		
	}
}
