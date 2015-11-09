package station;

import java.util.GregorianCalendar;

/**
 * Holds the relevant of the information about a station, as read in from the geoinfo.csv file.
 * 
 * The variables that need to be read in are:
 * stid: station id
 * name: the full name of the station
 * city: the nearest city
 * nlat: latitude (needed for project 5, read it in now)
 * elon: longitude (needed for project 5, read it in now)
 * datc: date the station was commissioned
 * datd: date the station was decommissioned (says 20991231 if the station is still active)
 *  
 * @author amy
 */
public class StationInfo {
	/**
	 * Station id (short)
	 */
	private String stationId;
	
	/**
	 * Descriptive name for the station
	 */
	private String name;
	
	/**
	 * Nearest city 
	 */
	private String city;

	/**
	 * Longitude and latitude
	 */
	private double latitude, longitude;

	/**
	 * Start (commissioning) dates for the station and End (if it has ended)
	 */
	private GregorianCalendar start, end;
	
	/**
	 * Create a new station info object from the info in the csv file.  Use the enum to help parse.
	 * @param infoString
	 */
	public StationInfo(String[] infoString) {
	}

	public String getStationId() {
	}

	public String getName() {
	}

	public String getCity() {
	}

	public double getLatitude() {
	}

	public double getLongitude() {
	}

	public GregorianCalendar getStart() {
	}

	public GregorianCalendar getEnd() {
	}
	
	public String toString() {
	}
	
}
