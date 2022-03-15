package input;


public class varags {
    public static void main(String[] args) {

        Calc on = new Calc();
        // int value = 
        System.out.println(on.add(20, 200));
    }
}

/**
 * Calc
 */
class Calc {
    public int add(int... n)///array type
    {

        int sum = 0;
        for (int i : n)
        {
            sum = sum + i;
        }
        return sum;
    }

}
