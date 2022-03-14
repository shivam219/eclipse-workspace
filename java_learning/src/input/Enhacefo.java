package input;

public class Enhacefo {
    public static void main(String[] args) {
        // int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 3, 4, 2, 5 } };

        // int l = a.length;
        // for (int i = 0; i < l; i++) {

        // for (int j = 0; j <= l; j++) {
        // System.out.print(" " + a[i][j]);
        // }
        // System.out.println();

        // }

        // System.out.println("*******************************");
        // int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 3, 4, 2, 5 } };
        // int aa= a.length;
        // System.out.println(aa);
        // for (int i = 0; i < a.length; i++) {

        // for (int j = 0; j <= a.length; j++) {
        // /*{ 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 3, 4, 2, 5 }
        // */

        // if (i > j) {
        // System.out.print(" "+0); // central trigle matrix

        // // System.out.println(" " + 0); // Upper tringle matrix

        // } else {
        // System.out.print(" " + a[i][j]);
        // }

        // }
        // System.out.println();

        // }
        // for (int i : a) {
        // System.out.println(i);
        // }

        // Matrix ARRAY using enhace for loop.
        System.out.println("*******************************");
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 3, 4, 2, 5 } };
        int aa = a.length;
        System.out.println(aa);
        for (int i[] : a) {

            for (int j : i) {

                System.out.println(0 + " ");

            }

        }
        System.out.println();
    }

}
