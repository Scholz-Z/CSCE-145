//Zachary Scholz
//Lab02 
//CSCE 145 03 LAB 02
import java.util.Scanner;
public class Lab02 {
	// Creates gravity as a constant to be called later
	private static final double gravity = 9.8;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//Asks user for the initial velocity
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A");
			//stores user response as variable initialVel
		double initialVel = key.nextDouble();
		//Asks user for the time the ball took
		System.out.println("how much time (in seconds) does the ball take to reach point B?");
			//stores user response as variable time
		double time = key.nextDouble();
			//Uses 'v = u + at' formula to find the final velocity of the ball
			double finalVel = initialVel + gravity * time;	
			//uses 'S = ut + ½ at²' formula to find the distance traveled by the ball
			double distance = initialVel * time + 0.5 * (gravity * Math.pow(time, 2));
			//Out puts the calculated values of the distance and the final velocity
			System.out.println("Final Velocity of the ball = " + finalVel + " m/s");
			System.out.println("Distance traveled by the ball (S) = " + distance + " meters");
		
		
	}
	
}
