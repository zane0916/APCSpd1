/*****************************************************
 * class Slots
 * simulates a slot machine in your very own terminal
 * Zane Wang
 * APCS1 pd01
 * HW26 -- Spin Class
 * 2017-11-03
 *****************************************************/

public class Slots
{
    
    private static final String[] FRUITS = {
	"lime", "lime", "lime", 
	"lemon", "lemon", "lemon", 
	"cherry", "cherry", "cherry", 
	"orange", "orange", "orange", 
	"grapefruit", "grapefruit", "grapefruit", 
	"tangerine", "tangerine", "tangerine", 
	"ugli", "ugli", "ugli",
	"peach", "peach", "peach"
    };
    
    private String[] _fruits; //to be init'd by each instance
    
    
    /*=====================================
      Slots() -- default constructor
      pre:  constant array FRUITS exists, has been initialized
      post: mutable array _fruits contains same elements as FRUITS
      =====================================*/
    public Slots()
    {
	//allocate memory for _fruits based on size of FRUITS:
	_fruits = new String[FRUITS.length];
	//copy elements of FRUITS into _fruits:
	for (int index = 0; index < _fruits.length; index ++) {
	    _fruits[index] = FRUITS[index];
	}
    }
    
    
    /*=====================================
      String toString() -- overrides inherited toString()
      pre:  
      post: returns String of elements in slots 0 thru 2, separated by tabs
      =====================================*/
    public String toString()
    {
	// first 3 slots separated by tabs
	return _fruits[0] + "\t" + _fruits[1] + "\t" + _fruits[2];
    }
    
    
    /*=====================================
      void swap(int,int) -- array swap util fxn
      pre:  _fruits array exists
      post: elements at indices i, j are swapped
      =====================================*/
    private void swap( int i, int j )
    {
	// puts _fruits[i] in a storage because _fruits[i] changes first
	String holder = _fruits[i];
	// changes _fruits[i] to _fruits[j] and vice versa
	_fruits[i] = _fruits[j];
	_fruits[j] = holder;
    }
    
    
    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
      pre:  _fruits array exists
      post: randomized order of elements in _fruits array
      =====================================*/
    public void spinOnce()
    {
	// swaps all the indexes of the slot machine with one another
	for (int index = 0; index < _fruits.length; index ++) {
	    swap(index, (int) (Math.random() * _fruits.length));
	}
    }
    
    
    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    // ugli is the winning combo
    public boolean jackpot()
    {
	// if first is ugli and all are the same --> true
	return _fruits[0].equals(_fruits[1]) && _fruits[1].equals(_fruits[2]) && _fruits[0].equals("ugli");
    }
    
    
    /*=====================================
      boolean miniWin() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      or if first 3 slots mutually distinct, 
      false otherwise
      =====================================*/
    public boolean miniWin()
    {
	// if the first three are the same and not a jackpot --> true
	if (!( _fruits[0].equals("ugli"))) {
	    return _fruits[0].equals(_fruits[1]) && _fruits[1].equals(_fruits[2]);
	    }
	return false;
    }
    
    
  //main() method for testing
    public static void main( String[] args )
    {
	//usage: move bar below down 1 line at a time to test functionality...
	
	  Slots machine01 = new Slots();
	  Slots machine02 = new Slots();
	
	  //test to verify slot machines function indepently
	  System.out.println();
	  System.out.println( "Machine01 initial state:\t" + machine01 );
	  System.out.println( "Machine02 initial state:\t" + machine02 );
	  
	  System.out.println( "\nSpinning machine01...\n" );
	  
	  machine01.spinOnce();
	  
	  System.out.println();
	  System.out.println( "Machine01 state:\t" + machine01 );
	  System.out.println( "Machine02 state:\t" + machine02 );
	  System.out.println();

	  
	  //test gamble-until-you-win mechanism
	  
	  System.out.println( "Preparing to spin until a mini win! . . ." );
	  System.out.println( "------------------------------------" );
	  
	  //if you haven't won, spin again until you win!
	  while( machine01.miniWin() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
	  }
	  
	  System.out.println( "====================================" );
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "WIN\n" );
	  
      
	  
	  System.out.println( "Preparing to spin until...jackpot! . . ." );
	  System.out.println( "------------------------------------" );
	  
	  //if you haven't won, spin again until you win!
	  while( machine01.jackpot() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
	  }
	  
	  System.out.println( "====================================" );
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "JACKPOT!\n" );
	  /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    	  
	    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main
    
}//end class Slots
