package contructor;

public class soal {
	private static int a,b,c;
  
	/*soal(int aa,int bb){
		a=aa;
		b=bb;
		c=a+b;
	}*/
	soal(){
		a=10;
		b=10;
		c=a+b;}

		

	public static void main(String[] args) {
			soal ob1=  new soal();
			System.out.println(ob1.c);
			
	}

}
