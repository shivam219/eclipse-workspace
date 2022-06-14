package therad;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_Integer {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public void incrementi() {
		i.incrementAndGet();
	}

	public void incrementj() {
		j.incrementAndGet();
	}

	public AtomicInteger getI() {
		return i;
	}

	public AtomicInteger getJ() {
		return j;
	}

	public static void main(String[] args) {

	}

}
