/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

// Zane Wang
// APCS1 pd1
// HW41 -- Array of Steel
// 2017-11-27

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _data = new int[10];
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
      String retStr = "[";
      for (int i = 0; i < _data.length; i++)
	  {
	      retStr += _data[i] + ",";
	  }
      return retStr.substring(0,retStr.length() - 1) + "]";
  }


  //double capacity of SuperArray
  private void expand()
  {
      _data = new int[_data.length * 2];
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int holder = _data[index];
      _data[index] = newVal;
      return holder;
  }


  //main method for testing
  public static void main( String[] args )
  {
    
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);      
      }
      
  }//end main()


}//end class
