import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

public class MonthlyDataTest 
{
	@Test
	public void parseDataTest() throws IOException 
	{
		
		MonthlyData test = new MonthlyData("testmonth", 2015);
		ArrayList<DailyData> actual = test.getDailyData();
		System.out.print(actual.toString());
	}

}
