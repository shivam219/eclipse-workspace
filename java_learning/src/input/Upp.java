package input;


public class Upp {

    public static void main(String[] args) {
            int a[][] = { { 1, 2, 3 }, { 5, 6, 7, 8 }, { 4, 2, 5 } };
    
            int l = a.length;
            for (int i = 0; i < l; i++) {
    
                for (int j = 0; j <= l; j++) {
                    System.out.print("  " + a[i][j]);
                }
                System.out.println();
    
            }
    
            System.out.println("*******************************");
            for (int i = 0; i < l; i++) {
    
                for (int j = 0; j <= l; j++) {
                    
                   if (i>j)
                   {
                   System.out.print("  "+0);
                   }
                   else {
                    System.out.print("  " + a[i][j]);
                   }
                   
                }
                System.out.println();
        }
    }
    
}
