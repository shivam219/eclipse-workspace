package file_hand;

import java.io.*;

public class Create_file {
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates and open the template
	 * in the editor.
	 */

	/**
	 *
	 * @author Trainer
	 */

	public static void main(String args[]) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("myfile.text");
		System.out.println("Enter Text @ at the end:  ");
		char ch;
		while ((ch = (char) dis.read()) != '@')
			fout.write(ch);
		fout.close();

	}

}
