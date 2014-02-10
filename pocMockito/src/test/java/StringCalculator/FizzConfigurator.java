package StringCalculator;

public class FizzConfigurator {
    enum Config {
	ALWAYS, NEVER, SOMETIMES
    };

    public void doFoo(String msg) {
	doWidget(msg, Config.ALWAYS);
    }

    public void doBar(String msg) {
	doWidget(msg, Config.NEVER);
    }

    public void doBuzz(String msg) {
	doWidget(msg, Config.SOMETIMES);
    }

    public void doWidget(String msg, Config cfg) {
	System.out.println("real call...");
    }
}