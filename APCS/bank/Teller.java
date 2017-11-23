// Team Bob (Ahnaf Hasan,Zane Wang, Jerry Ye)
// APCS1 pd01
// HW11 -- Breaking the Bank
// 2017-10-04 

public class Teller {
    public static void main(String[] args) {
	BankAccount teller = new BankAccount();
	teller.setName("John Smith");
	teller.setPasswd("HelloWorld");
	teller.setPin(1424);
	teller.setAcctNum(123456789);
	teller.setBalance(2564.78);
	teller.deposit(256);
	teller.withdraw(1000);
	System.out.println(teller.toString());
	System.out.println(teller.authenticate(123456789, "John Smith"));
    }
}
