//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW30 -- Ye Olde Role Playing Game, Improved
//2017-11-11

public class Protagonist extends Character{

	//extends makes Protagonist a SUBCLASS of Character, which means that it will inherit
	//all the instance variables and methods from class Character
	
	
	/* constructor
	takes String input to name the Protagonist
	initializes all attributes (instance variables)	*/
	public Protagonist( String newName ) { 	
		name = newName;		
		life = 125;		
		strength = 100;		
		defense = 40;		
		attackR = 0.4;		
	}
		

	//mutators	
	
	/* specialize
	prepares the Protagonist to perform a special attack
	decreases defense attribute
	increases attack attribute */
	public void specialize() {		
		defense /= 2;		
		attackR *= 2;		
	}
	
	/* normalize
	prepares the Protagonist to perform a normal attack
	resets defense attribute
	resets attack attribute */
	public void normalize() {		
		defense = 40;		
		attackR = 0.4;		
	}
	

}//end class