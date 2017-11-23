//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Protagonist{

	public static String name;
	public static int health;
	public static int strength;
	public static int defense;
	public static double attack;

	public static int origDefense = defense; //so we can reset the defense to the original value later on 
	public static double origAttack = attack; //so we can reset the defense to the original value later on 

	public Protagonist(String name0){
		name = name0;
		health = 100;
		strength = 100;
		defense = 100;
		attack = 10;
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

	public static int attack(Monster monster){
		return( (int) ((strength * attack) - monster.defense) );

	}

	public static void specialize(){
		defense /= 2;
		attack *= 2;
	}

	public static void normalize(){
		defense = origDefense;
		attack = origAttack;
	}




}//end class