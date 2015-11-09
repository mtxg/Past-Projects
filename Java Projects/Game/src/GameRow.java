
public class GameRow {
    private boolean isEmptySpace;
    private int freePosition;

    /**
     * 
     * Fill In Code Here
     * 
     */
    public GameRow()
    {
    	
       GameRow row = new GameRow();
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public GameRow(int freePosition)
    {
    	//create a row that is not empty,
    	//and has a free position that is given
    	GameRow row = new GameRow();
    	this.freePosition = freePosition;
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public boolean isEmpty()
    {
        return true;
    }

    /**
     * 
     * Fill In Code Here
     * 
     */
    public int getFreePosition()
    {
		return freePosition;
        //Get the free position
    }
}
