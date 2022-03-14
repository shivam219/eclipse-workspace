package Greedy;

public class Activity_Selection_problem {

	public static void main(String[] args) {
		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };

		solve(s, f);
	}

	private static void solve(int[] s, int[] f) {
		{
			int i, j;

			System.out.print("Followixng activities are selected :   ");

			// The first activity always gets selected
			i = 0;
			System.out.print(i + " ");

			// Consider rest of the activities
			for (j = 1; j < f.length; j++) {
				// If this activity has start time greater than or
				// equal to the finish time of previously selected
				// activity, then select it
				if (s[j] >= f[i]) {
					System.out.print(" -> "+ j );
					i = j;
				}
			}
		}
	}
}
