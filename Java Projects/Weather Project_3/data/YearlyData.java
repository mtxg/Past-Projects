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
 * Holds on year of data for a single station
 * @author amy
 *
 */
public class YearlyData {
	/**
	 * The list of monthly data
	 */
	private HashMap<Integer, MonthlyData> monthlyData;
	
	/**
	 * What year this is
	 */
	private int year;
	
	/**
	 * Statistical data for the year 
	 */
	private Statistics stats;
	
	
	/**
	 * Create a new year's worth of data from a file
	 * 
	 * @param year
	 */
	public YearlyData(int year) {
	}


	public int getYear() {
	}


	/**
	 * Add a line of data to this station
	 * @param data one line of data (already split)
	 * @param nameMapping the mapping from the variable names to the index into the data array (created from the top line of the file)
	 */
	public void addData(String[] data, HashMap <String, Integer> nameMapping) {
	}


	/**
	 * Compute statistics on the year of data
	 */
	public void computeStatistics(HashMap <String, DataInfo> dataMap) {
	}


	public HashMap<Integer, MonthlyData> getMonthlyData() {
	}

	
	

}
