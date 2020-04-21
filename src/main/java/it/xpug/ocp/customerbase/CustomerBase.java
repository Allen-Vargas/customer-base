package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase {

	private List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> findBy(IFinder finder){
		return finder.find(customers);
	}

}
