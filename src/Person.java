import java.util.Vector;

public class Person {

	protected String name;
	protected String surname;
	protected Address address;
	protected String phoneNumber;
	protected int id;
	protected Vector<Contact> pContacts = null;
	
	//Constructor
	public Person() {
		pContacts = new Vector<Contact>();
		
	}
	
	// Getter & Setter name	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter & Setter surname
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	// Getter & Setter address
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address adress) {
		this.address = adress;
	}
	
	// Add address
	public Address addAddress(int num, String street, String postCode, String town) {
		Address a = new Address();
		a.num = num;
		a.street = street;
		a.postCode = postCode;
		a.town = town;
		return a;
	}

	// Getter & Setter phoneNumber
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Getter & Setter id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Getter & Setter pContacts
	public Vector<Contact> getpContacts() {
		return pContacts;
	}

	public void setpContacts(Vector<Contact> pContacts) {
		this.pContacts = pContacts;
	}
	
	// Add & remove contact
	public void addContact(String type, String value) {
		boolean found = false;
		for(Contact c : pContacts) {
			if(c.getType() == type && c.getValeur() == value) {
				found = true;
			}
		}
		
		if(!found) {
			Contact c = new Contact();
			c.type = type;
			c.valeur = value;
			pContacts.addElement(c);
		}
	}
	
	public void removeContact(String type) {
		for(Contact c : pContacts) {
			if(c.getType() == type) {
				pContacts.removeElement(c);
			}
		}
	}
	
	public String toXml() {
		return "";
	}
}
