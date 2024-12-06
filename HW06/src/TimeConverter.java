//Zachary Scholz
public class TimeConverter {
	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	
	//Default Constructor
	public TimeConverter() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.notPM = true;
	}
	
	//Parameterized Constructor
	public TimeConverter(int hours, int minutes, int seconds) throws TimeException {
		updateTime(hours, minutes, seconds);
	}
	
	//Accessors
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds; 
	}
	
	public boolean isNotPM() {
		return notPM;
	}
	
	//Mutators
	public void setHours(int hours) throws TimeException {
		if (hours < 0 || hours > 23) {
			throw new TimeException ("Invalid hours entered");
		}
		this.hours = hours;
	}
	
	public void setMinutes(int minutes) throws TimeException {
		if (minutes < 0 || minutes > 59) {
			throw new TimeException("Invalid minutes entered");
		}
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds) throws TimeException {
		if (seconds < 0 || seconds > 59) {
			throw new TimeException("Invalid seconds entered");
		}
		this.seconds = seconds;
	}
	
	// Update Time with hours, minutes, and seconds
	public void updateTime(int hours, int minutes, int seconds) throws TimeException {
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
			throw new TimeException();
		}
		
		this.notPM = hours < 12;
		
		if (hours == 0) {
			this.hours = 12;
		} else if (hours > 12) {
			this.hours = hours - 12;
		} else {
			this.hours = hours;
		}
		
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	// Update Time with string format "H:M:S"
	public void updateTime(String time) throws TimeException {
		try {
			String[] parts = time.split(".");
			int hours = Integer.parseInt(parts[0]);
			int minutes = Integer.parseInt(parts[1]);
			int seconds = Integer.parseInt(parts[2]);
			
			updateTime(hours, minutes, seconds);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			throw new TimeException("Invalid time format");
			}
		}
	
	// Display Time in 12-hour format
		public void displayTime() {
			String period = notPM ? "AM" : "PM";
			System.out.printf("%d:%02d:%02d %s%n", hours, minutes, seconds, period);
	
		}
}
