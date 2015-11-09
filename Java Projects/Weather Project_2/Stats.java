import java.util.ArrayList;


public class Stats 
{
	private Record maxRain, minRain, maxTemp, minTemp, maxWind, minWind, maxHeatIndex, minWindChill;
	private double totalRainfall;

	
	public Stats()
	{
		
	}
	public Stats(Record maxRain, Record minRain, Record maxTemp, Record minTemp, Record maxWind, Record minWind, 
			Record maxHeatIndex, Record minWindChill, double totalRainfall)
	{
		this.maxRain = maxRain;
		this.minRain = minRain;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.maxWind = maxWind;
		this.minWind = minWind;
		this.maxHeatIndex = maxHeatIndex;
		this.minWindChill = minWindChill;
		this.totalRainfall = totalRainfall;
	}

	public void computeRainTotal(ArrayList<DailyData> dailyData)
	{
		double totalRain = 0.0;
		int i = 0;
		while(i < dailyData.size())
		{
			totalRain += dailyData.get(i).getRainfall().getValue();
			i++;
		}
		totalRainfall = totalRain;

	}

	public void computeRainRecords(ArrayList<DailyData> dailyData)
	{
		int i = 0;
		DailyData max = dailyData.get(i);
		DailyData min = dailyData.get(i);
		while(i < dailyData.size())
		{
			if(dailyData.get(i).getRainfall().getValue() < dailyData.get(i+1).getRainfall().getValue())
			{
				max = dailyData.get(i+1);
			}
			if(dailyData.get(i+1).getRainfall().getValue() > dailyData.get(i).getRainfall().getValue())
			{
				min = dailyData.get(i);
			}
			i++;
		}
		maxRain = new DailyRecord(max.getRainfall().getValue(), max.getDay(), max.getMonth(), max.getYear());	
		minRain = new DailyRecord(min.getRainfall().getValue(), min.getDay(), min.getMonth(), min.getYear());	
	}

	public void computeTemperatureRecords(ArrayList<DailyData> dailyData)
	{
		int i = 0;
		DailyData max = dailyData.get(i);
		DailyData min = dailyData.get(i);
		while(i < dailyData.size())
		{
			if(dailyData.get(i).getMaxTemp().getValue() < dailyData.get(i+1).getMaxTemp().getValue())
			{
				max = dailyData.get(i+1);
			}
			if(dailyData.get(i+1).getMinTemp().getValue() > dailyData.get(i).getMinTemp().getValue())
			{
				min = dailyData.get(i);
			}
			i++;
		}
		maxTemp = new DailyRecord(max.getMaxTemp().getValue(), max.getDay(), max.getMonth(), max.getYear());	
		minTemp = new DailyRecord(min.getMinTemp().getValue(), min.getDay(), min.getMonth(), min.getYear());
	}

	public void computeWindRecords(ArrayList<DailyData> dailyData)
	{
		int i = 0;
		DailyData max = dailyData.get(i);
		DailyData min = dailyData.get(i);
		while(i < dailyData.size())
		{
			if(dailyData.get(i).getMaxWind().getValue() < dailyData.get(i+1).getMaxWind().getValue())
			{
				max = dailyData.get(i+1);
			}
			if(dailyData.get(i+1).getMinWind().getValue() > dailyData.get(i).getMinWind().getValue())
			{
				min = dailyData.get(i);
			}
			i++;
		}
		maxWind = new DailyRecord(max.getMaxWind().getValue(), max.getDay(), max.getMonth(), max.getYear());	
		minWind = new DailyRecord(min.getMinWind().getValue(), min.getDay(), min.getMonth(), min.getYear());
	}

	public void computeMaxHeatIndex(ArrayList<DailyData> dailyData)
	{
		int i = 0;
		DailyData heatIndex = dailyData.get(i);

		while(i < dailyData.size())
		{
			if(dailyData.get(i).getHeatIndex().getValue() < dailyData.get(i+1).getHeatIndex().getValue())
			{
				heatIndex = dailyData.get(i+1);
			}
			i++;
		}
		maxHeatIndex = new DailyRecord(heatIndex.getMaxWind().getValue(), heatIndex.getDay(), 
				heatIndex.getMonth(), heatIndex.getYear());	
	}

	public void computeMaxWindChill(ArrayList<DailyData> dailyData)
	{
		int i = 0;
		DailyData windChill = dailyData.get(i);

		while(i < dailyData.size())
		{
			if(dailyData.get(i+1).getWindChill().getValue() > dailyData.get(i).getWindChill().getValue())
			{
				windChill = dailyData.get(i);
			}
			i++;
		}
		minWindChill = new DailyRecord(windChill.getMaxWind().getValue(), windChill.getDay(), 
				windChill.getMonth(), windChill.getYear());	
	}

	public Record getMaxRain() {
		return maxRain;
	}

	public Record getMinRain() {
		return minRain;
	}

	public Record getMaxTemp() {
		return maxTemp;
	}

	public Record getMinTemp() {
		return minTemp;
	}

	public Record getMaxWind() {
		return maxWind;
	}

	public Record getMinWind() {
		return minWind;
	}

	public Record getMaxHeatIndex() {
		return maxHeatIndex;
	}

	public Record getMinWindChill() {
		return minWindChill;
	}

	public double getTotalRainfall() {
		return totalRainfall;
	}


}
