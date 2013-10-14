import java.util.Vector;


public class Directory {
	
	protected Vector<Person> persons;
	
	public static void main(String[] args) {
		
		Directory dir = new Directory();
		
		dir.addPerson("LEPOISSON", "Bloup", "0147200001", 1);		
		Person p = dir.getPerson(1);
		p.address = p.addAddress(1, "Avenue de l'Aquarium", "05001", "FishVille");
		p.addContact("email", "blouplepoisson@gmail.com");
		
		dir.addPerson("MAGIC", "Bibi", "0476350101", 2);
		Person p2 = dir.getPerson(2);
		p2.address = p2.addAddress(5, "Rue de l'Alchimie", "01120", "MageTown");
		p2.addContact("email", "magicbibi@gmail.com");
		
		dir.afficherPerson(1);
		dir.afficherPerson(2);

	}
	
	public Directory() {
		persons = new Vector<Person>();
		
	}
	
	public void addPerson(String name, String surname, String phoneNumber, int id) {
		Person p = new Person();
		p.name = name;
		p.surname = surname;
		p.phoneNumber = phoneNumber;
		p.id = id;
		persons.addElement(p);
	}
	
	public void removePerson(int id) {
		for(Person p : persons) {
			if(p.getId() == id) {
				persons.removeElement(p);
			}
		}
	}
	
	public Person getPerson(int id) {
		Person person = new Person();
		for(Person p : persons) {
			if(p.getId() == id) {
				person = p;
			}
		}
		return person;
	}
	
	public void afficherPerson(int id) {
		for(Person p : persons) {
			if(p.getId() == id) {
				System.out.println(p.name);
				System.out.println(p.surname);
				System.out.println(p.phoneNumber);
				if(p.address != null) {
					System.out.println(p.address.num + " " + p.address.street + ", " + p.address.postCode + " " + p.address.town);
				}
				if(p.pContacts != null) {
					for(Contact c : p.pContacts) {
						System.out.println(c.type + " : " + c.valeur);
					}
				}
			}
		}
	}
	
	
}
