package input;



class AA {
    public AA() { // if don't mention int super 
        System.out.println("IN a");
    }
    public AA(int i) {
        System.out.println("second a");
    }
    
    
}

class BB extends AA {
    public BB() {
        super(5);// it will call parameter construtor
        System.out.println("IN B");
    }
    public BB(int i) {
        super(i);// it will call parameter construtor
        System.out.println("second b");
    }
}

public class Intera_multi_ple {
    public static void main(String[] args) {
        BB ob= new BB(5);
      
    }

}