import java.util.concurrent.atomic.AtomicLong;

/**
 * Count using AtomicLong.
 * @author Phanuwatch Luangpradit
 *
 */
public class AtomicCounter extends Counter{

	private AtomicLong total;
	
	/** Constructor */
	public AtomicCounter(){
		total = new AtomicLong();
	}
	
	/** add amount to the total. */
	public void add(int amount){
		total.getAndAdd(amount);
	}
	
	/** return the total as a long value. */
	public long get(){
		return total.get();
	}
	
}
