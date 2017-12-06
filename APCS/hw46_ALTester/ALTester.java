import java.util.ArrayList;

//Zane Wang
//APCS1 pd1
//HW46 -- Al<B> Sorted!
//2017-12-04

public class ALTester {
    
    // populates array with x terms, beginning with 1 and counting up by 1
    public static void populateUp(ArrayList<Comparable> array, int x) {
	int ctr = 1;
	while (ctr <= 23) {
	    array.add(ctr);
	    ctr++;
	}
    }

    // populates array with x terms, beginning with 23 and counting down by 1
    public static void populateDown(ArrayList<Comparable> array, int x) {
	int ctr = 23;
	while (ctr >= 1) {
	    array.add(ctr);
	    ctr--;
	}
    }
    
    // checks each index in array with next number, to
    // determine if in ascending order, remains true if
    // next term is greater than current term, otherwise turns false
    // and exits while loop
    public static boolean sortedUp(ArrayList<Comparable> array) {
	int i = 0;
	boolean retboo = true;
	while ( i < array.size() - 1 && retboo == true) {
	    if ((int) array.get(i) <= (int) array.get(i + 1)) {
		retboo = true;
	    }
	    else {
		retboo = false;
	    }
	    i++;
	}
	return retboo;
	}

    // checks each index in array with next number, to
    // determine if in descending order, remains true if
    // next term is less than current term, otherwise turns false
    // and exits while loop
    public static boolean sortedDown(ArrayList<Comparable> array) {
	int i = 0;
	boolean retboo = true;
	while ( i < array.size() - 1 && retboo == true) {
	    if ((int) array.get(i) >= (int) array.get(i + 1)) {
		retboo = true;
	    }
	    else {
		retboo = false;
	    }
	    i++;
	}
	return retboo;
	}
    
    public static void main(String[] args) {
	System.out.println("=======Test Initiation=======");
	System.out.println("Initializing foo...");
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	System.out.println("=======Initial Size=======");
	System.out.println(foo.size());
	System.out.println("Populating foo...");
	populateUp(foo,23);
	System.out.println("=======Size After Population=======");
	System.out.println(foo.size());
	System.out.println("=======Testing Sorted=======");
	System.out.print("foo sorted ascendingly: ");
	System.out.println(sortedUp(foo));
	System.out.print("foo sorted decendingly: ");
	System.out.println(sortedDown(foo));
	System.out.println("Final foo...");
	System.out.println(foo);
	
	System.out.println("");
	
	System.out.println("Initializing boo...");
	ArrayList<Comparable> boo = new ArrayList<Comparable>();
	System.out.println("Populating boo...");
	populateDown(boo,23);
	System.out.println("=======Testing Sorted=======");
	System.out.print("boo sorted ascendingly: ");
	System.out.println(sortedUp(boo));
	System.out.print("boo sorted decendingly: ");
	System.out.println(sortedDown(boo));
	System.out.println("Final boo...");
	System.out.println(boo);
    }
}
