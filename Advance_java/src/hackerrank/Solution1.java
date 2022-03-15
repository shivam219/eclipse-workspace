package hackerrank;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
//                 System.out.printf("%-15s%03d%n", s1, x);
                System.out.printf("%-15s%03%n",s1,x);
//                here %-15 occoupied 15 space for string
//                here %03 occoupied 3 space for int
                
                
            }
            System.out.println("================================");

    }
}