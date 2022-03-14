package contructor;

public class t_p_c {
    int a,b,c,mi,di,mu;///instance variable
    		///10		5
	t_p_c( int aa, int bb){
	a=aa;
	b=bb;
	
	c=aa+bb;
	mi=aa-bb;
	di=aa/bb;
	mu=aa*bb;
	}
	public static void main(String[] args) {
		
	t_p_c ob1 = new t_p_c(10,5);////////t_p_c( int aa, int bb)
	System.out.println("first value "+ob1.a);
	System.out.println("second value "+ob1.b+"\n");
	System.out.println("Addition = "+ob1.c);
	System.out.println("minus = "+ob1.mi);
	System.out.println("division = "+ob1.di);
	System.out.println("miltiple = "+ob1.mu);
	
	}
}
