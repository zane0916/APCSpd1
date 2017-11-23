//Zane Wang
//APCS1 pd1
//HW25 -- All Hallow's Eve
//2017-10-31

public class Loopier {
    public static void populate(int[] anArray) {
	for (int counter = 0; counter < anArray.length; counter += 1) {
	    anArray[counter] = (int) (Math.random() * 100);
	    //input array and sets elements random ints 0 <= x <= 99 
	}
    }//ends populate()

    
    public static String stringify(int[] anArray) {
	String retStr = Integer.toString(anArray[0]);
	for (int counter = 1; counter < anArray.length; counter += 1) {
	    retStr += " " + Integer.toString(anArray[counter]);
	    //retStr adds a space to separate the different numbers
	}
	return retStr;
    }//ends stringify()

    
    public static int linSearch(int[] a, int target) {
	int counter = a.length - 1;
	//starts from back and goes backward to avoid IOOB error
	while (counter > -1) {
	    if (a[counter] == target) {
		return counter; //return index of the target
	    }
	    counter -= 1;
	}
	return counter;
    }//ends linSearch()

    
    public static int linSearchR(int[] a, int target) {
	if (a[0] == target) {
	    return 0; 
	}
	else if (a.length < 2) {
	    // since previous line checked if number is in first index, if length 1 or less then non-existent in string, - 10 to cancel out the plus ones
	    return -10;
	}
	else {
	    int[] b = new int[a.length - 1];
	    for (int counter = 0; counter < b.length; counter += 1) {
		b[counter] = a[counter + 1];
	    }
	    return 1 + linSearchR(b, target);
	}
    }// ends linSearchR

    
    public static int freq(int[] a, int target) {
	int counter = 0;
	// adds one to counter everytime target is found inside the array
	for (int indexCtr = 0; indexCtr < a.length; indexCtr += 1) {
	    if (a[indexCtr] == target) {
		counter += 1;
	    }
	}
	return counter;
    }// ends freq

    
    public static int freqRec(int[] a, int target) {
	int[] b = new int[a.length - 1];
	for (int counter = 0; counter < b.length; counter += 1) {
	    b[counter] = a[counter + 1];
	}
	if (a[0] == target) {
	    return 1 + freqRec(b, target);
	}
	// returns 0 if a[0] != target and a.length <= 1
	if (a.length < 2) {
	    return 0;
	}
	else {
	    return freqRec(b, target);
	}
    }// ends freqRec

    
    public static void main(String[] args) {
	int[] trialArray;
	trialArray = new int[10];
	populate(trialArray);
	System.out.println(stringify(trialArray));
	System.out.println(linSearch(trialArray, 15));
	System.out.println(linSearch(trialArray, 27));
	System.out.println(linSearchR(trialArray, 15));
	System.out.println(linSearchR(trialArray, 27));
	System.out.println(freq(trialArray, 15));
	System.out.println(freq(trialArray, 27));
	System.out.println(freqRec(trialArray, 15));
	System.out.println(freqRec(trialArray, 27));
    }
}
