/**
 * Count using synchronized method.
 * @author Phanuwatch Luangpradit
 *
 */
public class SynchronousCounter extends Counter{
	
	/**
	 * Add an amount.
	 */
	@Override
	public synchronized void add(int amount){
		super.add(amount);
	}
}
