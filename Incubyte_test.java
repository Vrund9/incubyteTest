package incubyte;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import org.junit.Test;

public class Incubyte_test {

	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testReturnZeroOnEmpty()
	{
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void testReturnNumber()
	{
		assertEquals(1,Calculator.add("1"));
	}
	
	@Test
	public void testSumofTwo()
	{
		assertEquals(3,Calculator.add("1,2"));
	}
	
	@Test
    public void handleUnknownAmountofNumber() {
        assertEquals(45, Calculator.add("1,2,3,4,5,6,7,8,9"));
    }
	
	@Test
	public void testNewLineDelimiter()
	{
		assertEquals(6,Calculator.add("1,2\n3"));
	}
	
	@Test
    public void negativeInputReturnsException() {
		thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("Negative input!");
        Calculator.add("-1");
    }
	
	@Test
    public void numbersGreaterThan1000AreIgnored() {
        assertEquals(17,Calculator.add("5,12,1001"));
        assertEquals(26,Calculator.add("14124,22\n4,1214"));
    }
}
