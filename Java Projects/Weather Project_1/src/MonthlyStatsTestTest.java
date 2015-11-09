import java.io.IOException;
import org.junit.Test;


public class MonthlyStatsTestTest 
{
	@Test
	public void computeRainStatsTest() throws IOException 
	{
		MonthlyData test = new MonthlyData("testmonth", 2015);
		MonthlyStats testStats = new MonthlyStats(test);
		testStats.computeRainStats(test);
	}
	
	@Test
	public void computeTempStatsTest() throws IOException
	{
		MonthlyData test = new MonthlyData("testmonth", 2015);
		MonthlyStats testStats = new MonthlyStats(test);
		testStats.computeTempStats(test);
	}
}

