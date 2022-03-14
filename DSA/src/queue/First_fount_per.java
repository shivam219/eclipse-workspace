package queue;

public class First_fount_per {
	public static void main(String[] args) {
		P p[] = new P[] { new P(4, 3), new P(5, 2), new P(6, 3) };
		rout(p);
	}

	public static void rout(P[] p) {
		int dis [] = new int[p.length];
		boolean flag = false; // for have break
		boolean flag2 = false; // for founded
		int tol = 0;int f =0; int lastdis =0;
		for(int i =0 ; i<p.length;i++) {
			dis[i] = p[i].petrol - p[i].dist;
			if((dis[i] + lastdis) <0) {
				f = i+1; lastdis =0;
			}
			
			if((dis[i] + lastdis) >=0) {
				lastdis = dis[i];
			}
			
			
			if(p[p.length]==p[i] && flag) {
				int j =f-1;
				while(j>=0 ) {
					tol+=dis[j]; j--;
				}
				if(f+tol>=0) {
					flag2 = true;
				}
			}
			if(flag2) {
				System.out.println("Yes  "+ (f+1));
			}
		}
	}	
	
	
}


class P {
	int dist, petrol;

	public P(int dist, int petrol) {
		this.dist = dist;
		this.petrol = petrol;
	}
}