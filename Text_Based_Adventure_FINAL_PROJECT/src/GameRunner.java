import java.util.Scanner;

public class GameRunner 
{
	public static void main(String[] args) 
	{
		String Resp;
		char Response;
		
		Scanner input = new Scanner(System.in);
		Cave_Jungle test2 = new Cave_Jungle();
		
		System.out.println("\t\s\sRNG Adventure"); // Main menu
		System.out.println("Made by name :: Evan R, Stowe B, Preston N, London \n\n");
		System.out.println(" \t[ (P)lay   (Q)uit ]"); 
		
			do
			{
				Resp = input.next();
				Response = Resp.charAt(0);
				
				if(Response == 'P' || Response == 'p') // Start the game
				{
					test2.Adventure_Start();
				}
			}while(Response != 'Q' && Response != 'q'); // End game
			
			System.out.println("System has ended, restart program to play again");
	}	
}