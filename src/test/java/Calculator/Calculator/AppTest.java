package Calculator.Calculator;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private App calculator;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
  
    @Before
    public void setUp() {
        calculator = new App();
    }

    /**
     * @return the suite of tests being tested
     */
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @Test
   public void testAdd()
    {
    	 int a = 15;
         int b = 20;
         int expectedResult = 35;
         long result = calculator.add(a, b);
         Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testMultiply()
    {
    	int a=5;
    	int b=10;
    	int expectedResult=50;
    	long result=calculator.multiply(a, b);
    	Assert.assertEquals(expectedResult, result);
    }
    
    @Test
    public void testSubtraction()
    {
    	int a=5;
    	int b=10;
    	int expected=-5;
    	long result=calculator.subtraction(a, b);
    	Assert.assertEquals(expected, result);
    }
    
    
    
    @Test
    public void testDivision()
    {
    	int a=5;
    	int b=2;
    	int expected=2;
    	long result=calculator.division(a, b);
    	Assert.assertEquals(expected, result);
    }
    
    
    
}
