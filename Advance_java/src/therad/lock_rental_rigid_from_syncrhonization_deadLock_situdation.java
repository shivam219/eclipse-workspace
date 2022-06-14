package therad;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock_rental_rigid_from_syncrhonization_deadLock_situdation {
	public static void main(String[] args) {
		Thread t1 = new Thread();

	}
}

class count {
	private int i = 1;
	private int j = 1;
	Lock locki = new ReentrantLock();
	Lock lockj = new ReentrantLock();

	synchronized public void incementj() {
		locki.lock();
		++i;
		locki.unlock();
	}

	synchronized void incementI() {
		lockj.lock();
		++i;
		lockj.unlock();
	}

	public int getJ() {
		return j;
	}

	public int getI() {
		return i;
	}
}

class atoIncream {

	AtomicInteger i = new AtomicInteger();
	AtomicInteger j = new AtomicInteger();

	synchronized public void incementj() {

		i.getAndIncrement();
	}

	synchronized void incementI() {
		j.getAndIncrement();
	}

	public int getJ() {
		return j.get();
	}

	public int getI() {
		return i.get();
	}
}