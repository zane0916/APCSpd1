// Team Bob- Ahnaf Hasan, Zane Wang, Jerry Ye
// APCS1 pd0
// HW10 -- Mo Money Mo Problems
// 2017-10-03 T
public class BankAccount
{
  //instance variables
  private static String name;
  private static String passwd;
  private static int pin;
  private static int acctNum;
  private static double balance;

  //mutators
  public static String setName( String newName )
  {
	String oldName = name;
	name = newName;
	return oldName;
  }
  public static String setPasswd( String newPasswd )
  {
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd;
  }
  public static int setPin( int newPin )
  {
	int oldPin = pin;
	if (newPin >= 1000 && newPin < 9999) {
   	pin = newPin;
 }
	else{
 pin = 9999;
 System.out.println("invalid pin");
	}
	return oldPin;
  }
  public static int setAcctNum( int newAcctNum )
  {
	int oldAcctNum = acctNum;
	if (newAcctNum >= 100000000 && newAcctNum < 999999999) {
	acctNum = newAcctNum;
 }
	else {
 acctNum = 999999999;
 System.out.println("invalid account number");
	}
	return oldAcctNum;
  }
  public static double setBalance( double newBalance )
  {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
  }
  public static void deposit( double depositAmount ) {
	balance = balance + depositAmount;
  }
  public static boolean withdraw( double withdrawAmount){
  	if (withdrawAmount > balance) {
  System.out.println("Not enough money in your bank account!");
  return false;
 	}
 else {
 	balance = balance - withdrawAmount;
 	return true;
 }
	}
	public static boolean authenticate( int accountNumber, String pass){
 if(pass == passwd && accountNumber == acctNum) {
  return true;
 	}
 else {
 	return false;
  }
	}

  //overwritten toString()
  public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
	}

  //main method for testing
	public static void main( String[] args){
	    
 	}//end main()
}//end class BankAccount
