import java.util.Scanner;
public class HW02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println ("\"Welcome traveler\"");
		System.out.println ("\"You have met a terrible fate haven't you?\"[Y/N]");
		String yes  = key.nextLine();
		String sword  = "";
		if(yes.equalsIgnoreCase("n")) {
			//allows users to exit the adventure early
			System.out.println ("\"Are you sure?\"[Y/N]");
			 yes  = key.nextLine();
			if(yes.equalsIgnoreCase("n")) {
				System.out.println ("\"Fine. Be that way\"");
				System.exit(0);
			}
			else {
				System.out.println("\"Very well back to the adventure.\"");
			}
		}
			System.out.println("\"To leave this place You must exit through a labrynth of doors.\"");
			System.out.println("\"Your journey begins now.\"");
			System.out.println("Three doors seem to lead from this room, Which one do you wish to open(1,2,3)");
			//gives user first door choice the only option that continues is choice 2 as this was constructed before the loops choices 2 and 3 are in choice one as well
			int door = key.nextInt();
			
			if(door == 1) {
				System.out.println("Hmm this door seems locked perhaps I can find a key to open it");
				System.out.println("Maybe I should try a different door(2,3) ");
				door = key.nextInt();
				if(door == 2) {
					System.out.println("You enter and find a beam of light shining down on a wooden sword ");
					System.out.println("\"It\'s dangerous to go alone. take this.\"");
					System.out.println("Do you take the sword? Y/N");
					sword = key.nextLine();
					sword = key.nextLine();
				}
					else if(door == 3)
					{
						System.out.println("Ouch! The door was just painted on the wall!? Thats mean.");
						System.out.println("I feel light-headed. Maybe Should lie down..");
						System.out.println("GAME OVER");
						System.exit(0);
					}
					
				}
			else if(door == 2) {
				System.out.println("You enter and find a beam of light shining down on a wooden sword ");
				System.out.println("\"It\'s dangerous to go alone. take this.\"");
				System.out.println("Do you take the sword? Y/N");
				sword = key.nextLine();
				sword = key.nextLine();
				//second .nextline used due to scanner error overlooking previous line
			}
			else if(door == 3) {
				System.out.println("Ouch! The door was just painted on the wall!? Thats mean.");
				System.out.println("I feel light-headed. Maybe Should lie down..");
				System.out.println("GAME OVER");
				System.exit(0);
				}
			else
			System.out.println("There are two more doors in this room");
			System.out.println("Where do i go from here?(1,2)");
			int door2 = key.nextInt();
			if(door2 == 1) {
				     System.out.println("Shhnnk! The door shut behind you.");
				     System.out.println("three creatures stare at you");
				     if(sword.equalsIgnoreCase("y")) {
				    	 //gives separate options for whether the user has a sword or not
				    	 System.out.println("will you fight them?(Y/N)");
				    	 String fight = key.nextLine();
				    	 fight = key.nextLine();
				    	 if(fight.equalsIgnoreCase("y")) {
				    		 System.out.println("You are quickly overpowered and defeated");
				    		 System.out.println("GAME OVER");
								System.exit(0);
				    	 }
				    	 else 
				    		 System.out.println("The fiends offer you food.");
				    	  	 System.out.println("Perhaps you may be able to make this trapped room your new home");
				    	  	System.exit(0);
				     }
				     else
				    	 System.out.println("Now that you get a closer you can tell that these are kobolds and they are gesturing to where you can leave.");
				     System.out.println("They are glad you can leave their home and you are glad you can leave this crypt.");
				     System.exit(0);
			}
			else if(door2 == 2) {
			System.out.println("Before you spans a mountain of treasures behind bars");
			System.out.println("the only thing that you think you can reach, however is a key ");
			System.out.println("will you try to reach the key(Y/N)");
			String reach = key.nextLine();
			 reach = key.nextLine();
			if(sword.equalsIgnoreCase("y") && reach.equalsIgnoreCase("y")){
				System.out.println("You barely scrape the key back to your side ");
				System.out.println("Should I go back to the locked door?(Y/N)");
				String rewind = key.nextLine();
				if(rewind.equalsIgnoreCase("y")) {
					System.out.println("You go back to to the locked door.");
					System.out.println("It leads to the treasure room and an exit!");	
					System.out.println("Congrats!");
					System.exit(0);
				}
				else
					System.out.println("Your boredom eats away at you till nothing but bones remain");
					System.exit(0);
			}
			else if(reach.equalsIgnoreCase("y")) {
				System.out.println("You try to grab the key and get stuck in the bars. Never to escape.");
				System.exit(0);
			}
			else
				System.out.println("The commotion you made wakes a drake that burns you through the bars with one sigh.");
			System.out.println("GAME OVER");
			System.exit(0);
			}
			else if(door2 == 42) {
				System.out.println("Secret ending you win!");
				System.exit(0);
				//secret ending contains the answer to life, the universe, and everything
			}
			
		}
		
	}


