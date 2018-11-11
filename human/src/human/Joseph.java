package human;

import java.util.ArrayList;
import java.util.List;

public class Joseph extends human
{
	
	//public static final cellPhone cell = null;
	public cellPhone [] cell = new cellPhone[2];
	//ArrayLists are not ordered, allow duplicates
    public List<cellPhone>  myCellPhone =  new ArrayList<cellPhone>();
	public String middleName;
	private int weight;
	private int height;
	
	public Joseph() 
	{
		middleName = "John";
		weight = 0;
	    
		cell[0]= new cellPhone();
		cell[1]= new cellPhone();
		//cell.setCellPhone(3253847);
	}
	public int getHeight()
	{
		return height;
	}
	
	//SETTERS
	public void setWeight(int setw) 
	{
		weight = setw;
	}
	public void setHeight(int seth) 
	{
		height = seth;
	}
	public int getWeight() 
	{
		return weight;
	}
}
