
public class TestCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("John");
		//customer.residentialAddress.setAddressLine("Ist Main HSR Layout");
		//customer.residentialAddress.setCity("Bangalore");
		Address address = new Address("Ist Main HSR Layout"," Bangalore");
		//customer.setResidentialAddress(address);
		System.out.println(customer.getCustomerName());
		System.out.println(address.getAddressDetails());
		//System.out.println(customer.getResidentialAddress());
		Customer customer1 = new Customer("Johnson","Ist Main HSR Layout"," Bangalore");
		System.out.println(customer1.getCustomerDetails());
	}
}
