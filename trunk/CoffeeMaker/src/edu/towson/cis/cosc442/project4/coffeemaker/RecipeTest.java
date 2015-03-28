package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * The class <code>RecipeTest</code> contains tests for the class {@link
 * <code>Recipe</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 3/26/15 2:21 PM
 *
 * @author User
 *
 * @version $Revision$
 */
public class RecipeTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	private Recipe r2;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();
		
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(1);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		r2 = new Recipe();
		r2.setName("Black Coffee");
		r2.setPrice(40);
		r2.setAmtCoffee(1);
		r2.setAmtMilk(0);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);
	}
	
	
	/**
	 * Test setAmountChocolate() method of the Recipe class to make sure
	 * that a negative amount cannot be added. And amount greater than 0 can be added.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetAmountChocolate() throws Exception {
		Integer value = -1;
		r1.setAmtChocolate(value);
		assertFalse(value == r1.getAmtChocolate());
		assertNotSame(r1.getAmtChocolate(), value);
		
		value = 0;
		r1.setAmtChocolate(value);
		assertEquals(value.intValue(), r1.getAmtChocolate().intValue());
		assertSame(r1.getAmtChocolate(), value);
		
		value = 1;
		r1.setAmtChocolate(value);
		assertEquals(value.intValue(), r1.getAmtChocolate().intValue());
		assertSame(r1.getAmtChocolate(), value);
	}
	
	/**
	 * Test setAmountCoffee() method of the Recipe class to make sure
	 * that a negative amount cannot be added. And amount greater than 0 can be added.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetAmountCoffee() throws Exception {
		Integer value = -1;
		r1.setAmtCoffee(value);
		assertFalse(value == r1.getAmtCoffee());
		assertNotSame(r1.getAmtCoffee(), value);
		
		value = 0;
		r1.setAmtCoffee(value);
		assertEquals(value.intValue(), r1.getAmtCoffee().intValue());
		assertSame(r1.getAmtCoffee(), value);
		
		value = 1;
		r1.setAmtCoffee(value);
		assertEquals(value.intValue(), r1.getAmtCoffee().intValue());
		assertSame(r1.getAmtCoffee(), value);
	}
	
	/**
	 * Test setAmountMilk() method of the Recipe class to make sure
	 * that a negative amount cannot be added. And amount greater than 0 can be added.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetAmountMilk() throws Exception {
		Integer value = -1;
		r1.setAmtMilk(value);
		assertFalse(value == r1.getAmtMilk());
		assertNotSame(r1.getAmtMilk(), value);
		
		value = 0;
		r1.setAmtMilk(value);
		assertEquals(value.intValue(), r1.getAmtMilk().intValue());
		assertSame(r1.getAmtMilk(), value);
		
		value = 1;
		r1.setAmtMilk(value);
		assertEquals(value.intValue(), r1.getAmtMilk().intValue());
		assertSame(r1.getAmtMilk(), value);
	}
	
	/**
	 * Test setAmountSugar() method of the Recipe class to make sure
	 * that a negative amount cannot be added. And amount greater than 0 can be added.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetAmountSugar() throws Exception {
		Integer value = -1;
		r1.setAmtSugar(value);
		assertFalse(value == r1.getAmtSugar());
		assertNotSame(r1.getAmtSugar(), value);
		
		value = 0;
		r1.setAmtSugar(value);
		assertEquals(value.intValue(), r1.getAmtSugar().intValue());
		assertSame(r1.getAmtSugar(), value);
		
		value = 1;
		r1.setAmtSugar(value);
		assertEquals(value.intValue(), r1.getAmtSugar().intValue());
		assertSame(r1.getAmtSugar(), value);
	}
	
	/**
	 * Test toString() method of the Recipe class to make sure that the correct string is returned.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testToString() throws Exception {
		assertEquals("Coffee", r1.toString());
	}
	
	/**
	 * Test equals() method of the Recipe class to make sure all the return values are as expected.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEquals() throws Exception {
		assertFalse(r1.equals(r2));
		Recipe r3 = r1;
		assertTrue(r1.equals(r3));
		Recipe r4 = new Recipe();
		assertFalse(r1.equals(r4));
		assertFalse(r4.equals(r1));
	}
}

/*$CPS$ This comment was generated by CodePro. Do not edit it.
 * patternId = com.instantiations.assist.eclipse.pattern.testCasePattern
 * strategyId = com.instantiations.assist.eclipse.pattern.testCasePattern.junitTestCase
 * additionalTestNames = 
 * assertTrue = false
 * callTestMethod = true
 * createMain = false
 * createSetUp = false
 * createTearDown = false
 * createTestFixture = false
 * createTestStubs = false
 * methods = 
 * package = edu.towson.cis.cosc442.project4.coffeemaker
 * package.sourceFolder = CoffeeMaker/src
 * superclassType = junit.framework.TestCase
 * testCase = RecipeTest
 * testClassType = Recipe
 */