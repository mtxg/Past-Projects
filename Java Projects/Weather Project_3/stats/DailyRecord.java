package stats;
/**
 * Holds the information for a daily record (so we need to know the day and month in addition to the year) 
 * 
 * @author amy
 *
 */
public class DailyRecord extends Record {
	/**
	 * The month and the day
	 */
	int month, day;

	
	/**
	 * Create the daily record
	 * 
	 * @param value
	 * @param year
	 * @param month
	 * @param day
	 */
	public DailyRecord(double value, int year, int month, int day) {
	}


	/**
	 * Create a record with no date information (to be set later)
	 * 
	 * @param value
	 */
	public DailyRecord(double value) {
	}


	public int getMonth() {
	}


	public void setMonth(int month) {
	}


	public int getDay() {
	}


	public void setDay(int day) {
	}

	/**
	 * Set the date
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
	public void setDate(int month, int day, int year) {
	}
	

	/**
	 * Nicely display the record information
	 */
	@Override
	public String toString() {
	}
	
	
	
	

}
