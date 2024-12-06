//Zachary Scholz
//CSCE 145 03 LAB 01
public class lab01 {
public static void main (String [] args) 
{
	//Narrates the code output as per the the sample output
	System.out.println("Drawing the initial shape:");
	//Uses multi-line text output for same output to ensure consistent patterns
	System.out.print("  _   _ \n "
				   + "( '^'))\n"
				   + " |    ||\n"
				   + " |    ||\n"
				   + " '----''\n");
	//Narrates code output further
	System.out.println("Displaying 2 copies of the shape that are horizontally adjacent:");
	// copied same pattern twice with lateral spacing
	System.out.print("  _   _     _   _\n "
				+ "( '^'))   ( '^'))\n"
				+ " |    ||   |    ||\n"
				+ " |    ||   |    ||\n"
				+ " '----''   '----''");
}
}
