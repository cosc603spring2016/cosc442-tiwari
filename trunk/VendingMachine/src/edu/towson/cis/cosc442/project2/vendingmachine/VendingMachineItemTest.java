package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class VendingMachineItemTest {

	//the vending machine items object that will be tested
	VendingMachineItem lessThanZero = null;
	VendingMachineItem moreThanZero = null;
	VendingMachineItem item = null;
	
	/**
	 * Sets up the objects that will be used in the tests.
	 */
	@Before
	public void setUp() {
		item = new VendingMachineItem("Soda", 1.25);
	}
	
	
	/**
	 * Test the constructor of VendinMachineItem.java to make sure the exception is thrown if a negative value is passed for the price
	 */
	@Test//(expected=VendingMachineException.class)
	public void testConstructorException() {
		try {
			lessThanZero = new VendingMachineItem("Chocolate Bar", -1.0);
		}catch(VendingMachineException e) {
			
		}finally {
			assertNull(lessThanZero);
		}
	}
	
	/**
	 * Test the constructor of VendingMachineItem.java to make sure the item is not null;
	 */
	@Test
	public void testConstructor() {
		moreThanZero = new VendingMachineItem("Chips", 1.0);
		assertNotNull("Testing that the moreThanZero item is not null.", moreThanZero);
	}
	
	/**
	 * Test getName() method of VendingMachineItem.java to make sure that it returns the correct value
	 */
	@Test
	public void testGetName() {
		assertEquals("Testing that getName() returns the correct value.", "Soda", item.getName());
	}
	
	/**
	 * Test getPrice() method of VendingMachineItem.java to make sure it returns the correct value
	 */
	@Test
	public void testGetPrice() {
		assertEquals(1.25, item.getPrice(), 0.0001);
	}
	
	/**
	 * Resets the objects that were used in the tests.
	 */
	@After
	public void tearDown() {
		item = null;
	}
}
