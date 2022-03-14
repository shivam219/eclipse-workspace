package M_f;

public class bishop {

	  public int solve(int row, int col) {
	       int ws =  min(row-1, col-1);
	       int se =  min(row-1 , 8-col);
	       int en =  min(8-row , 8-col);
	       int nw =  min(8-row, col-1);
	       return ws  + se + en + nw;
	    }
	    public static int  min(int a, int b){
	        return a>=b?b:a;
	    }

}
