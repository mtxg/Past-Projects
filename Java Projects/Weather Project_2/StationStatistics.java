import java.util.ArrayList;


public class StationStatistics 
{
	private Record recordHighTemp, recordLowTemp, recordHighWind, recordDailyRain, recordAnnualRain;
	
	public StationStatistics(Record recordHighTemp, Record recordLowTemp, Record recordHighWind, Record recordDailyRain,
			Record recordAnnualRain)
	{
		this.recordHighTemp = recordHighTemp;
		this.recordLowTemp = recordLowTemp;
		this.recordHighWind = recordHighWind;
		this.recordDailyRain = recordDailyRain;
		this.recordAnnualRain = recordAnnualRain;
	}
	
	private void computeAnnualRainfallRecord(ArrayList<YearlyData> yearlyData)
	{
		
	}
	private void computeWindChillRecord(ArrayList<YearlyData> yearlyData)
	{
		
	}
	private void computeHeatIndexRecord(ArrayList<YearlyData> yearlyData)
	{
		
	}
	private void computeWindRecords(ArrayList<YearlyData> yearlyData)
	{
		
	}
	private void computeRainRecords(ArrayList<YearlyData> yearlyData)
	{
		
	}
	private void computeTempRecords(ArrayList<YearlyData> yearlyData)
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "StationStatistics [recordHighTemp=" + recordHighTemp
				+ ", recordLowTemp=" + recordLowTemp + ", recordHighWind="
				+ recordHighWind + ", recordDailyRain=" + recordDailyRain
				+ ", recordAnnualRain=" + recordAnnualRain + "]";
	}
	
	
}
	
