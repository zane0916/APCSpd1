public class BankAccount {
    //inst vars
    public String Holder;
    private String pass;
    private Integer PIN;
    private Integer Pass;
    private float AcctBalance;
    //methods
    private String setup(String name, String word, Integer Nums4,Integer Nums9, float money) {
    String retstr;
	  Holder = name;
	  pass = word;
	  PIN = Nums4;
	  Pass = Nums9;
	  AcctBalance = money;
    retstr = "Name: " + Holder + " Password: " + pass;
    retstr += " PIN: " + PIN.toString();
    retstr += " Account Number: " + Pass.toString();
    retstr += " Account Balance: " + String.valueOf(AcctBalance);
    return(retstr);
    }// ends setup
public Boolean withdraw(float funds) {
  if (AcctBalance > funds){
    AcctBalance -= funds;
    return true;
  }
  else{
    return false;
  }
}//ends withdrawal
public Boolean deposit(float funds) {
  float prior = AcctBalance;
  AcctBalance += funds;
  if (AcctBalance > prior) {
    return true;
  }
  else {
    return false;
  }
}//ends deposit
public static void main(String[] args) {
    String pswd;
    Boolean firstWithdrawal;
    Boolean firstDeposit;
    BankAccount open = new BankAccount();
    pswd = open.setup("Benny", "sgjspvj2034", 0000, 123456789, 1000000);
    firstWithdrawal = open.withdraw(9235);
    firstDeposit = open.deposit(2235);
    System.out.println(pswd);
    System.out.println(firstWithdrawal);
    System.out.println(firstDeposit);
}// ends main
}//ends BankAccount
