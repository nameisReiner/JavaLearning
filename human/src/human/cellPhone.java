package human;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 
public class cellPhone {
	private int cellPhoneNumber;
	private Set<String>  myContacts =  new TreeSet<String>();
	
	
	public cellPhone() {
		// TODO Auto-generated constructor stub
	}
	//show all numbers in cell phone
	public final int showCellNumber() {
		return cellPhoneNumber;
	}
	//remove Contact from current cell phone list
	public void removeContacts(String name)
	{
		myContacts.remove(name);
	}
	public void removeAllContacts()
	{
		myContacts.removeAll(myContacts);
	}
	//print TreeSet Ordered..no duplicates
	//ref: https://www.programcreek.com/2009/02/a-simple-treeset-example/
	public void printContactList() 
	{
		Iterator<String> iterator = myContacts.iterator();
		
		if(myContacts.isEmpty())
		{
			System.out.println("Tree Set of Contacts is Empty.");
		} else {
			System.out.println("Tree Set size: " + myContacts.size());
		}
		//Displaying the Tree set data
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next() + " ");
		}
		
	}
	//add numbers to cell phone
	public void setCellPhone(int myNumber) {
		cellPhoneNumber = myNumber;
	}
	//add contacts to cell phone
	public void addContact(String contact) {
		myContacts.add(contact);
		
	}
	

}
