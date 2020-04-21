package it.xpug.ocp.customerbase;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;


public class CustomerBaseTest {

	private Customer alice = new Customer("Alice", "Rossi", 10000);
	private Customer bob = new Customer("Bob", "Rossi", 20000);
	private Customer charlie = new Customer("Charlie", "Bianchi", 30000);

	private CustomerBase customerBase = new CustomerBase();

	@Before
	public void setUp() throws Exception {
		customerBase.add(alice);
		customerBase.add(bob);
		customerBase.add(charlie);
	}

	@Test
	public void findByLastName() throws Exception {
		IFinder finderByLastName = new FinderByLastName("Rossi");
		List<Customer> found = customerBase.findBy(finderByLastName);
		assertThat(found, is(asList(alice, bob)));
	}

	@Test
	public void findByFirstAndLastName() throws Exception {
		IFinder finderByFirstAndLastName = new FinderByFirstAndLastName("Alice", "Rossi");
		List<Customer> found = customerBase.findBy(finderByFirstAndLastName);
		assertThat(found, is(asList(alice)));
	}

	@Test
	public void findWithCreditGreaterThan() throws Exception {
		IFinder finderByCreditGreater = new FinderByCreditGreater(20000);
		List<Customer> found = customerBase.findBy(finderByCreditGreater);
		assertThat(found, is(asList(charlie)));
	}

	//@Test
	//public void findWithCreditLessThan() throws Exception {
		//fail("open-closed violation");
		// ...
		// We're sick and tired of adding new methods to CustomerBase.
		// CHALLENGE: can you refactor CustomerBase and its tests
		// so that new kinds of queries can be implemented WITHOUT CHANGING CUSTOMERBASE ???

	//}


}
