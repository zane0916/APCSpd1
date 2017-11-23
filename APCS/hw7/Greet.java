public class Greet {
    public static void main (String [] args) {
	String greeting;

	BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Salutations");
	BigSib tracy = new BigSib("Hey ya");
	BigSib dotCom = new BigSib("Sup");

	greeting = richard.greet("freshmen");
	System.out.println(greeting);

	greeting = grizz.greet("Dr.Spaceman");
	System.out.println(greeting);

	greeting = tracy.greet("Kong Fooey");
	System.out.println(greeting);

	greeting = dotCom.greet("mom");
	System.out.println(greeting);
    }
}

