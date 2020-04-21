package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FinderByFirstAndLastName implements IFinder {

	private String lastName="";
	private String firstName="";
	
	public FinderByFirstAndLastName(String firstName, String lastName)
    {
		this.firstName = firstName;
        this.lastName = lastName;
    }
	
	@Override
	public List<Customer> find(List<Customer> customers) {
		// TODO Auto-generated method stub
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.firstName().equals(firstName) && customer.lastName().equals(lastName) ) {
				result.add(customer);
			}
		}
		return result;
	}

}
