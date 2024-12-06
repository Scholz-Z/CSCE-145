//Zachary Scholz
import java.util.Scanner;
public class Lab03 {
public static final int COST = 99;
	//TODO Auto-generated method stub
	public static void main(String[] args) {
		//allows for user input
	Scanner key = new Scanner(System.in);
	//prompts user for input
System.out.println("Please enter the number of software packages ordered: ");
//creates integer that stores the package amount ordered
int pkgamt = key.nextInt();
//creates and declares variable for the initial total before the discount
double total = 0;
//created and declares variable 
double discount = 0;
//created and declared a variable of the new discounted total 
double newtotal = 0;
//checks if the number of packages is below 0 and thus invalid
if(pkgamt < 0){
	//alerts the user to their invalid input
	System.out.println("Invalid value for package count! Exiting the program!");
	//ends the program
	System.exit(0);
}
//checks if the number of packages is less than ten
else if(pkgamt < 10) {
	//creates the total cost before the discount
	 total = pkgamt * COST; 
	 //alerts to the user that they do not get a discount
	System.out.println("No discount can be applied.");
	//creates the total cost after the discount(that is still zero) is applied
	newtotal = total - discount;
}
//checks if the number of packages is below 20 and at least 10
else if(pkgamt >= 10 && pkgamt < 20) {
	//creates the total cost before the discount
	total = pkgamt * COST;
	//creates the discount value for the order that has 10+ but less than 20 packages
	discount = total * .2;
	//creates the total cost after the discount is applied
	newtotal = total - discount;
}
//checks if the number of packages is below 50 and at least 20
else if(pkgamt >= 20 && pkgamt < 50) {
	//creates the total cost before the discount
	total = pkgamt * COST;
	//creates the discount value for the order that has 20+ but less than 50 packages
	discount = total * .3;
	//creates the total cost after the discount is applied
	newtotal = total - discount;
}
//checks if the number of packages is below 100 and at least 50
else if(pkgamt >= 50 && pkgamt < 100) {
	//creates the total cost before the discount
	total = pkgamt * COST;
	//creates the discount value for the order that has over 50 but less than 100 packages
	discount = total * .4;
	//creates the total cost after the discount is applied
	newtotal = total - discount;
}
//creates option for package amount greater than 100
else {
	//creates the total cost before the discount
	total = pkgamt * COST;
	//creates the discount value for the order that has over 100
	discount = total * .5;
	//creates the total cost after the discount is applied
	newtotal = total - discount;
}
//outputs the total cost before a discount
System.out.println("Total Bill Amount (before discount) = $"+total);
//outputs the active discount applied
System.out.println("Amount of discount = $"+discount);
//outputs total cost after discount
System.out.println("Total Bill Amount (after discount) = $"+newtotal);

	}

}

