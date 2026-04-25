abstract class Accounts{
    protected double balance;
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;
    public Accounts(double balance,int accountNumber,String name,String address){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.accountHoldersName=name;
        this.address=address;
    }
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    void display(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHoldersName);
        System.out.println("Address : "+address);
        System.out.println("Balance : "+balance);
    }
}
class savingsAccount extends Accounts{
    private double rateOfInterest;
    public savingsAccount(double balance,int accountNumber,String name,String address,double roi){
        super(balance, accountNumber, name, address);
        this.rateOfInterest=roi;
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdraw Amount : "+amount);
        }else{
            System.out.println("Insufficent Balance !");
        }
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited Amount : "+amount);
    }
    void calculateAmount(){
        double interest=balance*rateOfInterest/100;
        balance+=interest;
        System.out.println("Interest Added : "+interest);
    }
}
public class BankSystemUsingAbstract{
    public static void main(String[] args) {
        savingsAccount sa = new savingsAccount(10000, 12456,"Ankit Kumar","Kolkata", 6);
        System.out.println("Initial Details : ");
        sa.display();
        System.out.println("\nAfter Deposit : ");
        sa.deposit(15500);
        sa.display();
        System.out.println("\nAfter Withdraw : ");
        sa.withdraw(5614);
        sa.display();
        System.out.println("\nAfter Interest calculation : ");
        sa.calculateAmount();
        sa.display(); 
    } 
}
