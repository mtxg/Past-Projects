import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class UserSettings 
{
	ArrayList<String> stationNames = new ArrayList<String>();
	String year;
	boolean loadAllYears;
	Scanner input = new Scanner(System.in);
	String stationName;
	Station fileName = new Station();
	String station;


	public UserSettings() throws UserInputException, IOException
	{
		getUserInput();
		fileName.loadData(station, year);
	}


	public void getUserInput() throws UserInputException 
	{
		printLocationMenu();
		parseLocationAnswer(getUserAnswer(4));
		printYearMenu();
		parseYearAnswer(getUserAnswer(2));
	}

	private void printLocationMenu()
	{
		System.out.println("Welcome to weather summaries from Oklahoma Mesonet & 2334 Project 2! Please choose"
				+ " a station from the following list: ");
		System.out.println("1. Beaver (BEAV)");
		System.out.println("2. Norman (NRMN)");
		System.out.println("3. Bixby (BIXB)");
		System.out.println("4. All 3 stations");

	}
	// turn the numerical response to a string
	private void parseLocationAnswer(int answer)
	{

		if (answer == 1)
		{
			stationNames.add("BEAV");
			station = stationNames.get(0);
		}
		if(answer == 2)
		{
			stationNames.add("NRMN");
			station = stationNames.get(0);
		}
		if(answer == 3)
		{
			stationNames.add("BIXB");
			station = stationNames.get(0);
		}
		if(answer == 4)
		{
			stationNames.add("BEAV");
			stationNames.add("NRMN");
			stationNames.add("BIXB");
			
		}
		
	}

	private void printYearMenu() 
	{
		System.out.println("Which year would you like to load?");
		System.out.println("1. Choose a year from 2002-2014");
		System.out.println("2. All years");
	}
	// turn the numerical response to a string
	public void parseYearAnswer(int answer) 
	{

		if (answer == 1)
		{
			System.out.println("Which specific year would you like to load ?");

			int answer2 = input.nextInt();
			if(answer2 >= 2002 && answer2 <= 2014)
			{

				year = (String.valueOf(answer2));
			}
			
		}
		if(answer == 2)
		{ 

			for(int i = 2002; i <= 2014; i++)
			{
				if(loadAllYears = true)
				{
					year = (String.valueOf(i));
				}
				
			}
		}
	}

	/*
	 * Scans System.in for a number between 1 and allowed number.
	 * 
	 * @param maxAnswer maximum answer allowed for this menu
	 * @return the answer if it is valid 
	 * @throws UserInputException throw an exception if the answer is invalid
	 */
	private int getUserAnswer(int maxAnswer) throws UserInputException
	{
		int answer = input.nextInt();
		int b = 0;
		if(answer >= 1 && answer <= maxAnswer)
		{
			b = answer;
		}
		return b;
	}

	public ArrayList<String> getStationNames() 
	{
		return stationNames;
	}

	public String getYear() 
	{
		return year;
	}

	public boolean isLoadAllYears(int year) 
	{

		return loadAllYears;
	}


}
