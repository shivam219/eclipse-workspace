package input;

class pen {
	public void write() {
		System.out.println("in in pen ");

	}

}

class pencil {

	public void write() {
		System.out.println("in in pencil ");

	}
}

class kit {
	
	public void  dosome (pen p) {
	
		p.write();

	}
}

public class Interface_pr {
	public static void main(String[] args) {
		pen  p = new pen()	;
		
		kit ob = new kit();
		ob.dosome(p); 
	
	} 
}
