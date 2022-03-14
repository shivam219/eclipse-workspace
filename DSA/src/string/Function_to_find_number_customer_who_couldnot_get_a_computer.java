package string;

public class Function_to_find_number_customer_who_couldnot_get_a_computer {
	static int MAX_CHAR = 26;
	// n is number of computers in cafe. 
	// 'seq' is given sequence of customer entry, exit events 
	static int runCustomerSimulation(int n, char []seq) {
	    char []seen = new char[MAX_CHAR];   int res = 0; 
	    int occupied = 0; // To keep track of occupied computers 
	    for (int i=0; i< seq.length; i++) 
	    {
	        int ind = seq[i] - 'A'; //65
	        if (seen[ind] == 0) 
	        { 
	        	seen[ind] = 1; 
	            if (occupied < n) { 
	                occupied++; 
	                seen[ind] = 2; 
	            } 
	            else
	                res++; 
	        } 
	        else{ 
	          if(seen[ind] == 2) 
	            occupied--; 
	            seen[ind] = 0; 
	        } 
	    } 
	    return res; 
	} 
	public static void main(String[] args)
	{
	    System.out.println(runCustomerSimulation(2, "ABBAKZKZ".toCharArray())); 
	    System.out.println(runCustomerSimulation(1, "ABCBCADEED".toCharArray())); 
	}
}
