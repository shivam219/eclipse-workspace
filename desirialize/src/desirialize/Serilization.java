package desirialize;

import java.io.*;

public class Serilization {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Hare rama ";
		e.address = "Ayodya , up ";
		e.SSN = 564656678;
		e.number = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream("note.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}