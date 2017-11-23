//Zane Wang
//APCS1 pd1
//HW6 -- On BigSib Individuality and the Elimination of Radio Fuzz
//2017-09-25

public class BigSib {
    // instance vars
    private String helloMsg;

    // methods
    public void setHelloMsg( String newMsg) {
	helloMsg = newMsg;
    } //ends setHelloMsg

    public String greet( String name) {
	helloMsg += " " + name;
	helloMsg += "\nSalutations Dr. Spaceman";
	helloMsg += "\nHey ya Kong Fooey";
	helloMsg += "\nSup mom";
	return helloMsg;
    }//ends greet
}//ends BigSib
