package arraylist;



public class arr_me {

	/*public static void printArray(int[] array) 
	{
		   for (int i = 0; i < array.length; i++) 
		   {
 		      System.out.println(array[i] + " ");
		   }}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 printArray(new int[]{3, 1, 2, 6});
		
		}
*/
	/*public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		 
		}*/
	
	public static boolean equals(int[] is, int[] is2) {
		
	  boolean  tr = is==is2;
		return tr;
		
	}
	public static void main(String[] args) {
		 equals(new int[]{3, 1, 2, 6} ,new int[]{3, 1, 2, 6});
		 
		 System.out.println("shivam");
	}
		
}
