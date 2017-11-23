//Zane Wang
//APCS1 pd1
//HW16 -- Get It While You Can
//2017-10-14

public class Driver
{
  public static void main( String[] args )
  {

    //build Objects from blueprint specified by class Coin

    //test default constructor
    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
 
    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
    else
	    System.out.println( "No match. Firestarter you can not be." );

    //the continuous flipping method
    int MatchCtr = 0;
    while ((yours.headsCtr <= 30 ^  wayne.headsCtr <= 30) || MatchCtr < 10 || (MatchCtr <= 13000 && MatchCtr % 2001 == 0)) {
		if (yours.equals(wayne)) {
			MatchCtr += 1;
		    }
	      	yours.flip();
		wayne.flip();
		System.out.println("Heads of yours = " + yours.headsCtr);
		System.out.println("Heads of wayne = " + wayne.headsCtr);
		System.out.println("Matches = " + MatchCtr);
		System.out.println("Flips = " + yours.flipCtr);
	    }// ends while loop
    
  }//end main()

}//end class
