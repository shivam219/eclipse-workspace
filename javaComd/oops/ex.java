
class ex{
	public static void main(String[] args)  {
		doMo();
		System.out.println("main ");
	
}
	public static void doMo(){
		System.out.println("shivam");
		doMoo();
		try	{
		System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println(e);
		}
			System.out.println("complete");
		
	}
	public static void doMoo(){
		
		System.out.println(10/0);
		
	}
}