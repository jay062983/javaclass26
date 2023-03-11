package Encapsule;

public class Account {
    double balance;
    String AccountNumber;
    String type;
    String accountTitle;

    public void setBalance(double balance){
        //sanitizing the input meaning checking the value before we can assign them.
        if(balance<0) {
            System.out.println("Negative balance is not allowed");
        }else{
            this.balance=this.balance+balance;
        }
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String AccountNumber) {
        if (AccountNumber.length() != 16) {
            System.out.println("Wrong account number");
        } else {
            this.AccountNumber = AccountNumber;
        }
    }
     public String getAccountNumber(){
         return AccountNumber;

    }

    public String getAccountTitle(){
        return accountTitle;
    }

    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        AccountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}
class AccountTester{
    public static void main(String[] args) {
        Account account=new Account(-1000,"abba","abcd234","Mr");
        System.out.println(account.getAccountTitle());
        account.setBalance(-987980);
    }
}
