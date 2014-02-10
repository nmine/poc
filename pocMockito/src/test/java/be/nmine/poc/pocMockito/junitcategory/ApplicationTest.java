package be.nmine.poc.pocMockito.junitcategory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ApplicationTest {

    @Test
    @Category(SlowTest.class)
    // <plugin>
    // <artifactId>maven-surefire-plugin</artifactId>
    // <version>2.11</version>
    // <configuration>
    // <groups>com.mycompany.SlowTests</groups>
    // </configuration>
    // </plugin>
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
