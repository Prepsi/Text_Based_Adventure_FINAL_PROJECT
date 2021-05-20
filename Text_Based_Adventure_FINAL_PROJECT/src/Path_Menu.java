import java.util.Scanner;

public class Path_Menu 
{
	private int finalpath;
	Random_ENCOUNTER_GENERATOR random = new Random_ENCOUNTER_GENERATOR();
	
	public void path_SUCCESS() // Success path (Continue adventure)
	{
		System.out.println("\sYou successfully kill the beast using, " +random.R_Weapon()+  " the odds seem to be in your favor and you continue\n");
		path_FleeOrExit();
	}
	
	public void path_DEATH() // Death Ending (You died)
	{
		System.out.println("\sThe odds are stacked against you, and you die by being " +random.R_Death());
		System.out.println("\sYOU DIED.");
		System.exit(0);
	}
	
	public void path_INVESTIGATE_MONSTER() // Investigation method, for those who chose to investigate
	{
		DiceCode roller = new DiceCode();
		String Resp6;
		char Response6;
		
		System.out.println("\sYou cautiously look around and you see a " +random.R_Monster()+ " " +random.R_action()+"...");
		System.out.println("\sThe foe spots you and gets into it's attack stance... ");
		System.out.println("\sYou decide to...");
		System.out.println("");
		System.out.println("\s[ (A)ttack / (F)lee ]\s");
		System.out.println("");
		

		do {
			Scanner input6 = new Scanner(System.in);
			Resp6 = input6.next();
			Response6 = Resp6.charAt(0);
			
			if(Response6 == 'A' || Response6 == 'a') // Will ask player to roll the dice if 'A' is pressed
			{
						if(roller.RollDice().contains("Success"))
						{
							path_SUCCESS();
						}
						else
						{
							path_DEATH();
						}
				
			}
			else if(Response6 == 'F' || Response6 == 'f') // Player flees if 'F' is chosen
			{
				System.out.println("\sYou decide to avoid the trouble and rush out of the scene");
				System.out.println("\sThe beast chases after you, but you loose the beast after a good hour\n");
				path_FleeOrExit();
			}
		}while(Response6 != 'A' || Response6 != 'F');
	}
	
	public void path_FleeOrExit() // Method for those who chose to Flee, Also works as a method for those who successfully defeated monster
	{
		String Resp7;
		char Response7;
		
		System.out.println("\sYou finally make it out and take in the fresh "+random.R_AnyTemp()+" air...");
		System.out.println("\sYou continue walking as if nothing happened, but come across 3 paths...");
		System.out.println("\sThe paths seem familiar, but you have no idea which path to take, so you have to make a decision...");
		System.out.println("");
		System.out.println("\sWhich path will you take?\n");
		System.out.println("\s[ Take path (1) / Take path (2) / Take path (3) ]\s");
		System.out.println("");
		
		do { //This whole method is just a random path method, randomized endings.
				Scanner input7 = new Scanner(System.in);
				Resp7 = input7.next();
				Response7 = Resp7.charAt(0);
			
				if(Response7 == '1') 
				{
					System.out.println("\sYou decide to take the 1st path and walk forward, hoping to the best...\n");
					R_FinalPath();
				}
				else if(Response7 == '2')
				{
					System.out.println("\sYou decide to take the 2nd path and walk forward, hoping for the best...\n");
					R_FinalPath();
				}
				if(Response7 == '3')
				{
					System.out.println("\sYou decide to take the 3nd path and walk forward, hoping for the best...\n");
					R_FinalPath();
				}
		}while(Response7 != '1' && Response7 != '2' && Response7 != '3');	
	}
	
	
	
	public void R_FinalPath() //The final path (Hero Ending, Wealth Ending, and Home sweet Home Ending), also randomized
	{
		DiceCode roller = new DiceCode();	
		Path_Menu path = new Path_Menu();
		String Resp8;
		char Response8;
		
		finalpath = (int)(Math.random()*20+1);

		
		if(finalpath >= 11) // Wealth Ending
		{		
			System.out.println("\sYou tread down the path and find yourself at a large river...");
			System.out.println("\sYou look on the other side of the river, and you see a giant stash of gold...");
			System.out.println("\sThe river is littered with victims who were charmed by the sight of the sight of gold...");
			System.out.println("\sThe gold is irresistible, so you decide to test your luck\n");
			System.out.println("\s(A)ccept the odds");
			
			Scanner input8 = new Scanner(System.in);
			Resp8 = input8.next();
			Response8 = Resp8.charAt(0);
			
			if(Response8 == 'A' || Response8 == 'a')
			{
				System.out.println("\sThe sky becomes "+random.R_Weather()+ " as you cross the river...");
				System.out.println("\sBut will you cross the river successfully?\n");
						if(roller.RollDice().contains("Success"))
						{
							System.out.println("\sYou successfully cross the river to the mass of gold.");
							System.out.println("\sOne by one, you take as much as you can and stuff it into your pockets and bags.");
							System.out.println("\sSuddenly a " +random.R_Monster()+ " appears and shouts at you to get away from it's gold!");
							System.out.println("\sYou cowardly flee like a rat stealing cheese and run off, wealthy and a new man.\n\n");
							System.out.println("\s[ THE END ]");
							System.exit(0);
						}
						else
						{
							path.path_DEATH();
						}
			}	
		}
		
		else if(finalpath <= 9) // Hero Ending
		{
			System.out.println("\sAs you walk, dirt path starts to become stone, you suddenly realize that you are in heading towards the town...");
			System.out.println("\sYou look up to get a glance at the town, but you suddenly see that the town has been in chaos.");
			System.out.println("\sAs you look around, the ground shakes around you, and the sky becomes " +random.R_Weather()+ "...");
			System.out.println("\sSuddenly, a dragon appears right in front of your eyes, spitting " +random.R_AnyTemp()+ " air!");
			System.out.println("\sFor some reason, the dragon seems to be " +random.R_action()+ " which is an odd sight to see such large beast do such thing...");
			System.out.println("\sYou both lock eyes and fight...\n");
			
				if(roller.RollDice().contains("Success"))
				{
					System.out.println("\sYou strike the dragon with " +random.R_Weapon()+ " killing the beast...");
					System.out.println("\sTownspeople come out of their hiding spots to look at the dead dragon, but they all run to you to celebrate.");
					System.out.println("\sThey chant your name, and throw a celebration.");
					System.out.println("\sLater in the evening, you spot people at the celebration, and most people are " +random.R_action()+"...");
					System.out.println("\sYour name is suddenly called, and everyone bows down at you... The king steps out.");
					System.out.println("\sThe king pronounces you the hero of the village, and everyone cheers... Maybe this day isn't turning out so bad afterall.\n\n");
					System.out.println("\s[ THE END ]");
					System.exit(0);
					
				}
				else
				{
					path.path_DEATH();
				}
			
		}
		else if(finalpath == 10)// Home Sweet Home Ending (RARE ENDING)
		{
			System.out.println("\sThe terrain becomes extremely familiar, you come across a sign that says... 'Home sweet Home' ");
			System.out.println("\sYou suddenly realize that you've made it home. You rush inside the house, slamming the door shut behind you.");
			System.out.println("\sSuddenly the weather becomes " +random.R_Weather()+ " and you sit down behind your kitchen table");
			System.out.println("\sYour meal still hot, you eat the meal and relax\n\n");
			System.out.println("\s[ THE END ]");
			System.exit(0);
		}
	}	
}