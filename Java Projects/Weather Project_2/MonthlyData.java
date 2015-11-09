import java.io.IOException;
import java.util.ArrayList;

public class MonthlyData 
{
	private ArrayList<DailyData> dailyData = new ArrayList<DailyData>();
	private String stationName;
	private int year;
	private int month;
	private Stats stats;

	public MonthlyData()
	{
		
	}
	
	public MonthlyData(int year, int month)
	{
		this.year = year;
		this.month = month;
	}

	public void computeStats()
	{
		stats = new Stats();
		int day = 0;
		while(day < dailyData.size())
		{
			dailyData.add(dailyData.get(day));
			day++;
		}
		
		stats.computeMaxHeatIndex(dailyData);
		stats.computeMaxWindChill(dailyData);
		stats.computeRainRecords(dailyData);
		stats.computeRainTotal(dailyData);
		stats.computeTemperatureRecords(dailyData);
		stats.computeWindRecords(dailyData);
		
		System.out.println(stats.toString());
	}

	public void parseAndAddDay(String [] monthlyData) throws IOException, NullPointerException
	{

		//split line on commas by creating an array and using parse
		int yearGiven = Integer.parseInt(monthlyData [0]);
		int monthGiven = Integer.parseInt(monthlyData [1]);
		month = monthGiven;
		int day = Integer.parseInt(monthlyData [2]);
		String stationGiven = monthlyData [3];

		//Initialize stat objects and use try-catch while to set them
		Observation tmax = new Observation(0.0);
		Observation tmin = new Observation(0.0);
		Observation tavg = new Observation (0.0);
		Observation rainFall = new Observation(0.0);
		Observation maxWind = new Observation(0.0);
		Observation minWind = new Observation(0.0);
		Observation avgWind = new Observation(0.0);
		Observation heatIndex = new Observation(0.0);
		Observation windChill = new Observation(0.0);

		try {
			tmax = new Observation(Double.parseDouble(monthlyData [4]));
		} catch (NumberFormatException e) { 
			tmax = new Observation(-900);
		}
		try {
			tmin = new Observation(Double.parseDouble(monthlyData [5]));
		} catch (NumberFormatException e) { 
			tmin = new Observation(-900);
		}
		try {
			tavg = new Observation(Double.parseDouble(monthlyData [6]));
		} catch (NumberFormatException e) { 
			tavg = new Observation(-900);
		}
		try {
			maxWind = new Observation(Double.parseDouble(monthlyData [7]));
		} catch (NumberFormatException e) { 
			maxWind = new Observation(-900);
		}
		try {
			minWind = new Observation(Double.parseDouble(monthlyData [8]));
		} catch (NumberFormatException e) { 
			minWind = new Observation(-900);
		}
		try {
			avgWind = new Observation(Double.parseDouble(monthlyData [9]));
		} catch (NumberFormatException e) { 
			avgWind = new Observation(-900);
		}
		try {
			rainFall = new Observation(Double.parseDouble(monthlyData [10]));
		} catch (NumberFormatException e) { 
			rainFall = new Observation(-900);
		}
		try {
			heatIndex = new Observation(Double.parseDouble(monthlyData [11]));
		} catch (NumberFormatException e) { 
			heatIndex = new Observation(-900);
		}
		try {
			windChill = new Observation(Double.parseDouble(monthlyData [12]));
		} catch (NumberFormatException e) { 
			windChill = new Observation(-900);
		}


		DailyData data = new DailyData(yearGiven, monthGiven, day, stationGiven, tmax, tmin, 
				tavg, maxWind, minWind, avgWind,rainFall, heatIndex, windChill);
		dailyData.add(data);


	}

	public String getStationName() {
		return stationName;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public Stats getStats() {
		return stats;
	}

	public ArrayList<DailyData> getDailyData()
	{
		return dailyData;
	}

	//Used to test if data was retrieved
	public void printStats()
	{
		System.out.println(dailyData.toString());
	}

}
