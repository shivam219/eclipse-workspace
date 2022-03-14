package new_instance;
class Shivam{}
public class Istance { 
	 public static void ObjectCM(String c)throws Exception {
		     
		        Object obj = Class.forName(c).newInstance(); 
		  
		       
		        System.out.println("Object created for class is:"
		                        + obj.getClass().getName()); 
		    } 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Thread t = new  Thread();
//		System.out.println( t instanceOf Object());
//		System.out.println(Class.forName(args[0).isInstance(t)); // use to true
//		System.out.println(Class.forName(args[0).isInstance(t));

//    	ObjectCM("DemoInstance"); 
    	ObjectCM("java.lang.String");
//    	ObjectCM("Shivam");
    	ObjectCM("java.lang.Object");/// use it's in servelt
//    	finding 
    	Thread t = new Thread();
    	System.out.println(t instanceof Object);
    	System.out.println(t instanceof Object);
		

	}

}
//