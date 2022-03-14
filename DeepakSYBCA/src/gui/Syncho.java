package gui;


class Display{
	public void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("good morning");
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(name);
	}
	
}

   class MyThread extends Thread{
	   Display d;
	   String name;
	  public MyThread(Display d,String name) {
		  this.d=d;
		  this.name=name;
	  }
	  public void run() {
		  d.wish(name);
	  }
   }

public class Syncho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		MyThread t=new MyThread(d,"dhoni");

		Display d1=new Display();
		MyThread t1=new MyThread(d1,"Yuraj");
		
		t.start();
		t1.start();
	}

}
