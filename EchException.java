package inayat;
import java.lang.String;

public class EchException extends Exception{
	public EchException() {
		super("Not A Student Of Ech ");
	}
	
	public EchException(String s) {
		super(s);
	}
	
	
}
