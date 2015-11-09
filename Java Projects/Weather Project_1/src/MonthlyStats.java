
/**
 *  will compute and hold the maximum, average, and minimum data for a variable
 * (temperature and rainfall) for the month 
 * 
 * @author max_guerrero
 */

public class MonthlyStats 
{
	Observation maxRain, minRain, avgRain,
	maxTemp, minTemp, avgTemp;
	
	public MonthlyStats(MonthlyData data)
	{
		
	}

	/**
	 * outputs the maximum, average, and minimum rainfall
	 * 
	 * @param data
	 */
	public void computeRainStats(MonthlyData data) 
	{
		//Computes the max and min and avg rain for the month
		Observation rainOneFirst = new Observation(data.getDailyData().get(0).getRainfall().getValue());
		double minValue = rainOneFirst.getValue();//counts the first object in the ArrayList
		double maxValue = 0.0;
		int days = data.getDailyData().size();
		double sum = 0.0;
		for (int i = 0; i < data.getDailyData().size(); i++) 
		{
			for (int j = i+1; j < data.getDailyData().size(); j++)
			{
				Observation rainOne = new Observation(data.getDailyData().get(j).getRainfall().getValue());
				Observation rainTwo = new Observation(data.getDailyData().get(i).getRainfall().getValue());
				if (rainOne.getValue() > rainTwo.getValue() && rainOne.isGood() && rainTwo.isGood())
				{
					if (rainOne.getValue() > maxValue)
						maxValue = rainOne.getValue();
				}
				if (rainOne.getValue() < rainTwo.getValue() && rainOne.isGood() && rainTwo.isGood())
				{
					if (rainOne.getValue() < minValue)
						minValue = rainOne.getValue();		
				}
			}
			Observation rainOne = new Observation(data.getDailyData().get(i).getRainfall().getValue());
			// if there is a negative number, day with neg number will not be counted in the average
			if (rainOne.isGood())
			{
				sum += rainOne.getValue();
			}
			else
			{
				days = days - 1; // subtract the day so there is not a wrong average
			}
		}
		avgRain = new Observation(sum/days);
		maxRain = new Observation(maxValue);
		minRain = new Observation(minValue);
		System.out.println("The max rainfall is: " + maxRain.getValue());
		System.out.println("The min rainfall is: " + minRain.getValue());
		System.out.println("The average rainfall is: " + avgRain.getValue());
	}
	/**
	 * outputs the maximum, average, and minimum temperatures
	 * 
	 * @param data
	 */
	public void computeTempStats(MonthlyData data)
	{
		//Computes the max and min and avg. temperature for the month
		Observation tempOneFirst = new Observation(data.getDailyData().get(0).getMinTemp().getValue());
		double minValue = tempOneFirst.getValue();//counts the first object in the ArrayList
		double maxValue = 0.0;
		int days = data.getDailyData().size();
		double sum = 0.0;
		for (int i = 0; i < data.getDailyData().size(); i++) 
		{
			for (int j = i+1; j < data.getDailyData().size(); j++)
			{
				Observation tempOne = new Observation(data.getDailyData().get(j).getMaxTemp().getValue());
				Observation tempTwo = new Observation(data.getDailyData().get(i).getMaxTemp().getValue());
				if (tempOne.getValue() > tempTwo.getValue() && tempOne.isGood() && tempTwo.isGood() )
				{
					if (tempOne.getValue() > maxValue)
					{
						maxValue = tempOne.getValue();
					}

					if (tempOne.getValue() < tempTwo.getValue() && tempOne.isGood() && tempTwo.isGood() )
					{
						if (tempOne.getValue() < minValue)
						{
							minValue = tempOne.getValue();  	
						}
					}
				}	    
			}
			Observation tempOne = new Observation(data.getDailyData().get(i).getAvgTemp().getValue());
			// if there is a negative number, day with negr number will not be counted in the average
			if (tempOne.isGood())
			{
				sum += tempOne.getValue();
			}
			else
			{
				days = days - 1;// subtract the day so there is not a wrong average
			}
		}
		avgRain = new Observation(sum/days);
		maxTemp = new Observation(maxValue);
		minTemp = new Observation(minValue);
		System.out.println("The max temperature is: " + maxTemp.getValue());
		System.out.println("The min temperature is: " + minTemp.getValue());
		System.out.println("The average temperature is: " + avgRain.getValue());
	}

}
