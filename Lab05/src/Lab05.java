import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) {
		int bars = 0;
		int coupons = 0;
		//Initializes variables outside of the loops so they can be used throughout the code
		Scanner key = new Scanner(System.in);
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		int dollars = key.nextInt();
		if(dollars < 0){
			System.out.println("Invalid value for amount! Exiting the program!");
			System.exit(0);
		//provides error message for an invalid input
		}
		
		for(int i = dollars;i > 0;i--) {
			//creates a loop to track each value through the purchasing of chocolate bars
			bars++;
			coupons++;
			}
		while(coupons >= 6){
			//Checks whether there is enough coupons available for another bar and if so does the transaction
		coupons = coupons - 6;
		bars++;
		coupons++; 
		//adds the new coupons in case a coupon from a free bar gets a new free bar
		}
		System.out.println("You can buy "+bars+ " chocolate bars and will have "+coupons+" coupons left!");
			//provides the user with the final values in an aesthetically pleasing format
	}
}

