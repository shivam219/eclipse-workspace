package jvm;

public class heap_memery {
	public static void main(String[] args) {
		long mb = 1024*1024;
		Runtime r = Runtime.getRuntime();//return instance of signle tone class
		System.out.println("Max memory " + r.maxMemory() /mb + " MB");
		System.out.println("totol memory "+ r.totalMemory() /mb + "MB");
		System.out.println("free memory "+ r.freeMemory()/mb +"MB" );
		System.out.println("consumed meeory "+( r.totalMemory()-r.freeMemory() )%mb+"kb");
	}
}
