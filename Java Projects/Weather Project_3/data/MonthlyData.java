package data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import stats.Statistics;

/**
 * Stores and parses all of the monthly data for a single station.  
 * Assumes the file only contains data for a single station.
 * @author amy
 *
 */
public class MonthlyData {
	/**
	 * The station name
	 */
	private String stationName = null;

	/**
	 * The month this data is valid for
	 */
	private int month;

	/**
	 * The year this data is valid for
	 */
	private int year;

	/**
	 * The daily data for this station
	 */
	private ArrayList<DailyData> dailyData;

	/**
	 * The statistical data 
	 */
	private Statistics statistics;


	/**
	 * Create a new MonthlyData object from a file of data
	 * 
	 * @param file the File pointer to the data for the month
	 */
	public MonthlyData(int month, int year) {
	}


	/**
	 * Print the monthly summary statistics in a nice way
	 * 
	 */
	public void printStats() {
	}

	public int getYear() {
	}

	/**
	 * Tell the month to compute stats for the variables specified
	 */
	public void computeStatistics(HashMap <String, DataInfo> dataMap) {
	}
	

	/**
	 * Parses a single day of data (as a string) and adds it to the daily list
	 * @param readings one line of data (already split)
	 * @param nameMapping the mapping from the variable names to the index into the data array (created from the top line of the file)
	 */
	public void parseAndAddDay(String[] readings, HashMap <String, Integer> nameMapping) {
	}


	public ArrayList<DailyData> getDailyData() {
	}
	
	


}
