//Zachary Scholz
	import java.util.Scanner;
public class ClockTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		
		while (repeat) {
			try { 
				// First object with individual inputs
				TimeConverter tc1 = new TimeConverter();
				System.out.println("Enter the hours on the military clock");
				int hours = scanner.nextInt();
				System.out.println("Enter the minutes on the military clock:");
				int minutes = scanner.nextInt();
				System.out.println("Enter the seconds on the military clock:");
				int seconds = scanner.nextInt();
				tc1.updateTime(hours, minutes, seconds);
				System.out.println("12-hour clock time -> ");
				tc1.displayTime();
				
				//Second object with string input
				TimeConverter tc2 = new TimeConverter();
				System.out.println("Enter 24 hour clock time in the format hours:minutes:seconds");
				scanner.nextLine(); //Consume newline
				String time = scanner.nextLine();
				tc2.updateTime(time);
				System.out.println("12-hour clock time ->");
				tc2.displayTime();
				
			} catch (TimeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Would you like to do this again? Enter 'Yes' or 'No'");
			repeat = scanner.nextLine().equalsIgnoreCase("yes");
		}
		
		System.out.println("Exiting the program!");
		scanner.close();
	}

}
