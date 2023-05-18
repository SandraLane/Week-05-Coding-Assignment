package week05CA;

public class AsteriskLogger implements Logger{

	public void log(String log) {
		// TODO Auto-generated method stub
		
	}

	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("*****************************************"
		+ "\n" + "Error: " + error + "\n" + "****************************************");
		for (int i=1; i<sb.length(); i+=2)
		    sb.insert(i, ' ');
		System.out.println(sb.toString());
	}

}
	