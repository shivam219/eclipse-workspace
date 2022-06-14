package therad;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_service {
	public static void main(String[] args) {
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < 50; i++) {
//				System.out.println(" call thread 1 " + i);
//			}
//		});
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < 50; i++) {
//				System.out.println(" call thread 2 " + i);
//			}
//		});
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(() -> {
			System.out.println("task 1 started");
			for (int i = 1; i < 50; i++) {
				System.out.print(" " + i);
			}	System.out.println("task 1 end");
		});
		executorService.execute(() -> {
			System.out.println("task 2 started");
			for (int i = 1; i < 50; i++) {
				System.out.print(" " + i);
			}System.out.println("task 2 end");
		});
		System.out.println("Main started");
		for (int i = 1; i < 50; i++) {
			System.out.print(" " + i);
		}
		System.out.println("Main End");
		executorService.shutdown();
	}
}
