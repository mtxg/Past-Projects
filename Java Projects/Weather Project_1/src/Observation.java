
/**
 * holds a single observation and flag it if is bad (so you don’t use it in the statistics)
 * 
 * @author max_guerrero
 */

public class Observation 
{
	
	boolean good;
	double value;
	
	
	/**
	 * @param value
	 */
	public Observation(double value)
	{
		this.value = value;
	}
	
	/**
	 * @return
	 */
	public boolean isGood()  
	{
		if (this.value >= 0.0 )
			return true;
		else
			return false;
	}
	
	/**
	 * @return
	 */
	public double getValue() {
		return value;
	}
}
	
