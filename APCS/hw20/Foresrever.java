//Zane Wang
//APCS1 pd1
//HW20 -- For the Lulz Love of Strings
//2017-10-19

public class Foresrever{
    
    public static String fenceF(int posts) {// makes a fence fxn using for
	String retStr = "";
	for (int postsLeft = posts;  postsLeft > 0; postsLeft -= 1) {
	    if (postsLeft == 0) {
		retStr += "";
	    }
	    else if (postsLeft == 1) {
		retStr += "|";
	    }
	    else {
		retStr += "|--";
	    }
	}// ends for
	return retStr;
    }// ends fenceF
    
    public static String reverseF(String s) {
	String retStr = "";
	for (int counter = s.length(); counter > 0; counter -= 1) {
	    retStr += s.substring(counter - 1,counter);
	}// ends for loop
	return retStr;
    }// ends reverseF


    public static String reverseR(String s) {
	String retStr = "";
	if (s.length() == 1) {
	    retStr += s;
	}
	else{
	    retStr += s.substring(s.length() - 1);
	    retStr += reverseR(s.substring(0,s.length() - 1));
	}
	return retStr;
    }// ends reverseR
    
    public static void main(String[] args) {
	System.out.println("=====fenceF tests====");
	System.out.println(fenceF(0));
	System.out.println(fenceF(1));
	System.out.println(fenceF(3));
	System.out.println("=====reverseF tests====");
	System.out.println(reverseF("hello"));
	System.out.println(reverseF("weird"));
	System.out.println(reverseF("for functions"));
	System.out.println("=====reverseR tests====");
	System.out.println(reverseR("hello"));
	System.out.println(reverseR("weird"));
	System.out.println(reverseR("for functions"));
    }// ends main
    
}// ends Foresrever
