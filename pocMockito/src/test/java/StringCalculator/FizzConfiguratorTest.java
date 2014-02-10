package StringCalculator;

import static org.mockito.Mockito.doNothing;

import org.junit.Test;
import org.mockito.Mockito;

import StringCalculator.FizzConfigurator.Config;

public class FizzConfiguratorTest {

    @Test
    public void testFizz() {
	FizzConfigurator fixture = Mockito.spy(new FizzConfigurator());
	doNothing().when(fixture).doWidget(Mockito.anyString(), Mockito.<Config> any());
	fixture.doBuzz("some string");
	Mockito.verify(fixture).doWidget("some string", Config.SOMETIMES);
	// assertTrue(true);
    }
}