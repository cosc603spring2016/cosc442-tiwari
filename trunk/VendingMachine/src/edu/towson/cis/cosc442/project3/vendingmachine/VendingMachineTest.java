package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class VendingMachineTest {
	
	//the vending machine text object
	VendingMachine machine;
	VendingMachineItem item;
	
	/**
	 * Sets up the objects used in the tests
	 * 
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws VendingMachineException {
		machine = new VendingMachine();
		item = new VendingMachineItem("Coke", 1.25);
		machine.addItem(item, "A");
	}
	
	/**
	 * Test the addItem() method of VendingMachine.java to make sure the exception is shown
	 * when an item is attempted to be added on a slot that is already occupied
	 * 
	 */
	@Test(expected=VendingMachineException.class)
	public void testAddItemTest() {
		item = new VendingMachineItem("Chocolate Bar", 1.00);
		machine.addItem(item, "A");
	}
	
	
	/**
	 * Test the addItem() method of VendingMachine.java to make sure that an item can be added to a slot
	 * by checking that the item returned in the index is not null
	 */
	@Test
	public void testAddItem() {
		item = new VendingMachineItem("Chips", 1.00);
		machine.addItem(item, "B");
		//get the values of the item at slot B
		item = null;
		item = machine.getItem("B");
		assertNotNull(item);
	}
	
	/**
	 * Test the removeItem() method of VendingMachine.java to make sure the expection is thrown when removeItem()
	 * is called on an empty slot
	 */
	@Test(expected=VendingMachineException.class)
	public void testRemoveItemException() {
		item = machine.removeItem("C");
	}
	
	/**
	 * Test removeItem() method of VendingMachine.java to make sure that an item is successfully removed
	 * Also try to remove the item again to make sure that the item was removed from the slot successfully
	 * which is done by checking the exception
	 */
	@Test(expected=VendingMachineException.class)
	public void testRemoveItem() {
		item = machine.removeItem("B");
		assertEquals("Testing the name of the two items.", "Chips", item.getName());
		assertEquals(1.00, item.getPrice(), 0.0001);
		//try to remove the item again to make sure that the item was removed and slot B is empty
		item = machine.removeItem("B");
	}
	
	/**
	 * Test the insertMoney() method to make sure that the exception is thrown when a value less than 0 is passed
	 */
	@Test//(expected=VendingMachineException.class)
	public void testInsertMoneyException() {
		try {
			machine.insertMoney(-1.0);
		}catch(VendingMachineException e) {
			
		}finally {
			assertEquals(0.0, machine.getBalance(), 0.0001);
		}
	}
	
	/**
	 * Test insertMoney() method to make sure that the value is added
	 */
	@Test
	public void testInsertMoney() {
		machine.insertMoney(2.0);
		assertEquals(2.0, machine.getBalance(), 0.0001);
	}
	
	/**
	 * Test the getBalance() method to make sure that the correct balance is returned
	 */
	@Test
	public void testGetBalance() {
		double balance = machine.getBalance();
		assertEquals(0.0, balance, 0.0001);
		machine.insertMoney(2.0);
		balance = machine.getBalance();
		assertEquals(2.0, balance, 0.0001);
	}
	
	/**
	 * Test makePurchase() to make sure that a purchase is successful with enough money and a filled slot
	 */
	@Test
	public void testMakePurchaseTrue() {
		machine.insertMoney(2.0);
		boolean purchase = machine.makePurchase("A");
		assertTrue(purchase);
		assertNull(machine.getItem("A"));
	}
	
	/**
	 * Test makePurchase() to make sure that a purchase is not successful with less money and a filled slot
	 */
	@Test
	public void testMakePurchaseFalseItemExists() {
		machine.insertMoney(1.0);
		boolean purchase = machine.makePurchase("A");
		assertFalse(purchase);
		assertNotNull(machine.getItem("A"));
	}
	
	/**
	 * Test makePurchase() to make sure that a purchase is not successful with an empty slot
	 */
	@Test
	public void testMakePurchaseFalseItemNotExists() {
		machine.insertMoney(2.0);
		boolean purchase = machine.makePurchase("D");
		assertFalse(purchase);
		assertNull(machine.getItem("D"));
	}
	
	/**
	 * Test the returnChange() method to make sure that the correct change is returned
	 */
	@Test
	public void testReturnChange() {
		machine.insertMoney(2.0);
		boolean purchase = machine.makePurchase("A");
		assertTrue(purchase);
		assertEquals(0.75, machine.returnChange(), 0.0001);
	}
	
	/**
	 * Test to make sure that an exception is thrown when an invalid slot code is used to get an item.
	 */
	@Test(expected=VendingMachineException.class)
	public void testGetSlotIndexException() {
		item = machine.getItem("G");
	}

	/**
	 * Reset the data used in the tests
	 */
	@After
	public void tearDown() {
		machine = null;
	}
}
