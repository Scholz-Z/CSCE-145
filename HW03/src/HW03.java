//Zachary Scholz
import java.util.Random;
import java.util.Scanner;
public class HW03 {
	public static final int RPS = 3;
	//creates a constant for the random method to draw from to choose from rock paper or scissors
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		 String compDesc = "";
		 //initializes the string of the computers decision so it can be called outside the for loop
		System.out.println("Lets Play RoShamBo");
		Random hand = new Random();
		//initialized the random method to be called on later
		int score = 0;
		int handResult = 4;
		
		for(int i = 3; i > 0; i--) {
			//creates a for loop with exactly 3 rounds 
			handResult = hand.nextInt(RPS);
			if(handResult+1 == 1) {
				
				compDesc = "Scissors";
				
			}
			else if(handResult+1 == 2){
				
				compDesc = "Rock";
				
			}
			else if(handResult+1 == 3){
				compDesc = "Paper";
				
			}
			// assigns the random number to the different possible hands thrown
			System.out.println("Please enter rock, paper, or scissors");
			String userDesc = key.nextLine();
			if(userDesc.equalsIgnoreCase(compDesc)){
				System.out.println("Draw");
				//result for if the computer and the user throw the same choice
			}
				else if(userDesc.equalsIgnoreCase("scissors") && compDesc.equalsIgnoreCase("paper") ) {
					System.out.println("Win");
					score++;
				}
				else if(userDesc.equalsIgnoreCase("rock") && compDesc.equalsIgnoreCase("scissors") ) {
					System.out.println("Win");
					score++;
				}else if(userDesc.equalsIgnoreCase("paper") && compDesc.equalsIgnoreCase("rock") ) {
					System.out.println("Win");
					score++;
				}
			//results for if the user throws the wining hand

				else if(userDesc.equalsIgnoreCase("paper") && compDesc.equalsIgnoreCase("scissors") ) {
					System.out.println("Loss");
					score--;
				}
				else if(userDesc.equalsIgnoreCase("scissors") && compDesc.equalsIgnoreCase("rock") ) {
					System.out.println("Loss");
					score--;
				}
				else if(userDesc.equalsIgnoreCase("rock") && compDesc.equalsIgnoreCase("paper") ) {
					System.out.println("loss");
					score--;
				}
			//results for if the user throws the losing hand
				else
					System.out.println("Invalid input. The computer wins a point as penalty");
					score--;
			//results for if the user throws an incorrect option
			if(score == 2 ) {
				System.out.println("You won the game congrats!!");
				System.exit(0);
			}
			else if(score == -2 ) {
				System.out.println("You lost the game better luck next time!!");
				System.exit(0);
			}
			//Ends the program with the winner of the best of 3
		}
		System.out.println("Seems like a draw. Better luck next time!");
//ending that would result if there was a draw with either 3 draw results or 1 win 1 loss and 1 draw
	}
}
