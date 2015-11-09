package stats;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;

import data.DailyData;
import data.DataInfo;
import data.Observation;

/**
 * Stores the statistics and records
 * 
 * @author amy
 *
 */
public class Statistics {
	HashMap<String, Record> records;
	
	/**
	 * Total rain is separate because it has to be computed
	 */
	Record totalRain;
	
	/**
	 * Examine a list of daily data (and don't care how long the list is) so it could
	 * be a month or a year or more of data.  Compute records for each ob on it.  Note
	 * that the total rainfall calculation is the total over whatever period of data
	 * is sent in.
	 * 
	 * @param yearlyData
	 */
	public Statistics(Collection<DailyData> dailyData, HashMap <String, DataInfo> dataMap) {
	}
	
	

	/**
	 * Compute a max record
	 * @param variable
	 * @param dailyData
	 */
	private void computeMaxRecord(String variable, Collection<DailyData> dailyData) {
	}
	
	/**
	 * Compute a  min record
	 * @param variable
	 * @param dailyData
	 */
	private void computeMinRecord(String variable, Collection<DailyData> dailyData) {
	}


	/**
	 * Print stats for the requested variable
	 * @param variable
	 * @return
	 */
	public String printForVariable(String variable) {
	}

	public Record getTotalRain() {
	}

	public HashMap<String, Record> getRecords() {
	}
	
	
	
}
