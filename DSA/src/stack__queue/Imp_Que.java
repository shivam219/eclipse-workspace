package stack__queue;
public class Imp_Que {
	int arr[] ; int f=0,r=0,size,cap;
	public Imp_Que (int capacity) {
		arr = new int[capacity];
		this.cap=capacity;
	}	
	public  int size() {//resize where data is add
		return r;
	}
	public  int cap() {//capacity of arr
		return cap;
	}
	public  void enQue(int data) {
		if(isCap()) {
			arr[r]=data;
			r++;
		}
	}
	public  int DeQue() {
		int temp =0;
		if(isEmpty()) {
			temp = arr[f];arr[f]=0;
			f++;
		}
		return temp;
	}
	public  int reMo() {
		int temp=0;
		if(r==f) {}
		else{
			 temp =arr[f];arr[f]=0;
			f++;
		}
		return temp;
	}
	public boolean isEmpty() {
		if(r==0) {return true;}
		else{
			return false;
		}}
	public  boolean isCap() {
		if(cap>=r+1) {return true;}
		else {System.out.println("is fully");
		return false;
	}}
	public static void main(String[] args) {
		Imp_Que ob = new Imp_Que(4);
		ob.enQue(1);ob.enQue(2);
		System.out.println(ob.size()+ " " +ob.cap());
		System.out.println(ob.reMo());
		System.out.println(ob.reMo());
		System.out.println(ob.reMo());
	}
}
