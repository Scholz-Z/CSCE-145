import java.util.Scanner;

public class AppleTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Apple Tester!!!");
		System.out.println("Creating the first apple!");
		System.out.println("Default values of the first apple object");
		Apple newApple1 = new Apple();
		//uses the get methods to to output the default apple
		System.out.println("Type: "+newApple1.getType()+
	 			"\nWeight: "+newApple1.getWeight()+
	 			"\nPrice: "+newApple1.getPrice());
		//Creates second apple object 
		Apple newApple2 = new Apple();
		System.out.println("Enter the type of the second apple object:");
		//sets new value to the second apple's Type
		newApple2.setType(key.nextLine());
		System.out.println("Enter the weight of the second apple object:");
		//sets new value to the second apple's Weight
		newApple2.setWeight(key.nextDouble());
		System.out.println("Enter the price of the second apple object:");
		//sets new value to the second apple's Price
		newApple2.setPrice(key.nextDouble());
		//Outputs the second apple's values
		newApple2.writeOutput();
	}

}
