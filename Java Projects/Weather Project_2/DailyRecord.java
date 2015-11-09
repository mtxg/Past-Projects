
public class DailyRecord extends Record
{
	protected int month, day;
	
	public DailyRecord(double value, int month, int day, int year) 
	{
		super();
		this.value = value;
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString() 
	{
		return "Record value" + value + "Observed on" + day;
	}

}
