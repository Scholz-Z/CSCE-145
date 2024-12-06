//Zachary Scholz
import java.util.Scanner;
public class HW01 {

	public static void main(String[] args) {
	 final int YEAR = 2024;
	 //Creates constant for the year of this program
		Scanner key = new Scanner(System.in);
		//initializes key for the users input
 System.out.println("What is your fisrt name?");
 //prompts user for their first name
 String first = key.nextLine();
 //Creates and initializes the first variable that stores the user's first name
 System.out.println("What is your last name?");
 //prompts user for their first name
 String last = key.nextLine();
 //Creates and initializes the last variable that stores the user's last name
 System.out.println("What is your age(in years)?");
 //prompts user for their current age
 int age = key.nextInt();
 //Creates and initializes the age variable that stores the user's age
 System.out.println("What is your phone number(no parenthesis or dashes)?");
 //prompts user for their current phone number
 key.nextLine();
 //used as a buffer as occasionally Scanner will eat the next end of line statement
 String cellphone = key.nextLine();
 //Creates and initializes the cellphone variable that stores the user's phone number
 System.out.println("What is your Major?");
 //prompts user for their current major
 String major = key.nextLine();
 //Creates and initializes the major variable that stores the user's major
 System.out.println("What is your college year(Fresman, sophomore, etc.)?");
 //prompts user for their current year in college
 String collegeYear = key.nextLine();
 //Creates and initializes the collegeYear variable that stores the user's year of college
 System.out.println("What is todays date(mm/dd/yyyy)?");
 //prompts user for the current date
 String today = key.nextLine();
 //Creates and initializes the collegeYear variable that stores the user's year of college
 System.out.println("What is your favorite pet?");
 //prompts user for their favorite pet
 String pet = key.nextLine();
 //Creates and initializes the pet variable that stores the user's favorite pet
 System.out.println("What is your mothers maiden name?");
 //prompts user for their mothers maiden name
 String mother = key.nextLine();
 //Creates and initializes the mother variable that stores the user's mother's maiden name
 System.out.println("What are the last 4 digits of your social security number?");
 //prompts user for the last four digits of their social security number
 String ssid = key.nextLine();
 //Creates and initializes the ssid variable that stores the user's final four digits if their social security number
 int birthYear = YEAR - age;
 //calculates the birth year of the user by subtracting the current year by the age of the user
 String updatedPhone = "("+cellphone.substring(0,3)+")-"+cellphone.substring(3,6)+"-"+cellphone.substring(6,10);
 //puts proper formatting on the phone number that the user put in
 String newDate = today.substring(4,5)+"."+today.substring(1,2)+"."+today.substring(6,10);
 //reformatting the date the user input to be the European format
 System.out.println("Here’s an quick intro for "+first+" "+last+":\n"+
		"You were born in the year "+birthYear+" Your favorite pet is "+pet+" and your mother's maiden name is "
				+mother+".\nThe last four digits of your social security number is "+ssid+". You are a "+collegeYear+" at USC\n"+
				"You are majoring in "+major+" and you can be reached at "+updatedPhone+" Welcome new gamecock!\n"+
				"Last Updated: "+newDate);
		//Has a large paragraph format for all the outputs that the program has
	}
}
