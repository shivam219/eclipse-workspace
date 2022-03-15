package hackerrank;

import java.util.Scanner;

public class math_fuio {
	static  Scanner in = new Scanner(System.in);
	  public static void main(String []argh){
//	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int c = a;
	            for(int j=0;j<n;j++){
	                c += Math.pow(2, j)*b;
	                System.out.printf("%s ",c);
	                // System.out.print(" "+c);
	            }
	            System.out.println();
	        }
	        in.close(); 
	        
	        int tt = in.nextInt();
	        for (int ii =0 ; ii<tt;ii++) {
	        	int aa = in.nextInt();
	        	int bb = in.nextInt();
	        	int nn = in.nextInt();
	        	int cc =aa;
	        	for ( int jj = 0  ; jj<nn; jj++)
	        	{
	        		cc += Math.pow(2, jj)*bb;
	        		System.out.printf("%s ", cc);
	        	}
	        	
	        }
	    }
}
