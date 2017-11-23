//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Monster{

	public static int health;
	public static int strength;
	public static int defense;
	public static double attack;
	public static String name;

	public Monster(){
		name = "Troll";
		health = 150;
		defense = 20;
		attack = 1;
		strength = ( (int) (Math.random() * 45) ) + 20; //sets strength w/ range [20,65)
	}

	public static boolean isAlive(){
		return health > 0;
	}

	public static int getDefense(){
		return defense;
	}

	public static String getName(){
		return name;
	}

	public static void lowerHP(int damage){
		health -= damage;
	} 

	public static int attack(Protagonist protagonist){
		return(  (int) ((strength * attack) - protagonist.defense)  );
	}



}//end class