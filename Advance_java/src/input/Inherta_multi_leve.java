package input;


/**
 * Inter_fast
 */ // IS-A, HAS-A
class Interfast { // super base Parent
    public int add(int a, int b) {
        System.out.println(a == b);
        return a + b;
    }
}
    class AdvInterfast extends Interfast { // sub==java deirved==c,C++ child==OOP

        public int sub(int a, int b) {
            return a + b;
        }

    }
    class MoreAdvInterfast extends AdvInterfast { // sub==java deirved==c,C++ child==OOP

        public int sub(int a, int b) {
            return a + b;
        }

    }
/// multi-level inheritance
public class Inherta_multi_leve {

    public static void main(String[] args) {
     MoreAdvInterfast more = new MoreAdvInterfast();
                      more.add(20,52);

    }
}
