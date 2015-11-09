
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Station 
{
	private String name;
	private ArrayList<YearlyData> yearlyData = new ArrayList<YearlyData>();
	private StationStatistics statistics = new StationStatistics(null, null, null, null, null);


	public Station()
	{
		
		
	}

	public void loadData(String stationNames, String year) throws IOException, IndexOutOfBoundsException
	{

		System.out.println("Records and Summaries for " + stationNames );
		File station = new File(year + "/" + stationNames.toString() + "_" + year + ".csv");
		YearlyData data = new YearlyData();;
		data.parseFile(station);
		computeStatistics();

	}




	public void computeStatistics() 
	{
		MonthlyData monthlyData = new MonthlyData();
		monthlyData.computeStats();
	}

	public void printStatistics()
	{
		computeStatistics();
	}
}
