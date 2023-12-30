package proj1;

public class BankAccount {
public int accountNumber;
public String accountHolderName;
public int balance;
public BankAccount(int accountNumber, String AccountHolderName,int balance) {this.accountNumber=accountNumber;
this.accountHolderName=accountHolderName;
this.balance=balance;
}
public int  getAccountnumber() {return(this.accountNumber);
}
public String getAccountHolderName() {return(accountHolderName);}

public int getBalance() {return(balance);}

public void deposit(int d) {balance=balance+d;}
public void withdraw (int d) {balance=balance-d;}

public static void main(String args[])
{BankAccount a=new BankAccount(1578,"aziz",17485);
System.out.println(a.getAccountnumber());
a.withdraw(100);
System.out.println("la balance est"+a.balance);
}
}


