package file_hand;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
public class ReadFIle {
    public static void main(String args[]) throws IOException
    {
        //DataInputStream dis = new DataInputStream(System.in);
        FileInputStream fout = new FileInputStream("myfile.text");
        System.out.println("File contents:  ");
        int ch;
        while((ch=fout.read())!=-1)
            System.out.print((char)ch);
        fout.close();
    }
}
