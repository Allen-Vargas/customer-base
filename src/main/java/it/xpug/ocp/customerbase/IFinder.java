package it.xpug.ocp.customerbase;

import java.util.List;

public interface IFinder {
	public List<Customer> found(List<Customer> customers);
}
