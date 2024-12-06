  //Zachary Scholz
import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("How many books did you purchase at BN booksellers this month?");
		int books = key.nextInt();
		//initialized books variable to hold the number of books to decide how many points are received
		int points = 0;
		//initialized points variable to store the  number of points the customer should receive
		int cases = 0;
		if(books  < 0) {
			//created if statement to prevent users from entering an invalid value into the program
			System.out.println("Invalid value entered! Exiting the program!");
			System.exit(0);
		}
		else {
			//makes the alternate code that makes the cases 
			//equal the books number where each case awards the points for the corresponding book number
			cases = books;
		}
		switch(cases)
		{
		case 0:
			points = 0;
			break;
		case 1: 
			points = 5;
			break;
		case 2: 
			points = 15;
			break;
		case 3: 
			points = 30;
			break;
			default:
				points = 60;
		}
		if(points == 0) {
			//creates an if statement to give the alternate text that encourages buying more books
			System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
		}
		else {
			//it other wise shows the text telling the points earned
			System.out.println("Congratulations!!! You have earned "+points+" points! \n"
					+"You may redeem these points on your next book purchase!");
		}
	}

}
