/**
 * Remove number from Counter.
 * @author Phanuwatch Luangpradit
 *
 */
public class SubtractTask implements Runnable{
	private Counter counter;
	private int limit;
	
	/**
	 * Constructor
	 */
	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * Remove the number from Counter.
	 */
	@Override
	public void run() {
		for(int i = 1; i<=limit ; i++){
			counter.add(-i);
		}System.out.println("Done "+Thread.currentThread().getName());
	}
}
