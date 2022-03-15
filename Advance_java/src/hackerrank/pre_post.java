package hackerrank;

public class pre_post {
	public static int s = 5;

	public static void main(String[] args) {

		pre_post.m1();
		pre_post.m2();
		pre_post.m1();
	}

	public static void m1() {
		pre_post.s = 10;
		System.out.println(s);
	}

	public static void m2() {
		pre_post.s = 20;
		System.out.println(s);
	}

}
