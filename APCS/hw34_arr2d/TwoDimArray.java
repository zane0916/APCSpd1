/******************************
 * class TwoDimArray
 * practice working with 2D arrays
 ******************************/

// Zane Wang
// APCS1 pd1
// HW34 -- Arrays of Arrays
// 2017-11-17

public class TwoDimArray
{
    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) {
	for (int ctr1 = 0; ctr1 < a.length; ctr1 ++) {// each row
	    for (int ctr2 = 0; ctr2 < a[ctr1].length; ctr2 ++) {// each column
		System.out.print(a[ctr1][ctr2]); // same line
	    }
	    System.out.println("");
	}
    }// ends print1
    
    
    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) {
	// same method as above
	for (int[] k : a) {
	    for (int x : k) {
		System.out.print(x);
	    }
	    System.out.println("");
	}
    }// ends print2   

    
    //postcond: returns sum of all items in 2D int array a
    // goes through each element, adding it to a total
    public static int sum1( int[][] a )
    {
	int sum = 0;
	for (int[] x: a) {// all rows
	    for (int k: x) {// all columns
		sum += k; // sum of all ints in array a
	    }
	}
	return sum;
    }// ends sum1
    
    
    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m )
    {
	int sum = 0;
	for (int ctr = 0; ctr < m.length; ctr ++) {
	    sum += sumRow(ctr, m); // sum of the sums of all the rows
	}
	return sum;
    }// ends sum2
    
    
    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a )
    {
	int sum = 0;
	for (int x = 0; x < a[r].length; x ++) {// goes through the row r
	    sum += a[r][x]; // total sum is all integers in row r of array a
	}
	return sum;
    }
    
    
    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m)
    {
	int sum = 0;
	for (int x : m[r]) {// adds all values in row r of array m
	    sum += x;
	}
	return sum;
    }
    
    
    public static void main( String [] args )
    {
	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
	print1(m1);
	print1(m2);
	print1(m3);
	print2(m1);
	print2(m2);
	print2(m3);
	System.out.print("testing sum1...\n");
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }
    
}//end class TwoDimArray


