public class Coin
{
    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;
    public Coin() {
        value = 0;
        upFace = "heads";
        name = "null";
        flipCtr = 0;
        headsCtr = 0;
        tailsCtr = 0;
        bias = Math.random();
    }// ends default constructor
    
    public Coin(String coinType) {
	this();
	name = coinType;
    }// ends overloaded constructor 1
    
    public Coin(String coinType, String position) {
	this();
	name = coinType;
	upFace = position;
    }// ends overloaded constructor 2

    public double assignValue(String coinType) {
	if (coinType == "quarter") {
	    value = 0.25;
	}
	else if (coinType == "dime") {
	    value = 0.10;
	}
	else if (coinType == "penny") {
	    value = 0.01;
	}
	else if (coinType == "nickel") {
	    value = 0.05;
	}
	else if (coinType == "halfDollar") {
	    value = 0.50;
	}
	else if (coinType == "dollar") {
	    value = 1.00;
	}
	return value;
    }// ends assignValue

    public String toString() {
	String retStr;
	retStr = name;
	retStr += "--";
	retStr += upFace;
	return retStr;
    }// ends toString
    
    public String flip() {
	if (bias >= 0.5) {
	    upFace = "heads";
	    headsCtr += 1;
	}
	else {
	    upFace = "tails";
	    tailsCtr += 1;
	}
	flipCtr += 1;
	return upFace;
    }// ends flip()

    public Boolean equals(Coin object) {
	return upFace == object.upFace;
    }// ends equals()
}//ends class Coin
