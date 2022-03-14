package timer_task;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
//		Timer => A facility for threads to schedule tasks
//				for future execution in a background thread
//	TimerTask => A task that can be scheduled for one-time 
//				or repeated execution by a timer
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int counter = 10;

			@Override
			public void run() {
				if (counter > 0) {
					System.out.println(counter + " Seconds");
					counter--;
				} else {
					System.out.println("Happy new year");
					timer.cancel();
				}
			}

		};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, Calendar.APRIL);
		date.set(Calendar.DAY_OF_MONTH, 14);
		date.set(Calendar.MINUTE, 59);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);

//		timer.schedule(task, date.getTime()); // 
		timer.scheduleAtFixedRate(task, 0, 100); 
								/// task end gap
		
//		timer.scheduleAtFixedRate(task, date.getTime(), 1000); 
								//task       end         gap        
		
	}
}
