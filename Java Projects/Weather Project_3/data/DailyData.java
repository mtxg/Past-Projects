package data;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Set;

/**
 * Holds the data for a single station for a day.  
 *   
 * @author amy
 */
public class DailyData {
	private HashMap<String, Observation> data;
	GregorianCalendar date;
	
	/**
	 * Initialize a new object with the date.  Set the data using set methods
	 * @param month
	 * @param day
	 * @param year
	 */
	public DailyData(int month, int day, int year) {
	}

	public GregorianCalendar getDate() {
	}
	
	/**
	 * Add an observation to the list
	 * @param name
	 * @param ob
	 */
	public void addData(String name, String ob) {
	}
	
	/**
	 * Return the observation for this variable name
	 * 
	 * @param name
	 * @return
	 */
	public Observation getObservation(String name) {
	}
	
	/**
	 * Return the list of observations for this day
	 * @return
	 */
	public Set getObservationNames() {
	}
	
}
