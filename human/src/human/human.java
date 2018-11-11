package human;

import java.util.ArrayList;
import java.util.List;

public class human 
{
	
	private int fingers=10;
	private int legs=2;
	private String name;
	private String hairColor="bald";
	private boolean single= true;
	private String gender;
	
	private List<String>  myCreditCards =  new ArrayList<String>();
	
	 
	protected int showFingers() {
		return fingers;
	}
	
	protected int showlegs() {
		return legs;
	}
	protected boolean showStatus() {
		return single;
	}
	protected String showName() {
		return name;
	}
	protected String showGender() {
		return gender;
	}
	protected String showHairColor() {
		return hairColor;
	}
	//SETTERS
	public void setGender(String settingSex) {
		gender =settingSex;
		
	}
	public void setName(String settingName) {
		name =settingName;
		
	}
	public void setHairColor(String myHairColor) 
	{
		hairColor=myHairColor;
	}
	public void addCreditCard(String creditCardName) 
	{
		myCreditCards.add(creditCardName);
	}

	

}

