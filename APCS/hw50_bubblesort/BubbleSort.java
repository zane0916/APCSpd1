/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 ******************************/

// Zane Wang
// APCS1 pd1
// HW50 -- Dat Bubbly Tho
// 2017-12-09

import java.util.ArrayList;

public class BubbleSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
	//setup for traversal fr right to left
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }

    public static void swap(ArrayList data, int index1, int index2) {
	// swaps the indexes 1 and 2 of data
	Object holder = data.get(index2);
	data.set(index2, data.get(index1));
	data.set(index1, holder);
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data )
    {
	int ctr = 1;
	// runs data.size() - 1 loops
	while (ctr < data.size()) {
	    // for every pair starting from the end, swaps them into ascending order
	    for (int flips = data.size() - 1; flips >= 1; flips--) {
		if ((data.get(flips).compareTo(data.get(flips - 1))) < 1) {
		    swap(data,flips - 1,flips);
		}
	    }
	    ctr++;
	}
    }


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
	ArrayList<Comparable> data = new ArrayList();
	for (Comparable x:input) {
	    data.add(x);
	}
	// sorts the new copy using the already built void version
	bubbleSortV(data);
	return data;
    }


    public static void main( String [] args )
    {
	///*===============for VOID methods=============
	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	bubbleSortV(glen);
	System.out.println( "ArrayList glen after sorting:\n" + glen );

	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	bubbleSortV(coco);
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	//============================================*/

	///*==========for AL-returning methods==========
	  ArrayList coen = new ArrayList<Integer>();
	  // renamed glen because it was already defined
	  coen.add(7);
	  coen.add(1);
	  coen.add(5);
	  coen.add(12);
	  coen.add(3);
	  System.out.println( "ArrayList coen before sorting:\n" + coen );
	  ArrayList coenSorted = bubbleSort( coen );
	  System.out.println( "sorted version of ArrayList coen:\n" 
	  + coenSorted );
	  System.out.println( "ArrayList coen after sorting:\n" + coen );

	  System.out.println("Scrambling coco...");
	  shuffle(coco);
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = bubbleSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  //============================================*/

    }//end main

}//end class BubbleSort
