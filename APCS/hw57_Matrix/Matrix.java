/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) 
    {
	// 2D array with lengths DEFAULT_SIZE
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) 
    {
	// 2D array with lengths a and a
	matrix = new Object[a][a];
    }


    //return size of this matrix, where size is 1 dimension
    private int size()
    {
	// size is how many rows there are
	return matrix.length;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) 
    {
	// gets the value at r-1, c-1 because we consider the start 1,1
	return matrix[r - 1][c - 1];
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty() 
    {
	// iterates through entire matrix
	boolean retBoo = true;
	for (int r = 0; r < matrix.length; r++) {
	    for (Object o : matrix[r]) {
		// does nothing if it is null, if not null then isn't empty
		retBoo = o.equals(null);
		if (retBoo = false) {
		    return retBoo;
		}
	    }
	}
	return retBoo;
    }
    
    
    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) 
    {
	// a holder place value holds original, then changes the original to the new, returns original
	Object holder = get(r,c);
	matrix[r - 1][c - 1] = newVal;
	return holder;
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() 
    {
	String retStr = "";
	// iterates through matrix, adding the number to retStr and separated with two spaces
	for (int r = 0; r < matrix.length; r++) {
	    for (Object o : matrix[r]) {
		retStr += o + "  ";
	    }
	    // new line for next row
	    retStr += "\n";
	}
	return retStr;
    }
    

    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) 
    {
	Matrix a = (Matrix) rightSide;
	// if the size are equal and the printed string is equal then they are equal
	return this.size() == a.size() && this.toString().equals(a.toString());
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) 
    {
	// iterates through each row, changing the 2 column values in each
	// x holds the row number
	for (int x = 1; x <= matrix.length; x++) {
	    set(x,c1, set(x,c2, get(x,c1)));
	}
    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) 
    {
	// for rows r1 and r2, swaps the values of the same column between them
	// x holds the column spot
	for (int x = 1; x <= matrix[r1].length; x++) {
	    set(r1,x, set(r2,x,get(r1,x)));
	}
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	System.out.println("======constructor and toString tester============");
	System.out.println("Initializing m1...");
	Matrix m1 = new Matrix();
	System.out.println("Printing m1...");
	System.out.println(m1);
	System.out.println("Initializing m2...");
	Matrix m2 = new Matrix(3);
	System.out.println("Printing m2...");
	System.out.println(m2);

	System.out.println("=====size tester======");
	System.out.println("m1.size()...");
	System.out.println(m1.size());
	System.out.println("m2.size()...");
	System.out.println(m2.size());

	System.out.println("======set tester=======");
	System.out.println("Updating values of m1...");
	m1.set(1,1,5);
	m1.set(1,2,6);
	m1.set(2,1,7);
	m1.set(2,2,8);
	System.out.println("Printing new m1...");
	System.out.println(m1);
	
	System.out.println("=====get tester=======");
	System.out.println(m1.get(1,2));
	System.out.println(m1.get(2,1));
        //m1.get(3,4); //error

	System.out.println("=====isEmpty tester=====");
	System.out.println(m1.isEmpty());
	
	System.out.println("====equals tester=======");
	System.out.println(m1.equals(m2));
	System.out.println("Initializing m3...");
	Matrix m3 = new Matrix();
	System.out.println("Printing m3...");
	System.out.println(m3);
	System.out.println(m1.equals(m3));
	m3.set(1,1,5);
	m3.set(1,2,6);
	m3.set(2,1,7);
	m3.set(2,2,8);
	System.out.println("Printing new m3...");
	System.out.println(m3);
	System.out.println(m1.equals(m3));
	
	System.out.println("=====swap testers======");
	System.out.println("Printing m1...");
	System.out.println(m1);
	m1.swapColumns(1,2);
	System.out.println("Printing new m1...");
	System.out.println(m1);
	System.out.println("Printing m3...");
	System.out.println(m3);
	m3.swapRows(1,2);
	System.out.println("Printing new m3...");
	System.out.println(m3);
    }
    
}//end class Matrix
