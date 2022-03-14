class ud extends RuntimeException{
	public ud(String str) {
		super(str);System.out.println("ss"); m1();
	}
	
	public static void m1(){
		System.out.println("ss");
		main(null);
	}
	public static void main(String[] args) {
		String str = " user define by constructing ";
		throw new ud(str);
	}

}
