package be.nmine.poc.pocMockito.captor;

public class AuditFacade {

    private AuditService auditService;

    public void enterAuditLogXML() {
	Game game = new Game();
	game.setScore(1);
	auditService.saveAuditEntry(game);
    }

}