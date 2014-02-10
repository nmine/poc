package be.nmine.poc.pocMockito.captor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuditFacadeImplTest {

    @Mock
    private AuditService auditService;

    @InjectMocks
    private AuditFacade auditingFacade;

    @Test
    public void testSaveAuditEntry() {
	ArgumentCaptor<Game> argument = ArgumentCaptor.forClass(Game.class);
	auditingFacade.enterAuditLogXML();
	verify(auditService).saveAuditEntry(argument.capture());
	Game actualAuditEntry = argument.getValue();
	assertEquals(1, actualAuditEntry.getScore());

    }
}
