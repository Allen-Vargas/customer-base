package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FinderByLastName implements IFinder {

	private String lastName="";
	
	public void FindByLastName(String lastName)
    {
        this.lastName = lastName;
    }
	
	@Override
	public List<Customer> found(List<Customer> customers) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.lastName().equals(lastName)) {
				result.add(customer);
			}
		}
		return result;
	}

}
