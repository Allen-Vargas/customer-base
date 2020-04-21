package it.xpug.ocp.customerbase;

import java.util.List;

public interface IFinder {
	public List<Customer> find(List<Customer> customers);
}
