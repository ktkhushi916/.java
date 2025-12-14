import java.util.Scanner;
import java.lang.Math;
abstract class Account{
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;
    Account(String customerName,String accountNumber,String accountType,double initialBalance){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit:$"+amount);
            displayBalance();
        }
    }
    public void displayBalance(){
        System.out.println("current balance for"+customerName+"("+accountType+") : $"+balance);

    }
    public abstract void computeAndDepositInterest();
    public abstract void permitWithdrawal(double amount);
    public abstract void checkForMinimumBalance();
    
    


}
class SavAcct extends Account{
    private static final double RATE=0.05;
    public SavAcct(String customerName,String accountNumber,double initialBalance){
        super(customerName,accountNumber,"Savings",initialBalance);

    }
    @Override
    public void computeAndDepositInterest(){
        double interest=balance*RATE;
        balance+=interest;
        System.out.println("Interest (5%) of $"+interest+"deposited");
        displayBalance();
    }
    @Override
    public void permitWithdrawal(double amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdrew :$"+amount);
            displayBalance();
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }
    @Override
    public void checkForMinimumBalance(){


    }
    
}
class CurrAcct extends Account{
    private static final double Min_balance=500.0;
    private static final double PENALTY=50.0;

    public CurrAcct(String customerName,String accountNumber,double initialBalance){
        super(customerName,accountNumber,"Current ",initialBalance);

    }
    @Override
    public void computeAndDepositInterest(){
        System.out.println("Current ban does not earn interest");
    
    }
    @Override
    public void permitWithdrawal(double amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdrew :$"+amount);
            checkForMinimumBalance();
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }
    @Override
    public void checkForMinimumBalance(){
        if(balance<Min_balance && balance>0){
            balance-=PENALTY;
            System.out.println("bALANCE FELL BELOW OF $"+Min_balance+"."+PENALTY+"imposed");
            displayBalance();

        }else if(balance<=0){
            System.out.println("Account is overdrawn or empty.no further actions possible");
        }

    }
    
}
public class BankDemo{
    public static void main(String[] args) {
        System.out.println("---TESTING SAVNGS ACCOUNT");
        SavAcct sa = new SavAcct("Alice","SA1234",1000.0);
        sa.displayBalance();
        sa.deposit(200.0);
        sa.permitWithdrawal(50.0);
        sa.computeAndDepositInterest();
        sa.checkForMinimumBalance();
        System.out.println("---TESTING CURRENT ACCOUNT");
        CurrAcct ca = new CurrAcct("BOB","CA1234",600.0);
        ca.displayBalance();
        ca.deposit(50.0);
        ca.computeAndDepositInterest();
        ca.permitWithdrawal(100.0);
        ca.checkForMinimumBalance();
        



    }
}



 