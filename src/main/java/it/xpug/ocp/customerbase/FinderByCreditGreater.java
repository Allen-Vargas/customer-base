package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FinderByCreditGreater implements IFinder {

	private int credit = 0;
	
	public void FindByCreditGreaterThan(int credit)
    {
        this.credit = credit;
    }
	
	@Override
	public List<Customer> found(List<Customer> customers) {
		// TODO Auto-generated method stub
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.credit() > credit) {
				result.add(customer);
			}
		}
		return result;
	}

}
