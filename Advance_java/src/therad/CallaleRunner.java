package therad;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//return values
class CallTask implements Callable<String> {
	private String name;

	public CallTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallaleRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);//gives number that much thread will run from list of thread
		Future<String> welcomFucture = executorService.submit(new CallTask("welcome future"));
		String name =  welcomFucture.get();
		System.out.println(name);
		System.out.println("\n new callable executed");
		System.out.println("\n main completed");
		List<CallTask> tasks= List.of(new CallTask("task 1"), new CallTask("task 1"),new CallTask("task 1"));
		List<Future<String>> welcomlist = executorService.invokeAll(tasks);
		for(Future<String> d: welcomlist) {
			System.out.println (d.get() +" ");
		}
		executorService.shutdown();
		
	}
}
