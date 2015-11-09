
/**
 * will hold the daily data for a station
 * 
 * @author max_guerrero
 */

public class DailyData 
{

	Observation rainfall, maxTemp, minTemp, avgTemp;
	int year, month, day;
	String station;
	
	/**
	 * @param year
	 * @param month
	 * @param day
	 * @param station
	 * @param rainfall
	 * @param maxTemp
	 * @param minTemp
	 * @param avgTemp
	 */
	public DailyData(int year, int month, int day, String station, Observation rainfall, 
			Observation maxTemp, Observation minTemp, Observation avgTemp )
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.station = station;
		this.rainfall = rainfall;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.avgTemp = avgTemp;
	}
	
	/**
	 * @return
	 */
	public Observation getRainfall() 
	{
		return rainfall;
	}
	/**
	 * @return
	 */
	public Observation getMaxTemp() 
	{
		return maxTemp;
	}
	/**
	 * @return
	 */
	public Observation getMinTemp() 
	{
		return minTemp;
	}
	/**
	 * @return
	 */
	public Observation getAvgTemp() 
	{
		return avgTemp;
	}
	/**
	 * @return
	 */
	public int getYear() 
	{
		return year;
	}
	/**
	 * @return
	 */
	public int getMonth() 
	{
		return month;
	}
	/**
	 * @return
	 */
	public int getDay() 
	{
		return day;
	}
	
	public String toString()
	{
		return "YEAR: " + year + " Month: " + month + " DAY: " + day + " STATION: " + station + " RAINFALL: " 
				+ rainfall.getValue() + " MAXTEMP: " + maxTemp.getValue() + " MINTEMP: " 
				+ minTemp.getValue() + " AVGTEMP: " + avgTemp.getValue() +"\n";
	}
}
