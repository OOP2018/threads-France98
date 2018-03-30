import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class CounterWithLock extends Counter{
	private Lock lock = new ReentrantLock();
	
	public void add(int amount){
		try {
			lock.lock();
			super.add(amount);
		} finally {
			lock.unlock();
		}
	}
}
