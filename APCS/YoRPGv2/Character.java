//Alvin Ye, Zane Wang, Andrew Shao (Team: The Warriors)
//APCS1 pd1
//HW30 -- Ye Olde Role Playing Game, Improved
//2017-11-11

public class Character {

	//Character is the PARENT CLASS, so it will have the methods and instance variables
	//that both Monster and Protagonist would share
	
	
	//Instance Variables
	
	public int life, strength, defense;
	
	public double attackR;	

	public String name;
	

	//Methods

	/*=======    getName      ===========              
	returns the String name
	===================================*/
	public String getName() {		
		return name;		
	}
	
	/*=======    isAlive      ===========  
	Checks to see if the character is dead

	returns boolean 
	(true if life > 0)
	(false if life < 0)
	===================================*/	
	public boolean isAlive(){
		return life > 0;
	}

	/*=======    getDefense      ===========              
	returns the int defense
	===================================*/
	public int getDefense(){
		return defense;
	}

	/*=======    lowerHP      ===========              
	This is a mutator, which updates int life by subtracting int damage
	===================================*/
	public void lowerHP(int damage){
		life -= damage;
	} 

	/*=======    attack      ===========              
	returns the int dmg, which is calculated below

	This also calls lowerHP, which will mutate int life

	This is used to lower the health of the enemy
	===================================*/
	public int attack(Character enemy){	
		int dmg = (int) (strength * attackR) - enemy.getDefense();		
		if(dmg < 0) {
			dmg = 0;
		}		
		enemy.lowerHP( dmg ); //takes the calculated damage and updates the enemy's life	
		return dmg;		
	}

}//end class