/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/
// Zane Wang
// APCS1 pd1
// HW47 -- ascenDING
// 2017-12-05

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	_data = ArrayList<Comparable>.ArrayList();
    }


    public Comparable remove( int index )
    {	
	Comparable holder = _data.remove(index);
	return holder;
    }


    public int size()
    { 
	return _data.size();
    }

    
    public Comparable get( int index )
    { 
	return _data.get(index);
    }


    public void add(Comparable newVal)
    { 
	int i = 0;
	while (newVal.compareTo(_data.get(i)) > 0) {
	    i++;
	}
	_data.add(i,newVal);
    }



    // main method solely for testing purposes
    public static void main( String[] args )
    {

	   OrderedArrayList Franz = new OrderedArrayList();

	   // testing linear search
	   for( int i = 0; i < 15; i++ )
	   Franz.add( (int)( 50 * Math.random() ) );
	   System.out.println( Franz );

	   //check for sorted-ness
	   //if msg does not appear, list was sorted
	   for( int i=0; i<Franz.size()-1; i++ ) {
	   System.out.println("at i: " + Franz.get(i) );
	   if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
	   System.out.println( " *** NOT sorted *** " );
	   break;
	   }
	   }
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class OrderedArrayList
