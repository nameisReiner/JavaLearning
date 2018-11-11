package human;

public class Start 
{

	public static void main(String[] args) 
	{
		char status;
		// TODO Auto-generated method stub
		Joseph [] kid = new Joseph[2];
		
		
		kid[0] = new Joseph();
		kid[1] = new Joseph();
		kid[0].addCreditCard("Visa");
		kid[0].setWeight(168);
		kid[0].setHeight(70);
		kid[0].setHairColor("Brown");
		kid[0].setGender("male");
		kid[0].setName("Joseph R");
		//adding a cell phone to the list
		kid[0].myCellPhone.add(new cellPhone());
		//adding a contact to the List/Set
		//ArrayList intialization of methods 
		//ref: https://stackoverflow.com/questions/18435992/java-call-object-methods-thorugh-arraylist
		kid[0].myCellPhone.get(0).addContact("Joseph");
		kid[0].myCellPhone.get(0).addContact("Zenith");
		kid[0].myCellPhone.get(0).addContact("Sarah");
		kid[0].myCellPhone.get(0).addContact("JC");
		kid[0].myCellPhone.get(0).addContact("Jessica");
		kid[0].myCellPhone.get(0).addContact("Derrel");
		kid[0].myCellPhone.get(0).addContact("Maha");
		kid[0].myCellPhone.get(0).addContact("Sahar");
		kid[0].myCellPhone.get(0).addContact("Madawi");
		kid[0].myCellPhone.get(0).addContact("Alisa");
		kid[0].myCellPhone.get(0).addContact("Janicka");
		kid[0].myCellPhone.get(0).addContact("Alicia");
		kid[0].myCellPhone.get(0).addContact("Jean'Na");
		kid[0].myCellPhone.get(0).setCellPhone(3253847);
		
		//array initialization
		kid[1].cell[0].setCellPhone(3253847);
		kid[1].cell[1].setCellPhone(4184033);
		kid[1].cell[0].addContact("nameishi");
		kid[1].cell[1].addContact("amy");
		
		
		if(kid[0].showStatus()==true) {
			status ='y';
		} else {
			status='n';
		}
		System.out.println("Are you Single? : "+ status );
		System.out.println("Gender: " + kid[0].showGender());
		System.out.println("Height : "+kid[0].getHeight()+" inches" );
		System.out.println("Name: "+kid[0].showName());
		System.out.println("Middle name: " + kid[0].middleName);
		System.out.println("Cell number Array 0: " + kid[0].cell[0].showCellNumber() );
		System.out.println("Cell number Array 1: " + kid[0].cell[1].showCellNumber() );
		System.out.println("Cell number List: " +kid[0].myCellPhone.get(0).showCellNumber());
				//print list
				kid[0].myCellPhone.get(0).printContactList();
				//remove name from contact list
				kid[0].myCellPhone.get(0).removeContacts("JC");
				//print list
				kid[0].myCellPhone.get(0).printContactList();
				//remove All
				kid[0].myCellPhone.get(0).removeAllContacts();
				kid[0].myCellPhone.get(0).printContactList();
					
	}

}
