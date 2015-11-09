
public class DailyData 
{

	private Observation rainfall, maxTemp, minTemp, avgTemp, maxWind, minWind, avgWind, heatIndex, windChill;
	private int year, month, day;
	private String station;


	public DailyData(int year, int month, int day, String station, Observation rainfall, 
			Observation maxTemp, Observation minTemp, Observation avgTemp, Observation maxWind, Observation minWind,
			Observation avgWind, Observation heatIndex, Observation windChill)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.station = station;
		this.rainfall = rainfall;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.avgTemp = avgTemp;
		this.maxWind = maxWind;
		this.minWind = minWind;
		this.avgWind = avgWind;
		this.heatIndex = heatIndex;
		this.windChill = windChill;
	}


	public Observation getRainfall() 
	{
		return rainfall;
	}

	public void setRainfall(Observation rainfall) 
	{
		this.rainfall = rainfall;
	}

	public Observation getMaxTemp() 
	{
		return maxTemp;
	}

	public void setMaxTemp(Observation maxTemp) 
	{
		this.maxTemp = maxTemp;
	}

	public Observation getMinTemp() 
	{
		return minTemp;
	}

	public void setMinTemp(Observation minTemp) 
	{
		this.minTemp = minTemp;
	}

	public Observation getAvgTemp() 
	{
		return avgTemp;
	}

	public void setAvgTemp(Observation avgTemp) 
	{
		this.avgTemp = avgTemp;
	}

	public Observation getMaxWind()
	{
		return maxWind;
	}

	public void setMaxWind(Observation maxWind) 
	{
		this.maxWind = maxWind;
	}

	public Observation getMinWind() 
	{
		return minWind;
	}

	public void setMinWind(Observation minWind) 
	{
		this.minWind = minWind;
	}

	public Observation getAvgWind() 
	{
		return avgWind;
	}

	public void setAvgWind(Observation avgWind) 
	{
		this.avgWind = avgWind;
	}

	public Observation getHeatIndex()
	{
		return heatIndex;
	}

	public void setHeatIndex(Observation heatIndex) 
	{
		this.heatIndex = heatIndex;
	}

	public Observation getWindChill() 
	{
		return windChill;
	}

	public void setWindChill(Observation windChill) 
	{
		this.windChill = windChill;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}

	public String getStation() 
	{
		return station;
	}

	public void setStation(String station) 
	{
		this.station = station;
	}

	@Override
	public String toString() 
	{

		return "DailyData [YEAR: " + year + " Month: " + month + " Day: " + day + " Station: " + station + " Rainfall: " 
				+ rainfall + " MaxTemp: " + maxTemp+ " MinTemp: " + minTemp+ " AvgTemp: " + avgTemp  + " MaxTind: " + 
				maxWind + " MinWind: " + minWind + " AvgWind: " + avgWind + " HeatIndex: " + heatIndex + " WindChill: "
				+ windChill+ "]";

	}


}
