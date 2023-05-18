package week05CA;

public class SpacedLogger implements Logger{

	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("***" + log + "***");
		for (int i=1; i<sb.length(); i+=2)
		    sb.insert(i, ' ');
		System.out.println(sb.toString());
		
	}

	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
