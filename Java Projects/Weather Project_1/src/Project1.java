import java.io.IOException;

/**
 * contains the main method and runs the project
 * 
 * @author max_guerrero
 */

public class Project1 
{
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException 
	{
		MonthlyData test2010 = new MonthlyData("august", 2010);
		MonthlyData test2011 = new MonthlyData("august", 2011);
		MonthlyData test2012 = new MonthlyData("august", 2012);
		MonthlyData test2013 = new MonthlyData("august", 2013);
		MonthlyData test2014 = new MonthlyData("august", 2014);
		MonthlyStats testStats = new MonthlyStats(test2011);
		//Prints out the weather statistics for 2010
		System.out.println("These are the weather statistics for 2010:");
		testStats.computeRainStats(test2010);
		testStats.computeTempStats(test2010);
		System.out.print("\n");
		//Prints out the weather statistics for 2011
		System.out.println("These are the weather statistics for 2011:");
		testStats.computeRainStats(test2011);
		testStats.computeTempStats(test2011);
		System.out.print("\n");
		//Prints out the weather statistics for 2012
		System.out.println("These are the weather statistics for 2012:");
		testStats.computeRainStats(test2012);
		testStats.computeTempStats(test2012);
		System.out.print("\n");
		//Prints out the weather statistics for 2013
		System.out.println("These are the weather statistics for 2013:");
		testStats.computeRainStats(test2013);
		testStats.computeTempStats(test2013);
		System.out.print("\n");
		//Prints out the weather statistics for 2014
		System.out.println("These are the weather statistics for 2014:");
		testStats.computeRainStats(test2014);
		testStats.computeTempStats(test2014);
		System.out.print("\n");
				
	}
}
