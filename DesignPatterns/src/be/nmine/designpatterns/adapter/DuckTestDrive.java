package be.nmine.designpatterns.adapter;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("The turkey say...");
		turkey.gobble();
		turkey.fly();
		System.out.println("\nThe duck says...");
		testDuck(duck);
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	static void testDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}
}
