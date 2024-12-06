import java.util.Scanner;
public class Lab06 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the height of the triangle: ");
		int height = key.nextInt();
		//takes in the tallest point of the triangle
		String triangle = "*";
		//assigns asterisk as a unit to measure/make the triangle
		System.out.println(triangle);
		
		for (int i = 0; i < height - 1;i++) {
			triangle = triangle + "*";
			//adds an asterisk for each row until it reaches the height of the triangle
			System.out.println(triangle);
			//prints the new, longer asterisk line
			}
		for (int i = height - 1; i > 0;i--) {
			System.out.println(triangle.substring(0,i));
			//goes along the string of the highest point and re types it with one less until it hits zero
			}
		System.out.println("End of program!");
		System.exit(0);
	}

}
