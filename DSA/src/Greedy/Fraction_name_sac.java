package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Fraction_name_sac {
	private static double getMaxValue(int[] wt, int[] val, int capacity) {
		Items[] itm = new Items[wt.length];
		for (int i = 0; i < wt.length; i++)
			itm[i] = new Items(wt[i], val[i], i);
		Arrays.sort(itm, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return o2.cost.compareTo(o1.cost);
			}
		});
		double toVal = 0d;
		for(Items i : itm) {
			int curWt = (int) i.wt;
			int curVal = (int) i.val;
			if(capacity- curWt>=0) {
				capacity = capacity - curWt;
				toVal += curVal;
			}
			else {
				double fraction = ((double) capacity / (double)curWt);
				toVal+= (curVal*fraction);
				capacity = (int)(capacity-(curWt*fraction));
				break;
				
			}
		}return toVal;
	}

	public static void main(String[] args) {
	    int[] wt = { 10, 40, 20, 30 };
        int[] val = { 60, 40, 100, 120 };
        int capacity = 50;
 
        double maxValue = getMaxValue(wt, val, capacity);
 
        // Function call
        System.out.println("Maximum value we can obtain = "
                           + maxValue);
	}
}

class Items {
	Double cost;
	double wt, val, ind;

	Items(double wt, double val, double ind) {
		this.wt = wt;
		this.val = val;
		this.ind = ind;
		cost = new Double((double) val / (double) wt);
	}
}