package be.nmine.designpatterns.singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	//problem with thread : solution : either synchronized or declared
	//staic singleton volatile and synchronyze(Singleton.class) {} (to avoid synchronisation which use a lot of memory)
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
