package input;



class Aaa {
    public Aaa() {
        System.out.println("In A");
    }

    public Aaa(int i) {
        System.out.println("In A2");
    }

}

class Bbb extends Aaa {
    public Bbb() {
        System.out.println("In B");
    }
    public Bbb(int i) {
        super(i);
        System.out.println("In b2");
    }

}

public class Super_class {

    public static void main(String[] args) {
        Bbb ob = new Bbb(5);
    }
}
