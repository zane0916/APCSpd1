//Zane Wang
//APCS1 pd1
//HW7 -- On the Origins of a BigSib
//2017-09-26

public class BigSib {
    
    // instance vars
    private String helloMsg;

    // Methods
    public BigSib() {
	helloMsg = "hello";
    }// ends constructor
	
    public BigSib(String newMsg) {
	helloMsg = newMsg;
    }// ends constructor
    
    public String greet( String name) {
	helloMsg += " " + name;
	return helloMsg;
    }// ends greet
}// ends BigSib
