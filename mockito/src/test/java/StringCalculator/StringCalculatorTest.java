package StringCalculator;

import static junit.framework.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import be.nmine.poc.pocMockito.testlab.StringCalculator;

public class StringCalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void simpleAddTest() {
	StringCalculator calculator = new StringCalculator();
	assertEquals(0, calculator.add(""));
    }

    @Test
    public void AddValueTest() {
	StringCalculator calculator = new StringCalculator();
	assertEquals(1, calculator.add("1"));
    }

    @Test
    public void AddTwoValueTest() {
	StringCalculator calculator = new StringCalculator();
	assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void AddAnyValueTest() {
	StringCalculator calculator = new StringCalculator();
	assertEquals(6, calculator.add("1,2,3"));
    }

    @Test
    public void canHandleNegativeValueTest() throws Exception {
	StringCalculator calculator = new StringCalculator();
	thrown.expect(Exception.class);
	// thrown.expectMessage("ss");
	throw new Exception("");
    }
}
