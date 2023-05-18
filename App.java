package week05CA;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		Logger logs = new SpacedLogger();
		logs.log("How are you today?");
		
		Logger logger = new AsteriskLogger();
		logger.error("Why isn't this working?");
		
		

	}

}
