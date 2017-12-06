/***************************
 * interface List
 * Declares methods that will be implemented by any
 *  class wishing to adhere to this specification.
 * This interface specifies behaviors of a list of ints.
 ***************************/

public interface List
{
  // Return number of elements in the list
  public int size();

  // Append an int to the end. Return true.
  public boolean add( java.lang.Object num );

  // Insert an int at index
  void add( int index, java.lang.Object num ); 

  // Retrieve the int at index
  public java.lang.Object get( int index );

  // Overwrite the int at index
  public java.lang.Object set( int index, java.lang.Object num );

  // Remove the int at index,
  // shifting any elements after it to the left.
  // Return removed value.
  public java.lang.Object remove( int index );

}//end interface List
