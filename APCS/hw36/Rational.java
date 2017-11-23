// Zane Wang
// APCS1 pd1
// HW36--Be Rational
// 2017-11-17

public class Rational {

    // instance variables
    
    private int numer;
    private int denom;

    // constructors

    // default makes the number a 0
    public Rational() {
	numer = 0;
	denom = 1;
    }

    // sets to default if denominator is a 0
    public Rational(int a, int b) {
	if (b == 0) {
	    numer = 0;
	    denom = 1;
	    System.out.println("invalid denominator");
	}
	else {
	    numer = a;
	    denom = b;
	}
    }

    // methods
    
    public String toString() {
	// returns a string with the numbers and a fraction sign
	return numer + "/" + denom;
    }
    
    public float floatValue(int a, int b) {
	// returns the float value of a divided by b
	// a * 1.0 is a double, forces to be a float
	return (float) (a * 1.0) / b;
    }
    
    public void multiply(Rational r) {
	// this number's numerator is multiplied to the other numerator
	// same for denominator
	numer = numer * r.numer;
	denom = denom * r.denom;
    }
    
    public void divide(Rational r) {
	// method of Keep, Change, Flip
	numer = numer * r.denom;
	denom = denom * r.numer;
    }
    
    public static void main(String[] args) {
	System.out.println("====== Multiply Testing ======");
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	System.out.println(r.toString());
	System.out.println(s.toString());
	r.multiply(s);
	System.out.println(r.toString());
	System.out.println(s.toString());

	System.out.println("====== Divide Testing ======");
	Rational k = new Rational(2,3);
	Rational h = new Rational(1,2);
	System.out.println(k.toString());
	System.out.println(h.toString());
	k.divide(h);
	System.out.println(k.toString());
	System.out.println(h.toString());
    }
}
