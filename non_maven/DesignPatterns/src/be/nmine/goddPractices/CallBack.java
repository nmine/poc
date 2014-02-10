package be.nmine.goddPractices;


public class CallBack {

    public void doSomeStuff(final Command command) {
    	//some logic
    	command.execute();
    }
    public static void main(String[] args) {
		CallBack callBack = new CallBack();
		callBack.doSomeStuff(new Command() {
			
			@Override
			public void execute() {
				System.out.println("command execute !");
			}
		});
	}

}


