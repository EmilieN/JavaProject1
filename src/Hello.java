
public class Hello {
	
	public Hello() {
		System.out.println("Hello World!");
	} 
	
	public static void main(String[] args) {
		new Hello();
		
		Person p;
		p = new Person();
		
		p.name = p.getName();
		p.surname = p.getSurname();
		p.address = new Address();
		p.address.num = p.getAddress().getNum();
		p.address.postCode = p.getAddress().getPostCode();
		p.address.street = p.getAddress().getStreet();
		p.address.town = p.getAddress().getTown();
		p.phoneNumber = p.getPhoneNumber() ;
		p.id = p.getId();
		
		System.out.println(p.name);
		System.out.println(p.surname);
		System.out.println(p.address.num);

	}
	
}
