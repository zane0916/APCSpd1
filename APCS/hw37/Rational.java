// Zane Wang
// APCS1 pd1
// HW37--Be More Rational
// 2017-11-20

public class Rational {

    // instance variables
    
    private int numer;
    private int denom;

    // constructors

    // default makes the number a 0
    public Rational() {
	numer = 0;
	denom = 1;
    }// ends Rational() default

    // sets to default if denominator is a 0
    public Rational(int a, int b) {
	this();
	if (b == 0) {
	    System.out.println("invalid denominator");
	}
	else {
	    numer = a;
	    denom = b;
	}
    }// ends Rational() overloaded

    // methods
    
    public String toString() {
	// returns a string with the numbers and a fraction sign
	return numer + " / " + denom;
    }// ends toString()
    
    public double floatValue() {
	// returns the float value of a divided by b
	// a * 1.0 is a double, forces to be a float
	return (this.numer * 1.0) / this.denom;
    }// ends floatValue()
    
    public void multiply(Rational r) {
	// this number's numerator is multiplied to the other numerator
	// same for denominator
	this.numer = this.numer * r.numer;
	this.denom = this.denom * r.denom;
    }// ends multiply()
    
    public void divide(Rational r) {
	// method of Keep, Change, Flip
	if (r.numer != 0) {
	    this.numer = this.numer * r.denom;
	    this.denom = this.denom * r.numer;
	}
	else {
	    System.out.println("division by zero attempted, numbers unchanged");
	}
    }// ends divide()

    public void add(Rational r) {
	// multiplies denoms together, adds the numers
	this.numer = (this.numer * r.denom) + (r.numer * this.denom);
	this.denom = this.denom * r.denom;
    }// ends add()

    public void subtract(Rational r) {
	// multiplies denoms, then cross multiply and subtracts
	this.numer = (this.numer * r.denom) - (r.numer * this.denom);
	this.denom = this.denom * r.denom;
    }// ends subtract

    public static int gcd ( int a, int b) { 
	// recursively finds the gcd
        if (a % b == 0) {
                return b;
        }
        return gcd( b, a%b);
    }// ends gcd helper fxn
    
    public int rationalgcd() {
	// uses the gcd helper to find gcd of the rational number, using larger
	// number first
	if (this.numer > this.denom) {
	    return gcd(this.numer, this.denom);
	}
	else {
	    return gcd(this.denom, this.numer);
	}
    }// ends rationalgcd()

    public void reduce() {
	// reduces fraction by both by the gcd
	// divisor stores gcd bc after numer is changed so is gcd
	int divisor = rationalgcd();
	this.numer = this.numer / divisor;
	this.denom = this.denom / divisor;
    }// ends reduce()

    public int compareTo(Rational r) {
	// compares this rational to another, returns 1 if greater, 0 if equal,
	// -1 if less
	if (this.floatValue() > r.floatValue()) {
	    return 1;
	}
	else if (this.floatValue() == r.floatValue()) {
	    return 0;
	}
	else {
	    return -1;
	}
    }// ends compareTo()
    
    public static void main(String[] args) {
	System.out.println("====== floatValue testing ======");
	Rational a = new Rational(2,3);
	System.out.println(a.toString());
	System.out.println(a.floatValue());
	
	System.out.println("====== multiply testing ======");
	Rational b = new Rational(2,3);
	Rational c = new Rational(1,2);
	System.out.println(b.toString());
	System.out.println(c.toString());
	b.multiply(c);
	System.out.println(b.toString());
	System.out.println(c.toString());
	b.reduce();
	System.out.println(b.toString());

	System.out.println("====== divide testing ======");
	Rational d = new Rational(2,3);
	Rational e = new Rational(1,2);
	System.out.println(d.toString());
	System.out.println(e.toString());
	d.divide(e);
	System.out.println(d.toString());
	System.out.println(e.toString());
	d.reduce();
	System.out.println(d.toString());

	System.out.println("====== adding testing ======");
	Rational f = new Rational(2,3);
	Rational g = new Rational(1,2);
	System.out.println(f.toString());
	System.out.println(g.toString());
	f.add(g);
	System.out.println(f.toString());
	System.out.println(g.toString());
	f.reduce();
	System.out.println(f.toString());

	System.out.println("====== subtract testing ======");
	Rational h = new Rational(2,3);
	Rational i = new Rational(1,2);
	System.out.println(h.toString());
	System.out.println(i.toString());
	h.subtract(i);
	System.out.println(h.toString());
	System.out.println(i.toString());
	h.reduce();
	System.out.println(h.toString());
    }
}
