// Zane Wang
// APCS1 pd1
// HW12 -- stAtistically sPeaking
// 2017-10-05

public class Stats {
    public static int mean(int a, int b) {
	return (int)(a + b)/2; // could possibly result in a .5, so use int
    }// ends int mean
    public static double mean(double a, double b) {
	return (a + b)/2;
    }// ends double mean
    public static int max(int a, int b) {
	if (a > b) {
	    return a;
	}
	else return b; // returns b even if a and b are equal, bc same #
    }//ends int max
    public static double max(double a, double b) {
	if (a > b) {
	    return a;
	}
	else return b; // returns the larger of the two values
    }//ends double max
    public static int geoMean(int a, int b) {
	return (int)Math.sqrt(a*b); // returns a integer val by truncation
    }//ends int geoMean
    public static double geoMean(double a, double b) {
	return Math.sqrt(a*b); // returns the float
    }//ends int geoMean
    public static void main(String[] args) {
	System.out.println(mean(5,6)); // 5
	System.out.println(mean(5.0,6.0)); // 5.5
	System.out.println(max(5,6)); // 6 
	System.out.println(max(5.0,6.0)); // 6.0
	System.out.println(max(5,5)); // 5
	System.out.println(max(5.0,5.0)); // 5.0
	System.out.println(geoMean(5,6)); // 5
	System.out.println(geoMean(5.0,6.0)); // 5.477225575051661
    }
}
