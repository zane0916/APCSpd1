// Zane Wang
// APCS1 pd1
// HW21 -- Karmacomma
// 2017-10-23

public class Commafier {
    public static String commafyR(int x) {
	String num = Integer.toString(x);
	String retString = "";
	if (num.length() > 3) {
	    if (num.length() % 3 != 0) {
		retString += commafyR(Integer.parseInt(num.substring(0,num.length() - 3))) + "," + num.substring(num.length() - 3);
	    }
	    else {
		retString = num.substring(0) + "," + retString;
	    }
	}
	else {
	    return num;
	}
	return retString;
    }
    public static String commafyF(int x) {
	String retStr = "";
	String a = Integer.toString(x);
	for (; a.length() > 3; a = a.substring(0,a.length() - 3)) {
	    retStr += "," + a.substring(a.length() - 3);
	}
	return a.substring(0) + retStr;
    }
    public static void main(String[] args) {
        for (String s: args) {
	    int a = Integer.parseInt(s);
	    System.out.println(commafyR(a));
	    //System.out.println(commafyF(a));;
	}
    }
}
