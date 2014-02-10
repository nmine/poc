package be.nmine.designpatterns.facade;

public class HomeTheaterFacade {
	Amplifier amplifier;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	Projector projector;
	//facade pattern provides a unified interface to a set of interface in a subsysteme
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
			DvdPlayer dvdPlayer, Projector projector) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
	}
	
	public void watchMovie(String movie) {
		amplifier.setVolume(5);
		//so one
	}
	
	public void endMovie() {
		//shutting all down...
	}
	
	
}
