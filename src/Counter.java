/**
 * An accumulator for a sum.
 */
public class Counter {
	protected long total;
	
	public Counter() {
		total = 0;
	}
	
	/**
	 * Add an amount to the total.
	 */
	public void add(int amount) { total += amount; }
	
	/**
	 * Get the total value of counter.
	 */
	public long get() { return total; }
	
	public static void main(String[] args) {
		Counter c = new Counter();
		c.add(50);
		c.add(-15);
		System.out.println(c.get());
		c.add(-34);
		System.out.println(c.get());
	}
}
