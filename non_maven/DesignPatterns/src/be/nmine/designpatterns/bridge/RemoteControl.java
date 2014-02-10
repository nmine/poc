package be.nmine.designpatterns.bridge;

public abstract class RemoteControl {
	Tv tv;
	//to complete?
	abstract void on();
	
	abstract void off();
	
	void setChannel() {
		tv.tuneChannel();
	}
}
