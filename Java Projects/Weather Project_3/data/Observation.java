package data;
/**
 * Holds a single observation.  This class is used to flag data as good or bad.
 * 
 * @author amy
 *
 */
public class Observation {
	/**
	 * The data value 
	 */
	private double value;
	
	/**
	 * True if the data is good and false otherwise
	 */
	private boolean good;

	/**
	 * Data is good if it is > -900
	 * @param value
	 */
	public Observation(double value) {
	}

	/**
	 * Get the value
	 * @return
	 */
	public double getValue() {
	}

	/**
	 * Is the value good? 
	 * 
	 * @return true if the value is good and false otherwise
	 */
	public boolean isGood() {
	}
	
	public String toString() {
	}
	
	
}
