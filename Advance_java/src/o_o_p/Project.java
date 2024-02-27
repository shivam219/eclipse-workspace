package o_o_p;
// concept of oops of java
// what is oops --> oop revolves around the concept of "objects." 
// an object is a self-contained unit that consists of data (attributes) and functions (methods) that operate on that data. 
// template for creating objects. It serves as a fundamental building block of object-oriented programming (OOP).
// A class defines the properties (attributes) and behaviors (methods) that an object will have. Objects are instances of classes,
// and they represent real-world entities in a program
/*advantage of introducing oop concept in java language so that they inhance power of language
 *security- Encapsulating data field , and provide get setter method to deal with it -so no one directly access to property of class
 *reusiblity- Inheritance IS-A relationship - program is employer and type 
 *polymorphism - flexibility -- two way comile time- method over-loading,  Runtime  - overriding
 *abstaction - two ways interface and abstract class  
 * 
 */
// Class-->Object-->Inheritance-->Polymorphism-->Abstraction-->Encapsulation
//object --> have some state behavior 
//object can be defined as an instance
//Object contains an address and take up some space in memory 
//Inheritance 
/* Method Overriding (so runtime polymorphism can be achieved)
 *  IS-A relationship - program is employer
 * Type of In
 * single       -> A-->B
 * multiple     -> A,B-->C - Not support
 * multiplie    -> A-->B-->C-->D
 * hierarchical -> A-->B,A-->C,A-->D
 * Hybride 		-> A-->B,B-->A Not support
 */

//Polymorphism
/* compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.
 *==>compitle-time-method overloading
 *-->Same Name 
 *-->Within same class
 *-->Different-Argument
 *-->No of arg, Types of arg, Sequesce of arg
 *==>Runtime-time -method overrind
 *-->Sanme Name
 *-->Different class
 *-->Same agrument
 *-->No arg,  Type of arg, sequence of arg
 *-->IS-A relationship
 *-->Covariant return type:- at class and excepton 
 *-->When overrinden method in child class should be have  child relation in return string and parent class as Object is valid reverse in no valid
 *--> exception - parent m1() throws Exception child m1() throws InterruptedException valid reverse in valid
 *-->is executed
*/ 
//Abstraction
/* It can have abstract and non-abstract methods (method with the body)
 * abstraction - (0-100)
 * 
 */

//Encapsulation 
/*
 * Encapsulation in java is mechanism of wrapping the data -varible and code
 * code acting on the data method together as a single unti in encapsulation the
 * varible of a class will be hidden from other class accessed only through th
 * emethods of their current class Getter and Setter method
 */

//Oops moduleb
/*
 *code reusibilty using inheritance or polymorphisam
 *Secuity- Abstraction , Data hiding Encaption, tightly couple 
 */

// Abstraction and Encapsulation
/* Abstraction  ->is detail hiding (implementation)
 * Encapsulation-> is data hiding (information hiding)
 * 
 * Data abstraction -> deals with exposing the interface
 * hiding the details of implementaion
 * Encapsulation-> group together data and methods that
 * act upon the data 
 * 
 */




// non static variable , local valriable -- in block, instance variable-- in class
// static variable -- global variable
/*
 *  reference type-- string a = "helo" -- having address of object
 *  a == 1005 1005=="helo"
*/



class A {
	public void m1() {
		System.out.println("T");
	}

	int a = 10;
}

final public class Project extends A {

	public static void main(String[] args) {
		Project a = new Project();
		a.m1();


	}
}






