//ZacharyScholz
public class TimeException extends Exception {
	public TimeException() {
		super("EXCEPTION: Invalid time entered");
	}
	
	public TimeException(String message) {
		super(message);
	}

}