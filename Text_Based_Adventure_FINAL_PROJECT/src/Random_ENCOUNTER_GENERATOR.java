import java.util.Scanner;

public class Random_ENCOUNTER_GENERATOR
{
	private int weather, temp, sound, death, monster, monsteract, weapon;
	
	public String R_Weather() // Random Weather
	{
		weather = (int)(Math.random()*10+1);
		
		if(weather <= 4)
		{
			return "rainy";
		}
		else if(weather >= 6)
		{
			return "sunny";
		}
		else if( weather == 5)
		{
			return "cloudy";
		}
		return "";
	}
	
	public String R_AnyTemp() // Random Temperature(Works for anything that requires temperature)
	{
		temp = (int)(Math.random()*10+1);
		
		if(temp <= 4)
		{
			return "warm";
		}
		else if(temp >= 6)
		{
			return "hot";
		}
		else if(temp == 5)
		{
			return "mildly cool";
		}
		return "";

	}
	
	public String R_SoundEncounter()// Random sound
	{
		sound = (int)(Math.random()*10+1);
		
		if(sound <= 4)
		{
			return "creepy whail";
		}
		else if(sound >= 6)
		{
			return "loud road";
		}
		else if(sound == 5)
		{
			return "piercing scream";
		}
		return "";
	}
	
	public String R_Death()// Random death if player dies
	{
		death = (int)(Math.random()*10+1);
		
		if(death <= 4)
		{
			return "body slammed";
		}
		else if(death >= 6)
		{
			return "being crushed to death";
		}
		else if(death == 5)
		{
			return "magically killed";
		}
		return "";
	}
	
	public String R_Monster()// Random monster
	{
		monster = (int)(Math.random()*10+1);
				
		if(monster <= 4)
		{
			return "skeleton";
		}
		else if(monster >= 6)
		{
			return "troll";
		}
		else if(monster == 5)
		{
			return "golem";
		}
		return "";

	}
	
	public String R_action()// Random action of anything
	{
		monsteract= (int)(Math.random()*10+1);
		
		if(monsteract <= 4)
		{
			return "playing games";
		}
		else if(monsteract >= 6)
		{
			return "eating food";
		}
		else if(monsteract == 5)
		{
			return "singing";
		}
		return "";
	}
	
	public String R_Weapon()// Random weapon
	{
		weapon = (int)(Math.random()*10+1);
		
		if(weapon <= 4)
		{
			return "a sword";
		}
		else if(weapon >= 6)
		{
			return "a bow";
		}
		else if(weapon == 5)
		{
			return "a magic lazer";
		}
		return "";
	}	
}
