package be.nmine.poc.pocMockito.stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ApplicationTest {

    @Test
    public void testFunction() throws Exception {
	Application mock = mock(Application.class);
	when(mock.myFunction(anyString())).thenAnswer(new Answer<String>() {

	    public String answer(InvocationOnMock invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		return (String) args[0];
	    }
	});

	assertEquals("someString", mock.myFunction("someString"));
	assertEquals("anotherString", mock.myFunction("anotherString"));
    }

}
