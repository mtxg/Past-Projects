import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class YearlyData 
{
	private ArrayList<MonthlyData> monthlyData = new ArrayList<MonthlyData>();;
	private int year;
	private String stationName;
	private Stats stats;

	public YearlyData()
	{

	}
	public YearlyData(int year, String stationName) throws IOException
	{
		this.year = year;
		this.stationName = stationName;
		File file = new File(stationName + year);
		

	}

	public void parseFile(File file) throws IOException
	{

		FileReader file1 = new FileReader(file);
		BufferedReader reader = new BufferedReader(file1);
		String line = reader.readLine();

		//Skips first line of text document
		line = reader.readLine();

		//creates MonthlyData objects from DailyData objects and stores them in the monthlyData ArrayList

		for(int month = 1; line != null && month <= 12; month++) 
		{
			MonthlyData newMonth = new MonthlyData(year, month);
			while (month == newMonth.getMonth() && line != null)
			{
				String [] day = line.split(",");
				newMonth.parseAndAddDay(day);
				line = reader.readLine();
			}
			monthlyData.add(newMonth);
			line = reader.readLine();

		}
		file1.close();
		reader.close();

	}

	public void computeStats()
	{

	}

	public ArrayList<MonthlyData> getMonthlyData() {
		return monthlyData;
	}

	public int getYear() {
		return year;
	}

	public String getStationName() {
		return stationName;
	}

	public Stats getStats() 
	{
		return stats;
	}


}
