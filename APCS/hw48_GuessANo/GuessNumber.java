/*==================================================
  class GuessNumber -- fun fun fun!
  
  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

// Zane Wang
// APCS1 pd1
// HW48 -- Keep Guessing
// 2017-12-6

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;
    
    
    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
	// assumes a is the lower bound and b is upper bound
	_lo = Math.min(a,b);
	_hi = Math.max(a,b);
	_guessCtr = 1;
	_target = (int) (Math.random() * (_hi - _lo + 1) + _lo);
    }
    
    
    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() 
    {
	System.out.println("Guess a number from " + _lo + "-" + _hi + ":");
	// prompts the guess
	int enter = Keyboard.readInt();
	// if input is lower than target do this
	if (enter < _target) {
	    System.out.println("Too low, try again...");
	    _lo = enter + 1;
	    _guessCtr ++;
	    // calls this method with modified _lo and _guessCtr
	    playRec();
	}
	// if input is higher than target do this
	else if (enter > _target) {
	    System.out.println("Too high, try again...");
	    _hi = enter - 1;
	    _guessCtr ++;
	    // calls this method with modified _hi and _guessCtr
	    playRec();
	}
	// if input is target (guessed correctly) ends the recursion
	else {
	    System.out.println("Correct! It took " + _guessCtr + " guesses.");
	}
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	// initialize the variable enter --> needed to start loop
	// uses an int that is out of bounds so that it isn't equal to target
	int enter = 0;
	while (enter != _target) {
	    System.out.println("Guess a number from " + _lo + "-" + _hi + ":");
	    enter = Keyboard.readInt();
	    // modifies _lo and _guessCtr if too high, and loops with new vals
	    if (enter < _target) {
		System.out.println("Too low, try again...");
		_lo = enter + 1;
		_guessCtr ++;
	    }
	    // modifies _hi and _guessCtr if too high, and loops with new vals
	    else if (enter > _target) {
		System.out.println("Too high, try again...");
		_hi = enter - 1;
		_guessCtr ++;
	    }
	    // if the new enter is = to target, doesn't call any of these
	    // and instead will exit while loop on next "turn"
	}
	// equal to target (guessed correctly) exits loop
	System.out.println("Correct! It took " + _guessCtr + " guesses.");
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	//playRec();
	playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
	
	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
