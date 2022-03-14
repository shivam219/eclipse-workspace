package new_instance;

class A {  int a; } 
class B {  int b; } 
class Student5{
	int e;
	
}
class Employee7{
	int f ;
}
  
public class NewInstance 
{ 
    
    public static void ObjectCreatedMethod(String c)  throws Exception
      
    { 
     
        Object obj = Class.forName(c).newInstance(); 
  
       
        System.out.println("Object created for class is:"
                        + obj.getClass().getName()); 
    } 
  
   
    public static void main(String[] args) throws Exception 
    
    { 
//    	ObjectCreatedMethod("Student5"); 
    	ObjectCreatedMethod("java.lang.String");
    	ObjectCreatedMethod("java.lang.Object");
    
    }    
} 

