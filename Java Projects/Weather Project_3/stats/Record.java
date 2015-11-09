package stats;
/**
 * Abstract class to hold records (highs and lows) data
 * 
 * @author amy
 *
 */
public abstract class Record {
	protected double value;
	protected int year;
	
	
	/**
	 * Create a record with just the year and value
	 * 
	 * @param value
	 * @param year
	 */
	public Record(double value, int year) {
	}
	
	/**
	 * Create a record with just the value
	 * 
	 * @param value
	 */
	public Record(double value) {
	}

	/**
	 * Require the child classes to print themselves out well
	 */
	abstract public String toString();
	
	public double getValue() {
	}


	public void setValue(double value) {
	}


	public int getYear() {
	}


	public void setYear(int year) {
	}

	
	
}
