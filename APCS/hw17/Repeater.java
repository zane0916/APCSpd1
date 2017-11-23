//Zane Wang
//APCS1 pd1
//HW17--Do I repeat myself?
//2017-10-16

public class Repeater{
    public static String fenceW(int numPosts) {
	String retString = "";
	int postsLeft = numPosts;
	if (postsLeft == 0) {
		retString +=  "";
	    }
       	while (postsLeft > 1) {
	    retString += "|--";
	    postsLeft -= 1;
	}
	if (postsLeft == 1) {
		retString += "|";
	    }
	return retString;
    }
    public static String fenceR(int numPosts) {
	if (numPosts == 0) {
		return "";
	    }
	if (numPosts == 1) {
		return "|";
	    }
	else {
	    return "|--" + fenceR(numPosts - 1);
	}
    }
    public static void main(String[] args) {
	System.out.println("======WHILE=====");
	System.out.println(fenceR(0));
	System.out.println(fenceR(1));
	System.out.println(fenceR(3));
	System.out.println(fenceR(5));
	System.out.println("======RECURSIVE=====");
	System.out.println(fenceW(0));
	System.out.println(fenceW(1));
	System.out.println(fenceW(3));
	System.out.println(fenceW(5));
    }
}
