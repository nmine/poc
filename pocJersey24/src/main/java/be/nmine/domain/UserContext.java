package be.nmine.domain;

import javax.ws.rs.HeaderParam;

public class UserContext {
	
	@HeaderParam("userContext") 
	private String userContext;
	
	@HeaderParam("notaryId") 
	private String notaryId;
	
	@HeaderParam("dossierReference") 
	private String dossierReference;
	
	@HeaderParam("organisationNumber") 
	private String organisationNumber;
	
	@HeaderParam("application") 
	private String application;
	
	@HeaderParam("personNationalNumber") 
	private String personNationalNumber;
	
	@HeaderParam("language") 
	private String language;

}
