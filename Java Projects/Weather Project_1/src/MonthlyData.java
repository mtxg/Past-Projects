import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * will read in a month of data from a text file, parse it, and create the daily data
 * 
 * @author max_guerrero
 */

public class MonthlyData 
{
	
	private ArrayList<DailyData> dailyData = new ArrayList<DailyData>();
	int year;
	String month;
	
	/**
	 * @param month
	 * @param year
	 * @throws IOException
	 */
	public MonthlyData (String month, int year) throws IOException
	{
		this.year = year;
		this.month = month;
		FileReader file = new FileReader(month.toString() + "_" + year + ".csv");
		
		BufferedReader reader = new BufferedReader(file);
	    String line = reader.readLine();
	    
	    //Skips first line of text document
	    line = reader.readLine();
	    
	    //creates DailyData objects from text document and stores them in the dailyData ArrayList
	    while ((line != null)) 
	    { 
	    	
	    	//split line on commas by creating an array and using parse
	        String [] monthlyData = line.split(",");
	        
	        int yearGiven = Integer.parseInt(monthlyData[0]); 
	        int monthGiven = Integer.parseInt(monthlyData[1]); 
	        int day = Integer.parseInt(monthlyData[2]); 
	        String stationGiven = monthlyData[3];
	        
	        Observation tmax = new Observation(0.0);
	        Observation tmin = new Observation(0.0);
	        Observation tavg = new Observation (0.0);
	        Observation rainFall = new Observation(0.0);
	        try
	        {
	        tmax = new Observation(Double.parseDouble(monthlyData[4]));
	        }
	        catch (NumberFormatException e)
	        {
	        	tmax = new Observation(-1);
	        }
	        
	        try
	        {
	        tmin = new Observation(Double.parseDouble(monthlyData[5]));
	        }
	        catch (NumberFormatException e)
	        {
	        	tmin = new Observation(-1);
	        }
	        
	        try
	        {
	        tavg = new Observation(Double.parseDouble(monthlyData[6]));
	        }
	        catch (NumberFormatException e)
	        {
	        	tavg = new Observation(-1);
	        }
	        
	        try
	        {
	        rainFall = new Observation(Double.parseDouble(monthlyData[7]));
	        }
	        catch (NumberFormatException e)
	        {
	        	rainFall = new Observation(-1);
	        }
	        
	        DailyData data = new DailyData(yearGiven, monthGiven, day, stationGiven, rainFall, tmax, tmin, tavg);
	        dailyData.add(data);
	        
	        line = reader.readLine();	        	       		
	    }
	    reader.close();
	    file.close();
	}

	/**
	 * @return
	 */
	public ArrayList<DailyData> getDailyData()
	{
		return dailyData;
	}
	
}

