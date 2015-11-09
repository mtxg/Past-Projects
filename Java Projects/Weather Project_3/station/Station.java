package station;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import stats.Statistics;
import data.DailyData;
import data.DataInfo;
import data.MonthlyData;
import data.YearlyData;

/**
 * A Station Object holds all the information for a single station, including its geographic info (stored in StationInfo)
 * and all of its data
 *  
 * @author amy
 */
public class Station {
	/**
	 * The info for this station
	 */
	private StationInfo stationInfo;
	
	/**
	 * The yearly data is stored as a hash map to make it easy to get to a single year.  The key is the year and the values are
	 * YearlyData objects.
	 */
	private HashMap<Integer,YearlyData> yearlyData;

	/**
	 *  The statistics and records for this station
	 */
	private Statistics stats;	
	
	/**
	 * Construct a station with the name and initialize the yearly data
	 * @param stationName
	 */
	public Station(StationInfo stationInfo) {
	}

	/**
	 * Computes the statistics for this station given whatever data is loaded (one year or more)
	 */
	public void computeStatistics(HashMap <String, DataInfo> dataMap) {
	}

	/**
	 * Nicely print the statistics
	 */
	public void printStatistics(String variable) {
	}
	
	/**
	 * Adds a new set of data from the csv file.  This is one line, already split using the commas
	 * @param data one line of data (already split)
	 * @param nameMapping the mapping from the variable names to the index into the data array (created from the top line of the file)
	 */
	public void addData(String[] data, HashMap <String, Integer> nameMapping) {
	}

	public Statistics getStats() {
	}

	public StationInfo getStationInfo() {
	}

	
	
}
